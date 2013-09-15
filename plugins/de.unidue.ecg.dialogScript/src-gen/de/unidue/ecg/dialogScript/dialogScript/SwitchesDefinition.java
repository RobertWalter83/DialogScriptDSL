/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switches Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.SwitchesDefinition#getSwitches <em>Switches</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getSwitchesDefinition()
 * @model
 * @generated
 */
public interface SwitchesDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Switches</b></em>' containment reference list.
   * The list contents are of type {@link de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switches</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switches</em>' containment reference list.
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getSwitchesDefinition_Switches()
   * @model containment="true"
   * @generated
   */
  EList<SwitchDefinition> getSwitches();

} // SwitchesDefinition
