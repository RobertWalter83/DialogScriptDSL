package de.unidue.ecg.dialogScript.ui.editor.templates

import com.google.inject.Inject
import java.util.Collection
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.text.templates.ContextTypeRegistry
import org.eclipse.jface.text.templates.TemplateContextType
import org.eclipse.jface.text.templates.persistence.TemplateStore
import org.eclipse.xtext.AbstractElement
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.ParserRule
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.TerminalRule
import org.eclipse.xtext.ui.editor.contentassist.IFollowElementAcceptor
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider
import org.eclipse.xtext.util.XtextSwitch

final class TerminalRuleAwareTemplateProposalProvider extends DefaultTemplateProposalProvider {

	protected final ContextTypeRegistry registry
	protected final ContextTypeIdHelper helper

	@Inject
	new(TemplateStore templateStoreArg, ContextTypeRegistry registryArg, ContextTypeIdHelper helperArg) {
		super(templateStoreArg, registryArg, helperArg)
		registry = registryArg
		helper = helperArg
	}

	override protected createFollowElementAcceptor(Collection<TemplateContextType> result) {
		return new TerminalRuleAwareFollowElementAcceptor(result, this)
	}
}

class TerminalRuleAwareFollowElementAcceptor extends XtextSwitch<Boolean> implements IFollowElementAcceptor {

	TerminalRuleAwareTemplateProposalProvider provider;
	Collection<TemplateContextType> result

	new(Collection<TemplateContextType> resultArg, TerminalRuleAwareTemplateProposalProvider providerArg) {
		result = resultArg
		provider = providerArg
	}

	override defaultCase(EObject object) {
		return Boolean.TRUE
	}

	override caseKeyword(Keyword object) {
		addContextType(object)
		object.defaultCase
	}

	override caseRuleCall(RuleCall object) {
		doSwitch(object.rule)
		object.defaultCase
	}

	override caseParserRule(ParserRule object) {
		addContextType(object)
		object.defaultCase 
	}

	override caseAssignment(Assignment object) {
		accept(object.terminal)
		object.defaultCase
	}

	override accept(AbstractElement element) {
		doSwitch(element)
	}

	override caseTerminalRule(TerminalRule object) {
		addContextType(object)
		object.defaultCase
	}

	def addContextType(ParserRule rule) {
		addContextType(provider.helper.getId(rule))
	}

	def addContextType(Keyword keyword) {
		addContextType(provider.helper.getId(keyword))
	}

	def addContextType(String id) {
		val contextType = provider.registry.getContextType(id);
		if (contextType != null)
			result.add(contextType);
	}

	def addContextType(TerminalRule rule) {
		addContextType(GrammarUtil.getGrammar(rule).name + "." + rule.name)
	}

}
