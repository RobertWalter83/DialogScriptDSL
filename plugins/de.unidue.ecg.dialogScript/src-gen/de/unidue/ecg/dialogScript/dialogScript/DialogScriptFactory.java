/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage
 * @generated
 */
public interface DialogScriptFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DialogScriptFactory eINSTANCE = de.unidue.ecg.dialogScript.dialogScript.impl.DialogScriptFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Script</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Script</em>'.
   * @generated
   */
  Script createScript();

  /**
   * Returns a new object of class '<em>Characters Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Characters Definition</em>'.
   * @generated
   */
  CharactersDefinition createCharactersDefinition();

  /**
   * Returns a new object of class '<em>Character Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Character Definition</em>'.
   * @generated
   */
  CharacterDefinition createCharacterDefinition();

  /**
   * Returns a new object of class '<em>Switches Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switches Definition</em>'.
   * @generated
   */
  SwitchesDefinition createSwitchesDefinition();

  /**
   * Returns a new object of class '<em>Switch Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch Definition</em>'.
   * @generated
   */
  SwitchDefinition createSwitchDefinition();

  /**
   * Returns a new object of class '<em>Conditions Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditions Definition</em>'.
   * @generated
   */
  ConditionsDefinition createConditionsDefinition();

  /**
   * Returns a new object of class '<em>Condition Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition Definition</em>'.
   * @generated
   */
  ConditionDefinition createConditionDefinition();

  /**
   * Returns a new object of class '<em>Scene</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scene</em>'.
   * @generated
   */
  Scene createScene();

  /**
   * Returns a new object of class '<em>Dialog</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dialog</em>'.
   * @generated
   */
  Dialog createDialog();

  /**
   * Returns a new object of class '<em>Recursive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recursive</em>'.
   * @generated
   */
  Recursive createRecursive();

  /**
   * Returns a new object of class '<em>Defaults</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Defaults</em>'.
   * @generated
   */
  Defaults createDefaults();

  /**
   * Returns a new object of class '<em>First Time</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>First Time</em>'.
   * @generated
   */
  FirstTime createFirstTime();

  /**
   * Returns a new object of class '<em>Other Times</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Other Times</em>'.
   * @generated
   */
  OtherTimes createOtherTimes();

  /**
   * Returns a new object of class '<em>Parting Lines</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parting Lines</em>'.
   * @generated
   */
  PartingLines createPartingLines();

  /**
   * Returns a new object of class '<em>Hub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hub</em>'.
   * @generated
   */
  Hub createHub();

  /**
   * Returns a new object of class '<em>Abstract Choice Dialog</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Choice Dialog</em>'.
   * @generated
   */
  AbstractChoiceDialog createAbstractChoiceDialog();

  /**
   * Returns a new object of class '<em>Conditional Choice Dialog</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Choice Dialog</em>'.
   * @generated
   */
  ConditionalChoiceDialog createConditionalChoiceDialog();

  /**
   * Returns a new object of class '<em>Otherwise Choice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Otherwise Choice</em>'.
   * @generated
   */
  OtherwiseChoice createOtherwiseChoice();

  /**
   * Returns a new object of class '<em>Choice Dialog</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Choice Dialog</em>'.
   * @generated
   */
  ChoiceDialog createChoiceDialog();

  /**
   * Returns a new object of class '<em>Condition List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition List</em>'.
   * @generated
   */
  ConditionList createConditionList();

  /**
   * Returns a new object of class '<em>Jump</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jump</em>'.
   * @generated
   */
  Jump createJump();

  /**
   * Returns a new object of class '<em>Invoke Hub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Invoke Hub</em>'.
   * @generated
   */
  InvokeHub createInvokeHub();

  /**
   * Returns a new object of class '<em>Invoke Scene</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Invoke Scene</em>'.
   * @generated
   */
  InvokeScene createInvokeScene();

  /**
   * Returns a new object of class '<em>Exit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exit</em>'.
   * @generated
   */
  Exit createExit();

  /**
   * Returns a new object of class '<em>Conditional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional</em>'.
   * @generated
   */
  Conditional createConditional();

  /**
   * Returns a new object of class '<em>Switch List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch List</em>'.
   * @generated
   */
  SwitchList createSwitchList();

  /**
   * Returns a new object of class '<em>Switch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch</em>'.
   * @generated
   */
  Switch createSwitch();

  /**
   * Returns a new object of class '<em>Conditional Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Body</em>'.
   * @generated
   */
  ConditionalBody createConditionalBody();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Otherwise</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Otherwise</em>'.
   * @generated
   */
  Otherwise createOtherwise();

  /**
   * Returns a new object of class '<em>Switch Off</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch Off</em>'.
   * @generated
   */
  SwitchOff createSwitchOff();

  /**
   * Returns a new object of class '<em>Switch On</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch On</em>'.
   * @generated
   */
  SwitchOn createSwitchOn();

  /**
   * Returns a new object of class '<em>Dialog Line</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dialog Line</em>'.
   * @generated
   */
  DialogLine createDialogLine();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DialogScriptPackage getDialogScriptPackage();

} //DialogScriptFactory
