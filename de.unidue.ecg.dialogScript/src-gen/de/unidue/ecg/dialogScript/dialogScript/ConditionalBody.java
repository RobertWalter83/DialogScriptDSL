/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalBody#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalBody#getSwitchOn <em>Switch On</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalBody#getSwitchOff <em>Switch Off</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalBody#getJump <em>Jump</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditionalBody()
 * @model
 * @generated
 */
public interface ConditionalBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link de.unidue.ecg.dialogScript.dialogScript.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditionalBody_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

  /**
   * Returns the value of the '<em><b>Switch On</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch On</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch On</em>' containment reference.
   * @see #setSwitchOn(SwitchOn)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditionalBody_SwitchOn()
   * @model containment="true"
   * @generated
   */
  SwitchOn getSwitchOn();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalBody#getSwitchOn <em>Switch On</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch On</em>' containment reference.
   * @see #getSwitchOn()
   * @generated
   */
  void setSwitchOn(SwitchOn value);

  /**
   * Returns the value of the '<em><b>Switch Off</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch Off</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch Off</em>' containment reference.
   * @see #setSwitchOff(SwitchOff)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditionalBody_SwitchOff()
   * @model containment="true"
   * @generated
   */
  SwitchOff getSwitchOff();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalBody#getSwitchOff <em>Switch Off</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch Off</em>' containment reference.
   * @see #getSwitchOff()
   * @generated
   */
  void setSwitchOff(SwitchOff value);

  /**
   * Returns the value of the '<em><b>Jump</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jump</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jump</em>' containment reference.
   * @see #setJump(Jump)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditionalBody_Jump()
   * @model containment="true"
   * @generated
   */
  Jump getJump();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalBody#getJump <em>Jump</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jump</em>' containment reference.
   * @see #getJump()
   * @generated
   */
  void setJump(Jump value);

} // ConditionalBody
