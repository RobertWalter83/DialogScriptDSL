package de.unidue.ecg.characterScript.util;

import de.unidue.ecg.characterScript.util.DefaultAttributeHelper;
import java.util.HashMap;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class LanguageUtil {
  private final static HashMap<String,DefaultAttributeHelper> defaults = new Function0<HashMap<String,DefaultAttributeHelper>>() {
    public HashMap<String,DefaultAttributeHelper> apply() {
      HashMap<String,DefaultAttributeHelper> _newHashMap = CollectionLiterals.<String, DefaultAttributeHelper>newHashMap();
      return _newHashMap;
    }
  }.apply();
  
  public static HashMap<String,DefaultAttributeHelper> getDefaultAttributes() {
    HashMap<String,DefaultAttributeHelper> _xblockexpression = null;
    {
      boolean _isEmpty = LanguageUtil.defaults.isEmpty();
      if (_isEmpty) {
        DefaultAttributeHelper _defaultAttributeHelper = new DefaultAttributeHelper("full name", "TEXT");
        LanguageUtil.defaults.put("full name", _defaultAttributeHelper);
        DefaultAttributeHelper _defaultAttributeHelper_1 = new DefaultAttributeHelper("age", "NUMBER");
        LanguageUtil.defaults.put("age", _defaultAttributeHelper_1);
        DefaultAttributeHelper _defaultAttributeHelper_2 = new DefaultAttributeHelper("sex", "ENUM");
        LanguageUtil.defaults.put("sex", _defaultAttributeHelper_2);
        DefaultAttributeHelper _defaultAttributeHelper_3 = new DefaultAttributeHelper("type", "ENUM");
        LanguageUtil.defaults.put("type", _defaultAttributeHelper_3);
        DefaultAttributeHelper _defaultAttributeHelper_4 = new DefaultAttributeHelper("description", "TEXT");
        LanguageUtil.defaults.put("description", _defaultAttributeHelper_4);
      }
      _xblockexpression = (LanguageUtil.defaults);
    }
    return _xblockexpression;
  }
}
