package de.unidue.ecg.characterScript.ui.editor.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.SWT

class CharacterScriptHighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static val FEATURE_KEYWORD = "featureKeyword"
	public static val MY_COMMENT_ID = "myComment"

	override configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(MY_COMMENT_ID, "SemanticComment", myCommentTextStyle())
		acceptor.acceptDefaultHighlighting(FEATURE_KEYWORD, "FeatureKeyword", featureKeywordTextStyle());
	}

	def featureKeywordTextStyle() {
		var textStyle = new TextStyle()
		textStyle.setColor(new RGB(129, 62, 0))
		textStyle.setStyle(SWT.ITALIC);
		textStyle
	}

	private def TextStyle myCommentTextStyle() {
		val textStyle = new TextStyle()
		textStyle.setColor(new RGB(88, 88, 88))
		textStyle.setStyle(SWT.ITALIC)
		return textStyle
	}

}
