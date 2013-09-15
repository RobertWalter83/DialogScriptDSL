/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.SwitchList#getSwitches <em>Switches</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getSwitchList()
 * @model
 * @generated
 */
public interface SwitchList extends EObject
{
  /**
   * Returns the value of the '<em><b>Switches</b></em>' containment reference list.
   * The list contents are of type {@link de.unidue.ecg.dialogScript.dialogScript.Switch}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switches</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switches</em>' containment reference list.
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getSwitchList_Switches()
   * @model containment="true"
   * @generated
   */
  EList<Switch> getSwitches();

} // SwitchList
