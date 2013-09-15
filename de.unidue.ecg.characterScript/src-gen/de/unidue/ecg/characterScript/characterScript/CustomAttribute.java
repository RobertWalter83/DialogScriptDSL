/**
 */
package de.unidue.ecg.characterScript.characterScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.CustomAttribute#getCaName <em>Ca Name</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.CustomAttribute#getType <em>Type</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.CustomAttribute#getEnumValues <em>Enum Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getCustomAttribute()
 * @model
 * @generated
 */
public interface CustomAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Ca Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ca Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ca Name</em>' containment reference.
   * @see #setCaName(CustomAttributeName)
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getCustomAttribute_CaName()
   * @model containment="true"
   * @generated
   */
  CustomAttributeName getCaName();

  /**
   * Sets the value of the '{@link de.unidue.ecg.characterScript.characterScript.CustomAttribute#getCaName <em>Ca Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ca Name</em>' containment reference.
   * @see #getCaName()
   * @generated
   */
  void setCaName(CustomAttributeName value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.unidue.ecg.characterScript.characterScript.AttributeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see de.unidue.ecg.characterScript.characterScript.AttributeType
   * @see #setType(AttributeType)
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getCustomAttribute_Type()
   * @model
   * @generated
   */
  AttributeType getType();

  /**
   * Sets the value of the '{@link de.unidue.ecg.characterScript.characterScript.CustomAttribute#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see de.unidue.ecg.characterScript.characterScript.AttributeType
   * @see #getType()
   * @generated
   */
  void setType(AttributeType value);

  /**
   * Returns the value of the '<em><b>Enum Values</b></em>' containment reference list.
   * The list contents are of type {@link de.unidue.ecg.characterScript.characterScript.EnumValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Values</em>' containment reference list.
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getCustomAttribute_EnumValues()
   * @model containment="true"
   * @generated
   */
  EList<EnumValue> getEnumValues();

} // CustomAttribute
