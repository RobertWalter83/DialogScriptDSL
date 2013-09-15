/**
 */
package de.unidue.ecg.characterScript.characterScript.impl;

import de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage;
import de.unidue.ecg.characterScript.characterScript.CustomAttributeName;
import de.unidue.ecg.characterScript.characterScript.CustomProperty;
import de.unidue.ecg.characterScript.characterScript.EnumValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.impl.CustomPropertyImpl#getCustomAttributeRef <em>Custom Attribute Ref</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.impl.CustomPropertyImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.impl.CustomPropertyImpl#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.impl.CustomPropertyImpl#getEnumValue <em>Enum Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomPropertyImpl extends PropertyImpl implements CustomProperty
{
  /**
   * The cached value of the '{@link #getCustomAttributeRef() <em>Custom Attribute Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomAttributeRef()
   * @generated
   * @ordered
   */
  protected CustomAttributeName customAttributeRef;

  /**
   * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected static final String STRING_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected String stringValue = STRING_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected static final int INT_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected int intValue = INT_VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getEnumValue() <em>Enum Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumValue()
   * @generated
   * @ordered
   */
  protected EnumValue enumValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CustomPropertyImpl()
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
    return CharacterScriptPackage.Literals.CUSTOM_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomAttributeName getCustomAttributeRef()
  {
    if (customAttributeRef != null && customAttributeRef.eIsProxy())
    {
      InternalEObject oldCustomAttributeRef = (InternalEObject)customAttributeRef;
      customAttributeRef = (CustomAttributeName)eResolveProxy(oldCustomAttributeRef);
      if (customAttributeRef != oldCustomAttributeRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CharacterScriptPackage.CUSTOM_PROPERTY__CUSTOM_ATTRIBUTE_REF, oldCustomAttributeRef, customAttributeRef));
      }
    }
    return customAttributeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomAttributeName basicGetCustomAttributeRef()
  {
    return customAttributeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustomAttributeRef(CustomAttributeName newCustomAttributeRef)
  {
    CustomAttributeName oldCustomAttributeRef = customAttributeRef;
    customAttributeRef = newCustomAttributeRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CharacterScriptPackage.CUSTOM_PROPERTY__CUSTOM_ATTRIBUTE_REF, oldCustomAttributeRef, customAttributeRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStringValue()
  {
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringValue(String newStringValue)
  {
    String oldStringValue = stringValue;
    stringValue = newStringValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CharacterScriptPackage.CUSTOM_PROPERTY__STRING_VALUE, oldStringValue, stringValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIntValue()
  {
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntValue(int newIntValue)
  {
    int oldIntValue = intValue;
    intValue = newIntValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CharacterScriptPackage.CUSTOM_PROPERTY__INT_VALUE, oldIntValue, intValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumValue getEnumValue()
  {
    if (enumValue != null && enumValue.eIsProxy())
    {
      InternalEObject oldEnumValue = (InternalEObject)enumValue;
      enumValue = (EnumValue)eResolveProxy(oldEnumValue);
      if (enumValue != oldEnumValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CharacterScriptPackage.CUSTOM_PROPERTY__ENUM_VALUE, oldEnumValue, enumValue));
      }
    }
    return enumValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumValue basicGetEnumValue()
  {
    return enumValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumValue(EnumValue newEnumValue)
  {
    EnumValue oldEnumValue = enumValue;
    enumValue = newEnumValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CharacterScriptPackage.CUSTOM_PROPERTY__ENUM_VALUE, oldEnumValue, enumValue));
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
      case CharacterScriptPackage.CUSTOM_PROPERTY__CUSTOM_ATTRIBUTE_REF:
        if (resolve) return getCustomAttributeRef();
        return basicGetCustomAttributeRef();
      case CharacterScriptPackage.CUSTOM_PROPERTY__STRING_VALUE:
        return getStringValue();
      case CharacterScriptPackage.CUSTOM_PROPERTY__INT_VALUE:
        return getIntValue();
      case CharacterScriptPackage.CUSTOM_PROPERTY__ENUM_VALUE:
        if (resolve) return getEnumValue();
        return basicGetEnumValue();
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
      case CharacterScriptPackage.CUSTOM_PROPERTY__CUSTOM_ATTRIBUTE_REF:
        setCustomAttributeRef((CustomAttributeName)newValue);
        return;
      case CharacterScriptPackage.CUSTOM_PROPERTY__STRING_VALUE:
        setStringValue((String)newValue);
        return;
      case CharacterScriptPackage.CUSTOM_PROPERTY__INT_VALUE:
        setIntValue((Integer)newValue);
        return;
      case CharacterScriptPackage.CUSTOM_PROPERTY__ENUM_VALUE:
        setEnumValue((EnumValue)newValue);
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
      case CharacterScriptPackage.CUSTOM_PROPERTY__CUSTOM_ATTRIBUTE_REF:
        setCustomAttributeRef((CustomAttributeName)null);
        return;
      case CharacterScriptPackage.CUSTOM_PROPERTY__STRING_VALUE:
        setStringValue(STRING_VALUE_EDEFAULT);
        return;
      case CharacterScriptPackage.CUSTOM_PROPERTY__INT_VALUE:
        setIntValue(INT_VALUE_EDEFAULT);
        return;
      case CharacterScriptPackage.CUSTOM_PROPERTY__ENUM_VALUE:
        setEnumValue((EnumValue)null);
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
      case CharacterScriptPackage.CUSTOM_PROPERTY__CUSTOM_ATTRIBUTE_REF:
        return customAttributeRef != null;
      case CharacterScriptPackage.CUSTOM_PROPERTY__STRING_VALUE:
        return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
      case CharacterScriptPackage.CUSTOM_PROPERTY__INT_VALUE:
        return intValue != INT_VALUE_EDEFAULT;
      case CharacterScriptPackage.CUSTOM_PROPERTY__ENUM_VALUE:
        return enumValue != null;
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
    result.append(" (stringValue: ");
    result.append(stringValue);
    result.append(", intValue: ");
    result.append(intValue);
    result.append(')');
    return result.toString();
  }

} //CustomPropertyImpl
