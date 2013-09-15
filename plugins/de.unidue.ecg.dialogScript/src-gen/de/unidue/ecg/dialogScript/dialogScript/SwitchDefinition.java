/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition#getName <em>Name</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getSwitchDefinition()
 * @model
 * @generated
 */
public interface SwitchDefinition extends EObject
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
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getSwitchDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getSwitchDefinition_Value()
   * @model
   * @generated
   */
  SwitchValue getValue();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchValue
   * @see #getValue()
   * @generated
   */
  void setValue(SwitchValue value);

} // SwitchDefinition
