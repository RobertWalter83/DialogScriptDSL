/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Hub#isIsHidden <em>Is Hidden</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Hub#getName <em>Name</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Hub#getHubComment <em>Hub Comment</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.Hub#getHubFragments <em>Hub Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getHub()
 * @model
 * @generated
 */
public interface Hub extends Recursive
{
  /**
   * Returns the value of the '<em><b>Is Hidden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Hidden</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Hidden</em>' attribute.
   * @see #setIsHidden(boolean)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getHub_IsHidden()
   * @model
   * @generated
   */
  boolean isIsHidden();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Hub#isIsHidden <em>Is Hidden</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Hidden</em>' attribute.
   * @see #isIsHidden()
   * @generated
   */
  void setIsHidden(boolean value);

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
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getHub_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Hub#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Hub Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hub Comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hub Comment</em>' attribute.
   * @see #setHubComment(String)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getHub_HubComment()
   * @model
   * @generated
   */
  String getHubComment();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.Hub#getHubComment <em>Hub Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hub Comment</em>' attribute.
   * @see #getHubComment()
   * @generated
   */
  void setHubComment(String value);

  /**
   * Returns the value of the '<em><b>Hub Fragments</b></em>' containment reference list.
   * The list contents are of type {@link de.unidue.ecg.dialogScript.dialogScript.HubFragment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hub Fragments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hub Fragments</em>' containment reference list.
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getHub_HubFragments()
   * @model containment="true"
   * @generated
   */
  EList<HubFragment> getHubFragments();

} // Hub
