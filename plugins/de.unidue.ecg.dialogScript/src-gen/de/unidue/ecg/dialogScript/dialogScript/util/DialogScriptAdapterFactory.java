/**
 */
package de.unidue.ecg.dialogScript.dialogScript.util;

import de.unidue.ecg.dialogScript.dialogScript.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage
 * @generated
 */
public class DialogScriptAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DialogScriptPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DialogScriptAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DialogScriptPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DialogScriptSwitch<Adapter> modelSwitch =
    new DialogScriptSwitch<Adapter>()
    {
      @Override
      public Adapter caseScript(Script object)
      {
        return createScriptAdapter();
      }
      @Override
      public Adapter caseCharactersDefinition(CharactersDefinition object)
      {
        return createCharactersDefinitionAdapter();
      }
      @Override
      public Adapter caseCharacterDefinition(CharacterDefinition object)
      {
        return createCharacterDefinitionAdapter();
      }
      @Override
      public Adapter caseSwitchesDefinition(SwitchesDefinition object)
      {
        return createSwitchesDefinitionAdapter();
      }
      @Override
      public Adapter caseSwitchDefinition(SwitchDefinition object)
      {
        return createSwitchDefinitionAdapter();
      }
      @Override
      public Adapter caseConditionsDefinition(ConditionsDefinition object)
      {
        return createConditionsDefinitionAdapter();
      }
      @Override
      public Adapter caseConditionDefinition(ConditionDefinition object)
      {
        return createConditionDefinitionAdapter();
      }
      @Override
      public Adapter caseScene(Scene object)
      {
        return createSceneAdapter();
      }
      @Override
      public Adapter caseDialog(Dialog object)
      {
        return createDialogAdapter();
      }
      @Override
      public Adapter caseRecursive(Recursive object)
      {
        return createRecursiveAdapter();
      }
      @Override
      public Adapter caseDefaults(Defaults object)
      {
        return createDefaultsAdapter();
      }
      @Override
      public Adapter caseFirstTime(FirstTime object)
      {
        return createFirstTimeAdapter();
      }
      @Override
      public Adapter caseOtherTimes(OtherTimes object)
      {
        return createOtherTimesAdapter();
      }
      @Override
      public Adapter casePartingLines(PartingLines object)
      {
        return createPartingLinesAdapter();
      }
      @Override
      public Adapter caseHub(Hub object)
      {
        return createHubAdapter();
      }
      @Override
      public Adapter caseHubFragment(HubFragment object)
      {
        return createHubFragmentAdapter();
      }
      @Override
      public Adapter caseConditionalChoiceDialog(ConditionalChoiceDialog object)
      {
        return createConditionalChoiceDialogAdapter();
      }
      @Override
      public Adapter caseOtherwiseChoice(OtherwiseChoice object)
      {
        return createOtherwiseChoiceAdapter();
      }
      @Override
      public Adapter caseChoiceDialog(ChoiceDialog object)
      {
        return createChoiceDialogAdapter();
      }
      @Override
      public Adapter caseConditionList(ConditionList object)
      {
        return createConditionListAdapter();
      }
      @Override
      public Adapter caseJump(Jump object)
      {
        return createJumpAdapter();
      }
      @Override
      public Adapter caseInvokeHub(InvokeHub object)
      {
        return createInvokeHubAdapter();
      }
      @Override
      public Adapter caseInvokeScene(InvokeScene object)
      {
        return createInvokeSceneAdapter();
      }
      @Override
      public Adapter caseExit(Exit object)
      {
        return createExitAdapter();
      }
      @Override
      public Adapter caseConditional(Conditional object)
      {
        return createConditionalAdapter();
      }
      @Override
      public Adapter caseSwitchList(SwitchList object)
      {
        return createSwitchListAdapter();
      }
      @Override
      public Adapter caseSwitch(Switch object)
      {
        return createSwitchAdapter();
      }
      @Override
      public Adapter caseConditionalBody(ConditionalBody object)
      {
        return createConditionalBodyAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseOtherwise(Otherwise object)
      {
        return createOtherwiseAdapter();
      }
      @Override
      public Adapter caseSwitchOff(SwitchOff object)
      {
        return createSwitchOffAdapter();
      }
      @Override
      public Adapter caseSwitchOn(SwitchOn object)
      {
        return createSwitchOnAdapter();
      }
      @Override
      public Adapter caseDialogLine(DialogLine object)
      {
        return createDialogLineAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.Script
   * @generated
   */
  public Adapter createScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.CharactersDefinition <em>Characters Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.CharactersDefinition
   * @generated
   */
  public Adapter createCharactersDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.CharacterDefinition <em>Character Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.CharacterDefinition
   * @generated
   */
  public Adapter createCharacterDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchesDefinition <em>Switches Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchesDefinition
   * @generated
   */
  public Adapter createSwitchesDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition <em>Switch Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition
   * @generated
   */
  public Adapter createSwitchDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionsDefinition <em>Conditions Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionsDefinition
   * @generated
   */
  public Adapter createConditionsDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionDefinition <em>Condition Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionDefinition
   * @generated
   */
  public Adapter createConditionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.Scene <em>Scene</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.Scene
   * @generated
   */
  public Adapter createSceneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.Dialog <em>Dialog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.Dialog
   * @generated
   */
  public Adapter createDialogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.Recursive <em>Recursive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.Recursive
   * @generated
   */
  public Adapter createRecursiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.Defaults <em>Defaults</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.Defaults
   * @generated
   */
  public Adapter createDefaultsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.FirstTime <em>First Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.FirstTime
   * @generated
   */
  public Adapter createFirstTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.OtherTimes <em>Other Times</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.OtherTimes
   * @generated
   */
  public Adapter createOtherTimesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.PartingLines <em>Parting Lines</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.PartingLines
   * @generated
   */
  public Adapter createPartingLinesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.Hub <em>Hub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.Hub
   * @generated
   */
  public Adapter createHubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.HubFragment <em>Hub Fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.HubFragment
   * @generated
   */
  public Adapter createHubFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog <em>Conditional Choice Dialog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog
   * @generated
   */
  public Adapter createConditionalChoiceDialogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice <em>Otherwise Choice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice
   * @generated
   */
  public Adapter createOtherwiseChoiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog <em>Choice Dialog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog
   * @generated
   */
  public Adapter createChoiceDialogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionList <em>Condition List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionList
   * @generated
   */
  public Adapter createConditionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.Jump <em>Jump</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.Jump
   * @generated
   */
  public Adapter createJumpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.InvokeHub <em>Invoke Hub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.InvokeHub
   * @generated
   */
  public Adapter createInvokeHubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.InvokeScene <em>Invoke Scene</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.InvokeScene
   * @generated
   */
  public Adapter createInvokeSceneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.Exit <em>Exit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.Exit
   * @generated
   */
  public Adapter createExitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.Conditional
   * @generated
   */
  public Adapter createConditionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchList <em>Switch List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchList
   * @generated
   */
  public Adapter createSwitchListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.Switch
   * @generated
   */
  public Adapter createSwitchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalBody <em>Conditional Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionalBody
   * @generated
   */
  public Adapter createConditionalBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.Otherwise <em>Otherwise</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.Otherwise
   * @generated
   */
  public Adapter createOtherwiseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchOff <em>Switch Off</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchOff
   * @generated
   */
  public Adapter createSwitchOffAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchOn <em>Switch On</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchOn
   * @generated
   */
  public Adapter createSwitchOnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.unidue.ecg.dialogScript.dialogScript.DialogLine <em>Dialog Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogLine
   * @generated
   */
  public Adapter createDialogLineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DialogScriptAdapterFactory
