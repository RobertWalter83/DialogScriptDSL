package de.unidue.ecg.dialogScript.ui.editor.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.SWT

class DialogScriptHighlightingConfiguration extends DefaultHighlightingConfiguration {
	public static val MY_COMMENT_ID = "myComment"
	public static val ID_IS_KEYWORD = "keywordAsId"
	public static val CROSSREF_STRING = "crossRef"
	public static val SCENE_NAME = "sceneName"
	public static val HUB_NAME = "hubName"
	public static val STRING_LITERAL = "stringLiteral" 
	
	override def configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor)
		acceptor.acceptDefaultHighlighting(MY_COMMENT_ID, "SemanticComment", myCommentTextStyle())
		acceptor.acceptDefaultHighlighting(ID_IS_KEYWORD, "KeywordAsId", defaultTextStyle())
		acceptor.acceptDefaultHighlighting(CROSSREF_STRING, "CrossrefString", crossRefStringStyle())
		acceptor.acceptDefaultHighlighting(SCENE_NAME, "SceneName", sceneNameStyle())
		acceptor.acceptDefaultHighlighting(HUB_NAME, "HubName", hubNameStyle())
		//acceptor.acceptDefaultHighlighting(STRING_LITERAL, "StringLiteral", stringTextStyle())
	}
	
	private def TextStyle crossRefStringStyle() {
		val textStyle = new TextStyle()
		textStyle.setColor(new RGB(44, 44, 44))
		textStyle
	}

	private def TextStyle hubNameStyle() {
		val textStyle = new TextStyle()
		textStyle.setColor(new RGB(0, 0, 0))
		return textStyle
	}

	private def TextStyle sceneNameStyle() {
		val textStyle = new TextStyle()
		textStyle.setColor(new RGB(0, 0, 0))
		textStyle.setStyle(SWT.BOLD)
		return textStyle
	}

	private def TextStyle myCommentTextStyle() {
		val textStyle = new TextStyle()
		textStyle.setColor(new RGB(88, 88, 88))
		textStyle.setStyle(SWT.ITALIC)
		return textStyle
	}
	
}
