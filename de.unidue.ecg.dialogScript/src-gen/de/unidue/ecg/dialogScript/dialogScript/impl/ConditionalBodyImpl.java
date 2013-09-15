/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.ConditionalBody;
import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;
import de.unidue.ecg.dialogScript.dialogScript.Jump;
import de.unidue.ecg.dialogScript.dialogScript.Statement;
import de.unidue.ecg.dialogScript.dialogScript.SwitchOff;
import de.unidue.ecg.dialogScript.dialogScript.SwitchOn;

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
 * An implementation of the model object '<em><b>Conditional Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalBodyImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalBodyImpl#getSwitchOn <em>Switch On</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalBodyImpl#getSwitchOff <em>Switch Off</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalBodyImpl#getJump <em>Jump</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalBodyImpl extends MinimalEObjectImpl.Container implements ConditionalBody
{
  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * The cached value of the '{@link #getSwitchOn() <em>Switch On</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitchOn()
   * @generated
   * @ordered
   */
  protected SwitchOn switchOn;

  /**
   * The cached value of the '{@link #getSwitchOff() <em>Switch Off</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitchOff()
   * @generated
   * @ordered
   */
  protected SwitchOff switchOff;

  /**
   * The cached value of the '{@link #getJump() <em>Jump</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJump()
   * @generated
   * @ordered
   */
  protected Jump jump;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalBodyImpl()
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
    return DialogScriptPackage.Literals.CONDITIONAL_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, DialogScriptPackage.CONDITIONAL_BODY__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchOn getSwitchOn()
  {
    return switchOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSwitchOn(SwitchOn newSwitchOn, NotificationChain msgs)
  {
    SwitchOn oldSwitchOn = switchOn;
    switchOn = newSwitchOn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialogScriptPackage.CONDITIONAL_BODY__SWITCH_ON, oldSwitchOn, newSwitchOn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwitchOn(SwitchOn newSwitchOn)
  {
    if (newSwitchOn != switchOn)
    {
      NotificationChain msgs = null;
      if (switchOn != null)
        msgs = ((InternalEObject)switchOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.CONDITIONAL_BODY__SWITCH_ON, null, msgs);
      if (newSwitchOn != null)
        msgs = ((InternalEObject)newSwitchOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.CONDITIONAL_BODY__SWITCH_ON, null, msgs);
      msgs = basicSetSwitchOn(newSwitchOn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.CONDITIONAL_BODY__SWITCH_ON, newSwitchOn, newSwitchOn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchOff getSwitchOff()
  {
    return switchOff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSwitchOff(SwitchOff newSwitchOff, NotificationChain msgs)
  {
    SwitchOff oldSwitchOff = switchOff;
    switchOff = newSwitchOff;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialogScriptPackage.CONDITIONAL_BODY__SWITCH_OFF, oldSwitchOff, newSwitchOff);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwitchOff(SwitchOff newSwitchOff)
  {
    if (newSwitchOff != switchOff)
    {
      NotificationChain msgs = null;
      if (switchOff != null)
        msgs = ((InternalEObject)switchOff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.CONDITIONAL_BODY__SWITCH_OFF, null, msgs);
      if (newSwitchOff != null)
        msgs = ((InternalEObject)newSwitchOff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.CONDITIONAL_BODY__SWITCH_OFF, null, msgs);
      msgs = basicSetSwitchOff(newSwitchOff, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.CONDITIONAL_BODY__SWITCH_OFF, newSwitchOff, newSwitchOff));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jump getJump()
  {
    return jump;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJump(Jump newJump, NotificationChain msgs)
  {
    Jump oldJump = jump;
    jump = newJump;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialogScriptPackage.CONDITIONAL_BODY__JUMP, oldJump, newJump);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJump(Jump newJump)
  {
    if (newJump != jump)
    {
      NotificationChain msgs = null;
      if (jump != null)
        msgs = ((InternalEObject)jump).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.CONDITIONAL_BODY__JUMP, null, msgs);
      if (newJump != null)
        msgs = ((InternalEObject)newJump).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.CONDITIONAL_BODY__JUMP, null, msgs);
      msgs = basicSetJump(newJump, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.CONDITIONAL_BODY__JUMP, newJump, newJump));
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
      case DialogScriptPackage.CONDITIONAL_BODY__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case DialogScriptPackage.CONDITIONAL_BODY__SWITCH_ON:
        return basicSetSwitchOn(null, msgs);
      case DialogScriptPackage.CONDITIONAL_BODY__SWITCH_OFF:
        return basicSetSwitchOff(null, msgs);
      case DialogScriptPackage.CONDITIONAL_BODY__JUMP:
        return basicSetJump(null, msgs);
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
      case DialogScriptPackage.CONDITIONAL_BODY__STATEMENTS:
        return getStatements();
      case DialogScriptPackage.CONDITIONAL_BODY__SWITCH_ON:
        return getSwitchOn();
      case DialogScriptPackage.CONDITIONAL_BODY__SWITCH_OFF:
        return getSwitchOff();
      case DialogScriptPackage.CONDITIONAL_BODY__JUMP:
        return getJump();
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
      case DialogScriptPackage.CONDITIONAL_BODY__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case DialogScriptPackage.CONDITIONAL_BODY__SWITCH_ON:
        setSwitchOn((SwitchOn)newValue);
        return;
      case DialogScriptPackage.CONDITIONAL_BODY__SWITCH_OFF:
        setSwitchOff((SwitchOff)newValue);
        return;
      case DialogScriptPackage.CONDITIONAL_BODY__JUMP:
        setJump((Jump)newValue);
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
      case DialogScriptPackage.CONDITIONAL_BODY__STATEMENTS:
        getStatements().clear();
        return;
      case DialogScriptPackage.CONDITIONAL_BODY__SWITCH_ON:
        setSwitchOn((SwitchOn)null);
        return;
      case DialogScriptPackage.CONDITIONAL_BODY__SWITCH_OFF:
        setSwitchOff((SwitchOff)null);
        return;
      case DialogScriptPackage.CONDITIONAL_BODY__JUMP:
        setJump((Jump)null);
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
      case DialogScriptPackage.CONDITIONAL_BODY__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case DialogScriptPackage.CONDITIONAL_BODY__SWITCH_ON:
        return switchOn != null;
      case DialogScriptPackage.CONDITIONAL_BODY__SWITCH_OFF:
        return switchOff != null;
      case DialogScriptPackage.CONDITIONAL_BODY__JUMP:
        return jump != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionalBodyImpl
