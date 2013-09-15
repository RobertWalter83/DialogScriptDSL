/**
 */
package de.unidue.ecg.characterScript.characterScript.impl;

import de.unidue.ecg.characterScript.characterScript.AttributeType;
import de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage;
import de.unidue.ecg.characterScript.characterScript.CustomAttribute;
import de.unidue.ecg.characterScript.characterScript.CustomAttributeName;
import de.unidue.ecg.characterScript.characterScript.EnumValue;

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
 * An implementation of the model object '<em><b>Custom Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.impl.CustomAttributeImpl#getCaName <em>Ca Name</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.impl.CustomAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.impl.CustomAttributeImpl#getEnumValues <em>Enum Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomAttributeImpl extends MinimalEObjectImpl.Container implements CustomAttribute
{
  /**
   * The cached value of the '{@link #getCaName() <em>Ca Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaName()
   * @generated
   * @ordered
   */
  protected CustomAttributeName caName;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final AttributeType TYPE_EDEFAULT = AttributeType.NUMBER;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected AttributeType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getEnumValues() <em>Enum Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumValues()
   * @generated
   * @ordered
   */
  protected EList<EnumValue> enumValues;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CustomAttributeImpl()
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
    return CharacterScriptPackage.Literals.CUSTOM_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomAttributeName getCaName()
  {
    return caName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaName(CustomAttributeName newCaName, NotificationChain msgs)
  {
    CustomAttributeName oldCaName = caName;
    caName = newCaName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CharacterScriptPackage.CUSTOM_ATTRIBUTE__CA_NAME, oldCaName, newCaName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaName(CustomAttributeName newCaName)
  {
    if (newCaName != caName)
    {
      NotificationChain msgs = null;
      if (caName != null)
        msgs = ((InternalEObject)caName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CharacterScriptPackage.CUSTOM_ATTRIBUTE__CA_NAME, null, msgs);
      if (newCaName != null)
        msgs = ((InternalEObject)newCaName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CharacterScriptPackage.CUSTOM_ATTRIBUTE__CA_NAME, null, msgs);
      msgs = basicSetCaName(newCaName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CharacterScriptPackage.CUSTOM_ATTRIBUTE__CA_NAME, newCaName, newCaName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(AttributeType newType)
  {
    AttributeType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CharacterScriptPackage.CUSTOM_ATTRIBUTE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnumValue> getEnumValues()
  {
    if (enumValues == null)
    {
      enumValues = new EObjectContainmentEList<EnumValue>(EnumValue.class, this, CharacterScriptPackage.CUSTOM_ATTRIBUTE__ENUM_VALUES);
    }
    return enumValues;
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
      case CharacterScriptPackage.CUSTOM_ATTRIBUTE__CA_NAME:
        return basicSetCaName(null, msgs);
      case CharacterScriptPackage.CUSTOM_ATTRIBUTE__ENUM_VALUES:
        return ((InternalEList<?>)getEnumValues()).basicRemove(otherEnd, msgs);
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
      case CharacterScriptPackage.CUSTOM_ATTRIBUTE__CA_NAME:
        return getCaName();
      case CharacterScriptPackage.CUSTOM_ATTRIBUTE__TYPE:
        return getType();
      case CharacterScriptPackage.CUSTOM_ATTRIBUTE__ENUM_VALUES:
        return getEnumValues();
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
      case CharacterScriptPackage.CUSTOM_ATTRIBUTE__CA_NAME:
        setCaName((CustomAttributeName)newValue);
        return;
      case CharacterScriptPackage.CUSTOM_ATTRIBUTE__TYPE:
        setType((AttributeType)newValue);
        return;
      case CharacterScriptPackage.CUSTOM_ATTRIBUTE__ENUM_VALUES:
        getEnumValues().clear();
        getEnumValues().addAll((Collection<? extends EnumValue>)newValue);
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
      case CharacterScriptPackage.CUSTOM_ATTRIBUTE__CA_NAME:
        setCaName((CustomAttributeName)null);
        return;
      case CharacterScriptPackage.CUSTOM_ATTRIBUTE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case CharacterScriptPackage.CUSTOM_ATTRIBUTE__ENUM_VALUES:
        getEnumValues().clear();
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
      case CharacterScriptPackage.CUSTOM_ATTRIBUTE__CA_NAME:
        return caName != null;
      case CharacterScriptPackage.CUSTOM_ATTRIBUTE__TYPE:
        return type != TYPE_EDEFAULT;
      case CharacterScriptPackage.CUSTOM_ATTRIBUTE__ENUM_VALUES:
        return enumValues != null && !enumValues.isEmpty();
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //CustomAttributeImpl
