/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.ConditionDefinition;
import de.unidue.ecg.dialogScript.dialogScript.ConditionList;
import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionListImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionListImpl extends MinimalEObjectImpl.Container implements ConditionList
{
  /**
   * The cached value of the '{@link #getConditions() <em>Conditions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditions()
   * @generated
   * @ordered
   */
  protected EList<ConditionDefinition> conditions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionListImpl()
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
    return DialogScriptPackage.Literals.CONDITION_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConditionDefinition> getConditions()
  {
    if (conditions == null)
    {
      conditions = new EObjectResolvingEList<ConditionDefinition>(ConditionDefinition.class, this, DialogScriptPackage.CONDITION_LIST__CONDITIONS);
    }
    return conditions;
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
      case DialogScriptPackage.CONDITION_LIST__CONDITIONS:
        return getConditions();
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
      case DialogScriptPackage.CONDITION_LIST__CONDITIONS:
        getConditions().clear();
        getConditions().addAll((Collection<? extends ConditionDefinition>)newValue);
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
      case DialogScriptPackage.CONDITION_LIST__CONDITIONS:
        getConditions().clear();
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
      case DialogScriptPackage.CONDITION_LIST__CONDITIONS:
        return conditions != null && !conditions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConditionListImpl
