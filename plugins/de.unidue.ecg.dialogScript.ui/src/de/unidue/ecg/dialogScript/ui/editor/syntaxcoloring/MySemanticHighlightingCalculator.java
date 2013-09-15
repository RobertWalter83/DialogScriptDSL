package de.unidue.ecg.dialogScript.ui.editor.syntaxcoloring;

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog;
import de.unidue.ecg.dialogScript.dialogScript.Hub;
import de.unidue.ecg.dialogScript.dialogScript.Scene;

public class MySemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	//@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getParseResult() == null)
			return;

		INode root = resource.getParseResult().getRootNode();
		for (INode node : root.getAsTreeIterable()) {
			if (node.getGrammarElement() instanceof RuleCall) {
				RuleCall ruleCall = (RuleCall) node.getGrammarElement();
				AbstractRule rule = ruleCall.getRule();
				if (rule.getName().equals("COMMENT")) {
					acceptor.addPosition(node.getOffset(), node.getLength(),
							MyHighlightingConfiguration.MY_COMMENT_ID);
				}
				if (rule.getName().equals("StringID")) {
					if (node.getParent().getSemanticElement() instanceof Scene) {
						acceptor.addPosition(node.getOffset(), node.getLength(),
								MyHighlightingConfiguration.SCENE_NAME);
					} else if (node.getParent().getSemanticElement() instanceof Hub
							|| node.getParent().getSemanticElement() instanceof ChoiceDialog) {
						acceptor.addPosition(node.getOffset(), node.getLength(),
								MyHighlightingConfiguration.HUB_NAME);
					}
				}
				if (rule.getName().equals("StringLiteral")) {
					acceptor.addPosition(node.getOffset(), node.getLength(),
							MyHighlightingConfiguration.STRING_LITERAL);
				}
			} else if (node.getGrammarElement() instanceof CrossReference) {
				acceptor.addPosition(node.getOffset(), node.getLength(),
						MyHighlightingConfiguration.CROSSREF_STRING);
			}
		}
	}
}
