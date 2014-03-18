/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.CharacterDefinition;
import de.unidue.ecg.dialogScript.dialogScript.CharactersDefinition;
import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characters Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.CharactersDefinitionImpl#getCharacters <em>Characters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharactersDefinitionImpl extends MinimalEObjectImpl.Container implements CharactersDefinition
{
  /**
   * The cached value of the '{@link #getCharacters() <em>Characters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacters()
   * @generated
   * @ordered
   */
  protected EList<CharacterDefinition> characters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CharactersDefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DialogScriptPackage.Literals.CHARACTERS_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CharacterDefinition> getCharacters()
  {
    if (characters == null)
    {
      characters = new EObjectContainmentEList<CharacterDefinition>(CharacterDefinition.class, this, DialogScriptPackage.CHARACTERS_DEFINITION__CHARACTERS);
    }
    return characters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DialogScriptPackage.CHARACTERS_DEFINITION__CHARACTERS:
        return ((InternalEList<?>)getCharacters()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DialogScriptPackage.CHARACTERS_DEFINITION__CHARACTERS:
        return getCharacters();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DialogScriptPackage.CHARACTERS_DEFINITION__CHARACTERS:
        getCharacters().clear();
        getCharacters().addAll((Collection<? extends CharacterDefinition>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DialogScriptPackage.CHARACTERS_DEFINITION__CHARACTERS:
        getCharacters().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DialogScriptPackage.CHARACTERS_DEFINITION__CHARACTERS:
        return characters != null && !characters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CharactersDefinitionImpl
