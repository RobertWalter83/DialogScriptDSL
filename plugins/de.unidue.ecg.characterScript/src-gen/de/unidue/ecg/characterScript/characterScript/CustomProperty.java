/**
 */
package de.unidue.ecg.characterScript.characterScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.CustomProperty#getCustomAttributeRef <em>Custom Attribute Ref</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.CustomProperty#getStringValue <em>String Value</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.CustomProperty#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.CustomProperty#getEnumValue <em>Enum Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getCustomProperty()
 * @model
 * @generated
 */
public interface CustomProperty extends Property
{
  /**
   * Returns the value of the '<em><b>Custom Attribute Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom Attribute Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom Attribute Ref</em>' reference.
   * @see #setCustomAttributeRef(CustomAttributeName)
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getCustomProperty_CustomAttributeRef()
   * @model
   * @generated
   */
  CustomAttributeName getCustomAttributeRef();

  /**
   * Sets the value of the '{@link de.unidue.ecg.characterScript.characterScript.CustomProperty#getCustomAttributeRef <em>Custom Attribute Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom Attribute Ref</em>' reference.
   * @see #getCustomAttributeRef()
   * @generated
   */
  void setCustomAttributeRef(CustomAttributeName value);

  /**
   * Returns the value of the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Value</em>' attribute.
   * @see #setStringValue(String)
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getCustomProperty_StringValue()
   * @model
   * @generated
   */
  String getStringValue();

  /**
   * Sets the value of the '{@link de.unidue.ecg.characterScript.characterScript.CustomProperty#getStringValue <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Value</em>' attribute.
   * @see #getStringValue()
   * @generated
   */
  void setStringValue(String value);

  /**
   * Returns the value of the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Value</em>' attribute.
   * @see #setIntValue(int)
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getCustomProperty_IntValue()
   * @model
   * @generated
   */
  int getIntValue();

  /**
   * Sets the value of the '{@link de.unidue.ecg.characterScript.characterScript.CustomProperty#getIntValue <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int Value</em>' attribute.
   * @see #getIntValue()
   * @generated
   */
  void setIntValue(int value);

  /**
   * Returns the value of the '<em><b>Enum Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Value</em>' reference.
   * @see #setEnumValue(EnumValue)
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getCustomProperty_EnumValue()
   * @model
   * @generated
   */
  EnumValue getEnumValue();

  /**
   * Sets the value of the '{@link de.unidue.ecg.characterScript.characterScript.CustomProperty#getEnumValue <em>Enum Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum Value</em>' reference.
   * @see #getEnumValue()
   * @generated
   */
  void setEnumValue(EnumValue value);

} // CustomProperty
