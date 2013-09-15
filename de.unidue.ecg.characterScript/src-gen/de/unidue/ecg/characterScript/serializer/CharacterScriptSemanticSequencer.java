package de.unidue.ecg.characterScript.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.unidue.ecg.characterScript.characterScript.Age;
import de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage;
import de.unidue.ecg.characterScript.characterScript.Characters;
import de.unidue.ecg.characterScript.characterScript.CustomAttribute;
import de.unidue.ecg.characterScript.characterScript.CustomAttributeName;
import de.unidue.ecg.characterScript.characterScript.CustomProperty;
import de.unidue.ecg.characterScript.characterScript.Customs;
import de.unidue.ecg.characterScript.characterScript.Description;
import de.unidue.ecg.characterScript.characterScript.EnumValue;
import de.unidue.ecg.characterScript.characterScript.FullName;
import de.unidue.ecg.characterScript.characterScript.Import;
import de.unidue.ecg.characterScript.characterScript.Sex;
import de.unidue.ecg.characterScript.characterScript.Template;
import de.unidue.ecg.characterScript.characterScript.Type;
import de.unidue.ecg.characterScript.services.CharacterScriptGrammarAccess;
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
public class CharacterScriptSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CharacterScriptGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CharacterScriptPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CharacterScriptPackage.AGE:
				if(context == grammarAccess.getAgeRule() ||
				   context == grammarAccess.getDefaultPropertyRule() ||
				   context == grammarAccess.getPropertyRule()) {
					sequence_Age(context, (Age) semanticObject); 
					return; 
				}
				else break;
			case CharacterScriptPackage.CHARACTER:
				if(context == grammarAccess.getCharacterRule()) {
					sequence_Character(context, (de.unidue.ecg.characterScript.characterScript.Character) semanticObject); 
					return; 
				}
				else break;
			case CharacterScriptPackage.CHARACTERS:
				if(context == grammarAccess.getCharactersRule()) {
					sequence_Characters(context, (Characters) semanticObject); 
					return; 
				}
				else break;
			case CharacterScriptPackage.CUSTOM_ATTRIBUTE:
				if(context == grammarAccess.getCustomAttributeRule()) {
					sequence_CustomAttribute(context, (CustomAttribute) semanticObject); 
					return; 
				}
				else break;
			case CharacterScriptPackage.CUSTOM_ATTRIBUTE_NAME:
				if(context == grammarAccess.getCustomAttributeNameRule()) {
					sequence_CustomAttributeName(context, (CustomAttributeName) semanticObject); 
					return; 
				}
				else break;
			case CharacterScriptPackage.CUSTOM_PROPERTY:
				if(context == grammarAccess.getCustomPropertyRule() ||
				   context == grammarAccess.getPropertyRule()) {
					sequence_CustomProperty(context, (CustomProperty) semanticObject); 
					return; 
				}
				else break;
			case CharacterScriptPackage.CUSTOMS:
				if(context == grammarAccess.getCustomsRule()) {
					sequence_Customs(context, (Customs) semanticObject); 
					return; 
				}
				else break;
			case CharacterScriptPackage.DESCRIPTION:
				if(context == grammarAccess.getDefaultPropertyRule() ||
				   context == grammarAccess.getDescriptionRule() ||
				   context == grammarAccess.getPropertyRule()) {
					sequence_Description(context, (Description) semanticObject); 
					return; 
				}
				else break;
			case CharacterScriptPackage.ENUM_VALUE:
				if(context == grammarAccess.getEnumValueRule()) {
					sequence_EnumValue(context, (EnumValue) semanticObject); 
					return; 
				}
				else break;
			case CharacterScriptPackage.FULL_NAME:
				if(context == grammarAccess.getDefaultPropertyRule() ||
				   context == grammarAccess.getFullNameRule() ||
				   context == grammarAccess.getPropertyRule()) {
					sequence_FullName(context, (FullName) semanticObject); 
					return; 
				}
				else break;
			case CharacterScriptPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case CharacterScriptPackage.SEX:
				if(context == grammarAccess.getDefaultPropertyRule() ||
				   context == grammarAccess.getPropertyRule() ||
				   context == grammarAccess.getSexRule()) {
					sequence_Sex(context, (Sex) semanticObject); 
					return; 
				}
				else break;
			case CharacterScriptPackage.TEMPLATE:
				if(context == grammarAccess.getTemplateRule()) {
					sequence_Template(context, (Template) semanticObject); 
					return; 
				}
				else break;
			case CharacterScriptPackage.TYPE:
				if(context == grammarAccess.getDefaultPropertyRule() ||
				   context == grammarAccess.getPropertyRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (value=INT comment=COMMENT?)
	 */
	protected void sequence_Age(EObject context, Age semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID template=[Template|ID]? properties+=Property*)
	 */
	protected void sequence_Character(EObject context, de.unidue.ecg.characterScript.characterScript.Character semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* templates+=Template* customs=Customs? characters+=Character*)
	 */
	protected void sequence_Characters(EObject context, Characters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_CustomAttributeName(EObject context, CustomAttributeName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CharacterScriptPackage.Literals.CUSTOM_ATTRIBUTE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CharacterScriptPackage.Literals.CUSTOM_ATTRIBUTE_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCustomAttributeNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (caName=CustomAttributeName (type=AttributeType | (enumValues+=EnumValue enumValues+=EnumValue*)))
	 */
	protected void sequence_CustomAttribute(EObject context, CustomAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (customAttributeRef=[CustomAttributeName|ID] (stringValue=STRING | intValue=INT | enumValue=[EnumValue|ID]) comment=COMMENT?)
	 */
	protected void sequence_CustomProperty(EObject context, CustomProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (customAttributes+=CustomAttribute customAttributes+=CustomAttribute*)
	 */
	protected void sequence_Customs(EObject context, Customs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING comment=COMMENT?)
	 */
	protected void sequence_Description(EObject context, Description semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EnumValue(EObject context, EnumValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CharacterScriptPackage.Literals.ENUM_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CharacterScriptPackage.Literals.ENUM_VALUE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING comment=COMMENT?)
	 */
	protected void sequence_FullName(EObject context, FullName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=ID
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CharacterScriptPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CharacterScriptPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceIDTerminalRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=CharaSex comment=COMMENT?)
	 */
	protected void sequence_Sex(EObject context, Sex semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID defaults+=DefaultAttribute* customs+=CustomAttribute*)
	 */
	protected void sequence_Template(EObject context, Template semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=CharaType comment=COMMENT?)
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
