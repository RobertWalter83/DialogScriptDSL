/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice Dialog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog#getName <em>Name</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog#getChoiceComment <em>Choice Comment</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getChoiceDialog()
 * @model
 * @generated
 */
public interface ChoiceDialog extends HubFragment
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
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getChoiceDialog_Modifiers()
   * @model unique="false"
   * @generated
   */
  EList<Modifier> getModifiers();

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
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getChoiceDialog_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Choice Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choice Comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choice Comment</em>' attribute.
   * @see #setChoiceComment(String)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getChoiceDialog_ChoiceComment()
   * @model
   * @generated
   */
  String getChoiceComment();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog#getChoiceComment <em>Choice Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Choice Comment</em>' attribute.
   * @see #getChoiceComment()
   * @generated
   */
  void setChoiceComment(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(ConditionalBody)
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getChoiceDialog_Body()
   * @model containment="true"
   * @generated
   */
  ConditionalBody getBody();

  /**
   * Sets the value of the '{@link de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ConditionalBody value);

} // ChoiceDialog
