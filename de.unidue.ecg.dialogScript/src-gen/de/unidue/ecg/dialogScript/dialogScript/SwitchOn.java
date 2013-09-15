/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.SwitchOn#getSets <em>Sets</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.SwitchOn#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getSwitchOn()
 * @model
 * @generated
 */
public interface SwitchOn extends EObject
{
  /**
   * Returns the value of the '<em><b>Sets</b></em>' reference list.
   * The list contents are of type {@link de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sets</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sets</em>' reference list.
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getSwitchOn_Sets()
   * @model
   * @generated
   */
  EList<SwitchDefinition> getSets();

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
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getSwitchOn_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchOn#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

} // SwitchOn
