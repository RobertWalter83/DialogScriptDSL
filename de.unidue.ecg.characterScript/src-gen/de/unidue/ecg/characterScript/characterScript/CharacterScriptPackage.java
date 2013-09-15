/**
 */
package de.unidue.ecg.characterScript.characterScript;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptFactory
 * @model kind="package"
 * @generated
 */
public interface CharacterScriptPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "characterScript";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.unidue.de/ecg/characterScript/CharacterScript";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "characterScript";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CharacterScriptPackage eINSTANCE = de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl.init();

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.impl.CharactersImpl <em>Characters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharactersImpl
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getCharacters()
   * @generated
   */
  int CHARACTERS = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERS__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Templates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERS__TEMPLATES = 1;

  /**
   * The feature id for the '<em><b>Customs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERS__CUSTOMS = 2;

  /**
   * The feature id for the '<em><b>Characters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERS__CHARACTERS = 3;

  /**
   * The number of structural features of the '<em>Characters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.impl.ImportImpl
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.impl.TemplateImpl <em>Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.impl.TemplateImpl
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getTemplate()
   * @generated
   */
  int TEMPLATE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Defaults</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__DEFAULTS = 1;

  /**
   * The feature id for the '<em><b>Customs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__CUSTOMS = 2;

  /**
   * The number of structural features of the '<em>Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.impl.CustomAttributeImpl <em>Custom Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.impl.CustomAttributeImpl
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getCustomAttribute()
   * @generated
   */
  int CUSTOM_ATTRIBUTE = 3;

  /**
   * The feature id for the '<em><b>Ca Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_ATTRIBUTE__CA_NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_ATTRIBUTE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Enum Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_ATTRIBUTE__ENUM_VALUES = 2;

  /**
   * The number of structural features of the '<em>Custom Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.impl.CustomAttributeNameImpl <em>Custom Attribute Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.impl.CustomAttributeNameImpl
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getCustomAttributeName()
   * @generated
   */
  int CUSTOM_ATTRIBUTE_NAME = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_ATTRIBUTE_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Custom Attribute Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_ATTRIBUTE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.impl.EnumValueImpl <em>Enum Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.impl.EnumValueImpl
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getEnumValue()
   * @generated
   */
  int ENUM_VALUE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE__NAME = 0;

  /**
   * The number of structural features of the '<em>Enum Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.impl.CustomsImpl <em>Customs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.impl.CustomsImpl
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getCustoms()
   * @generated
   */
  int CUSTOMS = 6;

  /**
   * The feature id for the '<em><b>Custom Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMS__CUSTOM_ATTRIBUTES = 0;

  /**
   * The number of structural features of the '<em>Customs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.impl.CharacterImpl <em>Character</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterImpl
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getCharacter()
   * @generated
   */
  int CHARACTER = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__NAME = 0;

  /**
   * The feature id for the '<em><b>Template</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__TEMPLATE = 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER__PROPERTIES = 2;

  /**
   * The number of structural features of the '<em>Character</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.impl.PropertyImpl
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 8;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__COMMENT = 0;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.impl.DefaultPropertyImpl <em>Default Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.impl.DefaultPropertyImpl
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getDefaultProperty()
   * @generated
   */
  int DEFAULT_PROPERTY = 9;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_PROPERTY__COMMENT = PROPERTY__COMMENT;

  /**
   * The number of structural features of the '<em>Default Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.impl.FullNameImpl <em>Full Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.impl.FullNameImpl
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getFullName()
   * @generated
   */
  int FULL_NAME = 10;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_NAME__COMMENT = DEFAULT_PROPERTY__COMMENT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_NAME__VALUE = DEFAULT_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Full Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_NAME_FEATURE_COUNT = DEFAULT_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.impl.DescriptionImpl <em>Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.impl.DescriptionImpl
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getDescription()
   * @generated
   */
  int DESCRIPTION = 11;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__COMMENT = DEFAULT_PROPERTY__COMMENT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__VALUE = DEFAULT_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_FEATURE_COUNT = DEFAULT_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.impl.TypeImpl
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getType()
   * @generated
   */
  int TYPE = 12;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__COMMENT = DEFAULT_PROPERTY__COMMENT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__VALUE = DEFAULT_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = DEFAULT_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.impl.AgeImpl <em>Age</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.impl.AgeImpl
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getAge()
   * @generated
   */
  int AGE = 13;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGE__COMMENT = DEFAULT_PROPERTY__COMMENT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGE__VALUE = DEFAULT_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Age</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGE_FEATURE_COUNT = DEFAULT_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.impl.SexImpl <em>Sex</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.impl.SexImpl
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getSex()
   * @generated
   */
  int SEX = 14;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEX__COMMENT = DEFAULT_PROPERTY__COMMENT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEX__VALUE = DEFAULT_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEX_FEATURE_COUNT = DEFAULT_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.impl.CustomPropertyImpl <em>Custom Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.impl.CustomPropertyImpl
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getCustomProperty()
   * @generated
   */
  int CUSTOM_PROPERTY = 15;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_PROPERTY__COMMENT = PROPERTY__COMMENT;

  /**
   * The feature id for the '<em><b>Custom Attribute Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_PROPERTY__CUSTOM_ATTRIBUTE_REF = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_PROPERTY__STRING_VALUE = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_PROPERTY__INT_VALUE = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enum Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_PROPERTY__ENUM_VALUE = PROPERTY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Custom Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.AttributeType <em>Attribute Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.AttributeType
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getAttributeType()
   * @generated
   */
  int ATTRIBUTE_TYPE = 16;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.CharaType <em>Chara Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.CharaType
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getCharaType()
   * @generated
   */
  int CHARA_TYPE = 17;

  /**
   * The meta object id for the '{@link de.unidue.ecg.characterScript.characterScript.CharaSex <em>Chara Sex</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.characterScript.characterScript.CharaSex
   * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getCharaSex()
   * @generated
   */
  int CHARA_SEX = 18;


  /**
   * Returns the meta object for class '{@link de.unidue.ecg.characterScript.characterScript.Characters <em>Characters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Characters</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Characters
   * @generated
   */
  EClass getCharacters();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.characterScript.characterScript.Characters#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Characters#getImports()
   * @see #getCharacters()
   * @generated
   */
  EReference getCharacters_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.characterScript.characterScript.Characters#getTemplates <em>Templates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Templates</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Characters#getTemplates()
   * @see #getCharacters()
   * @generated
   */
  EReference getCharacters_Templates();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.characterScript.characterScript.Characters#getCustoms <em>Customs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Customs</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Characters#getCustoms()
   * @see #getCharacters()
   * @generated
   */
  EReference getCharacters_Customs();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.characterScript.characterScript.Characters#getCharacters <em>Characters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Characters</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Characters#getCharacters()
   * @see #getCharacters()
   * @generated
   */
  EReference getCharacters_Characters();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.characterScript.characterScript.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.characterScript.characterScript.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.characterScript.characterScript.Template <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Template
   * @generated
   */
  EClass getTemplate();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.characterScript.characterScript.Template#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Template#getName()
   * @see #getTemplate()
   * @generated
   */
  EAttribute getTemplate_Name();

  /**
   * Returns the meta object for the attribute list '{@link de.unidue.ecg.characterScript.characterScript.Template#getDefaults <em>Defaults</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Defaults</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Template#getDefaults()
   * @see #getTemplate()
   * @generated
   */
  EAttribute getTemplate_Defaults();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.characterScript.characterScript.Template#getCustoms <em>Customs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Customs</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Template#getCustoms()
   * @see #getTemplate()
   * @generated
   */
  EReference getTemplate_Customs();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.characterScript.characterScript.CustomAttribute <em>Custom Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Attribute</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.CustomAttribute
   * @generated
   */
  EClass getCustomAttribute();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.characterScript.characterScript.CustomAttribute#getCaName <em>Ca Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ca Name</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.CustomAttribute#getCaName()
   * @see #getCustomAttribute()
   * @generated
   */
  EReference getCustomAttribute_CaName();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.characterScript.characterScript.CustomAttribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.CustomAttribute#getType()
   * @see #getCustomAttribute()
   * @generated
   */
  EAttribute getCustomAttribute_Type();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.characterScript.characterScript.CustomAttribute#getEnumValues <em>Enum Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enum Values</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.CustomAttribute#getEnumValues()
   * @see #getCustomAttribute()
   * @generated
   */
  EReference getCustomAttribute_EnumValues();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.characterScript.characterScript.CustomAttributeName <em>Custom Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Attribute Name</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.CustomAttributeName
   * @generated
   */
  EClass getCustomAttributeName();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.characterScript.characterScript.CustomAttributeName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.CustomAttributeName#getName()
   * @see #getCustomAttributeName()
   * @generated
   */
  EAttribute getCustomAttributeName_Name();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.characterScript.characterScript.EnumValue <em>Enum Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Value</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.EnumValue
   * @generated
   */
  EClass getEnumValue();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.characterScript.characterScript.EnumValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.EnumValue#getName()
   * @see #getEnumValue()
   * @generated
   */
  EAttribute getEnumValue_Name();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.characterScript.characterScript.Customs <em>Customs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Customs</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Customs
   * @generated
   */
  EClass getCustoms();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.characterScript.characterScript.Customs#getCustomAttributes <em>Custom Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Custom Attributes</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Customs#getCustomAttributes()
   * @see #getCustoms()
   * @generated
   */
  EReference getCustoms_CustomAttributes();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.characterScript.characterScript.Character <em>Character</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Character</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Character
   * @generated
   */
  EClass getCharacter();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.characterScript.characterScript.Character#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Character#getName()
   * @see #getCharacter()
   * @generated
   */
  EAttribute getCharacter_Name();

  /**
   * Returns the meta object for the reference '{@link de.unidue.ecg.characterScript.characterScript.Character#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Template</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Character#getTemplate()
   * @see #getCharacter()
   * @generated
   */
  EReference getCharacter_Template();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.characterScript.characterScript.Character#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Character#getProperties()
   * @see #getCharacter()
   * @generated
   */
  EReference getCharacter_Properties();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.characterScript.characterScript.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.characterScript.characterScript.Property#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Property#getComment()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Comment();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.characterScript.characterScript.DefaultProperty <em>Default Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Property</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.DefaultProperty
   * @generated
   */
  EClass getDefaultProperty();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.characterScript.characterScript.FullName <em>Full Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Full Name</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.FullName
   * @generated
   */
  EClass getFullName();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.characterScript.characterScript.FullName#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.FullName#getValue()
   * @see #getFullName()
   * @generated
   */
  EAttribute getFullName_Value();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.characterScript.characterScript.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Description
   * @generated
   */
  EClass getDescription();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.characterScript.characterScript.Description#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Description#getValue()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_Value();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.characterScript.characterScript.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.characterScript.characterScript.Type#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Type#getValue()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Value();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.characterScript.characterScript.Age <em>Age</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Age</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Age
   * @generated
   */
  EClass getAge();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.characterScript.characterScript.Age#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Age#getValue()
   * @see #getAge()
   * @generated
   */
  EAttribute getAge_Value();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.characterScript.characterScript.Sex <em>Sex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sex</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Sex
   * @generated
   */
  EClass getSex();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.characterScript.characterScript.Sex#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.Sex#getValue()
   * @see #getSex()
   * @generated
   */
  EAttribute getSex_Value();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.characterScript.characterScript.CustomProperty <em>Custom Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Property</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.CustomProperty
   * @generated
   */
  EClass getCustomProperty();

  /**
   * Returns the meta object for the reference '{@link de.unidue.ecg.characterScript.characterScript.CustomProperty#getCustomAttributeRef <em>Custom Attribute Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Custom Attribute Ref</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.CustomProperty#getCustomAttributeRef()
   * @see #getCustomProperty()
   * @generated
   */
  EReference getCustomProperty_CustomAttributeRef();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.characterScript.characterScript.CustomProperty#getStringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Value</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.CustomProperty#getStringValue()
   * @see #getCustomProperty()
   * @generated
   */
  EAttribute getCustomProperty_StringValue();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.characterScript.characterScript.CustomProperty#getIntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Value</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.CustomProperty#getIntValue()
   * @see #getCustomProperty()
   * @generated
   */
  EAttribute getCustomProperty_IntValue();

  /**
   * Returns the meta object for the reference '{@link de.unidue.ecg.characterScript.characterScript.CustomProperty#getEnumValue <em>Enum Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Enum Value</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.CustomProperty#getEnumValue()
   * @see #getCustomProperty()
   * @generated
   */
  EReference getCustomProperty_EnumValue();

  /**
   * Returns the meta object for enum '{@link de.unidue.ecg.characterScript.characterScript.AttributeType <em>Attribute Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute Type</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.AttributeType
   * @generated
   */
  EEnum getAttributeType();

  /**
   * Returns the meta object for enum '{@link de.unidue.ecg.characterScript.characterScript.CharaType <em>Chara Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Chara Type</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.CharaType
   * @generated
   */
  EEnum getCharaType();

  /**
   * Returns the meta object for enum '{@link de.unidue.ecg.characterScript.characterScript.CharaSex <em>Chara Sex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Chara Sex</em>'.
   * @see de.unidue.ecg.characterScript.characterScript.CharaSex
   * @generated
   */
  EEnum getCharaSex();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CharacterScriptFactory getCharacterScriptFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.impl.CharactersImpl <em>Characters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharactersImpl
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getCharacters()
     * @generated
     */
    EClass CHARACTERS = eINSTANCE.getCharacters();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHARACTERS__IMPORTS = eINSTANCE.getCharacters_Imports();

    /**
     * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHARACTERS__TEMPLATES = eINSTANCE.getCharacters_Templates();

    /**
     * The meta object literal for the '<em><b>Customs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHARACTERS__CUSTOMS = eINSTANCE.getCharacters_Customs();

    /**
     * The meta object literal for the '<em><b>Characters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHARACTERS__CHARACTERS = eINSTANCE.getCharacters_Characters();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.impl.ImportImpl
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.impl.TemplateImpl <em>Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.impl.TemplateImpl
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getTemplate()
     * @generated
     */
    EClass TEMPLATE = eINSTANCE.getTemplate();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPLATE__NAME = eINSTANCE.getTemplate_Name();

    /**
     * The meta object literal for the '<em><b>Defaults</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPLATE__DEFAULTS = eINSTANCE.getTemplate_Defaults();

    /**
     * The meta object literal for the '<em><b>Customs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE__CUSTOMS = eINSTANCE.getTemplate_Customs();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.impl.CustomAttributeImpl <em>Custom Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.impl.CustomAttributeImpl
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getCustomAttribute()
     * @generated
     */
    EClass CUSTOM_ATTRIBUTE = eINSTANCE.getCustomAttribute();

    /**
     * The meta object literal for the '<em><b>Ca Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_ATTRIBUTE__CA_NAME = eINSTANCE.getCustomAttribute_CaName();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_ATTRIBUTE__TYPE = eINSTANCE.getCustomAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Enum Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_ATTRIBUTE__ENUM_VALUES = eINSTANCE.getCustomAttribute_EnumValues();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.impl.CustomAttributeNameImpl <em>Custom Attribute Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.impl.CustomAttributeNameImpl
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getCustomAttributeName()
     * @generated
     */
    EClass CUSTOM_ATTRIBUTE_NAME = eINSTANCE.getCustomAttributeName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_ATTRIBUTE_NAME__NAME = eINSTANCE.getCustomAttributeName_Name();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.impl.EnumValueImpl <em>Enum Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.impl.EnumValueImpl
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getEnumValue()
     * @generated
     */
    EClass ENUM_VALUE = eINSTANCE.getEnumValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_VALUE__NAME = eINSTANCE.getEnumValue_Name();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.impl.CustomsImpl <em>Customs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.impl.CustomsImpl
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getCustoms()
     * @generated
     */
    EClass CUSTOMS = eINSTANCE.getCustoms();

    /**
     * The meta object literal for the '<em><b>Custom Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOMS__CUSTOM_ATTRIBUTES = eINSTANCE.getCustoms_CustomAttributes();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.impl.CharacterImpl <em>Character</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterImpl
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getCharacter()
     * @generated
     */
    EClass CHARACTER = eINSTANCE.getCharacter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER__NAME = eINSTANCE.getCharacter_Name();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHARACTER__TEMPLATE = eINSTANCE.getCharacter_Template();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHARACTER__PROPERTIES = eINSTANCE.getCharacter_Properties();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.impl.PropertyImpl
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__COMMENT = eINSTANCE.getProperty_Comment();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.impl.DefaultPropertyImpl <em>Default Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.impl.DefaultPropertyImpl
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getDefaultProperty()
     * @generated
     */
    EClass DEFAULT_PROPERTY = eINSTANCE.getDefaultProperty();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.impl.FullNameImpl <em>Full Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.impl.FullNameImpl
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getFullName()
     * @generated
     */
    EClass FULL_NAME = eINSTANCE.getFullName();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FULL_NAME__VALUE = eINSTANCE.getFullName_Value();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.impl.DescriptionImpl <em>Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.impl.DescriptionImpl
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getDescription()
     * @generated
     */
    EClass DESCRIPTION = eINSTANCE.getDescription();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__VALUE = eINSTANCE.getDescription_Value();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.impl.TypeImpl
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__VALUE = eINSTANCE.getType_Value();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.impl.AgeImpl <em>Age</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.impl.AgeImpl
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getAge()
     * @generated
     */
    EClass AGE = eINSTANCE.getAge();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGE__VALUE = eINSTANCE.getAge_Value();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.impl.SexImpl <em>Sex</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.impl.SexImpl
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getSex()
     * @generated
     */
    EClass SEX = eINSTANCE.getSex();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEX__VALUE = eINSTANCE.getSex_Value();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.impl.CustomPropertyImpl <em>Custom Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.impl.CustomPropertyImpl
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getCustomProperty()
     * @generated
     */
    EClass CUSTOM_PROPERTY = eINSTANCE.getCustomProperty();

    /**
     * The meta object literal for the '<em><b>Custom Attribute Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_PROPERTY__CUSTOM_ATTRIBUTE_REF = eINSTANCE.getCustomProperty_CustomAttributeRef();

    /**
     * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_PROPERTY__STRING_VALUE = eINSTANCE.getCustomProperty_StringValue();

    /**
     * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_PROPERTY__INT_VALUE = eINSTANCE.getCustomProperty_IntValue();

    /**
     * The meta object literal for the '<em><b>Enum Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_PROPERTY__ENUM_VALUE = eINSTANCE.getCustomProperty_EnumValue();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.AttributeType <em>Attribute Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.AttributeType
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getAttributeType()
     * @generated
     */
    EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.CharaType <em>Chara Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.CharaType
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getCharaType()
     * @generated
     */
    EEnum CHARA_TYPE = eINSTANCE.getCharaType();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.characterScript.characterScript.CharaSex <em>Chara Sex</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.characterScript.characterScript.CharaSex
     * @see de.unidue.ecg.characterScript.characterScript.impl.CharacterScriptPackageImpl#getCharaSex()
     * @generated
     */
    EEnum CHARA_SEX = eINSTANCE.getCharaSex();

  }

} //CharacterScriptPackage
