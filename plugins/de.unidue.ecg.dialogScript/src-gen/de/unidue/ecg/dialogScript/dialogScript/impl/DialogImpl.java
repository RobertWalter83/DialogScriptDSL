/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.Defaults;
import de.unidue.ecg.dialogScript.dialogScript.Dialog;
import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;
import de.unidue.ecg.dialogScript.dialogScript.FirstTime;
import de.unidue.ecg.dialogScript.dialogScript.PartingLines;
import de.unidue.ecg.dialogScript.dialogScript.Recursive;

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
 * An implementation of the model object '<em><b>Dialog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.DialogImpl#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.DialogImpl#getFirstTime <em>First Time</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.DialogImpl#getRecursives <em>Recursives</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.DialogImpl#getPartingLines <em>Parting Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DialogImpl extends MinimalEObjectImpl.Container implements Dialog
{
  /**
   * The cached value of the '{@link #getDefaults() <em>Defaults</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaults()
   * @generated
   * @ordered
   */
  protected Defaults defaults;

  /**
   * The cached value of the '{@link #getFirstTime() <em>First Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstTime()
   * @generated
   * @ordered
   */
  protected FirstTime firstTime;

  /**
   * The cached value of the '{@link #getRecursives() <em>Recursives</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecursives()
   * @generated
   * @ordered
   */
  protected EList<Recursive> recursives;

  /**
   * The cached value of the '{@link #getPartingLines() <em>Parting Lines</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartingLines()
   * @generated
   * @ordered
   */
  protected PartingLines partingLines;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DialogImpl()
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
    return DialogScriptPackage.Literals.DIALOG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Defaults getDefaults()
  {
    return defaults;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaults(Defaults newDefaults, NotificationChain msgs)
  {
    Defaults oldDefaults = defaults;
    defaults = newDefaults;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialogScriptPackage.DIALOG__DEFAULTS, oldDefaults, newDefaults);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaults(Defaults newDefaults)
  {
    if (newDefaults != defaults)
    {
      NotificationChain msgs = null;
      if (defaults != null)
        msgs = ((InternalEObject)defaults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.DIALOG__DEFAULTS, null, msgs);
      if (newDefaults != null)
        msgs = ((InternalEObject)newDefaults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.DIALOG__DEFAULTS, null, msgs);
      msgs = basicSetDefaults(newDefaults, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.DIALOG__DEFAULTS, newDefaults, newDefaults));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FirstTime getFirstTime()
  {
    return firstTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstTime(FirstTime newFirstTime, NotificationChain msgs)
  {
    FirstTime oldFirstTime = firstTime;
    firstTime = newFirstTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialogScriptPackage.DIALOG__FIRST_TIME, oldFirstTime, newFirstTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstTime(FirstTime newFirstTime)
  {
    if (newFirstTime != firstTime)
    {
      NotificationChain msgs = null;
      if (firstTime != null)
        msgs = ((InternalEObject)firstTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.DIALOG__FIRST_TIME, null, msgs);
      if (newFirstTime != null)
        msgs = ((InternalEObject)newFirstTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.DIALOG__FIRST_TIME, null, msgs);
      msgs = basicSetFirstTime(newFirstTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.DIALOG__FIRST_TIME, newFirstTime, newFirstTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Recursive> getRecursives()
  {
    if (recursives == null)
    {
      recursives = new EObjectContainmentEList<Recursive>(Recursive.class, this, DialogScriptPackage.DIALOG__RECURSIVES);
    }
    return recursives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartingLines getPartingLines()
  {
    return partingLines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPartingLines(PartingLines newPartingLines, NotificationChain msgs)
  {
    PartingLines oldPartingLines = partingLines;
    partingLines = newPartingLines;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialogScriptPackage.DIALOG__PARTING_LINES, oldPartingLines, newPartingLines);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartingLines(PartingLines newPartingLines)
  {
    if (newPartingLines != partingLines)
    {
      NotificationChain msgs = null;
      if (partingLines != null)
        msgs = ((InternalEObject)partingLines).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.DIALOG__PARTING_LINES, null, msgs);
      if (newPartingLines != null)
        msgs = ((InternalEObject)newPartingLines).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.DIALOG__PARTING_LINES, null, msgs);
      msgs = basicSetPartingLines(newPartingLines, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.DIALOG__PARTING_LINES, newPartingLines, newPartingLines));
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
      case DialogScriptPackage.DIALOG__DEFAULTS:
        return basicSetDefaults(null, msgs);
      case DialogScriptPackage.DIALOG__FIRST_TIME:
        return basicSetFirstTime(null, msgs);
      case DialogScriptPackage.DIALOG__RECURSIVES:
        return ((InternalEList<?>)getRecursives()).basicRemove(otherEnd, msgs);
      case DialogScriptPackage.DIALOG__PARTING_LINES:
        return basicSetPartingLines(null, msgs);
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
      case DialogScriptPackage.DIALOG__DEFAULTS:
        return getDefaults();
      case DialogScriptPackage.DIALOG__FIRST_TIME:
        return getFirstTime();
      case DialogScriptPackage.DIALOG__RECURSIVES:
        return getRecursives();
      case DialogScriptPackage.DIALOG__PARTING_LINES:
        return getPartingLines();
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
      case DialogScriptPackage.DIALOG__DEFAULTS:
        setDefaults((Defaults)newValue);
        return;
      case DialogScriptPackage.DIALOG__FIRST_TIME:
        setFirstTime((FirstTime)newValue);
        return;
      case DialogScriptPackage.DIALOG__RECURSIVES:
        getRecursives().clear();
        getRecursives().addAll((Collection<? extends Recursive>)newValue);
        return;
      case DialogScriptPackage.DIALOG__PARTING_LINES:
        setPartingLines((PartingLines)newValue);
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
      case DialogScriptPackage.DIALOG__DEFAULTS:
        setDefaults((Defaults)null);
        return;
      case DialogScriptPackage.DIALOG__FIRST_TIME:
        setFirstTime((FirstTime)null);
        return;
      case DialogScriptPackage.DIALOG__RECURSIVES:
        getRecursives().clear();
        return;
      case DialogScriptPackage.DIALOG__PARTING_LINES:
        setPartingLines((PartingLines)null);
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
      case DialogScriptPackage.DIALOG__DEFAULTS:
        return defaults != null;
      case DialogScriptPackage.DIALOG__FIRST_TIME:
        return firstTime != null;
      case DialogScriptPackage.DIALOG__RECURSIVES:
        return recursives != null && !recursives.isEmpty();
      case DialogScriptPackage.DIALOG__PARTING_LINES:
        return partingLines != null;
    }
    return super.eIsSet(featureID);
  }

} //DialogImpl
