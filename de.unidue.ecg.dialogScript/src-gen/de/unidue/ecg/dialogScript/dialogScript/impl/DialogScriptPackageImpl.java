/**
 */
package de.unidue.ecg.dialogScript.dialogScript.impl;

import de.unidue.ecg.dialogScript.dialogScript.AbstractChoiceDialog;
import de.unidue.ecg.dialogScript.dialogScript.CharacterDefinition;
import de.unidue.ecg.dialogScript.dialogScript.CharactersDefintion;
import de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog;
import de.unidue.ecg.dialogScript.dialogScript.ConditionDefinition;
import de.unidue.ecg.dialogScript.dialogScript.ConditionList;
import de.unidue.ecg.dialogScript.dialogScript.Conditional;
import de.unidue.ecg.dialogScript.dialogScript.ConditionalBody;
import de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog;
import de.unidue.ecg.dialogScript.dialogScript.ConditionsDefinition;
import de.unidue.ecg.dialogScript.dialogScript.Defaults;
import de.unidue.ecg.dialogScript.dialogScript.Dialog;
import de.unidue.ecg.dialogScript.dialogScript.DialogLine;
import de.unidue.ecg.dialogScript.dialogScript.DialogScriptFactory;
import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;
import de.unidue.ecg.dialogScript.dialogScript.Exit;
import de.unidue.ecg.dialogScript.dialogScript.FirstTime;
import de.unidue.ecg.dialogScript.dialogScript.Hub;
import de.unidue.ecg.dialogScript.dialogScript.InvokeHub;
import de.unidue.ecg.dialogScript.dialogScript.InvokeScene;
import de.unidue.ecg.dialogScript.dialogScript.Jump;
import de.unidue.ecg.dialogScript.dialogScript.Modifier;
import de.unidue.ecg.dialogScript.dialogScript.OtherTimes;
import de.unidue.ecg.dialogScript.dialogScript.Otherwise;
import de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice;
import de.unidue.ecg.dialogScript.dialogScript.PartingLines;
import de.unidue.ecg.dialogScript.dialogScript.Recursive;
import de.unidue.ecg.dialogScript.dialogScript.Scene;
import de.unidue.ecg.dialogScript.dialogScript.Script;
import de.unidue.ecg.dialogScript.dialogScript.Statement;
import de.unidue.ecg.dialogScript.dialogScript.Switch;
import de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition;
import de.unidue.ecg.dialogScript.dialogScript.SwitchList;
import de.unidue.ecg.dialogScript.dialogScript.SwitchOff;
import de.unidue.ecg.dialogScript.dialogScript.SwitchOn;
import de.unidue.ecg.dialogScript.dialogScript.SwitchValue;
import de.unidue.ecg.dialogScript.dialogScript.SwitchesDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DialogScriptPackageImpl extends EPackageImpl implements DialogScriptPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass charactersDefintionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass characterDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchesDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionsDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sceneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dialogEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recursiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass firstTimeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass otherTimesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partingLinesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hubEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractChoiceDialogEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalChoiceDialogEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass otherwiseChoiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass choiceDialogEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jumpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass invokeHubEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass invokeSceneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass otherwiseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchOffEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchOnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dialogLineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum modifierEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum switchValueEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DialogScriptPackageImpl()
  {
    super(eNS_URI, DialogScriptFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DialogScriptPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DialogScriptPackage init()
  {
    if (isInited) return (DialogScriptPackage)EPackage.Registry.INSTANCE.getEPackage(DialogScriptPackage.eNS_URI);

    // Obtain or create and register package
    DialogScriptPackageImpl theDialogScriptPackage = (DialogScriptPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DialogScriptPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DialogScriptPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDialogScriptPackage.createPackageContents();

    // Initialize created meta-data
    theDialogScriptPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDialogScriptPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DialogScriptPackage.eNS_URI, theDialogScriptPackage);
    return theDialogScriptPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScript()
  {
    return scriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_CharactersDefinition()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_SwitchesDefinition()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_ConditionsDefinition()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_Scenes()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCharactersDefintion()
  {
    return charactersDefintionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCharactersDefintion_Characters()
  {
    return (EReference)charactersDefintionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCharacterDefinition()
  {
    return characterDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCharacterDefinition_Name()
  {
    return (EAttribute)characterDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitchesDefinition()
  {
    return switchesDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchesDefinition_Switches()
  {
    return (EReference)switchesDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitchDefinition()
  {
    return switchDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitchDefinition_Name()
  {
    return (EAttribute)switchDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitchDefinition_Value()
  {
    return (EAttribute)switchDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionsDefinition()
  {
    return conditionsDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionsDefinition_Conditions()
  {
    return (EReference)conditionsDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionDefinition()
  {
    return conditionDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionDefinition_Name()
  {
    return (EAttribute)conditionDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionDefinition_SwitchList()
  {
    return (EReference)conditionDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScene()
  {
    return sceneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScene_Name()
  {
    return (EAttribute)sceneEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScene_Dialog()
  {
    return (EReference)sceneEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDialog()
  {
    return dialogEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDialog_Defaults()
  {
    return (EReference)dialogEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDialog_FirstTime()
  {
    return (EReference)dialogEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDialog_Recursives()
  {
    return (EReference)dialogEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDialog_PartingLines()
  {
    return (EReference)dialogEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecursive()
  {
    return recursiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaults()
  {
    return defaultsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefaults_Comment()
  {
    return (EAttribute)defaultsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefaults_Body()
  {
    return (EReference)defaultsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFirstTime()
  {
    return firstTimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFirstTime_Comment()
  {
    return (EAttribute)firstTimeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFirstTime_Body()
  {
    return (EReference)firstTimeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFirstTime_OtherTimes()
  {
    return (EReference)firstTimeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOtherTimes()
  {
    return otherTimesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOtherTimes_Comment()
  {
    return (EAttribute)otherTimesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOtherTimes_Body()
  {
    return (EReference)otherTimesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPartingLines()
  {
    return partingLinesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPartingLines_Comment()
  {
    return (EAttribute)partingLinesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartingLines_Body()
  {
    return (EReference)partingLinesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHub()
  {
    return hubEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHub_IsHidden()
  {
    return (EAttribute)hubEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHub_Name()
  {
    return (EAttribute)hubEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHub_HubComment()
  {
    return (EAttribute)hubEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHub_ChoiceDialogs()
  {
    return (EReference)hubEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractChoiceDialog()
  {
    return abstractChoiceDialogEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractChoiceDialog_Modifiers()
  {
    return (EAttribute)abstractChoiceDialogEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalChoiceDialog()
  {
    return conditionalChoiceDialogEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalChoiceDialog_ConditionList()
  {
    return (EReference)conditionalChoiceDialogEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionalChoiceDialog_Comment()
  {
    return (EAttribute)conditionalChoiceDialogEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalChoiceDialog_ChoiceDialogs()
  {
    return (EReference)conditionalChoiceDialogEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalChoiceDialog_OtherwiseChoices()
  {
    return (EReference)conditionalChoiceDialogEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOtherwiseChoice()
  {
    return otherwiseChoiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOtherwiseChoice_Modifiers()
  {
    return (EAttribute)otherwiseChoiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOtherwiseChoice_ConditionList()
  {
    return (EReference)otherwiseChoiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOtherwiseChoice_Comment()
  {
    return (EAttribute)otherwiseChoiceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOtherwiseChoice_Choices()
  {
    return (EReference)otherwiseChoiceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChoiceDialog()
  {
    return choiceDialogEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChoiceDialog_Name()
  {
    return (EAttribute)choiceDialogEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChoiceDialog_ChoiceComment()
  {
    return (EAttribute)choiceDialogEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoiceDialog_Body()
  {
    return (EReference)choiceDialogEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionList()
  {
    return conditionListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionList_Conditions()
  {
    return (EReference)conditionListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJump()
  {
    return jumpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInvokeHub()
  {
    return invokeHubEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvokeHub_Hub()
  {
    return (EReference)invokeHubEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInvokeScene()
  {
    return invokeSceneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvokeScene_Scene()
  {
    return (EReference)invokeSceneEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExit()
  {
    return exitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExit_ExitHub()
  {
    return (EAttribute)exitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExit_ExitScene()
  {
    return (EAttribute)exitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditional()
  {
    return conditionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditional_ConditionList()
  {
    return (EReference)conditionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditional_Comment()
  {
    return (EAttribute)conditionalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditional_Body()
  {
    return (EReference)conditionalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditional_OtherwiseList()
  {
    return (EReference)conditionalEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitchList()
  {
    return switchListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchList_Switches()
  {
    return (EReference)switchListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitch()
  {
    return switchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_Switch()
  {
    return (EReference)switchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitch_Value()
  {
    return (EAttribute)switchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalBody()
  {
    return conditionalBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalBody_Statements()
  {
    return (EReference)conditionalBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalBody_SwitchOn()
  {
    return (EReference)conditionalBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalBody_SwitchOff()
  {
    return (EReference)conditionalBodyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalBody_Jump()
  {
    return (EReference)conditionalBodyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOtherwise()
  {
    return otherwiseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOtherwise_Modifiers()
  {
    return (EAttribute)otherwiseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOtherwise_ConditionList()
  {
    return (EReference)otherwiseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOtherwise_Comment()
  {
    return (EAttribute)otherwiseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOtherwise_Body()
  {
    return (EReference)otherwiseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitchOff()
  {
    return switchOffEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchOff_Sets()
  {
    return (EReference)switchOffEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitchOff_Comment()
  {
    return (EAttribute)switchOffEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitchOn()
  {
    return switchOnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchOn_Sets()
  {
    return (EReference)switchOnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitchOn_Comment()
  {
    return (EAttribute)switchOnEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDialogLine()
  {
    return dialogLineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDialogLine_Character()
  {
    return (EReference)dialogLineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDialogLine_Lines()
  {
    return (EAttribute)dialogLineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDialogLine_Comment()
  {
    return (EAttribute)dialogLineEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getModifier()
  {
    return modifierEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSwitchValue()
  {
    return switchValueEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DialogScriptFactory getDialogScriptFactory()
  {
    return (DialogScriptFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    scriptEClass = createEClass(SCRIPT);
    createEReference(scriptEClass, SCRIPT__CHARACTERS_DEFINITION);
    createEReference(scriptEClass, SCRIPT__SWITCHES_DEFINITION);
    createEReference(scriptEClass, SCRIPT__CONDITIONS_DEFINITION);
    createEReference(scriptEClass, SCRIPT__SCENES);

    charactersDefintionEClass = createEClass(CHARACTERS_DEFINTION);
    createEReference(charactersDefintionEClass, CHARACTERS_DEFINTION__CHARACTERS);

    characterDefinitionEClass = createEClass(CHARACTER_DEFINITION);
    createEAttribute(characterDefinitionEClass, CHARACTER_DEFINITION__NAME);

    switchesDefinitionEClass = createEClass(SWITCHES_DEFINITION);
    createEReference(switchesDefinitionEClass, SWITCHES_DEFINITION__SWITCHES);

    switchDefinitionEClass = createEClass(SWITCH_DEFINITION);
    createEAttribute(switchDefinitionEClass, SWITCH_DEFINITION__NAME);
    createEAttribute(switchDefinitionEClass, SWITCH_DEFINITION__VALUE);

    conditionsDefinitionEClass = createEClass(CONDITIONS_DEFINITION);
    createEReference(conditionsDefinitionEClass, CONDITIONS_DEFINITION__CONDITIONS);

    conditionDefinitionEClass = createEClass(CONDITION_DEFINITION);
    createEAttribute(conditionDefinitionEClass, CONDITION_DEFINITION__NAME);
    createEReference(conditionDefinitionEClass, CONDITION_DEFINITION__SWITCH_LIST);

    sceneEClass = createEClass(SCENE);
    createEAttribute(sceneEClass, SCENE__NAME);
    createEReference(sceneEClass, SCENE__DIALOG);

    dialogEClass = createEClass(DIALOG);
    createEReference(dialogEClass, DIALOG__DEFAULTS);
    createEReference(dialogEClass, DIALOG__FIRST_TIME);
    createEReference(dialogEClass, DIALOG__RECURSIVES);
    createEReference(dialogEClass, DIALOG__PARTING_LINES);

    recursiveEClass = createEClass(RECURSIVE);

    defaultsEClass = createEClass(DEFAULTS);
    createEAttribute(defaultsEClass, DEFAULTS__COMMENT);
    createEReference(defaultsEClass, DEFAULTS__BODY);

    firstTimeEClass = createEClass(FIRST_TIME);
    createEAttribute(firstTimeEClass, FIRST_TIME__COMMENT);
    createEReference(firstTimeEClass, FIRST_TIME__BODY);
    createEReference(firstTimeEClass, FIRST_TIME__OTHER_TIMES);

    otherTimesEClass = createEClass(OTHER_TIMES);
    createEAttribute(otherTimesEClass, OTHER_TIMES__COMMENT);
    createEReference(otherTimesEClass, OTHER_TIMES__BODY);

    partingLinesEClass = createEClass(PARTING_LINES);
    createEAttribute(partingLinesEClass, PARTING_LINES__COMMENT);
    createEReference(partingLinesEClass, PARTING_LINES__BODY);

    hubEClass = createEClass(HUB);
    createEAttribute(hubEClass, HUB__IS_HIDDEN);
    createEAttribute(hubEClass, HUB__NAME);
    createEAttribute(hubEClass, HUB__HUB_COMMENT);
    createEReference(hubEClass, HUB__CHOICE_DIALOGS);

    abstractChoiceDialogEClass = createEClass(ABSTRACT_CHOICE_DIALOG);
    createEAttribute(abstractChoiceDialogEClass, ABSTRACT_CHOICE_DIALOG__MODIFIERS);

    conditionalChoiceDialogEClass = createEClass(CONDITIONAL_CHOICE_DIALOG);
    createEReference(conditionalChoiceDialogEClass, CONDITIONAL_CHOICE_DIALOG__CONDITION_LIST);
    createEAttribute(conditionalChoiceDialogEClass, CONDITIONAL_CHOICE_DIALOG__COMMENT);
    createEReference(conditionalChoiceDialogEClass, CONDITIONAL_CHOICE_DIALOG__CHOICE_DIALOGS);
    createEReference(conditionalChoiceDialogEClass, CONDITIONAL_CHOICE_DIALOG__OTHERWISE_CHOICES);

    otherwiseChoiceEClass = createEClass(OTHERWISE_CHOICE);
    createEAttribute(otherwiseChoiceEClass, OTHERWISE_CHOICE__MODIFIERS);
    createEReference(otherwiseChoiceEClass, OTHERWISE_CHOICE__CONDITION_LIST);
    createEAttribute(otherwiseChoiceEClass, OTHERWISE_CHOICE__COMMENT);
    createEReference(otherwiseChoiceEClass, OTHERWISE_CHOICE__CHOICES);

    choiceDialogEClass = createEClass(CHOICE_DIALOG);
    createEAttribute(choiceDialogEClass, CHOICE_DIALOG__NAME);
    createEAttribute(choiceDialogEClass, CHOICE_DIALOG__CHOICE_COMMENT);
    createEReference(choiceDialogEClass, CHOICE_DIALOG__BODY);

    conditionListEClass = createEClass(CONDITION_LIST);
    createEReference(conditionListEClass, CONDITION_LIST__CONDITIONS);

    jumpEClass = createEClass(JUMP);

    invokeHubEClass = createEClass(INVOKE_HUB);
    createEReference(invokeHubEClass, INVOKE_HUB__HUB);

    invokeSceneEClass = createEClass(INVOKE_SCENE);
    createEReference(invokeSceneEClass, INVOKE_SCENE__SCENE);

    exitEClass = createEClass(EXIT);
    createEAttribute(exitEClass, EXIT__EXIT_HUB);
    createEAttribute(exitEClass, EXIT__EXIT_SCENE);

    conditionalEClass = createEClass(CONDITIONAL);
    createEReference(conditionalEClass, CONDITIONAL__CONDITION_LIST);
    createEAttribute(conditionalEClass, CONDITIONAL__COMMENT);
    createEReference(conditionalEClass, CONDITIONAL__BODY);
    createEReference(conditionalEClass, CONDITIONAL__OTHERWISE_LIST);

    switchListEClass = createEClass(SWITCH_LIST);
    createEReference(switchListEClass, SWITCH_LIST__SWITCHES);

    switchEClass = createEClass(SWITCH);
    createEReference(switchEClass, SWITCH__SWITCH);
    createEAttribute(switchEClass, SWITCH__VALUE);

    conditionalBodyEClass = createEClass(CONDITIONAL_BODY);
    createEReference(conditionalBodyEClass, CONDITIONAL_BODY__STATEMENTS);
    createEReference(conditionalBodyEClass, CONDITIONAL_BODY__SWITCH_ON);
    createEReference(conditionalBodyEClass, CONDITIONAL_BODY__SWITCH_OFF);
    createEReference(conditionalBodyEClass, CONDITIONAL_BODY__JUMP);

    statementEClass = createEClass(STATEMENT);

    otherwiseEClass = createEClass(OTHERWISE);
    createEAttribute(otherwiseEClass, OTHERWISE__MODIFIERS);
    createEReference(otherwiseEClass, OTHERWISE__CONDITION_LIST);
    createEAttribute(otherwiseEClass, OTHERWISE__COMMENT);
    createEReference(otherwiseEClass, OTHERWISE__BODY);

    switchOffEClass = createEClass(SWITCH_OFF);
    createEReference(switchOffEClass, SWITCH_OFF__SETS);
    createEAttribute(switchOffEClass, SWITCH_OFF__COMMENT);

    switchOnEClass = createEClass(SWITCH_ON);
    createEReference(switchOnEClass, SWITCH_ON__SETS);
    createEAttribute(switchOnEClass, SWITCH_ON__COMMENT);

    dialogLineEClass = createEClass(DIALOG_LINE);
    createEReference(dialogLineEClass, DIALOG_LINE__CHARACTER);
    createEAttribute(dialogLineEClass, DIALOG_LINE__LINES);
    createEAttribute(dialogLineEClass, DIALOG_LINE__COMMENT);

    // Create enums
    modifierEEnum = createEEnum(MODIFIER);
    switchValueEEnum = createEEnum(SWITCH_VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    hubEClass.getESuperTypes().add(this.getRecursive());
    conditionalChoiceDialogEClass.getESuperTypes().add(this.getAbstractChoiceDialog());
    choiceDialogEClass.getESuperTypes().add(this.getAbstractChoiceDialog());
    invokeHubEClass.getESuperTypes().add(this.getJump());
    invokeSceneEClass.getESuperTypes().add(this.getJump());
    exitEClass.getESuperTypes().add(this.getJump());
    conditionalEClass.getESuperTypes().add(this.getRecursive());
    conditionalEClass.getESuperTypes().add(this.getAbstractChoiceDialog());
    conditionalEClass.getESuperTypes().add(this.getStatement());
    dialogLineEClass.getESuperTypes().add(this.getRecursive());
    dialogLineEClass.getESuperTypes().add(this.getStatement());

    // Initialize classes and features; add operations and parameters
    initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScript_CharactersDefinition(), this.getCharactersDefintion(), null, "charactersDefinition", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScript_SwitchesDefinition(), this.getSwitchesDefinition(), null, "switchesDefinition", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScript_ConditionsDefinition(), this.getConditionsDefinition(), null, "conditionsDefinition", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScript_Scenes(), this.getScene(), null, "scenes", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(charactersDefintionEClass, CharactersDefintion.class, "CharactersDefintion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCharactersDefintion_Characters(), this.getCharacterDefinition(), null, "characters", null, 0, -1, CharactersDefintion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(characterDefinitionEClass, CharacterDefinition.class, "CharacterDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCharacterDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, CharacterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchesDefinitionEClass, SwitchesDefinition.class, "SwitchesDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSwitchesDefinition_Switches(), this.getSwitchDefinition(), null, "switches", null, 0, -1, SwitchesDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchDefinitionEClass, SwitchDefinition.class, "SwitchDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSwitchDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, SwitchDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSwitchDefinition_Value(), this.getSwitchValue(), "value", null, 0, 1, SwitchDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionsDefinitionEClass, ConditionsDefinition.class, "ConditionsDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditionsDefinition_Conditions(), this.getConditionDefinition(), null, "conditions", null, 0, -1, ConditionsDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionDefinitionEClass, ConditionDefinition.class, "ConditionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConditionDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConditionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditionDefinition_SwitchList(), this.getSwitchList(), null, "switchList", null, 0, 1, ConditionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sceneEClass, Scene.class, "Scene", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScene_Name(), ecorePackage.getEString(), "name", null, 0, 1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScene_Dialog(), this.getDialog(), null, "dialog", null, 0, 1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dialogEClass, Dialog.class, "Dialog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDialog_Defaults(), this.getDefaults(), null, "defaults", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDialog_FirstTime(), this.getFirstTime(), null, "firstTime", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDialog_Recursives(), this.getRecursive(), null, "recursives", null, 0, -1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDialog_PartingLines(), this.getPartingLines(), null, "partingLines", null, 0, 1, Dialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recursiveEClass, Recursive.class, "Recursive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(defaultsEClass, Defaults.class, "Defaults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefaults_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Defaults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefaults_Body(), this.getConditionalBody(), null, "body", null, 0, 1, Defaults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(firstTimeEClass, FirstTime.class, "FirstTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFirstTime_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, FirstTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFirstTime_Body(), this.getConditionalBody(), null, "body", null, 0, 1, FirstTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFirstTime_OtherTimes(), this.getOtherTimes(), null, "otherTimes", null, 0, 1, FirstTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(otherTimesEClass, OtherTimes.class, "OtherTimes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOtherTimes_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, OtherTimes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOtherTimes_Body(), this.getConditionalBody(), null, "body", null, 0, 1, OtherTimes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(partingLinesEClass, PartingLines.class, "PartingLines", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPartingLines_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, PartingLines.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPartingLines_Body(), this.getConditionalBody(), null, "body", null, 0, 1, PartingLines.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hubEClass, Hub.class, "Hub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHub_IsHidden(), ecorePackage.getEBoolean(), "isHidden", null, 0, 1, Hub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHub_Name(), ecorePackage.getEString(), "name", null, 0, 1, Hub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHub_HubComment(), ecorePackage.getEString(), "hubComment", null, 0, 1, Hub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHub_ChoiceDialogs(), this.getAbstractChoiceDialog(), null, "choiceDialogs", null, 0, -1, Hub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractChoiceDialogEClass, AbstractChoiceDialog.class, "AbstractChoiceDialog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractChoiceDialog_Modifiers(), this.getModifier(), "modifiers", null, 0, -1, AbstractChoiceDialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalChoiceDialogEClass, ConditionalChoiceDialog.class, "ConditionalChoiceDialog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditionalChoiceDialog_ConditionList(), this.getConditionList(), null, "conditionList", null, 0, 1, ConditionalChoiceDialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionalChoiceDialog_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, ConditionalChoiceDialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditionalChoiceDialog_ChoiceDialogs(), this.getChoiceDialog(), null, "choiceDialogs", null, 0, -1, ConditionalChoiceDialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditionalChoiceDialog_OtherwiseChoices(), this.getOtherwiseChoice(), null, "otherwiseChoices", null, 0, -1, ConditionalChoiceDialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(otherwiseChoiceEClass, OtherwiseChoice.class, "OtherwiseChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOtherwiseChoice_Modifiers(), this.getModifier(), "modifiers", null, 0, -1, OtherwiseChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOtherwiseChoice_ConditionList(), this.getConditionList(), null, "conditionList", null, 0, 1, OtherwiseChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOtherwiseChoice_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, OtherwiseChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOtherwiseChoice_Choices(), this.getChoiceDialog(), null, "choices", null, 0, -1, OtherwiseChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(choiceDialogEClass, ChoiceDialog.class, "ChoiceDialog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChoiceDialog_Name(), ecorePackage.getEString(), "name", null, 0, 1, ChoiceDialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChoiceDialog_ChoiceComment(), ecorePackage.getEString(), "choiceComment", null, 0, 1, ChoiceDialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChoiceDialog_Body(), this.getConditionalBody(), null, "body", null, 0, 1, ChoiceDialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionListEClass, ConditionList.class, "ConditionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditionList_Conditions(), this.getConditionDefinition(), null, "conditions", null, 0, -1, ConditionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jumpEClass, Jump.class, "Jump", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(invokeHubEClass, InvokeHub.class, "InvokeHub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInvokeHub_Hub(), this.getHub(), null, "hub", null, 0, 1, InvokeHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(invokeSceneEClass, InvokeScene.class, "InvokeScene", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInvokeScene_Scene(), this.getScene(), null, "scene", null, 0, 1, InvokeScene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exitEClass, Exit.class, "Exit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExit_ExitHub(), ecorePackage.getEBoolean(), "exitHub", null, 0, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExit_ExitScene(), ecorePackage.getEBoolean(), "exitScene", null, 0, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditional_ConditionList(), this.getConditionList(), null, "conditionList", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditional_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditional_Body(), this.getConditionalBody(), null, "body", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditional_OtherwiseList(), this.getOtherwise(), null, "otherwiseList", null, 0, -1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchListEClass, SwitchList.class, "SwitchList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSwitchList_Switches(), this.getSwitch(), null, "switches", null, 0, -1, SwitchList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSwitch_Switch(), this.getSwitchDefinition(), null, "switch", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSwitch_Value(), this.getSwitchValue(), "value", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalBodyEClass, ConditionalBody.class, "ConditionalBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditionalBody_Statements(), this.getStatement(), null, "statements", null, 0, -1, ConditionalBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditionalBody_SwitchOn(), this.getSwitchOn(), null, "switchOn", null, 0, 1, ConditionalBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditionalBody_SwitchOff(), this.getSwitchOff(), null, "switchOff", null, 0, 1, ConditionalBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditionalBody_Jump(), this.getJump(), null, "jump", null, 0, 1, ConditionalBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(otherwiseEClass, Otherwise.class, "Otherwise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOtherwise_Modifiers(), this.getModifier(), "modifiers", null, 0, -1, Otherwise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOtherwise_ConditionList(), this.getConditionList(), null, "conditionList", null, 0, 1, Otherwise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOtherwise_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Otherwise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOtherwise_Body(), this.getConditionalBody(), null, "body", null, 0, 1, Otherwise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchOffEClass, SwitchOff.class, "SwitchOff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSwitchOff_Sets(), this.getSwitchDefinition(), null, "sets", null, 0, -1, SwitchOff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSwitchOff_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, SwitchOff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchOnEClass, SwitchOn.class, "SwitchOn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSwitchOn_Sets(), this.getSwitchDefinition(), null, "sets", null, 0, -1, SwitchOn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSwitchOn_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, SwitchOn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dialogLineEClass, DialogLine.class, "DialogLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDialogLine_Character(), this.getCharacterDefinition(), null, "character", null, 0, 1, DialogLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDialogLine_Lines(), ecorePackage.getEString(), "lines", null, 0, 1, DialogLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDialogLine_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, DialogLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(modifierEEnum, Modifier.class, "Modifier");
    addEEnumLiteral(modifierEEnum, Modifier.SINGLE);
    addEEnumLiteral(modifierEEnum, Modifier.RANDOM);

    initEEnum(switchValueEEnum, SwitchValue.class, "SwitchValue");
    addEEnumLiteral(switchValueEEnum, SwitchValue.ON);
    addEEnumLiteral(switchValueEEnum, SwitchValue.OFF);

    // Create resource
    createResource(eNS_URI);
  }

} //DialogScriptPackageImpl
