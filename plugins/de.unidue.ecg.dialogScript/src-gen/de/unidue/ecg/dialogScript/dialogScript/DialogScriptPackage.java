/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptFactory
 * @model kind="package"
 * @generated
 */
public interface DialogScriptPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dialogScript";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.unidue.de/ecg/dialogScript/DialogScript";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dialogScript";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DialogScriptPackage eINSTANCE = de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl.init();

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ScriptImpl <em>Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.ScriptImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getScript()
   * @generated
   */
  int SCRIPT = 0;

  /**
   * The feature id for the '<em><b>Characters Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__CHARACTERS_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Switches Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__SWITCHES_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Conditions Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__CONDITIONS_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Scenes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__SCENES = 3;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.CharactersDefintionImpl <em>Characters Defintion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.CharactersDefintionImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getCharactersDefintion()
   * @generated
   */
  int CHARACTERS_DEFINTION = 1;

  /**
   * The feature id for the '<em><b>Characters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERS_DEFINTION__CHARACTERS = 0;

  /**
   * The number of structural features of the '<em>Characters Defintion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERS_DEFINTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.CharacterDefinitionImpl <em>Character Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.CharacterDefinitionImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getCharacterDefinition()
   * @generated
   */
  int CHARACTER_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_DEFINITION__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Character Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.SwitchesDefinitionImpl <em>Switches Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.SwitchesDefinitionImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getSwitchesDefinition()
   * @generated
   */
  int SWITCHES_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Switches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCHES_DEFINITION__SWITCHES = 0;

  /**
   * The number of structural features of the '<em>Switches Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCHES_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.SwitchDefinitionImpl <em>Switch Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.SwitchDefinitionImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getSwitchDefinition()
   * @generated
   */
  int SWITCH_DEFINITION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_DEFINITION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Switch Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionsDefinitionImpl <em>Conditions Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.ConditionsDefinitionImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getConditionsDefinition()
   * @generated
   */
  int CONDITIONS_DEFINITION = 5;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONS_DEFINITION__CONDITIONS = 0;

  /**
   * The number of structural features of the '<em>Conditions Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONS_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionDefinitionImpl <em>Condition Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.ConditionDefinitionImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getConditionDefinition()
   * @generated
   */
  int CONDITION_DEFINITION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Switch List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_DEFINITION__SWITCH_LIST = 1;

  /**
   * The number of structural features of the '<em>Condition Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.SceneImpl <em>Scene</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.SceneImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getScene()
   * @generated
   */
  int SCENE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENE__NAME = 0;

  /**
   * The feature id for the '<em><b>Dialog</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENE__DIALOG = 1;

  /**
   * The number of structural features of the '<em>Scene</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.DialogImpl <em>Dialog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getDialog()
   * @generated
   */
  int DIALOG = 8;

  /**
   * The feature id for the '<em><b>Defaults</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALOG__DEFAULTS = 0;

  /**
   * The feature id for the '<em><b>First Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALOG__FIRST_TIME = 1;

  /**
   * The feature id for the '<em><b>Recursives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALOG__RECURSIVES = 2;

  /**
   * The feature id for the '<em><b>Parting Lines</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALOG__PARTING_LINES = 3;

  /**
   * The number of structural features of the '<em>Dialog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALOG_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.RecursiveImpl <em>Recursive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.RecursiveImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getRecursive()
   * @generated
   */
  int RECURSIVE = 9;

  /**
   * The number of structural features of the '<em>Recursive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSIVE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.DefaultsImpl <em>Defaults</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DefaultsImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getDefaults()
   * @generated
   */
  int DEFAULTS = 10;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULTS__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULTS__BODY = 1;

  /**
   * The number of structural features of the '<em>Defaults</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULTS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.FirstTimeImpl <em>First Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.FirstTimeImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getFirstTime()
   * @generated
   */
  int FIRST_TIME = 11;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRST_TIME__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRST_TIME__BODY = 1;

  /**
   * The feature id for the '<em><b>Other Times</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRST_TIME__OTHER_TIMES = 2;

  /**
   * The number of structural features of the '<em>First Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRST_TIME_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.OtherTimesImpl <em>Other Times</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.OtherTimesImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getOtherTimes()
   * @generated
   */
  int OTHER_TIMES = 12;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_TIMES__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_TIMES__BODY = 1;

  /**
   * The number of structural features of the '<em>Other Times</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_TIMES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.PartingLinesImpl <em>Parting Lines</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.PartingLinesImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getPartingLines()
   * @generated
   */
  int PARTING_LINES = 13;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTING_LINES__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTING_LINES__BODY = 1;

  /**
   * The number of structural features of the '<em>Parting Lines</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTING_LINES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.HubImpl <em>Hub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.HubImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getHub()
   * @generated
   */
  int HUB = 14;

  /**
   * The feature id for the '<em><b>Is Hidden</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUB__IS_HIDDEN = RECURSIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUB__NAME = RECURSIVE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Hub Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUB__HUB_COMMENT = RECURSIVE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Choice Dialogs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUB__CHOICE_DIALOGS = RECURSIVE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Hub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUB_FEATURE_COUNT = RECURSIVE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.AbstractChoiceDialogImpl <em>Abstract Choice Dialog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.AbstractChoiceDialogImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getAbstractChoiceDialog()
   * @generated
   */
  int ABSTRACT_CHOICE_DIALOG = 15;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CHOICE_DIALOG__MODIFIERS = 0;

  /**
   * The number of structural features of the '<em>Abstract Choice Dialog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CHOICE_DIALOG_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalChoiceDialogImpl <em>Conditional Choice Dialog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalChoiceDialogImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getConditionalChoiceDialog()
   * @generated
   */
  int CONDITIONAL_CHOICE_DIALOG = 16;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_CHOICE_DIALOG__MODIFIERS = ABSTRACT_CHOICE_DIALOG__MODIFIERS;

  /**
   * The feature id for the '<em><b>Condition List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_CHOICE_DIALOG__CONDITION_LIST = ABSTRACT_CHOICE_DIALOG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_CHOICE_DIALOG__COMMENT = ABSTRACT_CHOICE_DIALOG_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Choice Dialogs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_CHOICE_DIALOG__CHOICE_DIALOGS = ABSTRACT_CHOICE_DIALOG_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Otherwise Choices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_CHOICE_DIALOG__OTHERWISE_CHOICES = ABSTRACT_CHOICE_DIALOG_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Conditional Choice Dialog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_CHOICE_DIALOG_FEATURE_COUNT = ABSTRACT_CHOICE_DIALOG_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.OtherwiseChoiceImpl <em>Otherwise Choice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.OtherwiseChoiceImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getOtherwiseChoice()
   * @generated
   */
  int OTHERWISE_CHOICE = 17;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHERWISE_CHOICE__MODIFIERS = 0;

  /**
   * The feature id for the '<em><b>Condition List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHERWISE_CHOICE__CONDITION_LIST = 1;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHERWISE_CHOICE__COMMENT = 2;

  /**
   * The feature id for the '<em><b>Choices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHERWISE_CHOICE__CHOICES = 3;

  /**
   * The number of structural features of the '<em>Otherwise Choice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHERWISE_CHOICE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ChoiceDialogImpl <em>Choice Dialog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.ChoiceDialogImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getChoiceDialog()
   * @generated
   */
  int CHOICE_DIALOG = 18;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_DIALOG__MODIFIERS = ABSTRACT_CHOICE_DIALOG__MODIFIERS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_DIALOG__NAME = ABSTRACT_CHOICE_DIALOG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Choice Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_DIALOG__CHOICE_COMMENT = ABSTRACT_CHOICE_DIALOG_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_DIALOG__BODY = ABSTRACT_CHOICE_DIALOG_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Choice Dialog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_DIALOG_FEATURE_COUNT = ABSTRACT_CHOICE_DIALOG_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionListImpl <em>Condition List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.ConditionListImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getConditionList()
   * @generated
   */
  int CONDITION_LIST = 19;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_LIST__CONDITIONS = 0;

  /**
   * The number of structural features of the '<em>Condition List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.JumpImpl <em>Jump</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.JumpImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getJump()
   * @generated
   */
  int JUMP = 20;

  /**
   * The number of structural features of the '<em>Jump</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.InvokeHubImpl <em>Invoke Hub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.InvokeHubImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getInvokeHub()
   * @generated
   */
  int INVOKE_HUB = 21;

  /**
   * The feature id for the '<em><b>Hub</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_HUB__HUB = JUMP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Invoke Hub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_HUB_FEATURE_COUNT = JUMP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.InvokeSceneImpl <em>Invoke Scene</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.InvokeSceneImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getInvokeScene()
   * @generated
   */
  int INVOKE_SCENE = 22;

  /**
   * The feature id for the '<em><b>Scene</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_SCENE__SCENE = JUMP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Invoke Scene</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_SCENE_FEATURE_COUNT = JUMP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ExitImpl <em>Exit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.ExitImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getExit()
   * @generated
   */
  int EXIT = 23;

  /**
   * The feature id for the '<em><b>Exit Hub</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT__EXIT_HUB = JUMP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exit Scene</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT__EXIT_SCENE = JUMP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_FEATURE_COUNT = JUMP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalImpl <em>Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getConditional()
   * @generated
   */
  int CONDITIONAL = 24;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__MODIFIERS = RECURSIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__CONDITION_LIST = RECURSIVE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__COMMENT = RECURSIVE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__BODY = RECURSIVE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Otherwise List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__OTHERWISE_LIST = RECURSIVE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Conditional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_FEATURE_COUNT = RECURSIVE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.SwitchListImpl <em>Switch List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.SwitchListImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getSwitchList()
   * @generated
   */
  int SWITCH_LIST = 25;

  /**
   * The feature id for the '<em><b>Switches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_LIST__SWITCHES = 0;

  /**
   * The number of structural features of the '<em>Switch List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.SwitchImpl <em>Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.SwitchImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getSwitch()
   * @generated
   */
  int SWITCH = 26;

  /**
   * The feature id for the '<em><b>Switch</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__SWITCH = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__VALUE = 1;

  /**
   * The number of structural features of the '<em>Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalBodyImpl <em>Conditional Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalBodyImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getConditionalBody()
   * @generated
   */
  int CONDITIONAL_BODY = 27;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_BODY__STATEMENTS = 0;

  /**
   * The feature id for the '<em><b>Switch On</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_BODY__SWITCH_ON = 1;

  /**
   * The feature id for the '<em><b>Switch Off</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_BODY__SWITCH_OFF = 2;

  /**
   * The feature id for the '<em><b>Jump</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_BODY__JUMP = 3;

  /**
   * The number of structural features of the '<em>Conditional Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_BODY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.StatementImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 28;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.OtherwiseImpl <em>Otherwise</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.OtherwiseImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getOtherwise()
   * @generated
   */
  int OTHERWISE = 29;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHERWISE__MODIFIERS = 0;

  /**
   * The feature id for the '<em><b>Condition List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHERWISE__CONDITION_LIST = 1;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHERWISE__COMMENT = 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHERWISE__BODY = 3;

  /**
   * The number of structural features of the '<em>Otherwise</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHERWISE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.SwitchOffImpl <em>Switch Off</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.SwitchOffImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getSwitchOff()
   * @generated
   */
  int SWITCH_OFF = 30;

  /**
   * The feature id for the '<em><b>Sets</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_OFF__SETS = 0;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_OFF__COMMENT = 1;

  /**
   * The number of structural features of the '<em>Switch Off</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_OFF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.SwitchOnImpl <em>Switch On</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.SwitchOnImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getSwitchOn()
   * @generated
   */
  int SWITCH_ON = 31;

  /**
   * The feature id for the '<em><b>Sets</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_ON__SETS = 0;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_ON__COMMENT = 1;

  /**
   * The number of structural features of the '<em>Switch On</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_ON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.DialogLineImpl <em>Dialog Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogLineImpl
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getDialogLine()
   * @generated
   */
  int DIALOG_LINE = 32;

  /**
   * The feature id for the '<em><b>Character</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALOG_LINE__CHARACTER = RECURSIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lines</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALOG_LINE__LINES = RECURSIVE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALOG_LINE__COMMENT = RECURSIVE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Dialog Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALOG_LINE_FEATURE_COUNT = RECURSIVE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.Modifier <em>Modifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.Modifier
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getModifier()
   * @generated
   */
  int MODIFIER = 33;

  /**
   * The meta object id for the '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchValue <em>Switch Value</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchValue
   * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getSwitchValue()
   * @generated
   */
  int SWITCH_VALUE = 34;


  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Script
   * @generated
   */
  EClass getScript();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.Script#getCharactersDefinition <em>Characters Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Characters Definition</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Script#getCharactersDefinition()
   * @see #getScript()
   * @generated
   */
  EReference getScript_CharactersDefinition();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.Script#getSwitchesDefinition <em>Switches Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Switches Definition</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Script#getSwitchesDefinition()
   * @see #getScript()
   * @generated
   */
  EReference getScript_SwitchesDefinition();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.Script#getConditionsDefinition <em>Conditions Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conditions Definition</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Script#getConditionsDefinition()
   * @see #getScript()
   * @generated
   */
  EReference getScript_ConditionsDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.dialogScript.dialogScript.Script#getScenes <em>Scenes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scenes</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Script#getScenes()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Scenes();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.CharactersDefintion <em>Characters Defintion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Characters Defintion</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.CharactersDefintion
   * @generated
   */
  EClass getCharactersDefintion();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.dialogScript.dialogScript.CharactersDefintion#getCharacters <em>Characters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Characters</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.CharactersDefintion#getCharacters()
   * @see #getCharactersDefintion()
   * @generated
   */
  EReference getCharactersDefintion_Characters();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.CharacterDefinition <em>Character Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Character Definition</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.CharacterDefinition
   * @generated
   */
  EClass getCharacterDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.CharacterDefinition#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.CharacterDefinition#getImportedNamespace()
   * @see #getCharacterDefinition()
   * @generated
   */
  EAttribute getCharacterDefinition_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchesDefinition <em>Switches Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switches Definition</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchesDefinition
   * @generated
   */
  EClass getSwitchesDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchesDefinition#getSwitches <em>Switches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Switches</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchesDefinition#getSwitches()
   * @see #getSwitchesDefinition()
   * @generated
   */
  EReference getSwitchesDefinition_Switches();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition <em>Switch Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Definition</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition
   * @generated
   */
  EClass getSwitchDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition#getName()
   * @see #getSwitchDefinition()
   * @generated
   */
  EAttribute getSwitchDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition#getValue()
   * @see #getSwitchDefinition()
   * @generated
   */
  EAttribute getSwitchDefinition_Value();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionsDefinition <em>Conditions Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditions Definition</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionsDefinition
   * @generated
   */
  EClass getConditionsDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionsDefinition#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditions</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionsDefinition#getConditions()
   * @see #getConditionsDefinition()
   * @generated
   */
  EReference getConditionsDefinition_Conditions();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionDefinition <em>Condition Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Definition</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionDefinition
   * @generated
   */
  EClass getConditionDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionDefinition#getName()
   * @see #getConditionDefinition()
   * @generated
   */
  EAttribute getConditionDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionDefinition#getSwitchList <em>Switch List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Switch List</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionDefinition#getSwitchList()
   * @see #getConditionDefinition()
   * @generated
   */
  EReference getConditionDefinition_SwitchList();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.Scene <em>Scene</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scene</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Scene
   * @generated
   */
  EClass getScene();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.Scene#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Scene#getName()
   * @see #getScene()
   * @generated
   */
  EAttribute getScene_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.Scene#getDialog <em>Dialog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dialog</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Scene#getDialog()
   * @see #getScene()
   * @generated
   */
  EReference getScene_Dialog();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.Dialog <em>Dialog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dialog</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Dialog
   * @generated
   */
  EClass getDialog();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.Dialog#getDefaults <em>Defaults</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Defaults</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Dialog#getDefaults()
   * @see #getDialog()
   * @generated
   */
  EReference getDialog_Defaults();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.Dialog#getFirstTime <em>First Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First Time</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Dialog#getFirstTime()
   * @see #getDialog()
   * @generated
   */
  EReference getDialog_FirstTime();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.dialogScript.dialogScript.Dialog#getRecursives <em>Recursives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Recursives</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Dialog#getRecursives()
   * @see #getDialog()
   * @generated
   */
  EReference getDialog_Recursives();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.Dialog#getPartingLines <em>Parting Lines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parting Lines</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Dialog#getPartingLines()
   * @see #getDialog()
   * @generated
   */
  EReference getDialog_PartingLines();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.Recursive <em>Recursive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recursive</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Recursive
   * @generated
   */
  EClass getRecursive();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.Defaults <em>Defaults</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Defaults</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Defaults
   * @generated
   */
  EClass getDefaults();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.Defaults#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Defaults#getComment()
   * @see #getDefaults()
   * @generated
   */
  EAttribute getDefaults_Comment();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.Defaults#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Defaults#getBody()
   * @see #getDefaults()
   * @generated
   */
  EReference getDefaults_Body();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.FirstTime <em>First Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>First Time</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.FirstTime
   * @generated
   */
  EClass getFirstTime();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.FirstTime#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.FirstTime#getComment()
   * @see #getFirstTime()
   * @generated
   */
  EAttribute getFirstTime_Comment();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.FirstTime#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.FirstTime#getBody()
   * @see #getFirstTime()
   * @generated
   */
  EReference getFirstTime_Body();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.FirstTime#getOtherTimes <em>Other Times</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Other Times</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.FirstTime#getOtherTimes()
   * @see #getFirstTime()
   * @generated
   */
  EReference getFirstTime_OtherTimes();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.OtherTimes <em>Other Times</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Other Times</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.OtherTimes
   * @generated
   */
  EClass getOtherTimes();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.OtherTimes#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.OtherTimes#getComment()
   * @see #getOtherTimes()
   * @generated
   */
  EAttribute getOtherTimes_Comment();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.OtherTimes#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.OtherTimes#getBody()
   * @see #getOtherTimes()
   * @generated
   */
  EReference getOtherTimes_Body();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.PartingLines <em>Parting Lines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parting Lines</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.PartingLines
   * @generated
   */
  EClass getPartingLines();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.PartingLines#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.PartingLines#getComment()
   * @see #getPartingLines()
   * @generated
   */
  EAttribute getPartingLines_Comment();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.PartingLines#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.PartingLines#getBody()
   * @see #getPartingLines()
   * @generated
   */
  EReference getPartingLines_Body();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.Hub <em>Hub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hub</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Hub
   * @generated
   */
  EClass getHub();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.Hub#isIsHidden <em>Is Hidden</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Hidden</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Hub#isIsHidden()
   * @see #getHub()
   * @generated
   */
  EAttribute getHub_IsHidden();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.Hub#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Hub#getName()
   * @see #getHub()
   * @generated
   */
  EAttribute getHub_Name();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.Hub#getHubComment <em>Hub Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hub Comment</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Hub#getHubComment()
   * @see #getHub()
   * @generated
   */
  EAttribute getHub_HubComment();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.dialogScript.dialogScript.Hub#getChoiceDialogs <em>Choice Dialogs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Choice Dialogs</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Hub#getChoiceDialogs()
   * @see #getHub()
   * @generated
   */
  EReference getHub_ChoiceDialogs();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.AbstractChoiceDialog <em>Abstract Choice Dialog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Choice Dialog</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.AbstractChoiceDialog
   * @generated
   */
  EClass getAbstractChoiceDialog();

  /**
   * Returns the meta object for the attribute list '{@link de.unidue.ecg.dialogScript.dialogScript.AbstractChoiceDialog#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.AbstractChoiceDialog#getModifiers()
   * @see #getAbstractChoiceDialog()
   * @generated
   */
  EAttribute getAbstractChoiceDialog_Modifiers();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog <em>Conditional Choice Dialog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Choice Dialog</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog
   * @generated
   */
  EClass getConditionalChoiceDialog();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog#getConditionList <em>Condition List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition List</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog#getConditionList()
   * @see #getConditionalChoiceDialog()
   * @generated
   */
  EReference getConditionalChoiceDialog_ConditionList();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog#getComment()
   * @see #getConditionalChoiceDialog()
   * @generated
   */
  EAttribute getConditionalChoiceDialog_Comment();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog#getChoiceDialogs <em>Choice Dialogs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Choice Dialogs</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog#getChoiceDialogs()
   * @see #getConditionalChoiceDialog()
   * @generated
   */
  EReference getConditionalChoiceDialog_ChoiceDialogs();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog#getOtherwiseChoices <em>Otherwise Choices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Otherwise Choices</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog#getOtherwiseChoices()
   * @see #getConditionalChoiceDialog()
   * @generated
   */
  EReference getConditionalChoiceDialog_OtherwiseChoices();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice <em>Otherwise Choice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Otherwise Choice</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice
   * @generated
   */
  EClass getOtherwiseChoice();

  /**
   * Returns the meta object for the attribute list '{@link de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice#getModifiers()
   * @see #getOtherwiseChoice()
   * @generated
   */
  EAttribute getOtherwiseChoice_Modifiers();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice#getConditionList <em>Condition List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition List</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice#getConditionList()
   * @see #getOtherwiseChoice()
   * @generated
   */
  EReference getOtherwiseChoice_ConditionList();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice#getComment()
   * @see #getOtherwiseChoice()
   * @generated
   */
  EAttribute getOtherwiseChoice_Comment();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice#getChoices <em>Choices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Choices</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice#getChoices()
   * @see #getOtherwiseChoice()
   * @generated
   */
  EReference getOtherwiseChoice_Choices();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog <em>Choice Dialog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice Dialog</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog
   * @generated
   */
  EClass getChoiceDialog();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog#getName()
   * @see #getChoiceDialog()
   * @generated
   */
  EAttribute getChoiceDialog_Name();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog#getChoiceComment <em>Choice Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Choice Comment</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog#getChoiceComment()
   * @see #getChoiceDialog()
   * @generated
   */
  EAttribute getChoiceDialog_ChoiceComment();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog#getBody()
   * @see #getChoiceDialog()
   * @generated
   */
  EReference getChoiceDialog_Body();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionList <em>Condition List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition List</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionList
   * @generated
   */
  EClass getConditionList();

  /**
   * Returns the meta object for the reference list '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionList#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Conditions</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionList#getConditions()
   * @see #getConditionList()
   * @generated
   */
  EReference getConditionList_Conditions();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.Jump <em>Jump</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jump</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Jump
   * @generated
   */
  EClass getJump();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.InvokeHub <em>Invoke Hub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invoke Hub</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.InvokeHub
   * @generated
   */
  EClass getInvokeHub();

  /**
   * Returns the meta object for the reference '{@link de.unidue.ecg.dialogScript.dialogScript.InvokeHub#getHub <em>Hub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Hub</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.InvokeHub#getHub()
   * @see #getInvokeHub()
   * @generated
   */
  EReference getInvokeHub_Hub();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.InvokeScene <em>Invoke Scene</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invoke Scene</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.InvokeScene
   * @generated
   */
  EClass getInvokeScene();

  /**
   * Returns the meta object for the reference '{@link de.unidue.ecg.dialogScript.dialogScript.InvokeScene#getScene <em>Scene</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Scene</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.InvokeScene#getScene()
   * @see #getInvokeScene()
   * @generated
   */
  EReference getInvokeScene_Scene();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.Exit <em>Exit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exit</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Exit
   * @generated
   */
  EClass getExit();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.Exit#isExitHub <em>Exit Hub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exit Hub</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Exit#isExitHub()
   * @see #getExit()
   * @generated
   */
  EAttribute getExit_ExitHub();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.Exit#isExitScene <em>Exit Scene</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exit Scene</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Exit#isExitScene()
   * @see #getExit()
   * @generated
   */
  EAttribute getExit_ExitScene();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Conditional
   * @generated
   */
  EClass getConditional();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.Conditional#getConditionList <em>Condition List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition List</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Conditional#getConditionList()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_ConditionList();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.Conditional#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Conditional#getComment()
   * @see #getConditional()
   * @generated
   */
  EAttribute getConditional_Comment();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.Conditional#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Conditional#getBody()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_Body();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.dialogScript.dialogScript.Conditional#getOtherwiseList <em>Otherwise List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Otherwise List</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Conditional#getOtherwiseList()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_OtherwiseList();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchList <em>Switch List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch List</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchList
   * @generated
   */
  EClass getSwitchList();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchList#getSwitches <em>Switches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Switches</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchList#getSwitches()
   * @see #getSwitchList()
   * @generated
   */
  EReference getSwitchList_Switches();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Switch
   * @generated
   */
  EClass getSwitch();

  /**
   * Returns the meta object for the reference '{@link de.unidue.ecg.dialogScript.dialogScript.Switch#getSwitch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Switch</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Switch#getSwitch()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_Switch();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.Switch#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Switch#getValue()
   * @see #getSwitch()
   * @generated
   */
  EAttribute getSwitch_Value();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalBody <em>Conditional Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Body</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionalBody
   * @generated
   */
  EClass getConditionalBody();

  /**
   * Returns the meta object for the containment reference list '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalBody#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionalBody#getStatements()
   * @see #getConditionalBody()
   * @generated
   */
  EReference getConditionalBody_Statements();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalBody#getSwitchOn <em>Switch On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Switch On</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionalBody#getSwitchOn()
   * @see #getConditionalBody()
   * @generated
   */
  EReference getConditionalBody_SwitchOn();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalBody#getSwitchOff <em>Switch Off</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Switch Off</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionalBody#getSwitchOff()
   * @see #getConditionalBody()
   * @generated
   */
  EReference getConditionalBody_SwitchOff();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.ConditionalBody#getJump <em>Jump</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Jump</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.ConditionalBody#getJump()
   * @see #getConditionalBody()
   * @generated
   */
  EReference getConditionalBody_Jump();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.Otherwise <em>Otherwise</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Otherwise</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Otherwise
   * @generated
   */
  EClass getOtherwise();

  /**
   * Returns the meta object for the attribute list '{@link de.unidue.ecg.dialogScript.dialogScript.Otherwise#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Otherwise#getModifiers()
   * @see #getOtherwise()
   * @generated
   */
  EAttribute getOtherwise_Modifiers();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.Otherwise#getConditionList <em>Condition List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition List</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Otherwise#getConditionList()
   * @see #getOtherwise()
   * @generated
   */
  EReference getOtherwise_ConditionList();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.Otherwise#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Otherwise#getComment()
   * @see #getOtherwise()
   * @generated
   */
  EAttribute getOtherwise_Comment();

  /**
   * Returns the meta object for the containment reference '{@link de.unidue.ecg.dialogScript.dialogScript.Otherwise#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Otherwise#getBody()
   * @see #getOtherwise()
   * @generated
   */
  EReference getOtherwise_Body();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchOff <em>Switch Off</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Off</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchOff
   * @generated
   */
  EClass getSwitchOff();

  /**
   * Returns the meta object for the reference list '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchOff#getSets <em>Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sets</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchOff#getSets()
   * @see #getSwitchOff()
   * @generated
   */
  EReference getSwitchOff_Sets();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchOff#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchOff#getComment()
   * @see #getSwitchOff()
   * @generated
   */
  EAttribute getSwitchOff_Comment();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchOn <em>Switch On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch On</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchOn
   * @generated
   */
  EClass getSwitchOn();

  /**
   * Returns the meta object for the reference list '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchOn#getSets <em>Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sets</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchOn#getSets()
   * @see #getSwitchOn()
   * @generated
   */
  EReference getSwitchOn_Sets();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchOn#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchOn#getComment()
   * @see #getSwitchOn()
   * @generated
   */
  EAttribute getSwitchOn_Comment();

  /**
   * Returns the meta object for class '{@link de.unidue.ecg.dialogScript.dialogScript.DialogLine <em>Dialog Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dialog Line</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogLine
   * @generated
   */
  EClass getDialogLine();

  /**
   * Returns the meta object for the reference '{@link de.unidue.ecg.dialogScript.dialogScript.DialogLine#getCharacter <em>Character</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Character</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogLine#getCharacter()
   * @see #getDialogLine()
   * @generated
   */
  EReference getDialogLine_Character();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.DialogLine#getLines <em>Lines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lines</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogLine#getLines()
   * @see #getDialogLine()
   * @generated
   */
  EAttribute getDialogLine_Lines();

  /**
   * Returns the meta object for the attribute '{@link de.unidue.ecg.dialogScript.dialogScript.DialogLine#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.DialogLine#getComment()
   * @see #getDialogLine()
   * @generated
   */
  EAttribute getDialogLine_Comment();

  /**
   * Returns the meta object for enum '{@link de.unidue.ecg.dialogScript.dialogScript.Modifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Modifier</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.Modifier
   * @generated
   */
  EEnum getModifier();

  /**
   * Returns the meta object for enum '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchValue <em>Switch Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Switch Value</em>'.
   * @see de.unidue.ecg.dialogScript.dialogScript.SwitchValue
   * @generated
   */
  EEnum getSwitchValue();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DialogScriptFactory getDialogScriptFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.ScriptImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getScript()
     * @generated
     */
    EClass SCRIPT = eINSTANCE.getScript();

    /**
     * The meta object literal for the '<em><b>Characters Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__CHARACTERS_DEFINITION = eINSTANCE.getScript_CharactersDefinition();

    /**
     * The meta object literal for the '<em><b>Switches Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__SWITCHES_DEFINITION = eINSTANCE.getScript_SwitchesDefinition();

    /**
     * The meta object literal for the '<em><b>Conditions Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__CONDITIONS_DEFINITION = eINSTANCE.getScript_ConditionsDefinition();

    /**
     * The meta object literal for the '<em><b>Scenes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__SCENES = eINSTANCE.getScript_Scenes();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.CharactersDefintionImpl <em>Characters Defintion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.CharactersDefintionImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getCharactersDefintion()
     * @generated
     */
    EClass CHARACTERS_DEFINTION = eINSTANCE.getCharactersDefintion();

    /**
     * The meta object literal for the '<em><b>Characters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHARACTERS_DEFINTION__CHARACTERS = eINSTANCE.getCharactersDefintion_Characters();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.CharacterDefinitionImpl <em>Character Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.CharacterDefinitionImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getCharacterDefinition()
     * @generated
     */
    EClass CHARACTER_DEFINITION = eINSTANCE.getCharacterDefinition();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER_DEFINITION__IMPORTED_NAMESPACE = eINSTANCE.getCharacterDefinition_ImportedNamespace();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.SwitchesDefinitionImpl <em>Switches Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.SwitchesDefinitionImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getSwitchesDefinition()
     * @generated
     */
    EClass SWITCHES_DEFINITION = eINSTANCE.getSwitchesDefinition();

    /**
     * The meta object literal for the '<em><b>Switches</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCHES_DEFINITION__SWITCHES = eINSTANCE.getSwitchesDefinition_Switches();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.SwitchDefinitionImpl <em>Switch Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.SwitchDefinitionImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getSwitchDefinition()
     * @generated
     */
    EClass SWITCH_DEFINITION = eINSTANCE.getSwitchDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH_DEFINITION__NAME = eINSTANCE.getSwitchDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH_DEFINITION__VALUE = eINSTANCE.getSwitchDefinition_Value();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionsDefinitionImpl <em>Conditions Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.ConditionsDefinitionImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getConditionsDefinition()
     * @generated
     */
    EClass CONDITIONS_DEFINITION = eINSTANCE.getConditionsDefinition();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONS_DEFINITION__CONDITIONS = eINSTANCE.getConditionsDefinition_Conditions();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionDefinitionImpl <em>Condition Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.ConditionDefinitionImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getConditionDefinition()
     * @generated
     */
    EClass CONDITION_DEFINITION = eINSTANCE.getConditionDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION_DEFINITION__NAME = eINSTANCE.getConditionDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Switch List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_DEFINITION__SWITCH_LIST = eINSTANCE.getConditionDefinition_SwitchList();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.SceneImpl <em>Scene</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.SceneImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getScene()
     * @generated
     */
    EClass SCENE = eINSTANCE.getScene();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENE__NAME = eINSTANCE.getScene_Name();

    /**
     * The meta object literal for the '<em><b>Dialog</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENE__DIALOG = eINSTANCE.getScene_Dialog();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.DialogImpl <em>Dialog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getDialog()
     * @generated
     */
    EClass DIALOG = eINSTANCE.getDialog();

    /**
     * The meta object literal for the '<em><b>Defaults</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIALOG__DEFAULTS = eINSTANCE.getDialog_Defaults();

    /**
     * The meta object literal for the '<em><b>First Time</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIALOG__FIRST_TIME = eINSTANCE.getDialog_FirstTime();

    /**
     * The meta object literal for the '<em><b>Recursives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIALOG__RECURSIVES = eINSTANCE.getDialog_Recursives();

    /**
     * The meta object literal for the '<em><b>Parting Lines</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIALOG__PARTING_LINES = eINSTANCE.getDialog_PartingLines();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.RecursiveImpl <em>Recursive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.RecursiveImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getRecursive()
     * @generated
     */
    EClass RECURSIVE = eINSTANCE.getRecursive();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.DefaultsImpl <em>Defaults</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DefaultsImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getDefaults()
     * @generated
     */
    EClass DEFAULTS = eINSTANCE.getDefaults();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULTS__COMMENT = eINSTANCE.getDefaults_Comment();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFAULTS__BODY = eINSTANCE.getDefaults_Body();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.FirstTimeImpl <em>First Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.FirstTimeImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getFirstTime()
     * @generated
     */
    EClass FIRST_TIME = eINSTANCE.getFirstTime();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIRST_TIME__COMMENT = eINSTANCE.getFirstTime_Comment();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIRST_TIME__BODY = eINSTANCE.getFirstTime_Body();

    /**
     * The meta object literal for the '<em><b>Other Times</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIRST_TIME__OTHER_TIMES = eINSTANCE.getFirstTime_OtherTimes();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.OtherTimesImpl <em>Other Times</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.OtherTimesImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getOtherTimes()
     * @generated
     */
    EClass OTHER_TIMES = eINSTANCE.getOtherTimes();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OTHER_TIMES__COMMENT = eINSTANCE.getOtherTimes_Comment();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OTHER_TIMES__BODY = eINSTANCE.getOtherTimes_Body();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.PartingLinesImpl <em>Parting Lines</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.PartingLinesImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getPartingLines()
     * @generated
     */
    EClass PARTING_LINES = eINSTANCE.getPartingLines();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTING_LINES__COMMENT = eINSTANCE.getPartingLines_Comment();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTING_LINES__BODY = eINSTANCE.getPartingLines_Body();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.HubImpl <em>Hub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.HubImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getHub()
     * @generated
     */
    EClass HUB = eINSTANCE.getHub();

    /**
     * The meta object literal for the '<em><b>Is Hidden</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HUB__IS_HIDDEN = eINSTANCE.getHub_IsHidden();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HUB__NAME = eINSTANCE.getHub_Name();

    /**
     * The meta object literal for the '<em><b>Hub Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HUB__HUB_COMMENT = eINSTANCE.getHub_HubComment();

    /**
     * The meta object literal for the '<em><b>Choice Dialogs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HUB__CHOICE_DIALOGS = eINSTANCE.getHub_ChoiceDialogs();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.AbstractChoiceDialogImpl <em>Abstract Choice Dialog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.AbstractChoiceDialogImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getAbstractChoiceDialog()
     * @generated
     */
    EClass ABSTRACT_CHOICE_DIALOG = eINSTANCE.getAbstractChoiceDialog();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_CHOICE_DIALOG__MODIFIERS = eINSTANCE.getAbstractChoiceDialog_Modifiers();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalChoiceDialogImpl <em>Conditional Choice Dialog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalChoiceDialogImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getConditionalChoiceDialog()
     * @generated
     */
    EClass CONDITIONAL_CHOICE_DIALOG = eINSTANCE.getConditionalChoiceDialog();

    /**
     * The meta object literal for the '<em><b>Condition List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_CHOICE_DIALOG__CONDITION_LIST = eINSTANCE.getConditionalChoiceDialog_ConditionList();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITIONAL_CHOICE_DIALOG__COMMENT = eINSTANCE.getConditionalChoiceDialog_Comment();

    /**
     * The meta object literal for the '<em><b>Choice Dialogs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_CHOICE_DIALOG__CHOICE_DIALOGS = eINSTANCE.getConditionalChoiceDialog_ChoiceDialogs();

    /**
     * The meta object literal for the '<em><b>Otherwise Choices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_CHOICE_DIALOG__OTHERWISE_CHOICES = eINSTANCE.getConditionalChoiceDialog_OtherwiseChoices();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.OtherwiseChoiceImpl <em>Otherwise Choice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.OtherwiseChoiceImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getOtherwiseChoice()
     * @generated
     */
    EClass OTHERWISE_CHOICE = eINSTANCE.getOtherwiseChoice();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OTHERWISE_CHOICE__MODIFIERS = eINSTANCE.getOtherwiseChoice_Modifiers();

    /**
     * The meta object literal for the '<em><b>Condition List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OTHERWISE_CHOICE__CONDITION_LIST = eINSTANCE.getOtherwiseChoice_ConditionList();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OTHERWISE_CHOICE__COMMENT = eINSTANCE.getOtherwiseChoice_Comment();

    /**
     * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OTHERWISE_CHOICE__CHOICES = eINSTANCE.getOtherwiseChoice_Choices();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ChoiceDialogImpl <em>Choice Dialog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.ChoiceDialogImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getChoiceDialog()
     * @generated
     */
    EClass CHOICE_DIALOG = eINSTANCE.getChoiceDialog();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHOICE_DIALOG__NAME = eINSTANCE.getChoiceDialog_Name();

    /**
     * The meta object literal for the '<em><b>Choice Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHOICE_DIALOG__CHOICE_COMMENT = eINSTANCE.getChoiceDialog_ChoiceComment();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHOICE_DIALOG__BODY = eINSTANCE.getChoiceDialog_Body();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionListImpl <em>Condition List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.ConditionListImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getConditionList()
     * @generated
     */
    EClass CONDITION_LIST = eINSTANCE.getConditionList();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_LIST__CONDITIONS = eINSTANCE.getConditionList_Conditions();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.JumpImpl <em>Jump</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.JumpImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getJump()
     * @generated
     */
    EClass JUMP = eINSTANCE.getJump();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.InvokeHubImpl <em>Invoke Hub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.InvokeHubImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getInvokeHub()
     * @generated
     */
    EClass INVOKE_HUB = eINSTANCE.getInvokeHub();

    /**
     * The meta object literal for the '<em><b>Hub</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOKE_HUB__HUB = eINSTANCE.getInvokeHub_Hub();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.InvokeSceneImpl <em>Invoke Scene</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.InvokeSceneImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getInvokeScene()
     * @generated
     */
    EClass INVOKE_SCENE = eINSTANCE.getInvokeScene();

    /**
     * The meta object literal for the '<em><b>Scene</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOKE_SCENE__SCENE = eINSTANCE.getInvokeScene_Scene();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ExitImpl <em>Exit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.ExitImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getExit()
     * @generated
     */
    EClass EXIT = eINSTANCE.getExit();

    /**
     * The meta object literal for the '<em><b>Exit Hub</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXIT__EXIT_HUB = eINSTANCE.getExit_ExitHub();

    /**
     * The meta object literal for the '<em><b>Exit Scene</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXIT__EXIT_SCENE = eINSTANCE.getExit_ExitScene();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalImpl <em>Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getConditional()
     * @generated
     */
    EClass CONDITIONAL = eINSTANCE.getConditional();

    /**
     * The meta object literal for the '<em><b>Condition List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__CONDITION_LIST = eINSTANCE.getConditional_ConditionList();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITIONAL__COMMENT = eINSTANCE.getConditional_Comment();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__BODY = eINSTANCE.getConditional_Body();

    /**
     * The meta object literal for the '<em><b>Otherwise List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__OTHERWISE_LIST = eINSTANCE.getConditional_OtherwiseList();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.SwitchListImpl <em>Switch List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.SwitchListImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getSwitchList()
     * @generated
     */
    EClass SWITCH_LIST = eINSTANCE.getSwitchList();

    /**
     * The meta object literal for the '<em><b>Switches</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_LIST__SWITCHES = eINSTANCE.getSwitchList_Switches();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.SwitchImpl <em>Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.SwitchImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getSwitch()
     * @generated
     */
    EClass SWITCH = eINSTANCE.getSwitch();

    /**
     * The meta object literal for the '<em><b>Switch</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__SWITCH = eINSTANCE.getSwitch_Switch();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH__VALUE = eINSTANCE.getSwitch_Value();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalBodyImpl <em>Conditional Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.ConditionalBodyImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getConditionalBody()
     * @generated
     */
    EClass CONDITIONAL_BODY = eINSTANCE.getConditionalBody();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_BODY__STATEMENTS = eINSTANCE.getConditionalBody_Statements();

    /**
     * The meta object literal for the '<em><b>Switch On</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_BODY__SWITCH_ON = eINSTANCE.getConditionalBody_SwitchOn();

    /**
     * The meta object literal for the '<em><b>Switch Off</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_BODY__SWITCH_OFF = eINSTANCE.getConditionalBody_SwitchOff();

    /**
     * The meta object literal for the '<em><b>Jump</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_BODY__JUMP = eINSTANCE.getConditionalBody_Jump();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.StatementImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.OtherwiseImpl <em>Otherwise</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.OtherwiseImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getOtherwise()
     * @generated
     */
    EClass OTHERWISE = eINSTANCE.getOtherwise();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OTHERWISE__MODIFIERS = eINSTANCE.getOtherwise_Modifiers();

    /**
     * The meta object literal for the '<em><b>Condition List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OTHERWISE__CONDITION_LIST = eINSTANCE.getOtherwise_ConditionList();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OTHERWISE__COMMENT = eINSTANCE.getOtherwise_Comment();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OTHERWISE__BODY = eINSTANCE.getOtherwise_Body();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.SwitchOffImpl <em>Switch Off</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.SwitchOffImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getSwitchOff()
     * @generated
     */
    EClass SWITCH_OFF = eINSTANCE.getSwitchOff();

    /**
     * The meta object literal for the '<em><b>Sets</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_OFF__SETS = eINSTANCE.getSwitchOff_Sets();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH_OFF__COMMENT = eINSTANCE.getSwitchOff_Comment();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.SwitchOnImpl <em>Switch On</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.SwitchOnImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getSwitchOn()
     * @generated
     */
    EClass SWITCH_ON = eINSTANCE.getSwitchOn();

    /**
     * The meta object literal for the '<em><b>Sets</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_ON__SETS = eINSTANCE.getSwitchOn_Sets();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH_ON__COMMENT = eINSTANCE.getSwitchOn_Comment();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.impl.DialogLineImpl <em>Dialog Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogLineImpl
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getDialogLine()
     * @generated
     */
    EClass DIALOG_LINE = eINSTANCE.getDialogLine();

    /**
     * The meta object literal for the '<em><b>Character</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIALOG_LINE__CHARACTER = eINSTANCE.getDialogLine_Character();

    /**
     * The meta object literal for the '<em><b>Lines</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIALOG_LINE__LINES = eINSTANCE.getDialogLine_Lines();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIALOG_LINE__COMMENT = eINSTANCE.getDialogLine_Comment();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.Modifier <em>Modifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.Modifier
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getModifier()
     * @generated
     */
    EEnum MODIFIER = eINSTANCE.getModifier();

    /**
     * The meta object literal for the '{@link de.unidue.ecg.dialogScript.dialogScript.SwitchValue <em>Switch Value</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.unidue.ecg.dialogScript.dialogScript.SwitchValue
     * @see de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptPackageImpl#getSwitchValue()
     * @generated
     */
    EEnum SWITCH_VALUE = eINSTANCE.getSwitchValue();

  }

} //DialogScriptPackage
