/**
 */
package de.unidue.ecg.dialogScript.dialogScript.util;

import de.unidue.ecg.dialogScript.dialogScript.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage
 * @generated
 */
public class DialogScriptSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DialogScriptPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DialogScriptSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DialogScriptPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DialogScriptPackage.SCRIPT:
      {
        Script script = (Script)theEObject;
        T result = caseScript(script);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.CHARACTERS_DEFINTION:
      {
        CharactersDefintion charactersDefintion = (CharactersDefintion)theEObject;
        T result = caseCharactersDefintion(charactersDefintion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.CHARACTER_DEFINITION:
      {
        CharacterDefinition characterDefinition = (CharacterDefinition)theEObject;
        T result = caseCharacterDefinition(characterDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.SWITCHES_DEFINITION:
      {
        SwitchesDefinition switchesDefinition = (SwitchesDefinition)theEObject;
        T result = caseSwitchesDefinition(switchesDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.SWITCH_DEFINITION:
      {
        SwitchDefinition switchDefinition = (SwitchDefinition)theEObject;
        T result = caseSwitchDefinition(switchDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.CONDITIONS_DEFINITION:
      {
        ConditionsDefinition conditionsDefinition = (ConditionsDefinition)theEObject;
        T result = caseConditionsDefinition(conditionsDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.CONDITION_DEFINITION:
      {
        ConditionDefinition conditionDefinition = (ConditionDefinition)theEObject;
        T result = caseConditionDefinition(conditionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.SCENE:
      {
        Scene scene = (Scene)theEObject;
        T result = caseScene(scene);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.DIALOG:
      {
        Dialog dialog = (Dialog)theEObject;
        T result = caseDialog(dialog);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.RECURSIVE:
      {
        Recursive recursive = (Recursive)theEObject;
        T result = caseRecursive(recursive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.DEFAULTS:
      {
        Defaults defaults = (Defaults)theEObject;
        T result = caseDefaults(defaults);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.FIRST_TIME:
      {
        FirstTime firstTime = (FirstTime)theEObject;
        T result = caseFirstTime(firstTime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.OTHER_TIMES:
      {
        OtherTimes otherTimes = (OtherTimes)theEObject;
        T result = caseOtherTimes(otherTimes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.PARTING_LINES:
      {
        PartingLines partingLines = (PartingLines)theEObject;
        T result = casePartingLines(partingLines);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.HUB:
      {
        Hub hub = (Hub)theEObject;
        T result = caseHub(hub);
        if (result == null) result = caseRecursive(hub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.ABSTRACT_CHOICE_DIALOG:
      {
        AbstractChoiceDialog abstractChoiceDialog = (AbstractChoiceDialog)theEObject;
        T result = caseAbstractChoiceDialog(abstractChoiceDialog);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.CONDITIONAL_CHOICE_DIALOG:
      {
        ConditionalChoiceDialog conditionalChoiceDialog = (ConditionalChoiceDialog)theEObject;
        T result = caseConditionalChoiceDialog(conditionalChoiceDialog);
        if (result == null) result = caseAbstractChoiceDialog(conditionalChoiceDialog);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.OTHERWISE_CHOICE:
      {
        OtherwiseChoice otherwiseChoice = (OtherwiseChoice)theEObject;
        T result = caseOtherwiseChoice(otherwiseChoice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.CHOICE_DIALOG:
      {
        ChoiceDialog choiceDialog = (ChoiceDialog)theEObject;
        T result = caseChoiceDialog(choiceDialog);
        if (result == null) result = caseAbstractChoiceDialog(choiceDialog);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.CONDITION_LIST:
      {
        ConditionList conditionList = (ConditionList)theEObject;
        T result = caseConditionList(conditionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.JUMP:
      {
        Jump jump = (Jump)theEObject;
        T result = caseJump(jump);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.INVOKE_HUB:
      {
        InvokeHub invokeHub = (InvokeHub)theEObject;
        T result = caseInvokeHub(invokeHub);
        if (result == null) result = caseJump(invokeHub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.INVOKE_SCENE:
      {
        InvokeScene invokeScene = (InvokeScene)theEObject;
        T result = caseInvokeScene(invokeScene);
        if (result == null) result = caseJump(invokeScene);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.EXIT:
      {
        Exit exit = (Exit)theEObject;
        T result = caseExit(exit);
        if (result == null) result = caseJump(exit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.CONDITIONAL:
      {
        Conditional conditional = (Conditional)theEObject;
        T result = caseConditional(conditional);
        if (result == null) result = caseRecursive(conditional);
        if (result == null) result = caseAbstractChoiceDialog(conditional);
        if (result == null) result = caseStatement(conditional);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.SWITCH_LIST:
      {
        SwitchList switchList = (SwitchList)theEObject;
        T result = caseSwitchList(switchList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.SWITCH:
      {
        de.unidue.ecg.dialogScript.dialogScript.Switch switch_ = (de.unidue.ecg.dialogScript.dialogScript.Switch)theEObject;
        T result = caseSwitch(switch_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.CONDITIONAL_BODY:
      {
        ConditionalBody conditionalBody = (ConditionalBody)theEObject;
        T result = caseConditionalBody(conditionalBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.OTHERWISE:
      {
        Otherwise otherwise = (Otherwise)theEObject;
        T result = caseOtherwise(otherwise);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.SWITCH_OFF:
      {
        SwitchOff switchOff = (SwitchOff)theEObject;
        T result = caseSwitchOff(switchOff);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.SWITCH_ON:
      {
        SwitchOn switchOn = (SwitchOn)theEObject;
        T result = caseSwitchOn(switchOn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DialogScriptPackage.DIALOG_LINE:
      {
        DialogLine dialogLine = (DialogLine)theEObject;
        T result = caseDialogLine(dialogLine);
        if (result == null) result = caseRecursive(dialogLine);
        if (result == null) result = caseStatement(dialogLine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Script</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScript(Script object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Characters Defintion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Characters Defintion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCharactersDefintion(CharactersDefintion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Character Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Character Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCharacterDefinition(CharacterDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switches Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switches Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchesDefinition(SwitchesDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchDefinition(SwitchDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditions Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditions Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionsDefinition(ConditionsDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionDefinition(ConditionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scene</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scene</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScene(Scene object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dialog</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dialog</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDialog(Dialog object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Recursive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Recursive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecursive(Recursive object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Defaults</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Defaults</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaults(Defaults object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>First Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>First Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFirstTime(FirstTime object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Other Times</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Other Times</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOtherTimes(OtherTimes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parting Lines</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parting Lines</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePartingLines(PartingLines object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHub(Hub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Choice Dialog</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Choice Dialog</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractChoiceDialog(AbstractChoiceDialog object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Choice Dialog</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Choice Dialog</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalChoiceDialog(ConditionalChoiceDialog object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Otherwise Choice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Otherwise Choice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOtherwiseChoice(OtherwiseChoice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choice Dialog</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choice Dialog</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoiceDialog(ChoiceDialog object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionList(ConditionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Jump</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Jump</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJump(Jump object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Invoke Hub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invoke Hub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvokeHub(InvokeHub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Invoke Scene</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invoke Scene</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvokeScene(InvokeScene object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExit(Exit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditional(Conditional object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchList(SwitchList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitch(de.unidue.ecg.dialogScript.dialogScript.Switch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalBody(ConditionalBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Otherwise</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Otherwise</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOtherwise(Otherwise object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch Off</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch Off</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchOff(SwitchOff object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch On</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch On</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchOn(SwitchOn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dialog Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dialog Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDialogLine(DialogLine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DialogScriptSwitch
