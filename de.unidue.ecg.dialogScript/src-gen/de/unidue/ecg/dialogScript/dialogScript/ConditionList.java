/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.ConditionList#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditionList()
 * @model
 * @generated
 */
public interface ConditionList extends EObject
{
  /**
   * Returns the value of the '<em><b>Conditions</b></em>' reference list.
   * The list contents are of type {@link de.unidue.ecg.dialogScript.dialogScript.ConditionDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' reference list.
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getConditionList_Conditions()
   * @model
   * @generated
   */
  EList<ConditionDefinition> getConditions();

} // ConditionList
