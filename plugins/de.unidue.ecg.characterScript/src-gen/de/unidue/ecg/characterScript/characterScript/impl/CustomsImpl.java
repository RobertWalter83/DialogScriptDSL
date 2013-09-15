/**
 */
package de.unidue.ecg.characterScript.characterScript.impl;

import de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage;
import de.unidue.ecg.characterScript.characterScript.CustomAttribute;
import de.unidue.ecg.characterScript.characterScript.Customs;

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
 * An implementation of the model object '<em><b>Customs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.impl.CustomsImpl#getCustomAttributes <em>Custom Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomsImpl extends MinimalEObjectImpl.Container implements Customs
{
  /**
   * The cached value of the '{@link #getCustomAttributes() <em>Custom Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomAttributes()
   * @generated
   * @ordered
   */
  protected EList<CustomAttribute> customAttributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CustomsImpl()
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
    return CharacterScriptPackage.Literals.CUSTOMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CustomAttribute> getCustomAttributes()
  {
    if (customAttributes == null)
    {
      customAttributes = new EObjectContainmentEList<CustomAttribute>(CustomAttribute.class, this, CharacterScriptPackage.CUSTOMS__CUSTOM_ATTRIBUTES);
    }
    return customAttributes;
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
      case CharacterScriptPackage.CUSTOMS__CUSTOM_ATTRIBUTES:
        return ((InternalEList<?>)getCustomAttributes()).basicRemove(otherEnd, msgs);
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
      case CharacterScriptPackage.CUSTOMS__CUSTOM_ATTRIBUTES:
        return getCustomAttributes();
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
      case CharacterScriptPackage.CUSTOMS__CUSTOM_ATTRIBUTES:
        getCustomAttributes().clear();
        getCustomAttributes().addAll((Collection<? extends CustomAttribute>)newValue);
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
      case CharacterScriptPackage.CUSTOMS__CUSTOM_ATTRIBUTES:
        getCustomAttributes().clear();
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
      case CharacterScriptPackage.CUSTOMS__CUSTOM_ATTRIBUTES:
        return customAttributes != null && !customAttributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CustomsImpl
