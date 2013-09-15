/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;
import de.unidue.ecg.dialogScript.dialogScript.Switch;
import de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition;
import de.unidue.ecg.dialogScript.dialogScript.SwitchValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.SwitchImpl#getSwitch <em>Switch</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.SwitchImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchImpl extends MinimalEObjectImpl.Container implements Switch
{
  /**
   * The cached value of the '{@link #getSwitch() <em>Switch</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitch()
   * @generated
   * @ordered
   */
  protected SwitchDefinition switch_;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final SwitchValue VALUE_EDEFAULT = SwitchValue.ON;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected SwitchValue value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchImpl()
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
    return DialogScriptPackage.Literals.SWITCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchDefinition getSwitch()
  {
    if (switch_ != null && switch_.eIsProxy())
    {
      InternalEObject oldSwitch = (InternalEObject)switch_;
      switch_ = (SwitchDefinition)eResolveProxy(oldSwitch);
      if (switch_ != oldSwitch)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DialogScriptPackage.SWITCH__SWITCH, oldSwitch, switch_));
      }
    }
    return switch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchDefinition basicGetSwitch()
  {
    return switch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwitch(SwitchDefinition newSwitch)
  {
    SwitchDefinition oldSwitch = switch_;
    switch_ = newSwitch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.SWITCH__SWITCH, oldSwitch, switch_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(SwitchValue newValue)
  {
    SwitchValue oldValue = value;
    value = newValue == null ? VALUE_EDEFAULT : newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.SWITCH__VALUE, oldValue, value));
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
      case DialogScriptPackage.SWITCH__SWITCH:
        if (resolve) return getSwitch();
        return basicGetSwitch();
      case DialogScriptPackage.SWITCH__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DialogScriptPackage.SWITCH__SWITCH:
        setSwitch((SwitchDefinition)newValue);
        return;
      case DialogScriptPackage.SWITCH__VALUE:
        setValue((SwitchValue)newValue);
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
      case DialogScriptPackage.SWITCH__SWITCH:
        setSwitch((SwitchDefinition)null);
        return;
      case DialogScriptPackage.SWITCH__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case DialogScriptPackage.SWITCH__SWITCH:
        return switch_ != null;
      case DialogScriptPackage.SWITCH__VALUE:
        return value != VALUE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //SwitchImpl
