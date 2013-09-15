/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;
import de.unidue.ecg.dialogScript.dialogScript.InvokeScene;
import de.unidue.ecg.dialogScript.dialogScript.Scene;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoke Scene</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.InvokeSceneImpl#getScene <em>Scene</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokeSceneImpl extends JumpImpl implements InvokeScene
{
  /**
   * The cached value of the '{@link #getScene() <em>Scene</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScene()
   * @generated
   * @ordered
   */
  protected Scene scene;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InvokeSceneImpl()
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
    return DialogScriptPackage.Literals.INVOKE_SCENE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scene getScene()
  {
    if (scene != null && scene.eIsProxy())
    {
      InternalEObject oldScene = (InternalEObject)scene;
      scene = (Scene)eResolveProxy(oldScene);
      if (scene != oldScene)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DialogScriptPackage.INVOKE_SCENE__SCENE, oldScene, scene));
      }
    }
    return scene;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scene basicGetScene()
  {
    return scene;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScene(Scene newScene)
  {
    Scene oldScene = scene;
    scene = newScene;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.INVOKE_SCENE__SCENE, oldScene, scene));
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
      case DialogScriptPackage.INVOKE_SCENE__SCENE:
        if (resolve) return getScene();
        return basicGetScene();
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
      case DialogScriptPackage.INVOKE_SCENE__SCENE:
        setScene((Scene)newValue);
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
      case DialogScriptPackage.INVOKE_SCENE__SCENE:
        setScene((Scene)null);
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
      case DialogScriptPackage.INVOKE_SCENE__SCENE:
        return scene != null;
    }
    return super.eIsSet(featureID);
  }

} //InvokeSceneImpl
