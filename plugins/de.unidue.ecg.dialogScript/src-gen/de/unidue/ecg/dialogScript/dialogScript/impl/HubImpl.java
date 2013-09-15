/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.AbstractChoiceDialog;
import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;
import de.unidue.ecg.dialogScript.dialogScript.Hub;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.HubImpl#isIsHidden <em>Is Hidden</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.HubImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.HubImpl#getHubComment <em>Hub Comment</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.HubImpl#getChoiceDialogs <em>Choice Dialogs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HubImpl extends RecursiveImpl implements Hub
{
  /**
   * The default value of the '{@link #isIsHidden() <em>Is Hidden</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsHidden()
   * @generated
   * @ordered
   */
  protected static final boolean IS_HIDDEN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsHidden() <em>Is Hidden</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsHidden()
   * @generated
   * @ordered
   */
  protected boolean isHidden = IS_HIDDEN_EDEFAULT;

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
   * The default value of the '{@link #getHubComment() <em>Hub Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHubComment()
   * @generated
   * @ordered
   */
  protected static final String HUB_COMMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHubComment() <em>Hub Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHubComment()
   * @generated
   * @ordered
   */
  protected String hubComment = HUB_COMMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getChoiceDialogs() <em>Choice Dialogs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoiceDialogs()
   * @generated
   * @ordered
   */
  protected EList<AbstractChoiceDialog> choiceDialogs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HubImpl()
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
    return DialogScriptPackage.Literals.HUB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsHidden()
  {
    return isHidden;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsHidden(boolean newIsHidden)
  {
    boolean oldIsHidden = isHidden;
    isHidden = newIsHidden;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.HUB__IS_HIDDEN, oldIsHidden, isHidden));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.HUB__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHubComment()
  {
    return hubComment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHubComment(String newHubComment)
  {
    String oldHubComment = hubComment;
    hubComment = newHubComment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.HUB__HUB_COMMENT, oldHubComment, hubComment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractChoiceDialog> getChoiceDialogs()
  {
    if (choiceDialogs == null)
    {
      choiceDialogs = new EObjectContainmentEList<AbstractChoiceDialog>(AbstractChoiceDialog.class, this, DialogScriptPackage.HUB__CHOICE_DIALOGS);
    }
    return choiceDialogs;
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
      case DialogScriptPackage.HUB__CHOICE_DIALOGS:
        return ((InternalEList<?>)getChoiceDialogs()).basicRemove(otherEnd, msgs);
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
      case DialogScriptPackage.HUB__IS_HIDDEN:
        return isIsHidden();
      case DialogScriptPackage.HUB__NAME:
        return getName();
      case DialogScriptPackage.HUB__HUB_COMMENT:
        return getHubComment();
      case DialogScriptPackage.HUB__CHOICE_DIALOGS:
        return getChoiceDialogs();
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
      case DialogScriptPackage.HUB__IS_HIDDEN:
        setIsHidden((Boolean)newValue);
        return;
      case DialogScriptPackage.HUB__NAME:
        setName((String)newValue);
        return;
      case DialogScriptPackage.HUB__HUB_COMMENT:
        setHubComment((String)newValue);
        return;
      case DialogScriptPackage.HUB__CHOICE_DIALOGS:
        getChoiceDialogs().clear();
        getChoiceDialogs().addAll((Collection<? extends AbstractChoiceDialog>)newValue);
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
      case DialogScriptPackage.HUB__IS_HIDDEN:
        setIsHidden(IS_HIDDEN_EDEFAULT);
        return;
      case DialogScriptPackage.HUB__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DialogScriptPackage.HUB__HUB_COMMENT:
        setHubComment(HUB_COMMENT_EDEFAULT);
        return;
      case DialogScriptPackage.HUB__CHOICE_DIALOGS:
        getChoiceDialogs().clear();
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
      case DialogScriptPackage.HUB__IS_HIDDEN:
        return isHidden != IS_HIDDEN_EDEFAULT;
      case DialogScriptPackage.HUB__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DialogScriptPackage.HUB__HUB_COMMENT:
        return HUB_COMMENT_EDEFAULT == null ? hubComment != null : !HUB_COMMENT_EDEFAULT.equals(hubComment);
      case DialogScriptPackage.HUB__CHOICE_DIALOGS:
        return choiceDialogs != null && !choiceDialogs.isEmpty();
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
    result.append(" (isHidden: ");
    result.append(isHidden);
    result.append(", name: ");
    result.append(name);
    result.append(", hubComment: ");
    result.append(hubComment);
    result.append(')');
    return result.toString();
  }

} //HubImpl
