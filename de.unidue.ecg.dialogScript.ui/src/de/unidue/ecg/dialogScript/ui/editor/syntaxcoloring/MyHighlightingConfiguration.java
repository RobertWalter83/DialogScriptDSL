package de.unidue.ecg.dialogScript.ui.editor.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class MyHighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String MY_COMMENT_ID = "myComment";
	public static final String ID_IS_KEYWORD = "keywordAsId";
	public static final String CROSSREF_STRING = "crossRefString";
	public static final String SCENE_NAME = "sceneName";
	public static final String HUB_NAME = "hubName";
	public static final String STRING_LITERAL = "stringLiteral";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(MY_COMMENT_ID, "SemanticComment", myCommentTextStyle());
		acceptor.acceptDefaultHighlighting(ID_IS_KEYWORD, "KeywordAsId", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(CROSSREF_STRING, "CrossrefString", crossRefStringStyle());
		acceptor.acceptDefaultHighlighting(SCENE_NAME, "SceneName", sceneNameStyle());
		acceptor.acceptDefaultHighlighting(HUB_NAME, "HubName", hubNameStyle());
		//acceptor.acceptDefaultHighlighting(STRING_LITERAL, "StringLiteral", stringTextStyle());
	}
	
	private TextStyle crossRefStringStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(44, 44, 44));
		return textStyle;
	}

	private TextStyle hubNameStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}

	private TextStyle sceneNameStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 0));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	private TextStyle myCommentTextStyle() {
		TextStyle textStyle = new TextStyle();

		textStyle.setColor(new RGB(88, 88, 88));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
}
