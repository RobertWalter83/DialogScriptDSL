/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Otherwise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Otherwise#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Otherwise#getConditionList <em>Condition List</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Otherwise#getComment <em>Comment</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Otherwise#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getOtherwise()
 * @model
 * @generated
 */
public interface Otherwise extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
   * The list contents are of type {@link de.unidue.ecg.dialogScript.dialogScript.Modifier}.
   * The literals are from the enumeration {@link de.unidue.ecg.dialogScript.dialogScript.Modifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' attribute list.
   * @see de.unidue.ecg.dialogScript.dialogScript.Modifier
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getOtherwise_Modifiers()
   * @model unique="false"
   * @generated
   */
  EList<Modifier> getModifiers();

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
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getOtherwise_ConditionList()
   * @model containment="true"
   * @generated
   */
  ConditionList getConditionList();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Otherwise#getConditionList <em>Condition List</em>}' containment reference.
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
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getOtherwise_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Otherwise#getComment <em>Comment</em>}' attribute.
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
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getOtherwise_Body()
   * @model containment="true"
   * @generated
   */
  ConditionalBody getBody();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Otherwise#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ConditionalBody value);

} // Otherwise
