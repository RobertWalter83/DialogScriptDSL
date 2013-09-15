package de.unidue.ecg.dialogScript.ui.editor.templates

import org.eclipse.xtext.ui.editor.templates.XtextTemplateContextTypeRegistry
import org.eclipse.xtext.IGrammarAccess
import com.google.inject.Provider
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContextType
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.TerminalRule
import java.util.Collections
import com.google.inject.Inject

class TerminalRuleAwareTemplateContextTypeRegistry extends XtextTemplateContextTypeRegistry {

	@Inject
	new(IGrammarAccess grammarAccess, Provider<XtextTemplateContextType> ctxTypeProvider, ContextTypeIdHelper helper) {
		super(grammarAccess, ctxTypeProvider, helper)
	}

	override protected registerContextTypes(IGrammarAccess grammarAccess,
		Provider<XtextTemplateContextType> ctxTypeProvider) {
		super.registerContextTypes(grammarAccess, ctxTypeProvider)

		val terminalRules = GrammarUtil.allTerminalRules(grammarAccess.grammar)
		val allContextTypes = newArrayList()

		terminalRules.forEach [
			var type = ctxTypeProvider.get
			type.name = it.name
			type.id = it.id
			allContextTypes.add(type)
		]

		Collections.sort(allContextTypes)
		allContextTypes.forEach[addContextType]
	}

	def final getId(TerminalRule rule) {
		GrammarUtil.getGrammar(rule).getName() + "." + rule.getName();
	}

}
