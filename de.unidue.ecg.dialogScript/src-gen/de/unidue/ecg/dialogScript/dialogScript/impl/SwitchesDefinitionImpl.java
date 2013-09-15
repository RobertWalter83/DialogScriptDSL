/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;
import de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition;
import de.unidue.ecg.dialogScript.dialogScript.SwitchesDefinition;

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
 * An implementation of the model object '<em><b>Switches Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.SwitchesDefinitionImpl#getSwitches <em>Switches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchesDefinitionImpl extends MinimalEObjectImpl.Container implements SwitchesDefinition
{
  /**
   * The cached value of the '{@link #getSwitches() <em>Switches</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitches()
   * @generated
   * @ordered
   */
  protected EList<SwitchDefinition> switches;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchesDefinitionImpl()
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
    return DialogScriptPackage.Literals.SWITCHES_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SwitchDefinition> getSwitches()
  {
    if (switches == null)
    {
      switches = new EObjectContainmentEList<SwitchDefinition>(SwitchDefinition.class, this, DialogScriptPackage.SWITCHES_DEFINITION__SWITCHES);
    }
    return switches;
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
      case DialogScriptPackage.SWITCHES_DEFINITION__SWITCHES:
        return ((InternalEList<?>)getSwitches()).basicRemove(otherEnd, msgs);
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
      case DialogScriptPackage.SWITCHES_DEFINITION__SWITCHES:
        return getSwitches();
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
      case DialogScriptPackage.SWITCHES_DEFINITION__SWITCHES:
        getSwitches().clear();
        getSwitches().addAll((Collection<? extends SwitchDefinition>)newValue);
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
      case DialogScriptPackage.SWITCHES_DEFINITION__SWITCHES:
        getSwitches().clear();
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
      case DialogScriptPackage.SWITCHES_DEFINITION__SWITCHES:
        return switches != null && !switches.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SwitchesDefinitionImpl
