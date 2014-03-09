package de.unidue.ecg.characterScript.ui.editor.syntaxcoloring

import de.unidue.ecg.characterScript.characterScript.CustomAttribute
import de.unidue.ecg.characterScript.characterScript.CustomAttributeName
import de.unidue.ecg.characterScript.characterScript.Property
import de.unidue.ecg.characterScript.characterScript.Template
import de.unidue.ecg.characterScript.util.LanguageUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.EnumRule
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.TerminalRule
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator

class CharacterScriptSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getParseResult() == null)
			return

		val root = resource.parseResult.rootNode
		root.asTreeIterable.forEach [
			val grammarElement = it.grammarElement
			switch grammarElement {
				RuleCall: {
					val rule = grammarElement.rule

					switch rule.name {
						case "COMMENT":
							acceptor.addPosition(offset, length, CharacterScriptHighlightingConfiguration.MY_COMMENT_ID)
					}
				}
			}
			if (semanticElement instanceof Property) {
				if (filterForCrossReferencedEnumValues(grammarElement)) {
					acceptor.addPosition(offset, length, CharacterScriptHighlightingConfiguration.FEATURE_KEYWORD)
				} else if (grammarElement instanceof RuleCall) {
					val rule = (grammarElement as RuleCall).rule
					if (rule instanceof TerminalRule && (rule.name.equals("STRING") || rule.name.equals("INT")) ||
						rule instanceof EnumRule) {
						acceptor.addPosition(offset, length, CharacterScriptHighlightingConfiguration.DEFAULT_ID)
					}
				}
			} else if (parent?.semanticElement instanceof Template && grammarElement instanceof Keyword) {
				val keyword = grammarElement as Keyword
				if (LanguageUtil.defaultAttributes.get(keyword.value) != null)
					acceptor.addPosition(offset, length, CharacterScriptHighlightingConfiguration.FEATURE_KEYWORD)
			} else if (semanticElement instanceof CustomAttributeName) {
				if (grammarElement instanceof RuleCall) {
					val rule = (grammarElement as RuleCall).rule
					if (rule.name.equals('ID'))
						acceptor.addPosition(offset, length, CharacterScriptHighlightingConfiguration.FEATURE_KEYWORD)
				}
			} else if (semanticElement instanceof CustomAttribute) {
				if (grammarElement instanceof RuleCall) {
					val rule = (grammarElement as RuleCall).rule
					if (rule.name.equals("AttributeType")) {
						acceptor.addPosition(offset, length, CharacterScriptHighlightingConfiguration.DEFAULT_ID)
					}
				}
			}
		]
	}

	private dispatch def filterForCrossReferencedEnumValues(EObject obj) {
		return false
	}

	private dispatch def filterForCrossReferencedEnumValues(Keyword kw) {
		if (kw.value == '(' || kw.value == ')')
			return false
		return true
	}

	private dispatch def filterForCrossReferencedEnumValues(CrossReference cr) {
		if (cr.eContainer instanceof Assignment) {
			val assignment = cr.eContainer as Assignment
			val feature = assignment.feature
			if (feature.equals('enumValue'))
				return false
		}

		return true
	}
}
