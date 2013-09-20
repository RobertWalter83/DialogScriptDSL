package de.unidue.ecg.characterScript.ui.editor.templates

import com.google.inject.Inject
import de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage
import de.unidue.ecg.characterScript.characterScript.CustomAttribute
import de.unidue.ecg.characterScript.services.CharacterScriptGrammarAccess
import de.unidue.ecg.characterScript.util.DefaultAttributeHelper
import de.unidue.ecg.characterScript.util.LanguageUtil
import org.eclipse.jface.text.templates.ContextTypeRegistry
import org.eclipse.jface.text.templates.TemplateContext
import org.eclipse.jface.text.templates.persistence.TemplateStore
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.impl.ImportScope
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ITemplateAcceptor
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext
import de.unidue.ecg.characterScript.characterScript.Template

class CharacterScriptTemplateProposalProvider extends DefaultTemplateProposalProvider {

	var helper = null as ContextTypeIdHelper
	var numberTemplateCounter = 0

	@Inject
	CharacterScriptGrammarAccess grammarAccess

	@Inject
	new(TemplateStore templateStore, ContextTypeRegistry registry, ContextTypeIdHelper helper) {
		super(templateStore, registry, helper)
		this.helper = helper
	}

	override protected createTemplates(TemplateContext templateContext, ContentAssistContext context,
		ITemplateAcceptor acceptor) {
		super.createTemplates(templateContext, context, acceptor)

		this.numberTemplateCounter = 0
		if (templateContext instanceof XtextTemplateContext) {
			val xTemplateContext = templateContext as XtextTemplateContext
			val id = helper.getId(grammarAccess.characterRule)

			if (xTemplateContext.contextType.id.equals(id)) {
				if (context.currentModel != null) {
					val scopProvider = xTemplateContext.scopeProvider
					val scope = scopProvider.getScope(context.currentModel,
						CharacterScriptPackage.Literals.CHARACTER__TEMPLATE)
					val templates = newArrayList

					scope.allElements.forEach [
						val resolved = EcoreUtil2.resolve(it.EObjectOrProxy, context.resource.resourceSet)
						if (resolved instanceof Template) {
							val source = resolved as Template
							templates.add(source.createDynamicTemplate)
						}
					]

					templates.forEach [
						val proposal = createProposal(templateContext, context, image, relevance)
						acceptor.accept(proposal)
					]
				}
			}
		}

	}

	def createDynamicTemplate(Template source) {
		new org.eclipse.jface.text.templates.Template(
			"template: " + source.name,
			"insert character template for " + source.name,
			source.name,
			'''
				character ${name} uses «source.name»
					«FOR d : source.defaults»
						«d.createDefaultTemplateEntry»
					«ENDFOR»
					«FOR c : source.customs»
						«c.createCustomTemplateEntry»
					«ENDFOR»
				end
				 
				${cursor}
			''',
			true
		)

	}

	def createCustomTemplateEntry(CustomAttribute attribute) {
		var result = ""
		result = result + attribute.caName.name + " "
		result = result + attribute.createCustomValueTemplateExpression + " "
		result
	}

	def createCustomValueTemplateExpression(CustomAttribute attribute) {
		if (!attribute.enumValues.empty) {
			return "${" + attribute.enumValues?.get(0).name + ":Enum('value')}"
		}
		switch (attribute.type.getName()) {
			case "NUMBER": return "${" + (this.numberTemplateCounter = this.numberTemplateCounter + 1) + "}"
			case "TEXT": return "\"${" + attribute.caName.name.replaceAll("\\s+", "") + "Value}\""
		}
	}

	def createDefaultTemplateEntry(String key) {
		var result = ""
		val defaultsHelper = LanguageUtil.defaultAttributes
		val defaultHelper = defaultsHelper.get(key)

		if (defaultHelper != null) {
			result = result + defaultHelper.name + " "
			result = result + defaultHelper.createDefaultValueTemplateExpression + " "
		}
		result
	}

	def createDefaultValueTemplateExpression(DefaultAttributeHelper helper) {
		switch (helper.type) {
			case "NUMBER":
				return "${" + (this.numberTemplateCounter = this.numberTemplateCounter + 1) + "}"
			case "TEXT":
				return "\"${" + helper.name.replaceAll("\\s+", "") + "Value}\""
			case "ENUM": {
				if (helper.name.equals("sex")) {
					return "${female:Enum('CharaSex')}"
				} else if (helper.name.equals("type")) {
					return "${PC:Enum('CharaType')}"
				}
			}
		}
	}

}
