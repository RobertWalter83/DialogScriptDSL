/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog;
import de.unidue.ecg.dialogScript.dialogScript.ConditionalBody;
import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;
import de.unidue.ecg.dialogScript.dialogScript.Modifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice Dialog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ChoiceDialogImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ChoiceDialogImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ChoiceDialogImpl#getChoiceComment <em>Choice Comment</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.ChoiceDialogImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoiceDialogImpl extends HubFragmentImpl implements ChoiceDialog
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
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getChoiceComment() <em>Choice Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoiceComment()
   * @generated
   * @ordered
   */
  protected static final String CHOICE_COMMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getChoiceComment() <em>Choice Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoiceComment()
   * @generated
   * @ordered
   */
  protected String choiceComment = CHOICE_COMMENT_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChoiceDialogImpl()
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
    return DialogScriptPackage.Literals.CHOICE_DIALOG;
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
      modifiers = new EDataTypeEList<Modifier>(Modifier.class, this, DialogScriptPackage.CHOICE_DIALOG__MODIFIERS);
    }
    return modifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.CHOICE_DIALOG__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getChoiceComment()
  {
    return choiceComment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChoiceComment(String newChoiceComment)
  {
    String oldChoiceComment = choiceComment;
    choiceComment = newChoiceComment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.CHOICE_DIALOG__CHOICE_COMMENT, oldChoiceComment, choiceComment));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialogScriptPackage.CHOICE_DIALOG__BODY, oldBody, newBody);
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
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.CHOICE_DIALOG__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialogScriptPackage.CHOICE_DIALOG__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.CHOICE_DIALOG__BODY, newBody, newBody));
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
      case DialogScriptPackage.CHOICE_DIALOG__BODY:
        return basicSetBody(null, msgs);
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
      case DialogScriptPackage.CHOICE_DIALOG__MODIFIERS:
        return getModifiers();
      case DialogScriptPackage.CHOICE_DIALOG__NAME:
        return getName();
      case DialogScriptPackage.CHOICE_DIALOG__CHOICE_COMMENT:
        return getChoiceComment();
      case DialogScriptPackage.CHOICE_DIALOG__BODY:
        return getBody();
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
      case DialogScriptPackage.CHOICE_DIALOG__MODIFIERS:
        getModifiers().clear();
        getModifiers().addAll((Collection<? extends Modifier>)newValue);
        return;
      case DialogScriptPackage.CHOICE_DIALOG__NAME:
        setName((String)newValue);
        return;
      case DialogScriptPackage.CHOICE_DIALOG__CHOICE_COMMENT:
        setChoiceComment((String)newValue);
        return;
      case DialogScriptPackage.CHOICE_DIALOG__BODY:
        setBody((ConditionalBody)newValue);
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
      case DialogScriptPackage.CHOICE_DIALOG__MODIFIERS:
        getModifiers().clear();
        return;
      case DialogScriptPackage.CHOICE_DIALOG__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DialogScriptPackage.CHOICE_DIALOG__CHOICE_COMMENT:
        setChoiceComment(CHOICE_COMMENT_EDEFAULT);
        return;
      case DialogScriptPackage.CHOICE_DIALOG__BODY:
        setBody((ConditionalBody)null);
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
      case DialogScriptPackage.CHOICE_DIALOG__MODIFIERS:
        return modifiers != null && !modifiers.isEmpty();
      case DialogScriptPackage.CHOICE_DIALOG__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DialogScriptPackage.CHOICE_DIALOG__CHOICE_COMMENT:
        return CHOICE_COMMENT_EDEFAULT == null ? choiceComment != null : !CHOICE_COMMENT_EDEFAULT.equals(choiceComment);
      case DialogScriptPackage.CHOICE_DIALOG__BODY:
        return body != null;
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
    result.append(", name: ");
    result.append(name);
    result.append(", choiceComment: ");
    result.append(choiceComment);
    result.append(')');
    return result.toString();
  }

} //ChoiceDialogImpl
