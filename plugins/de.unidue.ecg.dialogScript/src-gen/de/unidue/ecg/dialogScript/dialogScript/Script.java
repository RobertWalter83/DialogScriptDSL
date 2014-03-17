/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Script#getCharactersDefinition <em>Characters Definition</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Script#getSwitchesDefinition <em>Switches Definition</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Script#getConditionsDefinition <em>Conditions Definition</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Script#getScenes <em>Scenes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject
{
  /**
   * Returns the value of the '<em><b>Characters Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Characters Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Characters Definition</em>' containment reference.
   * @see #setCharactersDefinition(CharactersDefinition)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getScript_CharactersDefinition()
   * @model containment="true"
   * @generated
   */
  CharactersDefinition getCharactersDefinition();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Script#getCharactersDefinition <em>Characters Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Characters Definition</em>' containment reference.
   * @see #getCharactersDefinition()
   * @generated
   */
  void setCharactersDefinition(CharactersDefinition value);

  /**
   * Returns the value of the '<em><b>Switches Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switches Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switches Definition</em>' containment reference.
   * @see #setSwitchesDefinition(SwitchesDefinition)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getScript_SwitchesDefinition()
   * @model containment="true"
   * @generated
   */
  SwitchesDefinition getSwitchesDefinition();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Script#getSwitchesDefinition <em>Switches Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switches Definition</em>' containment reference.
   * @see #getSwitchesDefinition()
   * @generated
   */
  void setSwitchesDefinition(SwitchesDefinition value);

  /**
   * Returns the value of the '<em><b>Conditions Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditions Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions Definition</em>' containment reference.
   * @see #setConditionsDefinition(ConditionsDefinition)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getScript_ConditionsDefinition()
   * @model containment="true"
   * @generated
   */
  ConditionsDefinition getConditionsDefinition();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Script#getConditionsDefinition <em>Conditions Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditions Definition</em>' containment reference.
   * @see #getConditionsDefinition()
   * @generated
   */
  void setConditionsDefinition(ConditionsDefinition value);

  /**
   * Returns the value of the '<em><b>Scenes</b></em>' containment reference list.
   * The list contents are of type {@link de.unidue.ecg.dialogScript.dialogScript.Scene}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenes</em>' containment reference list.
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getScript_Scenes()
   * @model containment="true"
   * @generated
   */
  EList<Scene> getScenes();

} // Script
