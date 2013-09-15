/**
 */
package de.unidue.ecg.characterScript.characterScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.Template#getName <em>Name</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.Template#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.Template#getCustoms <em>Customs</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getTemplate()
 * @model
 * @generated
 */
public interface Template extends EObject
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
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getTemplate_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.unidue.ecg.characterScript.characterScript.Template#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Defaults</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defaults</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defaults</em>' attribute list.
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getTemplate_Defaults()
   * @model unique="false"
   * @generated
   */
  EList<String> getDefaults();

  /**
   * Returns the value of the '<em><b>Customs</b></em>' containment reference list.
   * The list contents are of type {@link de.unidue.ecg.characterScript.characterScript.CustomAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Customs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Customs</em>' containment reference list.
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getTemplate_Customs()
   * @model containment="true"
   * @generated
   */
  EList<CustomAttribute> getCustoms();

} // Template
