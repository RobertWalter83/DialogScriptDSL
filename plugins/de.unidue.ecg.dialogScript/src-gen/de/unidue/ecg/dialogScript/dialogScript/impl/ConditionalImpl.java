/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.AbstractChoiceDialog;
import de.unidue.ecg.dialogScript.dialogScript.ConditionList;
import de.unidue.ecg.dialogScript.dialogScript.Conditional;
import de.unidue.ecg.dialogScript.dialogScript.ConditionalBody;
import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;
import de.unidue.ecg.dialogScript.dialogScript.Modifier;
import de.unidue.ecg.dialogScript.dialogScript.Otherwise;
import de.unidue.ecg.dialogScript.dialogScript.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalImpl#getConditionList <em>Condition List</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalImpl#getOtherwiseList <em>Otherwise List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalImpl extends RecursiveImpl implements Conditional
{
  /**
   * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiers()
   * @generated
   * @ordered
   */
  protected EList<Modifier> modifiers;

  /**
   * The cached value of the '{@link #getConditionList() <em>Condition List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionList()
   * @generated
   * @ordered
   */
  protected ConditionList conditionList;

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
   * The cached value of the '{@link #getOtherwiseList() <em>Otherwise List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOtherwiseList()
   * @generated
   * @ordered
   */
  protected EList<Otherwise> otherwiseList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalImpl()
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
    return DialogScriptPackage.Literals.CONDITIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Modifier> getModifiers()
  {
    if (modifiers == null)
    {
      modifiers = new EDataTypeEList<Modifier>(Modifier.class, this, DialogScriptPackage.CONDITIONAL__MODIFIERS);
    }
    return modifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionList getConditionList()
  {
    return conditionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditionList(ConditionList newConditionList, NotificationChain msgs)
  {
    ConditionList oldConditionList = conditionList;
    conditionList = newConditionList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialogScriptPackage.CONDITIONAL__CONDITION_LIST, oldConditionList, newConditionList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditionList(ConditionList newConditionList)
  {
    if (newConditionList != conditionList)
    {
      NotificationChain msgs = null;
      if (conditionList != null)
        msgs = ((InternalEObject)conditionList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.CONDITIONAL__CONDITION_LIST, null, msgs);
      if (newConditionList != null)
        msgs = ((InternalEObject)newConditionList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.CONDITIONAL__CONDITION_LIST, null, msgs);
      msgs = basicSetConditionList(newConditionList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.CONDITIONAL__CONDITION_LIST, newConditionList, newConditionList));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.CONDITIONAL__COMMENT, oldComment, comment));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialogScriptPackage.CONDITIONAL__BODY, oldBody, newBody);
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
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.CONDITIONAL__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.CONDITIONAL__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.CONDITIONAL__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Otherwise> getOtherwiseList()
  {
    if (otherwiseList == null)
    {
      otherwiseList = new EObjectContainmentEList<Otherwise>(Otherwise.class, this, DialogScriptPackage.CONDITIONAL__OTHERWISE_LIST);
    }
    return otherwiseList;
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
      case DialogScriptPackage.CONDITIONAL__CONDITION_LIST:
        return basicSetConditionList(null, msgs);
      case DialogScriptPackage.CONDITIONAL__BODY:
        return basicSetBody(null, msgs);
      case DialogScriptPackage.CONDITIONAL__OTHERWISE_LIST:
        return ((InternalEList<?>)getOtherwiseList()).basicRemove(otherEnd, msgs);
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
      case DialogScriptPackage.CONDITIONAL__MODIFIERS:
        return getModifiers();
      case DialogScriptPackage.CONDITIONAL__CONDITION_LIST:
        return getConditionList();
      case DialogScriptPackage.CONDITIONAL__COMMENT:
        return getComment();
      case DialogScriptPackage.CONDITIONAL__BODY:
        return getBody();
      case DialogScriptPackage.CONDITIONAL__OTHERWISE_LIST:
        return getOtherwiseList();
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
      case DialogScriptPackage.CONDITIONAL__MODIFIERS:
        getModifiers().clear();
        getModifiers().addAll((Collection<? extends Modifier>)newValue);
        return;
      case DialogScriptPackage.CONDITIONAL__CONDITION_LIST:
        setConditionList((ConditionList)newValue);
        return;
      case DialogScriptPackage.CONDITIONAL__COMMENT:
        setComment((String)newValue);
        return;
      case DialogScriptPackage.CONDITIONAL__BODY:
        setBody((ConditionalBody)newValue);
        return;
      case DialogScriptPackage.CONDITIONAL__OTHERWISE_LIST:
        getOtherwiseList().clear();
        getOtherwiseList().addAll((Collection<? extends Otherwise>)newValue);
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
      case DialogScriptPackage.CONDITIONAL__MODIFIERS:
        getModifiers().clear();
        return;
      case DialogScriptPackage.CONDITIONAL__CONDITION_LIST:
        setConditionList((ConditionList)null);
        return;
      case DialogScriptPackage.CONDITIONAL__COMMENT:
        setComment(COMMENT_EDEFAULT);
        return;
      case DialogScriptPackage.CONDITIONAL__BODY:
        setBody((ConditionalBody)null);
        return;
      case DialogScriptPackage.CONDITIONAL__OTHERWISE_LIST:
        getOtherwiseList().clear();
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
      case DialogScriptPackage.CONDITIONAL__MODIFIERS:
        return modifiers != null && !modifiers.isEmpty();
      case DialogScriptPackage.CONDITIONAL__CONDITION_LIST:
        return conditionList != null;
      case DialogScriptPackage.CONDITIONAL__COMMENT:
        return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
      case DialogScriptPackage.CONDITIONAL__BODY:
        return body != null;
      case DialogScriptPackage.CONDITIONAL__OTHERWISE_LIST:
        return otherwiseList != null && !otherwiseList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == AbstractChoiceDialog.class)
    {
      switch (derivedFeatureID)
      {
        case DialogScriptPackage.CONDITIONAL__MODIFIERS: return DialogScriptPackage.ABSTRACT_CHOICE_DIALOG__MODIFIERS;
        default: return -1;
      }
    }
    if (baseClass == Statement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == AbstractChoiceDialog.class)
    {
      switch (baseFeatureID)
      {
        case DialogScriptPackage.ABSTRACT_CHOICE_DIALOG__MODIFIERS: return DialogScriptPackage.CONDITIONAL__MODIFIERS;
        default: return -1;
      }
    }
    if (baseClass == Statement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (modifiers: ");
    result.append(modifiers);
    result.append(", comment: ");
    result.append(comment);
    result.append(')');
    return result.toString();
  }

} //ConditionalImpl
