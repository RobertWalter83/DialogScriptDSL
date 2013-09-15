/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Switch#getSwitch <em>Switch</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Switch#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends EObject
{
  /**
   * Returns the value of the '<em><b>Switch</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch</em>' reference.
   * @see #setSwitch(SwitchDefinition)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getSwitch_Switch()
   * @model
   * @generated
   */
  SwitchDefinition getSwitch();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Switch#getSwitch <em>Switch</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch</em>' reference.
   * @see #getSwitch()
   * @generated
   */
  void setSwitch(SwitchDefinition value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link de.unidue.ecg.dialogScript.dialogScript.SwitchValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchValue
   * @see #setValue(SwitchValue)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getSwitch_Value()
   * @model
   * @generated
   */
  SwitchValue getValue();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Switch#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchValue
   * @see #getValue()
   * @generated
   */
  void setValue(SwitchValue value);

} // Switch
