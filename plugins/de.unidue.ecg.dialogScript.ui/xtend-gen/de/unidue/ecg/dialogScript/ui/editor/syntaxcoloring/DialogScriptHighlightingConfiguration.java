package de.unidue.ecg.dialogScript.ui.editor.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

@SuppressWarnings("all")
public class DialogScriptHighlightingConfiguration extends DefaultHighlightingConfiguration {
  public final static String MY_COMMENT_ID = "myComment";
  
  public final static String ID_IS_KEYWORD = "keywordAsId";
  
  public final static String CROSSREF_STRING = "crossRef";
  
  public final static String SCENE_NAME = "sceneName";
  
  public final static String HUB_NAME = "hubName";
  
  public final static String STRING_LITERAL = "stringLiteral";
  
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    super.configure(acceptor);
    TextStyle _myCommentTextStyle = this.myCommentTextStyle();
    acceptor.acceptDefaultHighlighting(DialogScriptHighlightingConfiguration.MY_COMMENT_ID, "SemanticComment", _myCommentTextStyle);
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    acceptor.acceptDefaultHighlighting(DialogScriptHighlightingConfiguration.ID_IS_KEYWORD, "KeywordAsId", _defaultTextStyle);
    TextStyle _crossRefStringStyle = this.crossRefStringStyle();
    acceptor.acceptDefaultHighlighting(DialogScriptHighlightingConfiguration.CROSSREF_STRING, "CrossrefString", _crossRefStringStyle);
    TextStyle _sceneNameStyle = this.sceneNameStyle();
    acceptor.acceptDefaultHighlighting(DialogScriptHighlightingConfiguration.SCENE_NAME, "SceneName", _sceneNameStyle);
    TextStyle _hubNameStyle = this.hubNameStyle();
    acceptor.acceptDefaultHighlighting(DialogScriptHighlightingConfiguration.HUB_NAME, "HubName", _hubNameStyle);
  }
  
  private TextStyle crossRefStringStyle() {
    TextStyle _xblockexpression = null;
    {
      TextStyle _textStyle = new TextStyle();
      final TextStyle textStyle = _textStyle;
      RGB _rGB = new RGB(44, 44, 44);
      textStyle.setColor(_rGB);
      _xblockexpression = (textStyle);
    }
    return _xblockexpression;
  }
  
  private TextStyle hubNameStyle() {
    TextStyle _textStyle = new TextStyle();
    final TextStyle textStyle = _textStyle;
    RGB _rGB = new RGB(0, 0, 0);
    textStyle.setColor(_rGB);
    return textStyle;
  }
  
  private TextStyle sceneNameStyle() {
    TextStyle _textStyle = new TextStyle();
    final TextStyle textStyle = _textStyle;
    RGB _rGB = new RGB(0, 0, 0);
    textStyle.setColor(_rGB);
    textStyle.setStyle(SWT.BOLD);
    return textStyle;
  }
  
  private TextStyle myCommentTextStyle() {
    TextStyle _textStyle = new TextStyle();
    final TextStyle textStyle = _textStyle;
    RGB _rGB = new RGB(88, 88, 88);
    textStyle.setColor(_rGB);
    textStyle.setStyle(SWT.ITALIC);
    return textStyle;
  }
}
