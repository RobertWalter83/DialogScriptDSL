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
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.DialogLine#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getDialogLine()
 * @model
 * @generated
 */
public interface DialogLine extends Recursive, Statement
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
   * @see #setCharacter(de.unidue.ecg.characterScript.characterScript.Character)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getDialogLine_Character()
   * @model
   * @generated
   */
  de.unidue.ecg.characterScript.characterScript.Character getCharacter();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.DialogLine#getCharacter <em>Character</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Character</em>' reference.
   * @see #getCharacter()
   * @generated
   */
  void setCharacter(de.unidue.ecg.characterScript.characterScript.Character value);

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

  /**
   * Returns the value of the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' attribute.
   * @see #setComment(String)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getDialogLine_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.DialogLine#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

} // DialogLine
