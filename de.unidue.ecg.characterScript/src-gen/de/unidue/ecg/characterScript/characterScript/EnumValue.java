/**
 */
package de.unidue.ecg.characterScript.characterScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.EnumValue#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getEnumValue()
 * @model
 * @generated
 */
public interface EnumValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getEnumValue_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.unidue.ecg.characterScript.characterScript.EnumValue#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // EnumValue
