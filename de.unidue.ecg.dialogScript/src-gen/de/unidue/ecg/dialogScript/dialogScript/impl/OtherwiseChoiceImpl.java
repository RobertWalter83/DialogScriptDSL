/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog;
import de.unidue.ecg.dialogScript.dialogScript.ConditionList;
import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;
import de.unidue.ecg.dialogScript.dialogScript.Modifier;
import de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Otherwise Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.OtherwiseChoiceImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.OtherwiseChoiceImpl#getConditionList <em>Condition List</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.OtherwiseChoiceImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.OtherwiseChoiceImpl#getChoices <em>Choices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OtherwiseChoiceImpl extends MinimalEObjectImpl.Container implements OtherwiseChoice
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
   * The cached value of the '{@link #getChoices() <em>Choices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoices()
   * @generated
   * @ordered
   */
  protected EList<ChoiceDialog> choices;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OtherwiseChoiceImpl()
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
    return DialogScriptPackage.Literals.OTHERWISE_CHOICE;
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
      modifiers = new EDataTypeEList<Modifier>(Modifier.class, this, DialogScriptPackage.OTHERWISE_CHOICE__MODIFIERS);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialogScriptPackage.OTHERWISE_CHOICE__CONDITION_LIST, oldConditionList, newConditionList);
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
        msgs = ((InternalEObject)conditionList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.OTHERWISE_CHOICE__CONDITION_LIST, null, msgs);
      if (newConditionList != null)
        msgs = ((InternalEObject)newConditionList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.OTHERWISE_CHOICE__CONDITION_LIST, null, msgs);
      msgs = basicSetConditionList(newConditionList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.OTHERWISE_CHOICE__CONDITION_LIST, newConditionList, newConditionList));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.OTHERWISE_CHOICE__COMMENT, oldComment, comment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ChoiceDialog> getChoices()
  {
    if (choices == null)
    {
      choices = new EObjectContainmentEList<ChoiceDialog>(ChoiceDialog.class, this, DialogScriptPackage.OTHERWISE_CHOICE__CHOICES);
    }
    return choices;
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
      case DialogScriptPackage.OTHERWISE_CHOICE__CONDITION_LIST:
        return basicSetConditionList(null, msgs);
      case DialogScriptPackage.OTHERWISE_CHOICE__CHOICES:
        return ((InternalEList<?>)getChoices()).basicRemove(otherEnd, msgs);
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
      case DialogScriptPackage.OTHERWISE_CHOICE__MODIFIERS:
        return getModifiers();
      case DialogScriptPackage.OTHERWISE_CHOICE__CONDITION_LIST:
        return getConditionList();
      case DialogScriptPackage.OTHERWISE_CHOICE__COMMENT:
        return getComment();
      case DialogScriptPackage.OTHERWISE_CHOICE__CHOICES:
        return getChoices();
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
      case DialogScriptPackage.OTHERWISE_CHOICE__MODIFIERS:
        getModifiers().clear();
        getModifiers().addAll((Collection<? extends Modifier>)newValue);
        return;
      case DialogScriptPackage.OTHERWISE_CHOICE__CONDITION_LIST:
        setConditionList((ConditionList)newValue);
        return;
      case DialogScriptPackage.OTHERWISE_CHOICE__COMMENT:
        setComment((String)newValue);
        return;
      case DialogScriptPackage.OTHERWISE_CHOICE__CHOICES:
        getChoices().clear();
        getChoices().addAll((Collection<? extends ChoiceDialog>)newValue);
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
      case DialogScriptPackage.OTHERWISE_CHOICE__MODIFIERS:
        getModifiers().clear();
        return;
      case DialogScriptPackage.OTHERWISE_CHOICE__CONDITION_LIST:
        setConditionList((ConditionList)null);
        return;
      case DialogScriptPackage.OTHERWISE_CHOICE__COMMENT:
        setComment(COMMENT_EDEFAULT);
        return;
      case DialogScriptPackage.OTHERWISE_CHOICE__CHOICES:
        getChoices().clear();
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
      case DialogScriptPackage.OTHERWISE_CHOICE__MODIFIERS:
        return modifiers != null && !modifiers.isEmpty();
      case DialogScriptPackage.OTHERWISE_CHOICE__CONDITION_LIST:
        return conditionList != null;
      case DialogScriptPackage.OTHERWISE_CHOICE__COMMENT:
        return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
      case DialogScriptPackage.OTHERWISE_CHOICE__CHOICES:
        return choices != null && !choices.isEmpty();
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
    result.append(" (modifiers: ");
    result.append(modifiers);
    result.append(", comment: ");
    result.append(comment);
    result.append(')');
    return result.toString();
  }

} //OtherwiseChoiceImpl
