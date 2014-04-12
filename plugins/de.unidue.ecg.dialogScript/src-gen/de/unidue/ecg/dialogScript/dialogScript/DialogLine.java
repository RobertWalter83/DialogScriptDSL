/**
 */
package de.unidue.ecg.dialogScript.dialogScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialog Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.DialogLine#getCharacter <em>Character</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.DialogLine#getLines <em>Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getDialogLine()
 * @model
 * @generated
 */
public interface DialogLine extends Statement
{
  /**
   * Returns the value of the '<em><b>Character</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Character</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Character</em>' reference.
   * @see #setCharacter(CharacterDefinition)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getDialogLine_Character()
   * @model
   * @generated
   */
  CharacterDefinition getCharacter();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.DialogLine#getCharacter <em>Character</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Character</em>' reference.
   * @see #getCharacter()
   * @generated
   */
  void setCharacter(CharacterDefinition value);

  /**
   * Returns the value of the '<em><b>Lines</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lines</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lines</em>' attribute.
   * @see #setLines(String)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getDialogLine_Lines()
   * @model
   * @generated
   */
  String getLines();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.DialogLine#getLines <em>Lines</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lines</em>' attribute.
   * @see #getLines()
   * @generated
   */
  void setLines(String value);

} // DialogLine
