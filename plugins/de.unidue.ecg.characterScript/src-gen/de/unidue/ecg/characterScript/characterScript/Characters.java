/**
 */
package de.unidue.ecg.characterScript.characterScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.Characters#getImports <em>Imports</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.Characters#getTemplates <em>Templates</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.Characters#getGlobals <em>Globals</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.Characters#getCharacters <em>Characters</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getCharacters()
 * @model
 * @generated
 */
public interface Characters extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link de.unidue.ecg.characterScript.characterScript.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getCharacters_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
   * The list contents are of type {@link de.unidue.ecg.characterScript.characterScript.Template}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Templates</em>' containment reference list.
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getCharacters_Templates()
   * @model containment="true"
   * @generated
   */
  EList<Template> getTemplates();

  /**
   * Returns the value of the '<em><b>Globals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Globals</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Globals</em>' containment reference.
   * @see #setGlobals(Globals)
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getCharacters_Globals()
   * @model containment="true"
   * @generated
   */
  Globals getGlobals();

  /**
   * Sets the value of the '{@link de.unidue.ecg.characterScript.characterScript.Characters#getGlobals <em>Globals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Globals</em>' containment reference.
   * @see #getGlobals()
   * @generated
   */
  void setGlobals(Globals value);

  /**
   * Returns the value of the '<em><b>Characters</b></em>' containment reference list.
   * The list contents are of type {@link de.unidue.ecg.characterScript.characterScript.Character}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Characters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Characters</em>' containment reference list.
   * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getCharacters_Characters()
   * @model containment="true"
   * @generated
   */
  EList<de.unidue.ecg.characterScript.characterScript.Character> getCharacters();

} // Characters
