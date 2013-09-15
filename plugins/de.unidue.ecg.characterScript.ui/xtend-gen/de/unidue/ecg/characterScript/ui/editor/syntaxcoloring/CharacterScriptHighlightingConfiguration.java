package de.unidue.ecg.characterScript.ui.editor.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

@SuppressWarnings("all")
public class CharacterScriptHighlightingConfiguration extends DefaultHighlightingConfiguration {
  public final static String FEATURE_KEYWORD = "featureKeyword";
  
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    super.configure(acceptor);
    TextStyle _featureKeywordTextStyle = this.featureKeywordTextStyle();
    acceptor.acceptDefaultHighlighting(CharacterScriptHighlightingConfiguration.FEATURE_KEYWORD, "FeatureKeyword", _featureKeywordTextStyle);
  }
  
  public TextStyle featureKeywordTextStyle() {
    TextStyle _xblockexpression = null;
    {
      TextStyle _textStyle = new TextStyle();
      TextStyle textStyle = _textStyle;
      RGB _rGB = new RGB(129, 62, 0);
      textStyle.setColor(_rGB);
      textStyle.setStyle(SWT.ITALIC);
      _xblockexpression = (textStyle);
    }
    return _xblockexpression;
  }
}
