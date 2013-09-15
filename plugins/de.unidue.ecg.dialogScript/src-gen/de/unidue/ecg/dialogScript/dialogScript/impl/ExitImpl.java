/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;
import de.unidue.ecg.dialogScript.dialogScript.Exit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ExitImpl#isExitHub <em>Exit Hub</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ExitImpl#isExitScene <em>Exit Scene</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExitImpl extends JumpImpl implements Exit
{
  /**
   * The default value of the '{@link #isExitHub() <em>Exit Hub</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExitHub()
   * @generated
   * @ordered
   */
  protected static final boolean EXIT_HUB_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExitHub() <em>Exit Hub</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExitHub()
   * @generated
   * @ordered
   */
  protected boolean exitHub = EXIT_HUB_EDEFAULT;

  /**
   * The default value of the '{@link #isExitScene() <em>Exit Scene</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExitScene()
   * @generated
   * @ordered
   */
  protected static final boolean EXIT_SCENE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExitScene() <em>Exit Scene</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExitScene()
   * @generated
   * @ordered
   */
  protected boolean exitScene = EXIT_SCENE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExitImpl()
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
    return DialogScriptPackage.Literals.EXIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExitHub()
  {
    return exitHub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExitHub(boolean newExitHub)
  {
    boolean oldExitHub = exitHub;
    exitHub = newExitHub;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.EXIT__EXIT_HUB, oldExitHub, exitHub));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExitScene()
  {
    return exitScene;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExitScene(boolean newExitScene)
  {
    boolean oldExitScene = exitScene;
    exitScene = newExitScene;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.EXIT__EXIT_SCENE, oldExitScene, exitScene));
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
      case DialogScriptPackage.EXIT__EXIT_HUB:
        return isExitHub();
      case DialogScriptPackage.EXIT__EXIT_SCENE:
        return isExitScene();
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
      case DialogScriptPackage.EXIT__EXIT_HUB:
        setExitHub((Boolean)newValue);
        return;
      case DialogScriptPackage.EXIT__EXIT_SCENE:
        setExitScene((Boolean)newValue);
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
      case DialogScriptPackage.EXIT__EXIT_HUB:
        setExitHub(EXIT_HUB_EDEFAULT);
        return;
      case DialogScriptPackage.EXIT__EXIT_SCENE:
        setExitScene(EXIT_SCENE_EDEFAULT);
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
      case DialogScriptPackage.EXIT__EXIT_HUB:
        return exitHub != EXIT_HUB_EDEFAULT;
      case DialogScriptPackage.EXIT__EXIT_SCENE:
        return exitScene != EXIT_SCENE_EDEFAULT;
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
    result.append(" (exitHub: ");
    result.append(exitHub);
    result.append(", exitScene: ");
    result.append(exitScene);
    result.append(')');
    return result.toString();
  }

} //ExitImpl
