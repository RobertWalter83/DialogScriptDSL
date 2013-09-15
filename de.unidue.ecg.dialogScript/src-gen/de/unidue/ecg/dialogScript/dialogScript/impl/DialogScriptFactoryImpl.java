/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DialogScriptFactoryImpl extends EFactoryImpl implements DialogScriptFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DialogScriptFactory init()
  {
    try
    {
      DialogScriptFactory theDialogScriptFactory = (DialogScriptFactory)EPackage.Registry.INSTANCE.getEFactory(DialogScriptPackage.eNS_URI);
      if (theDialogScriptFactory != null)
      {
        return theDialogScriptFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DialogScriptFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DialogScriptFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DialogScriptPackage.SCRIPT: return createScript();
      case DialogScriptPackage.CHARACTERS_DEFINTION: return createCharactersDefintion();
      case DialogScriptPackage.CHARACTER_DEFINITION: return createCharacterDefinition();
      case DialogScriptPackage.SWITCHES_DEFINITION: return createSwitchesDefinition();
      case DialogScriptPackage.SWITCH_DEFINITION: return createSwitchDefinition();
      case DialogScriptPackage.CONDITIONS_DEFINITION: return createConditionsDefinition();
      case DialogScriptPackage.CONDITION_DEFINITION: return createConditionDefinition();
      case DialogScriptPackage.SCENE: return createScene();
      case DialogScriptPackage.DIALOG: return createDialog();
      case DialogScriptPackage.RECURSIVE: return createRecursive();
      case DialogScriptPackage.DEFAULTS: return createDefaults();
      case DialogScriptPackage.FIRST_TIME: return createFirstTime();
      case DialogScriptPackage.OTHER_TIMES: return createOtherTimes();
      case DialogScriptPackage.PARTING_LINES: return createPartingLines();
      case DialogScriptPackage.HUB: return createHub();
      case DialogScriptPackage.ABSTRACT_CHOICE_DIALOG: return createAbstractChoiceDialog();
      case DialogScriptPackage.CONDITIONAL_CHOICE_DIALOG: return createConditionalChoiceDialog();
      case DialogScriptPackage.OTHERWISE_CHOICE: return createOtherwiseChoice();
      case DialogScriptPackage.CHOICE_DIALOG: return createChoiceDialog();
      case DialogScriptPackage.CONDITION_LIST: return createConditionList();
      case DialogScriptPackage.JUMP: return createJump();
      case DialogScriptPackage.INVOKE_HUB: return createInvokeHub();
      case DialogScriptPackage.INVOKE_SCENE: return createInvokeScene();
      case DialogScriptPackage.EXIT: return createExit();
      case DialogScriptPackage.CONDITIONAL: return createConditional();
      case DialogScriptPackage.SWITCH_LIST: return createSwitchList();
      case DialogScriptPackage.SWITCH: return createSwitch();
      case DialogScriptPackage.CONDITIONAL_BODY: return createConditionalBody();
      case DialogScriptPackage.STATEMENT: return createStatement();
      case DialogScriptPackage.OTHERWISE: return createOtherwise();
      case DialogScriptPackage.SWITCH_OFF: return createSwitchOff();
      case DialogScriptPackage.SWITCH_ON: return createSwitchOn();
      case DialogScriptPackage.DIALOG_LINE: return createDialogLine();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DialogScriptPackage.MODIFIER:
        return createModifierFromString(eDataType, initialValue);
      case DialogScriptPackage.SWITCH_VALUE:
        return createSwitchValueFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DialogScriptPackage.MODIFIER:
        return convertModifierToString(eDataType, instanceValue);
      case DialogScriptPackage.SWITCH_VALUE:
        return convertSwitchValueToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script createScript()
  {
    ScriptImpl script = new ScriptImpl();
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharactersDefintion createCharactersDefintion()
  {
    CharactersDefintionImpl charactersDefintion = new CharactersDefintionImpl();
    return charactersDefintion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharacterDefinition createCharacterDefinition()
  {
    CharacterDefinitionImpl characterDefinition = new CharacterDefinitionImpl();
    return characterDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchesDefinition createSwitchesDefinition()
  {
    SwitchesDefinitionImpl switchesDefinition = new SwitchesDefinitionImpl();
    return switchesDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchDefinition createSwitchDefinition()
  {
    SwitchDefinitionImpl switchDefinition = new SwitchDefinitionImpl();
    return switchDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionsDefinition createConditionsDefinition()
  {
    ConditionsDefinitionImpl conditionsDefinition = new ConditionsDefinitionImpl();
    return conditionsDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionDefinition createConditionDefinition()
  {
    ConditionDefinitionImpl conditionDefinition = new ConditionDefinitionImpl();
    return conditionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scene createScene()
  {
    SceneImpl scene = new SceneImpl();
    return scene;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dialog createDialog()
  {
    DialogImpl dialog = new DialogImpl();
    return dialog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recursive createRecursive()
  {
    RecursiveImpl recursive = new RecursiveImpl();
    return recursive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Defaults createDefaults()
  {
    DefaultsImpl defaults = new DefaultsImpl();
    return defaults;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FirstTime createFirstTime()
  {
    FirstTimeImpl firstTime = new FirstTimeImpl();
    return firstTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OtherTimes createOtherTimes()
  {
    OtherTimesImpl otherTimes = new OtherTimesImpl();
    return otherTimes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartingLines createPartingLines()
  {
    PartingLinesImpl partingLines = new PartingLinesImpl();
    return partingLines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hub createHub()
  {
    HubImpl hub = new HubImpl();
    return hub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractChoiceDialog createAbstractChoiceDialog()
  {
    AbstractChoiceDialogImpl abstractChoiceDialog = new AbstractChoiceDialogImpl();
    return abstractChoiceDialog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalChoiceDialog createConditionalChoiceDialog()
  {
    ConditionalChoiceDialogImpl conditionalChoiceDialog = new ConditionalChoiceDialogImpl();
    return conditionalChoiceDialog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OtherwiseChoice createOtherwiseChoice()
  {
    OtherwiseChoiceImpl otherwiseChoice = new OtherwiseChoiceImpl();
    return otherwiseChoice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChoiceDialog createChoiceDialog()
  {
    ChoiceDialogImpl choiceDialog = new ChoiceDialogImpl();
    return choiceDialog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionList createConditionList()
  {
    ConditionListImpl conditionList = new ConditionListImpl();
    return conditionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jump createJump()
  {
    JumpImpl jump = new JumpImpl();
    return jump;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InvokeHub createInvokeHub()
  {
    InvokeHubImpl invokeHub = new InvokeHubImpl();
    return invokeHub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InvokeScene createInvokeScene()
  {
    InvokeSceneImpl invokeScene = new InvokeSceneImpl();
    return invokeScene;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exit createExit()
  {
    ExitImpl exit = new ExitImpl();
    return exit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conditional createConditional()
  {
    ConditionalImpl conditional = new ConditionalImpl();
    return conditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchList createSwitchList()
  {
    SwitchListImpl switchList = new SwitchListImpl();
    return switchList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Switch createSwitch()
  {
    SwitchImpl switch_ = new SwitchImpl();
    return switch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalBody createConditionalBody()
  {
    ConditionalBodyImpl conditionalBody = new ConditionalBodyImpl();
    return conditionalBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Otherwise createOtherwise()
  {
    OtherwiseImpl otherwise = new OtherwiseImpl();
    return otherwise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchOff createSwitchOff()
  {
    SwitchOffImpl switchOff = new SwitchOffImpl();
    return switchOff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchOn createSwitchOn()
  {
    SwitchOnImpl switchOn = new SwitchOnImpl();
    return switchOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DialogLine createDialogLine()
  {
    DialogLineImpl dialogLine = new DialogLineImpl();
    return dialogLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modifier createModifierFromString(EDataType eDataType, String initialValue)
  {
    Modifier result = Modifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertModifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchValue createSwitchValueFromString(EDataType eDataType, String initialValue)
  {
    SwitchValue result = SwitchValue.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSwitchValueToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DialogScriptPackage getDialogScriptPackage()
  {
    return (DialogScriptPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DialogScriptPackage getPackage()
  {
    return DialogScriptPackage.eINSTANCE;
  }

} //DialogScriptFactoryImpl
