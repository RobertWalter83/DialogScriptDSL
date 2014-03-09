/**
 */
package de.unidue.ecg.characterScript.characterScript.impl;

import de.unidue.ecg.characterScript.characterScript.Age;
import de.unidue.ecg.characterScript.characterScript.AttributeType;
import de.unidue.ecg.characterScript.characterScript.CharaSex;
import de.unidue.ecg.characterScript.characterScript.CharaType;
import de.unidue.ecg.characterScript.characterScript.CharacterScriptFactory;
import de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage;
import de.unidue.ecg.characterScript.characterScript.Characters;
import de.unidue.ecg.characterScript.characterScript.CustomAttribute;
import de.unidue.ecg.characterScript.characterScript.CustomAttributeName;
import de.unidue.ecg.characterScript.characterScript.CustomProperty;
import de.unidue.ecg.characterScript.characterScript.DefaultProperty;
import de.unidue.ecg.characterScript.characterScript.Description;
import de.unidue.ecg.characterScript.characterScript.EnumValue;
import de.unidue.ecg.characterScript.characterScript.FullName;
import de.unidue.ecg.characterScript.characterScript.Globals;
import de.unidue.ecg.characterScript.characterScript.Import;
import de.unidue.ecg.characterScript.characterScript.Property;
import de.unidue.ecg.characterScript.characterScript.Sex;
import de.unidue.ecg.characterScript.characterScript.Template;
import de.unidue.ecg.characterScript.characterScript.Type;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CharacterScriptFactoryImpl extends EFactoryImpl implements CharacterScriptFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CharacterScriptFactory init()
  {
    try
    {
      CharacterScriptFactory theCharacterScriptFactory = (CharacterScriptFactory)EPackage.Registry.INSTANCE.getEFactory(CharacterScriptPackage.eNS_URI);
      if (theCharacterScriptFactory != null)
      {
        return theCharacterScriptFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CharacterScriptFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharacterScriptFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CharacterScriptPackage.CHARACTERS: return createCharacters();
      case CharacterScriptPackage.IMPORT: return createImport();
      case CharacterScriptPackage.TEMPLATE: return createTemplate();
      case CharacterScriptPackage.CUSTOM_ATTRIBUTE: return createCustomAttribute();
      case CharacterScriptPackage.CUSTOM_ATTRIBUTE_NAME: return createCustomAttributeName();
      case CharacterScriptPackage.ENUM_VALUE: return createEnumValue();
      case CharacterScriptPackage.GLOBALS: return createGlobals();
      case CharacterScriptPackage.CHARACTER: return createCharacter();
      case CharacterScriptPackage.PROPERTY: return createProperty();
      case CharacterScriptPackage.DEFAULT_PROPERTY: return createDefaultProperty();
      case CharacterScriptPackage.FULL_NAME: return createFullName();
      case CharacterScriptPackage.DESCRIPTION: return createDescription();
      case CharacterScriptPackage.TYPE: return createType();
      case CharacterScriptPackage.AGE: return createAge();
      case CharacterScriptPackage.SEX: return createSex();
      case CharacterScriptPackage.CUSTOM_PROPERTY: return createCustomProperty();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CharacterScriptPackage.ATTRIBUTE_TYPE:
        return createAttributeTypeFromString(eDataType, initialValue);
      case CharacterScriptPackage.CHARA_TYPE:
        return createCharaTypeFromString(eDataType, initialValue);
      case CharacterScriptPackage.CHARA_SEX:
        return createCharaSexFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CharacterScriptPackage.ATTRIBUTE_TYPE:
        return convertAttributeTypeToString(eDataType, instanceValue);
      case CharacterScriptPackage.CHARA_TYPE:
        return convertCharaTypeToString(eDataType, instanceValue);
      case CharacterScriptPackage.CHARA_SEX:
        return convertCharaSexToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Characters createCharacters()
  {
    CharactersImpl characters = new CharactersImpl();
    return characters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Template createTemplate()
  {
    TemplateImpl template = new TemplateImpl();
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomAttribute createCustomAttribute()
  {
    CustomAttributeImpl customAttribute = new CustomAttributeImpl();
    return customAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomAttributeName createCustomAttributeName()
  {
    CustomAttributeNameImpl customAttributeName = new CustomAttributeNameImpl();
    return customAttributeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumValue createEnumValue()
  {
    EnumValueImpl enumValue = new EnumValueImpl();
    return enumValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Globals createGlobals()
  {
    GlobalsImpl globals = new GlobalsImpl();
    return globals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.unidue.ecg.characterScript.characterScript.Character createCharacter()
  {
    CharacterImpl character = new CharacterImpl();
    return character;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultProperty createDefaultProperty()
  {
    DefaultPropertyImpl defaultProperty = new DefaultPropertyImpl();
    return defaultProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FullName createFullName()
  {
    FullNameImpl fullName = new FullNameImpl();
    return fullName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description createDescription()
  {
    DescriptionImpl description = new DescriptionImpl();
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Age createAge()
  {
    AgeImpl age = new AgeImpl();
    return age;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sex createSex()
  {
    SexImpl sex = new SexImpl();
    return sex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomProperty createCustomProperty()
  {
    CustomPropertyImpl customProperty = new CustomPropertyImpl();
    return customProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue)
  {
    AttributeType result = AttributeType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharaType createCharaTypeFromString(EDataType eDataType, String initialValue)
  {
    CharaType result = CharaType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCharaTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharaSex createCharaSexFromString(EDataType eDataType, String initialValue)
  {
    CharaSex result = CharaSex.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCharaSexToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharacterScriptPackage getCharacterScriptPackage()
  {
    return (CharacterScriptPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CharacterScriptPackage getPackage()
  {
    return CharacterScriptPackage.eINSTANCE;
  }

} //CharacterScriptFactoryImpl
