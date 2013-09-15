/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.ConditionDefinition#getName <em>Name</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.ConditionDefinition#getSwitchList <em>Switch List</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditionDefinition()
 * @model
 * @generated
 */
public interface ConditionDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditionDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Switch List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch List</em>' containment reference.
   * @see #setSwitchList(SwitchList)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditionDefinition_SwitchList()
   * @model containment="true"
   * @generated
   */
  SwitchList getSwitchList();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionDefinition#getSwitchList <em>Switch List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch List</em>' containment reference.
   * @see #getSwitchList()
   * @generated
   */
  void setSwitchList(SwitchList value);

} // ConditionDefinition
