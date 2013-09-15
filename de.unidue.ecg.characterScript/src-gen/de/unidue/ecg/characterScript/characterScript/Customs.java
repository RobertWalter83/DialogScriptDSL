/**
 */
package de.unidue.ecg.characterScript.characterScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.Customs#getCustomAttributes <em>Custom Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getCustoms()
 * @model
 * @generated
 */
public interface Customs extends EObject
{
  /**
   * Returns the value of the '<em><b>Custom Attributes</b></em>' containment reference list.
   * The list contents are of type {@link de.unidue.ecg.characterScript.characterScript.CustomAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom Attributes</em>' containment reference list.
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getCustoms_CustomAttributes()
   * @model containment="true"
   * @generated
   */
  EList<CustomAttribute> getCustomAttributes();

} // Customs
