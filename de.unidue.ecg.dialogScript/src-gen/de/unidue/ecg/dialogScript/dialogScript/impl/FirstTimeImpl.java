/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.ConditionalBody;
import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;
import de.unidue.ecg.dialogScript.dialogScript.FirstTime;
import de.unidue.ecg.dialogScript.dialogScript.OtherTimes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>First Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.FirstTimeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.FirstTimeImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.FirstTimeImpl#getOtherTimes <em>Other Times</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FirstTimeImpl extends MinimalEObjectImpl.Container implements FirstTime
{
  /**
   * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected static final String COMMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected String comment = COMMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected ConditionalBody body;

  /**
   * The cached value of the '{@link #getOtherTimes() <em>Other Times</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOtherTimes()
   * @generated
   * @ordered
   */
  protected OtherTimes otherTimes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FirstTimeImpl()
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
    return DialogScriptPackage.Literals.FIRST_TIME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComment()
  {
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComment(String newComment)
  {
    String oldComment = comment;
    comment = newComment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.FIRST_TIME__COMMENT, oldComment, comment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalBody getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(ConditionalBody newBody, NotificationChain msgs)
  {
    ConditionalBody oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialogScriptPackage.FIRST_TIME__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(ConditionalBody newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.FIRST_TIME__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.FIRST_TIME__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.FIRST_TIME__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OtherTimes getOtherTimes()
  {
    return otherTimes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOtherTimes(OtherTimes newOtherTimes, NotificationChain msgs)
  {
    OtherTimes oldOtherTimes = otherTimes;
    otherTimes = newOtherTimes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialogScriptPackage.FIRST_TIME__OTHER_TIMES, oldOtherTimes, newOtherTimes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOtherTimes(OtherTimes newOtherTimes)
  {
    if (newOtherTimes != otherTimes)
    {
      NotificationChain msgs = null;
      if (otherTimes != null)
        msgs = ((InternalEObject)otherTimes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.FIRST_TIME__OTHER_TIMES, null, msgs);
      if (newOtherTimes != null)
        msgs = ((InternalEObject)newOtherTimes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.FIRST_TIME__OTHER_TIMES, null, msgs);
      msgs = basicSetOtherTimes(newOtherTimes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.FIRST_TIME__OTHER_TIMES, newOtherTimes, newOtherTimes));
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
      case DialogScriptPackage.FIRST_TIME__BODY:
        return basicSetBody(null, msgs);
      case DialogScriptPackage.FIRST_TIME__OTHER_TIMES:
        return basicSetOtherTimes(null, msgs);
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
      case DialogScriptPackage.FIRST_TIME__COMMENT:
        return getComment();
      case DialogScriptPackage.FIRST_TIME__BODY:
        return getBody();
      case DialogScriptPackage.FIRST_TIME__OTHER_TIMES:
        return getOtherTimes();
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
      case DialogScriptPackage.FIRST_TIME__COMMENT:
        setComment((String)newValue);
        return;
      case DialogScriptPackage.FIRST_TIME__BODY:
        setBody((ConditionalBody)newValue);
        return;
      case DialogScriptPackage.FIRST_TIME__OTHER_TIMES:
        setOtherTimes((OtherTimes)newValue);
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
      case DialogScriptPackage.FIRST_TIME__COMMENT:
        setComment(COMMENT_EDEFAULT);
        return;
      case DialogScriptPackage.FIRST_TIME__BODY:
        setBody((ConditionalBody)null);
        return;
      case DialogScriptPackage.FIRST_TIME__OTHER_TIMES:
        setOtherTimes((OtherTimes)null);
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
      case DialogScriptPackage.FIRST_TIME__COMMENT:
        return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
      case DialogScriptPackage.FIRST_TIME__BODY:
        return body != null;
      case DialogScriptPackage.FIRST_TIME__OTHER_TIMES:
        return otherTimes != null;
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
    result.append(" (comment: ");
    result.append(comment);
    result.append(')');
    return result.toString();
  }

} //FirstTimeImpl
