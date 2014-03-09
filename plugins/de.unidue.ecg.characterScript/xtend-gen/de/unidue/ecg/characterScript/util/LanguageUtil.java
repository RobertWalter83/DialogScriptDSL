package de.unidue.ecg.characterScript.util;

import de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage.Literals;
import de.unidue.ecg.characterScript.util.DefaultAttributeHelper;
import java.util.HashMap;
import org.eclipse.emf.ecore.EClass;
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
  
  private final static HashMap<EClass,String> defaults2 = new Function0<HashMap<EClass,String>>() {
    public HashMap<EClass,String> apply() {
      HashMap<EClass,String> _newHashMap = CollectionLiterals.<EClass, String>newHashMap();
      return _newHashMap;
    }
  }.apply();
  
  public static HashMap<String,DefaultAttributeHelper> getDefaultAttributes() {
    HashMap<String,DefaultAttributeHelper> _xblockexpression = null;
    {
      boolean _isEmpty = LanguageUtil.defaults.isEmpty();
      if (_isEmpty) {
        DefaultAttributeHelper _defaultAttributeHelper = new DefaultAttributeHelper("full name", "TEXT", Literals.FULL_NAME);
        LanguageUtil.defaults.put("full name", _defaultAttributeHelper);
        DefaultAttributeHelper _defaultAttributeHelper_1 = new DefaultAttributeHelper("age", "NUMBER", Literals.AGE);
        LanguageUtil.defaults.put("age", _defaultAttributeHelper_1);
        DefaultAttributeHelper _defaultAttributeHelper_2 = new DefaultAttributeHelper("sex", "ENUM", Literals.SEX);
        LanguageUtil.defaults.put("sex", _defaultAttributeHelper_2);
        DefaultAttributeHelper _defaultAttributeHelper_3 = new DefaultAttributeHelper("type", "ENUM", Literals.TYPE);
        LanguageUtil.defaults.put("type", _defaultAttributeHelper_3);
        DefaultAttributeHelper _defaultAttributeHelper_4 = new DefaultAttributeHelper("description", "TEXT", Literals.DESCRIPTION);
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
        LanguageUtil.defaults2.put(Literals.FULL_NAME, "full name");
        LanguageUtil.defaults2.put(Literals.AGE, "age");
        LanguageUtil.defaults2.put(Literals.SEX, "sex");
        LanguageUtil.defaults2.put(Literals.TYPE, "type");
        LanguageUtil.defaults2.put(Literals.DESCRIPTION, "description");
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
