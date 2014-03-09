/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.DialogLine;
import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dialog Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.DialogLineImpl#getCharacter <em>Character</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.DialogLineImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link de.unidue.ecg.dialogScript.dialogScript.impl.DialogLineImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DialogLineImpl extends RecursiveImpl implements DialogLine
{
  /**
   * The cached value of the '{@link #getCharacter() <em>Character</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacter()
   * @generated
   * @ordered
   */
  protected de.unidue.ecg.characterScript.characterScript.Character character;

  /**
   * The default value of the '{@link #getLines() <em>Lines</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLines()
   * @generated
   * @ordered
   */
  protected static final String LINES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLines() <em>Lines</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLines()
   * @generated
   * @ordered
   */
  protected String lines = LINES_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DialogLineImpl()
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
    return DialogScriptPackage.Literals.DIALOG_LINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.unidue.ecg.characterScript.characterScript.Character getCharacter()
  {
    if (character != null && character.eIsProxy())
    {
      InternalEObject oldCharacter = (InternalEObject)character;
      character = (de.unidue.ecg.characterScript.characterScript.Character)eResolveProxy(oldCharacter);
      if (character != oldCharacter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DialogScriptPackage.DIALOG_LINE__CHARACTER, oldCharacter, character));
      }
    }
    return character;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.unidue.ecg.characterScript.characterScript.Character basicGetCharacter()
  {
    return character;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCharacter(de.unidue.ecg.characterScript.characterScript.Character newCharacter)
  {
    de.unidue.ecg.characterScript.characterScript.Character oldCharacter = character;
    character = newCharacter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.DIALOG_LINE__CHARACTER, oldCharacter, character));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLines()
  {
    return lines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLines(String newLines)
  {
    String oldLines = lines;
    lines = newLines;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.DIALOG_LINE__LINES, oldLines, lines));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DialogScriptPackage.DIALOG_LINE__COMMENT, oldComment, comment));
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
      case DialogScriptPackage.DIALOG_LINE__CHARACTER:
        if (resolve) return getCharacter();
        return basicGetCharacter();
      case DialogScriptPackage.DIALOG_LINE__LINES:
        return getLines();
      case DialogScriptPackage.DIALOG_LINE__COMMENT:
        return getComment();
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
      case DialogScriptPackage.DIALOG_LINE__CHARACTER:
        setCharacter((de.unidue.ecg.characterScript.characterScript.Character)newValue);
        return;
      case DialogScriptPackage.DIALOG_LINE__LINES:
        setLines((String)newValue);
        return;
      case DialogScriptPackage.DIALOG_LINE__COMMENT:
        setComment((String)newValue);
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
      case DialogScriptPackage.DIALOG_LINE__CHARACTER:
        setCharacter((de.unidue.ecg.characterScript.characterScript.Character)null);
        return;
      case DialogScriptPackage.DIALOG_LINE__LINES:
        setLines(LINES_EDEFAULT);
        return;
      case DialogScriptPackage.DIALOG_LINE__COMMENT:
        setComment(COMMENT_EDEFAULT);
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
      case DialogScriptPackage.DIALOG_LINE__CHARACTER:
        return character != null;
      case DialogScriptPackage.DIALOG_LINE__LINES:
        return LINES_EDEFAULT == null ? lines != null : !LINES_EDEFAULT.equals(lines);
      case DialogScriptPackage.DIALOG_LINE__COMMENT:
        return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
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
    result.append(" (lines: ");
    result.append(lines);
    result.append(", comment: ");
    result.append(comment);
    result.append(')');
    return result.toString();
  }

} //DialogLineImpl
