/**
 */
package de.unidue.ecg.characterScript.characterScript.impl;

import de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage;
import de.unidue.ecg.characterScript.characterScript.Characters;
import de.unidue.ecg.characterScript.characterScript.Customs;
import de.unidue.ecg.characterScript.characterScript.Import;
import de.unidue.ecg.characterScript.characterScript.Template;

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
 * An implementation of the model object '<em><b>Characters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.impl.CharactersImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.impl.CharactersImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.impl.CharactersImpl#getCustoms <em>Customs</em>}</li>
 *   <li>{@link de.unidue.ecg.characterScript.characterScript.impl.CharactersImpl#getCharacters <em>Characters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharactersImpl extends MinimalEObjectImpl.Container implements Characters
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplates()
   * @generated
   * @ordered
   */
  protected EList<Template> templates;

  /**
   * The cached value of the '{@link #getCustoms() <em>Customs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustoms()
   * @generated
   * @ordered
   */
  protected Customs customs;

  /**
   * The cached value of the '{@link #getCharacters() <em>Characters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacters()
   * @generated
   * @ordered
   */
  protected EList<de.unidue.ecg.characterScript.characterScript.Character> characters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CharactersImpl()
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
    return CharacterScriptPackage.Literals.CHARACTERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, CharacterScriptPackage.CHARACTERS__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Template> getTemplates()
  {
    if (templates == null)
    {
      templates = new EObjectContainmentEList<Template>(Template.class, this, CharacterScriptPackage.CHARACTERS__TEMPLATES);
    }
    return templates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Customs getCustoms()
  {
    return customs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCustoms(Customs newCustoms, NotificationChain msgs)
  {
    Customs oldCustoms = customs;
    customs = newCustoms;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CharacterScriptPackage.CHARACTERS__CUSTOMS, oldCustoms, newCustoms);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustoms(Customs newCustoms)
  {
    if (newCustoms != customs)
    {
      NotificationChain msgs = null;
      if (customs != null)
        msgs = ((InternalEObject)customs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CharacterScriptPackage.CHARACTERS__CUSTOMS, null, msgs);
      if (newCustoms != null)
        msgs = ((InternalEObject)newCustoms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CharacterScriptPackage.CHARACTERS__CUSTOMS, null, msgs);
      msgs = basicSetCustoms(newCustoms, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CharacterScriptPackage.CHARACTERS__CUSTOMS, newCustoms, newCustoms));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<de.unidue.ecg.characterScript.characterScript.Character> getCharacters()
  {
    if (characters == null)
    {
      characters = new EObjectContainmentEList<de.unidue.ecg.characterScript.characterScript.Character>(de.unidue.ecg.characterScript.characterScript.Character.class, this, CharacterScriptPackage.CHARACTERS__CHARACTERS);
    }
    return characters;
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
      case CharacterScriptPackage.CHARACTERS__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case CharacterScriptPackage.CHARACTERS__TEMPLATES:
        return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
      case CharacterScriptPackage.CHARACTERS__CUSTOMS:
        return basicSetCustoms(null, msgs);
      case CharacterScriptPackage.CHARACTERS__CHARACTERS:
        return ((InternalEList<?>)getCharacters()).basicRemove(otherEnd, msgs);
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
      case CharacterScriptPackage.CHARACTERS__IMPORTS:
        return getImports();
      case CharacterScriptPackage.CHARACTERS__TEMPLATES:
        return getTemplates();
      case CharacterScriptPackage.CHARACTERS__CUSTOMS:
        return getCustoms();
      case CharacterScriptPackage.CHARACTERS__CHARACTERS:
        return getCharacters();
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
      case CharacterScriptPackage.CHARACTERS__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case CharacterScriptPackage.CHARACTERS__TEMPLATES:
        getTemplates().clear();
        getTemplates().addAll((Collection<? extends Template>)newValue);
        return;
      case CharacterScriptPackage.CHARACTERS__CUSTOMS:
        setCustoms((Customs)newValue);
        return;
      case CharacterScriptPackage.CHARACTERS__CHARACTERS:
        getCharacters().clear();
        getCharacters().addAll((Collection<? extends de.unidue.ecg.characterScript.characterScript.Character>)newValue);
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
      case CharacterScriptPackage.CHARACTERS__IMPORTS:
        getImports().clear();
        return;
      case CharacterScriptPackage.CHARACTERS__TEMPLATES:
        getTemplates().clear();
        return;
      case CharacterScriptPackage.CHARACTERS__CUSTOMS:
        setCustoms((Customs)null);
        return;
      case CharacterScriptPackage.CHARACTERS__CHARACTERS:
        getCharacters().clear();
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
      case CharacterScriptPackage.CHARACTERS__IMPORTS:
        return imports != null && !imports.isEmpty();
      case CharacterScriptPackage.CHARACTERS__TEMPLATES:
        return templates != null && !templates.isEmpty();
      case CharacterScriptPackage.CHARACTERS__CUSTOMS:
        return customs != null;
      case CharacterScriptPackage.CHARACTERS__CHARACTERS:
        return characters != null && !characters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CharactersImpl
