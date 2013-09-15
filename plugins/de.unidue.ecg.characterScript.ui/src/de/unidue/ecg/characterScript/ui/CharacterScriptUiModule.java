/*
 * generated by Xtext
 */
package de.unidue.ecg.characterScript.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalComparator;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider;

import de.unidue.ecg.characterScript.scoping.CharacterScriptScopeProvider;
import de.unidue.ecg.characterScript.ui.editor.syntaxcoloring.CharacterScriptHighlightingConfiguration;
import de.unidue.ecg.characterScript.ui.editor.syntaxcoloring.CharacterScriptSemanticHighlightingCalculator;
import de.unidue.ecg.characterScript.ui.editor.templates.CharacterScriptTemplateProposalProvider;
import de.unidue.ecg.common.ui.contentassist.TemplatePreferringCompletionProposalProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class CharacterScriptUiModule extends de.unidue.ecg.characterScript.ui.AbstractCharacterScriptUiModule {
	public CharacterScriptUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return CharacterScriptHighlightingConfiguration.class;
	}
	
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator>bindISemanticHighlightingCalculator() {
		return CharacterScriptSemanticHighlightingCalculator.class;
	}

	public Class<? extends ICompletionProposalComparator> bindICompletionProposalComparator() {
		return TemplatePreferringCompletionProposalProvider.class;
	}
	
	@Override
	public Class<? extends ITemplateProposalProvider> bindITemplateProposalProvider() {
		return CharacterScriptTemplateProposalProvider.class;
	}
	
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return CharacterScriptScopeProvider.class;
	}
}