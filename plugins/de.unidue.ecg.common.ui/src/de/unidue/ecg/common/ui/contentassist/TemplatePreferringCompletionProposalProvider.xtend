package de.unidue.ecg.common.ui.contentassist

import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalComparator
import org.eclipse.jface.text.contentassist.ICompletionProposal
import org.eclipse.jface.text.templates.TemplateProposal
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.xtext.ui.editor.quickfix.QuickAssistCompletionProposal

class TemplatePreferringCompletionProposalProvider implements ICompletionProposalComparator {

	static val PREMIUM_RELEVANCE = 2 as Integer
	static val HIGH_RELEVANCE = 1 as Integer
	static val MEDIUM_RELEVANCE = 0 as Integer
	static val LOW_RELEVANCE = -1 as Integer

	override compare(ICompletionProposal o1, ICompletionProposal o2) {
		var relevance1 = getRelevance(o1) as Integer;
		var relevance2 = getRelevance(o2) as Integer;
		if (relevance1 != null && relevance2 != null) {
			val res = relevance2.compareTo(relevance1);
			if (res != 0) {
				return res;
			}
		}
		return o1.getDisplayString().compareTo(o2.getDisplayString());
	}
	

	def dispatch getRelevance(TemplateProposal proposal)  {
		if(proposal.displayString.startsWith('template: '))
			PREMIUM_RELEVANCE
		else
			HIGH_RELEVANCE
	}
	
	def dispatch getRelevance(ConfigurableCompletionProposal proposal) {
		MEDIUM_RELEVANCE
	}
	
	def dispatch getRelevance(QuickAssistCompletionProposal proposal) {
		LOW_RELEVANCE
	}

	def dispatch getRelevance(Object o) {
		null
	}

}
