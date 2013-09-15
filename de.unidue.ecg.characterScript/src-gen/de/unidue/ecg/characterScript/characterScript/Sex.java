/**
 */
package de.unidue.ecg.characterScript.characterScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.Sex#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getSex()
 * @model
 * @generated
 */
public interface Sex extends DefaultProperty
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link de.unidue.ecg.characterScript.characterScript.CharaSex}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see de.unidue.ecg.characterScript.characterScript.CharaSex
   * @see #setValue(CharaSex)
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getSex_Value()
   * @model
   * @generated
   */
  CharaSex getValue();

  /**
   * Sets the value of the '{@link de.unidue.ecg.characterScript.characterScript.Sex#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see de.unidue.ecg.characterScript.characterScript.CharaSex
   * @see #getValue()
   * @generated
   */
  void setValue(CharaSex value);

} // Sex
