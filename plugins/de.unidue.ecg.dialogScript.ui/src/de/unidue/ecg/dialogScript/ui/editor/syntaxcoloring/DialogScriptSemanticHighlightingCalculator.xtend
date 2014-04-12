package de.unidue.ecg.dialogScript.ui.editor.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.RuleCall
import de.unidue.ecg.dialogScript.dialogScript.Scene
import de.unidue.ecg.dialogScript.dialogScript.Hub
import de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog
import org.eclipse.xtext.CrossReference

class DialogScriptSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {
	override def provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.parseResult == null) {
			return
		}

		val root = resource.parseResult.rootNode
		 
		root.asTreeIterable.forEach[
			val grammarElement = it.grammarElement
			switch grammarElement {
				RuleCall: {
					val rule = grammarElement.rule
					
					switch rule.name {
						case "COMMENT": 
							acceptor.addPosition(offset, length, DialogScriptHighlightingConfiguration.MY_COMMENT_ID)
						case "StringID": {
							if(parent.semanticElement instanceof Scene) {
								acceptor.addPosition(offset, length, DialogScriptHighlightingConfiguration.SCENE_NAME)
							} else if (parent.semanticElement instanceof Hub || parent.semanticElement instanceof ChoiceDialog) {
								acceptor.addPosition(offset, length, DialogScriptHighlightingConfiguration.HUB_NAME)
							}	
						}
						case "StringLiteral": {
							acceptor.addPosition(offset, length, DialogScriptHighlightingConfiguration.STRING_LITERAL)
						}
					}
				}
				CrossReference: {
					acceptor.addPosition(offset, length, DialogScriptHighlightingConfiguration.CROSSREF_STRING)
				}
			}
		]
	}
}