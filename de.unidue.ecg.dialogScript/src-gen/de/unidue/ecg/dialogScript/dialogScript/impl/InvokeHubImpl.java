/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;
import de.unidue.ecg.dialogScript.dialogScript.Hub;
import de.unidue.ecg.dialogScript.dialogScript.InvokeHub;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoke Hub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.InvokeHubImpl#getHub <em>Hub</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokeHubImpl extends JumpImpl implements InvokeHub
{
  /**
   * The cached value of the '{@link #getHub() <em>Hub</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHub()
   * @generated
   * @ordered
   */
  protected Hub hub;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InvokeHubImpl()
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
    return DialogScriptPackage.Literals.INVOKE_HUB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hub getHub()
  {
    if (hub != null && hub.eIsProxy())
    {
      InternalEObject oldHub = (InternalEObject)hub;
      hub = (Hub)eResolveProxy(oldHub);
      if (hub != oldHub)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DialogScriptPackage.INVOKE_HUB__HUB, oldHub, hub));
      }
    }
    return hub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hub basicGetHub()
  {
    return hub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHub(Hub newHub)
  {
    Hub oldHub = hub;
    hub = newHub;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.INVOKE_HUB__HUB, oldHub, hub));
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
      case DialogScriptPackage.INVOKE_HUB__HUB:
        if (resolve) return getHub();
        return basicGetHub();
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
      case DialogScriptPackage.INVOKE_HUB__HUB:
        setHub((Hub)newValue);
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
      case DialogScriptPackage.INVOKE_HUB__HUB:
        setHub((Hub)null);
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
      case DialogScriptPackage.INVOKE_HUB__HUB:
        return hub != null;
    }
    return super.eIsSet(featureID);
  }

} //InvokeHubImpl
