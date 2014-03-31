package de.unidue.ecg.characterScript.util;

import de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage;
import de.unidue.ecg.characterScript.util.DefaultAttributeHelper;
import java.util.HashMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class LanguageUtil {
  private final static HashMap<String,DefaultAttributeHelper> defaults = CollectionLiterals.<String, DefaultAttributeHelper>newHashMap();
  
  private final static HashMap<EClass,String> defaults2 = CollectionLiterals.<EClass, String>newHashMap();
  
  public static HashMap<String,DefaultAttributeHelper> getDefaultAttributes() {
    HashMap<String,DefaultAttributeHelper> _xblockexpression = null;
    {
      boolean _isEmpty = LanguageUtil.defaults.isEmpty();
      if (_isEmpty) {
        DefaultAttributeHelper _defaultAttributeHelper = new DefaultAttributeHelper("full name", "TEXT", CharacterScriptPackage.Literals.FULL_NAME);
        LanguageUtil.defaults.put("full name", _defaultAttributeHelper);
        DefaultAttributeHelper _defaultAttributeHelper_1 = new DefaultAttributeHelper("age", "NUMBER", CharacterScriptPackage.Literals.AGE);
        LanguageUtil.defaults.put("age", _defaultAttributeHelper_1);
        DefaultAttributeHelper _defaultAttributeHelper_2 = new DefaultAttributeHelper("sex", "ENUM", CharacterScriptPackage.Literals.SEX);
        LanguageUtil.defaults.put("sex", _defaultAttributeHelper_2);
        DefaultAttributeHelper _defaultAttributeHelper_3 = new DefaultAttributeHelper("type", "ENUM", CharacterScriptPackage.Literals.TYPE);
        LanguageUtil.defaults.put("type", _defaultAttributeHelper_3);
        DefaultAttributeHelper _defaultAttributeHelper_4 = new DefaultAttributeHelper("description", "TEXT", CharacterScriptPackage.Literals.DESCRIPTION);
        LanguageUtil.defaults.put("description", _defaultAttributeHelper_4);
      }
      _xblockexpression = (LanguageUtil.defaults);
    }
    return _xblockexpression;
  }
  
  private static HashMap<EClass,String> getDefaultAttributes2() {
    HashMap<EClass,String> _xblockexpression = null;
    {
      boolean _isEmpty = LanguageUtil.defaults2.isEmpty();
      if (_isEmpty) {
        LanguageUtil.defaults2.put(CharacterScriptPackage.Literals.FULL_NAME, "full name");
        LanguageUtil.defaults2.put(CharacterScriptPackage.Literals.AGE, "age");
        LanguageUtil.defaults2.put(CharacterScriptPackage.Literals.SEX, "sex");
        LanguageUtil.defaults2.put(CharacterScriptPackage.Literals.TYPE, "type");
        LanguageUtil.defaults2.put(CharacterScriptPackage.Literals.DESCRIPTION, "description");
      }
      _xblockexpression = (LanguageUtil.defaults2);
    }
    return _xblockexpression;
  }
  
  public static EClass getEClassFor(final String key) {
    HashMap<String,DefaultAttributeHelper> _defaultAttributes = LanguageUtil.getDefaultAttributes();
    DefaultAttributeHelper _get = _defaultAttributes.get(key);
    EClass _eClass = _get.getEClass();
    return _eClass;
  }
  
  public static String getKeywordValueFor(final EClass key) {
    HashMap<EClass,String> _defaultAttributes2 = LanguageUtil.getDefaultAttributes2();
    String _get = _defaultAttributes2.get(key);
    return _get;
  }
}
