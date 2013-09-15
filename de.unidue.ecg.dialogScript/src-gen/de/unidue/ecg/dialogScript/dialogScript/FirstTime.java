/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>First Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.FirstTime#getComment <em>Comment</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.FirstTime#getBody <em>Body</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.FirstTime#getOtherTimes <em>Other Times</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getFirstTime()
 * @model
 * @generated
 */
public interface FirstTime extends EObject
{
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
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getFirstTime_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.FirstTime#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(ConditionalBody)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getFirstTime_Body()
   * @model containment="true"
   * @generated
   */
  ConditionalBody getBody();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.FirstTime#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ConditionalBody value);

  /**
   * Returns the value of the '<em><b>Other Times</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Other Times</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other Times</em>' containment reference.
   * @see #setOtherTimes(OtherTimes)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getFirstTime_OtherTimes()
   * @model containment="true"
   * @generated
   */
  OtherTimes getOtherTimes();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.FirstTime#getOtherTimes <em>Other Times</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Other Times</em>' containment reference.
   * @see #getOtherTimes()
   * @generated
   */
  void setOtherTimes(OtherTimes value);

} // FirstTime
