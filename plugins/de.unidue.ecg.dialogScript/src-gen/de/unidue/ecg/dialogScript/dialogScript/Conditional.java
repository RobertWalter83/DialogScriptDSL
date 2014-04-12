/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Conditional#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Conditional#getConditionList <em>Condition List</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Conditional#getBody <em>Body</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Conditional#getOtherwiseList <em>Otherwise List</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditional()
 * @model
 * @generated
 */
public interface Conditional extends Statement
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
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditional_Modifiers()
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
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditional_ConditionList()
   * @model containment="true"
   * @generated
   */
  ConditionList getConditionList();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Conditional#getConditionList <em>Condition List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition List</em>' containment reference.
   * @see #getConditionList()
   * @generated
   */
  void setConditionList(ConditionList value);

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
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditional_Body()
   * @model containment="true"
   * @generated
   */
  ConditionalBody getBody();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Conditional#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ConditionalBody value);

  /**
   * Returns the value of the '<em><b>Otherwise List</b></em>' containment reference list.
   * The list contents are of type {@link de.unidue.ecg.dialogScript.dialogScript.Otherwise}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Otherwise List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Otherwise List</em>' containment reference list.
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditional_OtherwiseList()
   * @model containment="true"
   * @generated
   */
  EList<Otherwise> getOtherwiseList();

} // Conditional
