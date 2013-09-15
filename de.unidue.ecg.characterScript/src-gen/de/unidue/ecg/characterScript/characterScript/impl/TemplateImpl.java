/**
 */
package de.unidue.ecg.characterScript.characterScript.impl;

import de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage;
import de.unidue.ecg.characterScript.characterScript.CustomAttribute;
import de.unidue.ecg.characterScript.characterScript.Template;

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
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.impl.TemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.impl.TemplateImpl#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.impl.TemplateImpl#getCustoms <em>Customs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateImpl extends MinimalEObjectImpl.Container implements Template
{
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
   * The cached value of the '{@link #getDefaults() <em>Defaults</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaults()
   * @generated
   * @ordered
   */
  protected EList<String> defaults;

  /**
   * The cached value of the '{@link #getCustoms() <em>Customs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustoms()
   * @generated
   * @ordered
   */
  protected EList<CustomAttribute> customs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateImpl()
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
    return CharacterScriptPackage.Literals.TEMPLATE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CharacterScriptPackage.TEMPLATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDefaults()
  {
    if (defaults == null)
    {
      defaults = new EDataTypeEList<String>(String.class, this, CharacterScriptPackage.TEMPLATE__DEFAULTS);
    }
    return defaults;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CustomAttribute> getCustoms()
  {
    if (customs == null)
    {
      customs = new EObjectContainmentEList<CustomAttribute>(CustomAttribute.class, this, CharacterScriptPackage.TEMPLATE__CUSTOMS);
    }
    return customs;
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
      case CharacterScriptPackage.TEMPLATE__CUSTOMS:
        return ((InternalEList<?>)getCustoms()).basicRemove(otherEnd, msgs);
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
      case CharacterScriptPackage.TEMPLATE__NAME:
        return getName();
      case CharacterScriptPackage.TEMPLATE__DEFAULTS:
        return getDefaults();
      case CharacterScriptPackage.TEMPLATE__CUSTOMS:
        return getCustoms();
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
      case CharacterScriptPackage.TEMPLATE__NAME:
        setName((String)newValue);
        return;
      case CharacterScriptPackage.TEMPLATE__DEFAULTS:
        getDefaults().clear();
        getDefaults().addAll((Collection<? extends String>)newValue);
        return;
      case CharacterScriptPackage.TEMPLATE__CUSTOMS:
        getCustoms().clear();
        getCustoms().addAll((Collection<? extends CustomAttribute>)newValue);
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
      case CharacterScriptPackage.TEMPLATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CharacterScriptPackage.TEMPLATE__DEFAULTS:
        getDefaults().clear();
        return;
      case CharacterScriptPackage.TEMPLATE__CUSTOMS:
        getCustoms().clear();
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
      case CharacterScriptPackage.TEMPLATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CharacterScriptPackage.TEMPLATE__DEFAULTS:
        return defaults != null && !defaults.isEmpty();
      case CharacterScriptPackage.TEMPLATE__CUSTOMS:
        return customs != null && !customs.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", defaults: ");
    result.append(defaults);
    result.append(')');
    return result.toString();
  }

} //TemplateImpl
