/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Choice Dialog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.AbstractChoiceDialog#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getAbstractChoiceDialog()
 * @model
 * @generated
 */
public interface AbstractChoiceDialog extends EObject
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
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getAbstractChoiceDialog_Modifiers()
   * @model unique="false"
   * @generated
   */
  EList<Modifier> getModifiers();

} // AbstractChoiceDialog
