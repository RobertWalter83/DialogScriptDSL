/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Dialog#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Dialog#getFirstTime <em>First Time</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Dialog#getRecursives <em>Recursives</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Dialog#getPartingLines <em>Parting Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getDialog()
 * @model
 * @generated
 */
public interface Dialog extends EObject
{
  /**
   * Returns the value of the '<em><b>Defaults</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defaults</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defaults</em>' containment reference.
   * @see #setDefaults(Defaults)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getDialog_Defaults()
   * @model containment="true"
   * @generated
   */
  Defaults getDefaults();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Dialog#getDefaults <em>Defaults</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Defaults</em>' containment reference.
   * @see #getDefaults()
   * @generated
   */
  void setDefaults(Defaults value);

  /**
   * Returns the value of the '<em><b>First Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Time</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Time</em>' containment reference.
   * @see #setFirstTime(FirstTime)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getDialog_FirstTime()
   * @model containment="true"
   * @generated
   */
  FirstTime getFirstTime();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Dialog#getFirstTime <em>First Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Time</em>' containment reference.
   * @see #getFirstTime()
   * @generated
   */
  void setFirstTime(FirstTime value);

  /**
   * Returns the value of the '<em><b>Recursives</b></em>' containment reference list.
   * The list contents are of type {@link de.unidue.ecg.dialogScript.dialogScript.Recursive}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recursives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recursives</em>' containment reference list.
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getDialog_Recursives()
   * @model containment="true"
   * @generated
   */
  EList<Recursive> getRecursives();

  /**
   * Returns the value of the '<em><b>Parting Lines</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parting Lines</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parting Lines</em>' containment reference.
   * @see #setPartingLines(PartingLines)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getDialog_PartingLines()
   * @model containment="true"
   * @generated
   */
  PartingLines getPartingLines();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Dialog#getPartingLines <em>Parting Lines</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parting Lines</em>' containment reference.
   * @see #getPartingLines()
   * @generated
   */
  void setPartingLines(PartingLines value);

} // Dialog
