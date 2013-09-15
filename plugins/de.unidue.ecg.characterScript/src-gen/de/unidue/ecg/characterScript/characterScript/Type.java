/**
 */
package de.unidue.ecg.characterScript.characterScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.Type#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getType()
 * @model
 * @generated
 */
public interface Type extends DefaultProperty
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link de.unidue.ecg.characterScript.characterScript.CharaType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see de.unidue.ecg.characterScript.characterScript.CharaType
   * @see #setValue(CharaType)
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getType_Value()
   * @model
   * @generated
   */
  CharaType getValue();

  /**
   * Sets the value of the '{@link de.unidue.ecg.characterScript.characterScript.Type#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see de.unidue.ecg.characterScript.characterScript.CharaType
   * @see #getValue()
   * @generated
   */
  void setValue(CharaType value);

} // Type
