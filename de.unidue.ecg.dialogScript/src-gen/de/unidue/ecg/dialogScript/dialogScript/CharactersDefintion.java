/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characters Defintion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.CharactersDefintion#getCharacters <em>Characters</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getCharactersDefintion()
 * @model
 * @generated
 */
public interface CharactersDefintion extends EObject
{
  /**
   * Returns the value of the '<em><b>Characters</b></em>' containment reference list.
   * The list contents are of type {@link de.unidue.ecg.dialogScript.dialogScript.CharacterDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Characters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Characters</em>' containment reference list.
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getCharactersDefintion_Characters()
   * @model containment="true"
   * @generated
   */
  EList<CharacterDefinition> getCharacters();

} // CharactersDefintion
