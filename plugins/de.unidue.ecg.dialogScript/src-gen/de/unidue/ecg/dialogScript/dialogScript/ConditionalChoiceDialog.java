/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Choice Dialog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog#getConditionList <em>Condition List</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog#getComment <em>Comment</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog#getChoiceDialogs <em>Choice Dialogs</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog#getOtherwiseChoices <em>Otherwise Choices</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditionalChoiceDialog()
 * @model
 * @generated
 */
public interface ConditionalChoiceDialog extends AbstractChoiceDialog
{
  /**
   * Returns the value of the '<em><b>Condition List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition List</em>' containment reference.
   * @see #setConditionList(ConditionList)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditionalChoiceDialog_ConditionList()
   * @model containment="true"
   * @generated
   */
  ConditionList getConditionList();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog#getConditionList <em>Condition List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition List</em>' containment reference.
   * @see #getConditionList()
   * @generated
   */
  void setConditionList(ConditionList value);

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
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditionalChoiceDialog_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

  /**
   * Returns the value of the '<em><b>Choice Dialogs</b></em>' containment reference list.
   * The list contents are of type {@link de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choice Dialogs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choice Dialogs</em>' containment reference list.
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditionalChoiceDialog_ChoiceDialogs()
   * @model containment="true"
   * @generated
   */
  EList<ChoiceDialog> getChoiceDialogs();

  /**
   * Returns the value of the '<em><b>Otherwise Choices</b></em>' containment reference list.
   * The list contents are of type {@link de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Otherwise Choices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Otherwise Choices</em>' containment reference list.
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditionalChoiceDialog_OtherwiseChoices()
   * @model containment="true"
   * @generated
   */
  EList<OtherwiseChoice> getOtherwiseChoices();

} // ConditionalChoiceDialog
