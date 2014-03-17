/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.CharactersDefinition;
import de.unidue.ecg.dialogScript.dialogScript.ConditionsDefinition;
import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;
import de.unidue.ecg.dialogScript.dialogScript.Scene;
import de.unidue.ecg.dialogScript.dialogScript.Script;
import de.unidue.ecg.dialogScript.dialogScript.SwitchesDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ScriptImpl#getCharactersDefinition <em>Characters Definition</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ScriptImpl#getSwitchesDefinition <em>Switches Definition</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ScriptImpl#getConditionsDefinition <em>Conditions Definition</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ScriptImpl#getScenes <em>Scenes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptImpl extends MinimalEObjectImpl.Container implements Script
{
  /**
   * The cached value of the '{@link #getCharactersDefinition() <em>Characters Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharactersDefinition()
   * @generated
   * @ordered
   */
  protected CharactersDefinition charactersDefinition;

  /**
   * The cached value of the '{@link #getSwitchesDefinition() <em>Switches Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitchesDefinition()
   * @generated
   * @ordered
   */
  protected SwitchesDefinition switchesDefinition;

  /**
   * The cached value of the '{@link #getConditionsDefinition() <em>Conditions Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionsDefinition()
   * @generated
   * @ordered
   */
  protected ConditionsDefinition conditionsDefinition;

  /**
   * The cached value of the '{@link #getScenes() <em>Scenes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenes()
   * @generated
   * @ordered
   */
  protected EList<Scene> scenes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScriptImpl()
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
    return DialogScriptPackage.Literals.SCRIPT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharactersDefinition getCharactersDefinition()
  {
    return charactersDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCharactersDefinition(CharactersDefinition newCharactersDefinition, NotificationChain msgs)
  {
    CharactersDefinition oldCharactersDefinition = charactersDefinition;
    charactersDefinition = newCharactersDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialogScriptPackage.SCRIPT__CHARACTERS_DEFINITION, oldCharactersDefinition, newCharactersDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCharactersDefinition(CharactersDefinition newCharactersDefinition)
  {
    if (newCharactersDefinition != charactersDefinition)
    {
      NotificationChain msgs = null;
      if (charactersDefinition != null)
        msgs = ((InternalEObject)charactersDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.SCRIPT__CHARACTERS_DEFINITION, null, msgs);
      if (newCharactersDefinition != null)
        msgs = ((InternalEObject)newCharactersDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.SCRIPT__CHARACTERS_DEFINITION, null, msgs);
      msgs = basicSetCharactersDefinition(newCharactersDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.SCRIPT__CHARACTERS_DEFINITION, newCharactersDefinition, newCharactersDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchesDefinition getSwitchesDefinition()
  {
    return switchesDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSwitchesDefinition(SwitchesDefinition newSwitchesDefinition, NotificationChain msgs)
  {
    SwitchesDefinition oldSwitchesDefinition = switchesDefinition;
    switchesDefinition = newSwitchesDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialogScriptPackage.SCRIPT__SWITCHES_DEFINITION, oldSwitchesDefinition, newSwitchesDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwitchesDefinition(SwitchesDefinition newSwitchesDefinition)
  {
    if (newSwitchesDefinition != switchesDefinition)
    {
      NotificationChain msgs = null;
      if (switchesDefinition != null)
        msgs = ((InternalEObject)switchesDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.SCRIPT__SWITCHES_DEFINITION, null, msgs);
      if (newSwitchesDefinition != null)
        msgs = ((InternalEObject)newSwitchesDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.SCRIPT__SWITCHES_DEFINITION, null, msgs);
      msgs = basicSetSwitchesDefinition(newSwitchesDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.SCRIPT__SWITCHES_DEFINITION, newSwitchesDefinition, newSwitchesDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionsDefinition getConditionsDefinition()
  {
    return conditionsDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditionsDefinition(ConditionsDefinition newConditionsDefinition, NotificationChain msgs)
  {
    ConditionsDefinition oldConditionsDefinition = conditionsDefinition;
    conditionsDefinition = newConditionsDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialogScriptPackage.SCRIPT__CONDITIONS_DEFINITION, oldConditionsDefinition, newConditionsDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditionsDefinition(ConditionsDefinition newConditionsDefinition)
  {
    if (newConditionsDefinition != conditionsDefinition)
    {
      NotificationChain msgs = null;
      if (conditionsDefinition != null)
        msgs = ((InternalEObject)conditionsDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.SCRIPT__CONDITIONS_DEFINITION, null, msgs);
      if (newConditionsDefinition != null)
        msgs = ((InternalEObject)newConditionsDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.SCRIPT__CONDITIONS_DEFINITION, null, msgs);
      msgs = basicSetConditionsDefinition(newConditionsDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.SCRIPT__CONDITIONS_DEFINITION, newConditionsDefinition, newConditionsDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Scene> getScenes()
  {
    if (scenes == null)
    {
      scenes = new EObjectContainmentEList<Scene>(Scene.class, this, DialogScriptPackage.SCRIPT__SCENES);
    }
    return scenes;
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
      case DialogScriptPackage.SCRIPT__CHARACTERS_DEFINITION:
        return basicSetCharactersDefinition(null, msgs);
      case DialogScriptPackage.SCRIPT__SWITCHES_DEFINITION:
        return basicSetSwitchesDefinition(null, msgs);
      case DialogScriptPackage.SCRIPT__CONDITIONS_DEFINITION:
        return basicSetConditionsDefinition(null, msgs);
      case DialogScriptPackage.SCRIPT__SCENES:
        return ((InternalEList<?>)getScenes()).basicRemove(otherEnd, msgs);
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
      case DialogScriptPackage.SCRIPT__CHARACTERS_DEFINITION:
        return getCharactersDefinition();
      case DialogScriptPackage.SCRIPT__SWITCHES_DEFINITION:
        return getSwitchesDefinition();
      case DialogScriptPackage.SCRIPT__CONDITIONS_DEFINITION:
        return getConditionsDefinition();
      case DialogScriptPackage.SCRIPT__SCENES:
        return getScenes();
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
      case DialogScriptPackage.SCRIPT__CHARACTERS_DEFINITION:
        setCharactersDefinition((CharactersDefinition)newValue);
        return;
      case DialogScriptPackage.SCRIPT__SWITCHES_DEFINITION:
        setSwitchesDefinition((SwitchesDefinition)newValue);
        return;
      case DialogScriptPackage.SCRIPT__CONDITIONS_DEFINITION:
        setConditionsDefinition((ConditionsDefinition)newValue);
        return;
      case DialogScriptPackage.SCRIPT__SCENES:
        getScenes().clear();
        getScenes().addAll((Collection<? extends Scene>)newValue);
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
      case DialogScriptPackage.SCRIPT__CHARACTERS_DEFINITION:
        setCharactersDefinition((CharactersDefinition)null);
        return;
      case DialogScriptPackage.SCRIPT__SWITCHES_DEFINITION:
        setSwitchesDefinition((SwitchesDefinition)null);
        return;
      case DialogScriptPackage.SCRIPT__CONDITIONS_DEFINITION:
        setConditionsDefinition((ConditionsDefinition)null);
        return;
      case DialogScriptPackage.SCRIPT__SCENES:
        getScenes().clear();
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
      case DialogScriptPackage.SCRIPT__CHARACTERS_DEFINITION:
        return charactersDefinition != null;
      case DialogScriptPackage.SCRIPT__SWITCHES_DEFINITION:
        return switchesDefinition != null;
      case DialogScriptPackage.SCRIPT__CONDITIONS_DEFINITION:
        return conditionsDefinition != null;
      case DialogScriptPackage.SCRIPT__SCENES:
        return scenes != null && !scenes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ScriptImpl
