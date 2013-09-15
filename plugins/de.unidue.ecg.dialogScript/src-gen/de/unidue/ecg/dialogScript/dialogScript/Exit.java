/**
 */
package de.unidue.ecg.dialogScript.dialogScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Exit#isExitHub <em>Exit Hub</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Exit#isExitScene <em>Exit Scene</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getExit()
 * @model
 * @generated
 */
public interface Exit extends Jump
{
  /**
   * Returns the value of the '<em><b>Exit Hub</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exit Hub</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exit Hub</em>' attribute.
   * @see #setExitHub(boolean)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getExit_ExitHub()
   * @model
   * @generated
   */
  boolean isExitHub();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Exit#isExitHub <em>Exit Hub</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exit Hub</em>' attribute.
   * @see #isExitHub()
   * @generated
   */
  void setExitHub(boolean value);

  /**
   * Returns the value of the '<em><b>Exit Scene</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exit Scene</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exit Scene</em>' attribute.
   * @see #setExitScene(boolean)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getExit_ExitScene()
   * @model
   * @generated
   */
  boolean isExitScene();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Exit#isExitScene <em>Exit Scene</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exit Scene</em>' attribute.
   * @see #isExitScene()
   * @generated
   */
  void setExitScene(boolean value);

} // Exit
