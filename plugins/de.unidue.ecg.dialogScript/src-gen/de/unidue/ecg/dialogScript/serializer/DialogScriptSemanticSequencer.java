package de.unidue.ecg.dialogScript.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.unidue.ecg.dialogScript.dialogScript.CharacterDefinition;
import de.unidue.ecg.dialogScript.dialogScript.CharactersDefinition;
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
import de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage;
import de.unidue.ecg.dialogScript.dialogScript.Exit;
import de.unidue.ecg.dialogScript.dialogScript.FirstTime;
import de.unidue.ecg.dialogScript.dialogScript.Hub;
import de.unidue.ecg.dialogScript.dialogScript.InvokeHub;
import de.unidue.ecg.dialogScript.dialogScript.InvokeScene;
import de.unidue.ecg.dialogScript.dialogScript.OtherTimes;
import de.unidue.ecg.dialogScript.dialogScript.Otherwise;
import de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice;
import de.unidue.ecg.dialogScript.dialogScript.PartingLines;
import de.unidue.ecg.dialogScript.dialogScript.Scene;
import de.unidue.ecg.dialogScript.dialogScript.Script;
import de.unidue.ecg.dialogScript.dialogScript.Switch;
import de.unidue.ecg.dialogScript.dialogScript.SwitchDefinition;
import de.unidue.ecg.dialogScript.dialogScript.SwitchList;
import de.unidue.ecg.dialogScript.dialogScript.SwitchOff;
import de.unidue.ecg.dialogScript.dialogScript.SwitchOn;
import de.unidue.ecg.dialogScript.dialogScript.SwitchesDefinition;
import de.unidue.ecg.dialogScript.services.DialogScriptGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DialogScriptSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DialogScriptGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DialogScriptPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DialogScriptPackage.CHARACTER_DEFINITION:
				if(context == grammarAccess.getCharacterDefinitionRule()) {
					sequence_CharacterDefinition(context, (CharacterDefinition) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.CHARACTERS_DEFINITION:
				if(context == grammarAccess.getCharactersDefinitionRule()) {
					sequence_CharactersDefinition(context, (CharactersDefinition) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.CHOICE_DIALOG:
				if(context == grammarAccess.getChoiceDialogRule() ||
				   context == grammarAccess.getHubFragmentRule()) {
					sequence_ChoiceDialog(context, (ChoiceDialog) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.CONDITION_DEFINITION:
				if(context == grammarAccess.getConditionDefinitionRule()) {
					sequence_ConditionDefinition(context, (ConditionDefinition) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.CONDITION_LIST:
				if(context == grammarAccess.getConditionListRule()) {
					sequence_ConditionList(context, (ConditionList) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.CONDITIONAL:
				if(context == grammarAccess.getConditionalRule() ||
				   context == grammarAccess.getHubFragmentRule() ||
				   context == grammarAccess.getRecursiveRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Conditional(context, (Conditional) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.CONDITIONAL_BODY:
				if(context == grammarAccess.getConditionalBodyRule()) {
					sequence_ConditionalBody(context, (ConditionalBody) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.CONDITIONAL_CHOICE_DIALOG:
				if(context == grammarAccess.getConditionalChoiceDialogRule() ||
				   context == grammarAccess.getHubFragmentRule()) {
					sequence_ConditionalChoiceDialog(context, (ConditionalChoiceDialog) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.CONDITIONS_DEFINITION:
				if(context == grammarAccess.getConditionsDefinitionRule()) {
					sequence_ConditionsDefinition(context, (ConditionsDefinition) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.DEFAULTS:
				if(context == grammarAccess.getDefaultsRule()) {
					sequence_Defaults(context, (Defaults) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.DIALOG:
				if(context == grammarAccess.getDialogRule()) {
					sequence_Dialog(context, (Dialog) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.DIALOG_LINE:
				if(context == grammarAccess.getDialogLineRule() ||
				   context == grammarAccess.getHubFragmentRule() ||
				   context == grammarAccess.getRecursiveRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_DialogLine(context, (DialogLine) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.EXIT:
				if(context == grammarAccess.getExitRule() ||
				   context == grammarAccess.getJumpRule()) {
					sequence_Exit(context, (Exit) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.FIRST_TIME:
				if(context == grammarAccess.getFirstTimeRule()) {
					sequence_FirstTime(context, (FirstTime) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.HUB:
				if(context == grammarAccess.getHubRule() ||
				   context == grammarAccess.getRecursiveRule()) {
					sequence_Hub(context, (Hub) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.INVOKE_HUB:
				if(context == grammarAccess.getInvokeHubRule() ||
				   context == grammarAccess.getJumpRule()) {
					sequence_InvokeHub(context, (InvokeHub) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.INVOKE_SCENE:
				if(context == grammarAccess.getInvokeSceneRule() ||
				   context == grammarAccess.getJumpRule()) {
					sequence_InvokeScene(context, (InvokeScene) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.OTHER_TIMES:
				if(context == grammarAccess.getOtherTimesRule()) {
					sequence_OtherTimes(context, (OtherTimes) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.OTHERWISE:
				if(context == grammarAccess.getOtherwiseRule()) {
					sequence_Otherwise(context, (Otherwise) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.OTHERWISE_CHOICE:
				if(context == grammarAccess.getOtherwiseChoiceRule()) {
					sequence_OtherwiseChoice(context, (OtherwiseChoice) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.PARTING_LINES:
				if(context == grammarAccess.getPartingLinesRule()) {
					sequence_PartingLines(context, (PartingLines) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.SCENE:
				if(context == grammarAccess.getSceneRule()) {
					sequence_Scene(context, (Scene) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.SCRIPT:
				if(context == grammarAccess.getScriptRule()) {
					sequence_Script(context, (Script) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.SWITCH:
				if(context == grammarAccess.getSwitchRule()) {
					sequence_Switch(context, (Switch) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.SWITCH_DEFINITION:
				if(context == grammarAccess.getSwitchDefinitionRule()) {
					sequence_SwitchDefinition(context, (SwitchDefinition) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.SWITCH_LIST:
				if(context == grammarAccess.getSwitchListRule()) {
					sequence_SwitchList(context, (SwitchList) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.SWITCH_OFF:
				if(context == grammarAccess.getSwitchOffRule()) {
					sequence_SwitchOff(context, (SwitchOff) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.SWITCH_ON:
				if(context == grammarAccess.getSwitchOnRule()) {
					sequence_SwitchOn(context, (SwitchOn) semanticObject); 
					return; 
				}
				else break;
			case DialogScriptPackage.SWITCHES_DEFINITION:
				if(context == grammarAccess.getSwitchesDefinitionRule()) {
					sequence_SwitchesDefinition(context, (SwitchesDefinition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_CharacterDefinition(EObject context, CharacterDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DialogScriptPackage.Literals.CHARACTER_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DialogScriptPackage.Literals.CHARACTER_DEFINITION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCharacterDefinitionAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (characters+=CharacterDefinition characters+=CharacterDefinition*)
	 */
	protected void sequence_CharactersDefinition(EObject context, CharactersDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers+=Modifier* name=StringID choiceComment=COMMENT? body=ConditionalBody)
	 */
	protected void sequence_ChoiceDialog(EObject context, ChoiceDialog semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID switchList=SwitchList)
	 */
	protected void sequence_ConditionDefinition(EObject context, ConditionDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DialogScriptPackage.Literals.CONDITION_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DialogScriptPackage.Literals.CONDITION_DEFINITION__NAME));
			if(transientValues.isValueTransient(semanticObject, DialogScriptPackage.Literals.CONDITION_DEFINITION__SWITCH_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DialogScriptPackage.Literals.CONDITION_DEFINITION__SWITCH_LIST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionDefinitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConditionDefinitionAccess().getSwitchListSwitchListParserRuleCall_3_0(), semanticObject.getSwitchList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (conditions+=[ConditionDefinition|ID] conditions+=[ConditionDefinition|ID]*)
	 */
	protected void sequence_ConditionList(EObject context, ConditionList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=Statement* switchOn=SwitchOn? switchOff=SwitchOff? jump=Jump?)
	 */
	protected void sequence_ConditionalBody(EObject context, ConditionalBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers+=Modifier* conditionList=ConditionList comment=COMMENT? choiceDialogs+=ChoiceDialog+ otherwiseChoices+=OtherwiseChoice*)
	 */
	protected void sequence_ConditionalChoiceDialog(EObject context, ConditionalChoiceDialog semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers+=Modifier* conditionList=ConditionList comment=COMMENT? body=ConditionalBody otherwiseList+=Otherwise*)
	 */
	protected void sequence_Conditional(EObject context, Conditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (conditions+=ConditionDefinition conditions+=ConditionDefinition*)
	 */
	protected void sequence_ConditionsDefinition(EObject context, ConditionsDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment=COMMENT? body=ConditionalBody)
	 */
	protected void sequence_Defaults(EObject context, Defaults semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (character=[CharacterDefinition|ID] lines=StringID comment=COMMENT?)
	 */
	protected void sequence_DialogLine(EObject context, DialogLine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (defaults=Defaults? firstTime=FirstTime? recursives+=Recursive* partingLines=PartingLines?)
	 */
	protected void sequence_Dialog(EObject context, Dialog semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exitHub?='hub' | exitScene?='scene')
	 */
	protected void sequence_Exit(EObject context, Exit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment=COMMENT? body=ConditionalBody otherTimes=OtherTimes?)
	 */
	protected void sequence_FirstTime(EObject context, FirstTime semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isHidden?='hidden'? name=StringID hubComment=COMMENT? hubFragments+=HubFragment*)
	 */
	protected void sequence_Hub(EObject context, Hub semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     hub=[Hub|StringID]
	 */
	protected void sequence_InvokeHub(EObject context, InvokeHub semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DialogScriptPackage.Literals.INVOKE_HUB__HUB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DialogScriptPackage.Literals.INVOKE_HUB__HUB));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInvokeHubAccess().getHubHubStringIDParserRuleCall_2_0_1(), semanticObject.getHub());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     scene=[Scene|StringID]
	 */
	protected void sequence_InvokeScene(EObject context, InvokeScene semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DialogScriptPackage.Literals.INVOKE_SCENE__SCENE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DialogScriptPackage.Literals.INVOKE_SCENE__SCENE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInvokeSceneAccess().getSceneSceneStringIDParserRuleCall_2_0_1(), semanticObject.getScene());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (comment=COMMENT? body=ConditionalBody)
	 */
	protected void sequence_OtherTimes(EObject context, OtherTimes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers+=Modifier* conditionList=ConditionList? comment=COMMENT? choices+=ChoiceDialog+)
	 */
	protected void sequence_OtherwiseChoice(EObject context, OtherwiseChoice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers+=Modifier* conditionList=ConditionList? comment=COMMENT? body=ConditionalBody)
	 */
	protected void sequence_Otherwise(EObject context, Otherwise semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment=COMMENT? body=ConditionalBody)
	 */
	protected void sequence_PartingLines(EObject context, PartingLines semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=StringID dialog=Dialog)
	 */
	protected void sequence_Scene(EObject context, Scene semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DialogScriptPackage.Literals.SCENE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DialogScriptPackage.Literals.SCENE__NAME));
			if(transientValues.isValueTransient(semanticObject, DialogScriptPackage.Literals.SCENE__DIALOG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DialogScriptPackage.Literals.SCENE__DIALOG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSceneAccess().getNameStringIDParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSceneAccess().getDialogDialogParserRuleCall_3_0(), semanticObject.getDialog());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (charactersDefinition=CharactersDefinition? switchesDefinition=SwitchesDefinition? conditionsDefinition=ConditionsDefinition? scenes+=Scene*)
	 */
	protected void sequence_Script(EObject context, Script semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=SwitchValue?)
	 */
	protected void sequence_SwitchDefinition(EObject context, SwitchDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (switches+=Switch switches+=Switch*)
	 */
	protected void sequence_SwitchList(EObject context, SwitchList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sets+=[SwitchDefinition|ID] sets+=[SwitchDefinition|ID]* comment=COMMENT?)
	 */
	protected void sequence_SwitchOff(EObject context, SwitchOff semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sets+=[SwitchDefinition|ID] sets+=[SwitchDefinition|ID]* comment=COMMENT?)
	 */
	protected void sequence_SwitchOn(EObject context, SwitchOn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (switch=[SwitchDefinition|ID] value=SwitchValue)
	 */
	protected void sequence_Switch(EObject context, Switch semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DialogScriptPackage.Literals.SWITCH__SWITCH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DialogScriptPackage.Literals.SWITCH__SWITCH));
			if(transientValues.isValueTransient(semanticObject, DialogScriptPackage.Literals.SWITCH__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DialogScriptPackage.Literals.SWITCH__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSwitchAccess().getSwitchSwitchDefinitionIDTerminalRuleCall_0_0_1(), semanticObject.getSwitch());
		feeder.accept(grammarAccess.getSwitchAccess().getValueSwitchValueEnumRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (switches+=SwitchDefinition switches+=SwitchDefinition*)
	 */
	protected void sequence_SwitchesDefinition(EObject context, SwitchesDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
