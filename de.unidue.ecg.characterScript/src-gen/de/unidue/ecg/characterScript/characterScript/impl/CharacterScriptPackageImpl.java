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
import de.unidue.ecg.characterScript.characterScript.Customs;
import de.unidue.ecg.characterScript.characterScript.DefaultProperty;
import de.unidue.ecg.characterScript.characterScript.Description;
import de.unidue.ecg.characterScript.characterScript.EnumValue;
import de.unidue.ecg.characterScript.characterScript.FullName;
import de.unidue.ecg.characterScript.characterScript.Import;
import de.unidue.ecg.characterScript.characterScript.Property;
import de.unidue.ecg.characterScript.characterScript.Sex;
import de.unidue.ecg.characterScript.characterScript.Template;
import de.unidue.ecg.characterScript.characterScript.Type;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CharacterScriptPackageImpl extends EPackageImpl implements CharacterScriptPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass charactersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customAttributeNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass characterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fullNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sexEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum attributeTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum charaTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum charaSexEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CharacterScriptPackageImpl()
  {
    super(eNS_URI, CharacterScriptFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CharacterScriptPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CharacterScriptPackage init()
  {
    if (isInited) return (CharacterScriptPackage)EPackage.Registry.INSTANCE.getEPackage(CharacterScriptPackage.eNS_URI);

    // Obtain or create and register package
    CharacterScriptPackageImpl theCharacterScriptPackage = (CharacterScriptPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CharacterScriptPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CharacterScriptPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCharacterScriptPackage.createPackageContents();

    // Initialize created meta-data
    theCharacterScriptPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCharacterScriptPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CharacterScriptPackage.eNS_URI, theCharacterScriptPackage);
    return theCharacterScriptPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCharacters()
  {
    return charactersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCharacters_Imports()
  {
    return (EReference)charactersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCharacters_Templates()
  {
    return (EReference)charactersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCharacters_Customs()
  {
    return (EReference)charactersEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCharacters_Characters()
  {
    return (EReference)charactersEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplate()
  {
    return templateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTemplate_Name()
  {
    return (EAttribute)templateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTemplate_Defaults()
  {
    return (EAttribute)templateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplate_Customs()
  {
    return (EReference)templateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomAttribute()
  {
    return customAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomAttribute_CaName()
  {
    return (EReference)customAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomAttribute_Type()
  {
    return (EAttribute)customAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomAttribute_EnumValues()
  {
    return (EReference)customAttributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomAttributeName()
  {
    return customAttributeNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomAttributeName_Name()
  {
    return (EAttribute)customAttributeNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumValue()
  {
    return enumValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumValue_Name()
  {
    return (EAttribute)enumValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustoms()
  {
    return customsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustoms_CustomAttributes()
  {
    return (EReference)customsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCharacter()
  {
    return characterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCharacter_Name()
  {
    return (EAttribute)characterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCharacter_Template()
  {
    return (EReference)characterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCharacter_Properties()
  {
    return (EReference)characterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Comment()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultProperty()
  {
    return defaultPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFullName()
  {
    return fullNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFullName_Value()
  {
    return (EAttribute)fullNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescription()
  {
    return descriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDescription_Value()
  {
    return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Value()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAge()
  {
    return ageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAge_Value()
  {
    return (EAttribute)ageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSex()
  {
    return sexEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSex_Value()
  {
    return (EAttribute)sexEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomProperty()
  {
    return customPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomProperty_CustomAttributeRef()
  {
    return (EReference)customPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomProperty_StringValue()
  {
    return (EAttribute)customPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomProperty_IntValue()
  {
    return (EAttribute)customPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomProperty_EnumValue()
  {
    return (EReference)customPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAttributeType()
  {
    return attributeTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCharaType()
  {
    return charaTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCharaSex()
  {
    return charaSexEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharacterScriptFactory getCharacterScriptFactory()
  {
    return (CharacterScriptFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    charactersEClass = createEClass(CHARACTERS);
    createEReference(charactersEClass, CHARACTERS__IMPORTS);
    createEReference(charactersEClass, CHARACTERS__TEMPLATES);
    createEReference(charactersEClass, CHARACTERS__CUSTOMS);
    createEReference(charactersEClass, CHARACTERS__CHARACTERS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    templateEClass = createEClass(TEMPLATE);
    createEAttribute(templateEClass, TEMPLATE__NAME);
    createEAttribute(templateEClass, TEMPLATE__DEFAULTS);
    createEReference(templateEClass, TEMPLATE__CUSTOMS);

    customAttributeEClass = createEClass(CUSTOM_ATTRIBUTE);
    createEReference(customAttributeEClass, CUSTOM_ATTRIBUTE__CA_NAME);
    createEAttribute(customAttributeEClass, CUSTOM_ATTRIBUTE__TYPE);
    createEReference(customAttributeEClass, CUSTOM_ATTRIBUTE__ENUM_VALUES);

    customAttributeNameEClass = createEClass(CUSTOM_ATTRIBUTE_NAME);
    createEAttribute(customAttributeNameEClass, CUSTOM_ATTRIBUTE_NAME__NAME);

    enumValueEClass = createEClass(ENUM_VALUE);
    createEAttribute(enumValueEClass, ENUM_VALUE__NAME);

    customsEClass = createEClass(CUSTOMS);
    createEReference(customsEClass, CUSTOMS__CUSTOM_ATTRIBUTES);

    characterEClass = createEClass(CHARACTER);
    createEAttribute(characterEClass, CHARACTER__NAME);
    createEReference(characterEClass, CHARACTER__TEMPLATE);
    createEReference(characterEClass, CHARACTER__PROPERTIES);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__COMMENT);

    defaultPropertyEClass = createEClass(DEFAULT_PROPERTY);

    fullNameEClass = createEClass(FULL_NAME);
    createEAttribute(fullNameEClass, FULL_NAME__VALUE);

    descriptionEClass = createEClass(DESCRIPTION);
    createEAttribute(descriptionEClass, DESCRIPTION__VALUE);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__VALUE);

    ageEClass = createEClass(AGE);
    createEAttribute(ageEClass, AGE__VALUE);

    sexEClass = createEClass(SEX);
    createEAttribute(sexEClass, SEX__VALUE);

    customPropertyEClass = createEClass(CUSTOM_PROPERTY);
    createEReference(customPropertyEClass, CUSTOM_PROPERTY__CUSTOM_ATTRIBUTE_REF);
    createEAttribute(customPropertyEClass, CUSTOM_PROPERTY__STRING_VALUE);
    createEAttribute(customPropertyEClass, CUSTOM_PROPERTY__INT_VALUE);
    createEReference(customPropertyEClass, CUSTOM_PROPERTY__ENUM_VALUE);

    // Create enums
    attributeTypeEEnum = createEEnum(ATTRIBUTE_TYPE);
    charaTypeEEnum = createEEnum(CHARA_TYPE);
    charaSexEEnum = createEEnum(CHARA_SEX);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    defaultPropertyEClass.getESuperTypes().add(this.getProperty());
    fullNameEClass.getESuperTypes().add(this.getDefaultProperty());
    descriptionEClass.getESuperTypes().add(this.getDefaultProperty());
    typeEClass.getESuperTypes().add(this.getDefaultProperty());
    ageEClass.getESuperTypes().add(this.getDefaultProperty());
    sexEClass.getESuperTypes().add(this.getDefaultProperty());
    customPropertyEClass.getESuperTypes().add(this.getProperty());

    // Initialize classes and features; add operations and parameters
    initEClass(charactersEClass, Characters.class, "Characters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCharacters_Imports(), this.getImport(), null, "imports", null, 0, -1, Characters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCharacters_Templates(), this.getTemplate(), null, "templates", null, 0, -1, Characters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCharacters_Customs(), this.getCustoms(), null, "customs", null, 0, 1, Characters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCharacters_Characters(), this.getCharacter(), null, "characters", null, 0, -1, Characters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateEClass, Template.class, "Template", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTemplate_Name(), ecorePackage.getEString(), "name", null, 0, 1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTemplate_Defaults(), ecorePackage.getEString(), "defaults", null, 0, -1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplate_Customs(), this.getCustomAttribute(), null, "customs", null, 0, -1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customAttributeEClass, CustomAttribute.class, "CustomAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCustomAttribute_CaName(), this.getCustomAttributeName(), null, "caName", null, 0, 1, CustomAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomAttribute_Type(), this.getAttributeType(), "type", null, 0, 1, CustomAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomAttribute_EnumValues(), this.getEnumValue(), null, "enumValues", null, 0, -1, CustomAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customAttributeNameEClass, CustomAttributeName.class, "CustomAttributeName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomAttributeName_Name(), ecorePackage.getEString(), "name", null, 0, 1, CustomAttributeName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumValueEClass, EnumValue.class, "EnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customsEClass, Customs.class, "Customs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCustoms_CustomAttributes(), this.getCustomAttribute(), null, "customAttributes", null, 0, -1, Customs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(characterEClass, de.unidue.ecg.characterScript.characterScript.Character.class, "Character", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCharacter_Name(), ecorePackage.getEString(), "name", null, 0, 1, de.unidue.ecg.characterScript.characterScript.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCharacter_Template(), this.getTemplate(), null, "template", null, 0, 1, de.unidue.ecg.characterScript.characterScript.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCharacter_Properties(), this.getProperty(), null, "properties", null, 0, -1, de.unidue.ecg.characterScript.characterScript.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defaultPropertyEClass, DefaultProperty.class, "DefaultProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fullNameEClass, FullName.class, "FullName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFullName_Value(), ecorePackage.getEString(), "value", null, 0, 1, FullName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDescription_Value(), ecorePackage.getEString(), "value", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Value(), this.getCharaType(), "value", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ageEClass, Age.class, "Age", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAge_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Age.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sexEClass, Sex.class, "Sex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSex_Value(), this.getCharaSex(), "value", null, 0, 1, Sex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customPropertyEClass, CustomProperty.class, "CustomProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCustomProperty_CustomAttributeRef(), this.getCustomAttributeName(), null, "customAttributeRef", null, 0, 1, CustomProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomProperty_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, CustomProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomProperty_IntValue(), ecorePackage.getEInt(), "intValue", null, 0, 1, CustomProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomProperty_EnumValue(), this.getEnumValue(), null, "enumValue", null, 0, 1, CustomProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(attributeTypeEEnum, AttributeType.class, "AttributeType");
    addEEnumLiteral(attributeTypeEEnum, AttributeType.NUMBER);
    addEEnumLiteral(attributeTypeEEnum, AttributeType.TEXT);

    initEEnum(charaTypeEEnum, CharaType.class, "CharaType");
    addEEnumLiteral(charaTypeEEnum, CharaType.PC);
    addEEnumLiteral(charaTypeEEnum, CharaType.NPC);

    initEEnum(charaSexEEnum, CharaSex.class, "CharaSex");
    addEEnumLiteral(charaSexEEnum, CharaSex.MALE);
    addEEnumLiteral(charaSexEEnum, CharaSex.FEMALE);

    // Create resource
    createResource(eNS_URI);
  }

} //CharacterScriptPackageImpl
