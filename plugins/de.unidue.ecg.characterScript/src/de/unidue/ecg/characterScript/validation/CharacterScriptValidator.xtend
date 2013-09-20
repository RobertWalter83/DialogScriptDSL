/*
 * generated by Xtext
 */
package de.unidue.ecg.characterScript.validation

import de.unidue.ecg.characterScript.characterScript.Age
import de.unidue.ecg.characterScript.characterScript.Character
import de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage
import de.unidue.ecg.characterScript.characterScript.Characters
import de.unidue.ecg.characterScript.characterScript.CustomAttribute
import de.unidue.ecg.characterScript.characterScript.CustomProperty
import de.unidue.ecg.characterScript.characterScript.DefaultProperty
import de.unidue.ecg.characterScript.characterScript.Description
import de.unidue.ecg.characterScript.characterScript.FullName
import de.unidue.ecg.characterScript.characterScript.Sex
import de.unidue.ecg.characterScript.characterScript.Template
import de.unidue.ecg.characterScript.characterScript.Type
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class CharacterScriptValidator extends AbstractCharacterScriptValidator {

	public static val INVALID_ATTRIBUTE_TYPE = 'invalidAttributeType'
	public static val INVALID_ATTRIBUTE = 'invalidAttribute'
	public static val INVALID_ENUM_VALUE = 'invalidEnumValue'
	public static val INVALID_PROPERTY = 'invalidProperty'
	public static val UNRESOLVED_TEMPLATE = 'unresolvedTemplate'

	@Check
	def checkIfAttributeTypeIsEnum(CustomProperty cp) {
		val ca = cp.customAttributeRef.eContainer as CustomAttribute
		if (ca?.enumValues.empty && cp.enumValue != null)
			error('The value ' + cp.enumValue.name + ' is not available for the property ' + cp.customAttributeRef?.name,
				CharacterScriptPackage.Literals.CUSTOM_PROPERTY__ENUM_VALUE, INVALID_ATTRIBUTE_TYPE)
	}

	@Check
	def checkIfEnumValueIsValid(CustomProperty cp) {
		val ca = cp.customAttributeRef.eContainer as CustomAttribute
		if (!ca.enumValues.empty && !ca.enumValues.contains(cp.enumValue))
			error('This value is not available for the property ' + cp.customAttributeRef?.name,
				CharacterScriptPackage.Literals.CUSTOM_PROPERTY__ENUM_VALUE, INVALID_ENUM_VALUE)
	}

	@Check
	def checkCharacterAttributes(Character c) {
		if (c.template == null) {
			c.properties.forEach [ it, i |
				switch (it) {
					CustomProperty: {
						if (customAttributeRef.eContainer.eContainer instanceof Template) {
							val template = customAttributeRef.eContainer.eContainer as Template
							error(
								'The property ' + customAttributeRef?.name + ' is defined in the template ' +
									template.name + '. In order to use it, explicitly refer to this template.',
								CharacterScriptPackage.Literals.CHARACTER__PROPERTIES, i, INVALID_ATTRIBUTE)
						}
					}
				}
			]
		}
	}

	@Check
	def checkTemplateAccordance(Character c) {
		if (c.template != null) {
			val template = c.template
			val allowedDefaults = template.defaults
			val allowedCustoms = template.customs

			c.properties.forEach [ it, i |
				switch it {
					DefaultProperty case !it.isValidDefault(allowedDefaults): {
						error('The used template ' + template.name + ' does not provide this property',
							CharacterScriptPackage.Literals.CHARACTER__PROPERTIES, i, INVALID_PROPERTY)
					}
					CustomProperty case !it.isValidCustom(allowedCustoms): {
						error('The used template ' + template.name + ' does not provide this property',
							CharacterScriptPackage.Literals.CHARACTER__PROPERTIES, i, INVALID_PROPERTY)
					}
				}
			]
		}
	}

	@Check
	def checkForDoubledAttributes(Character c) {
		c.properties.forEach [
			
			switch it {
				DefaultProperty: {
					val outer = it
					val doubled = c.properties.filter(DefaultProperty).filter[!EcoreUtil2.equals(it, outer)].findFirst[it.eClass == outer.eClass]
					
					if(doubled != null) {
						val index = c.properties.indexOf(doubled)
						error('You cannot use a property twice',
							CharacterScriptPackage.Literals.CHARACTER__PROPERTIES, index, INVALID_PROPERTY)
					} 					
				}
				CustomProperty: {
					val outer = it
					val doubled = c.properties.filter(CustomProperty).filter[!EcoreUtil2.equals(it, outer)].findFirst[EcoreUtil2.equals(it.customAttributeRef, outer.customAttributeRef)]
					
					if(doubled != null) {
						val index = c.properties.indexOf(doubled)
						error('You cannot use a property twice',
							CharacterScriptPackage.Literals.CHARACTER__PROPERTIES, index, INVALID_PROPERTY)
					} 	
				}
			}
		]
	}
	
	@Check
	def checkImports(Character c){
		if(c.template != null) {
			val template = c.template
			val root = (c.eContainer as Characters)
			val imports = root.imports
			
			val matchedImport = imports.findFirst[it.importedNamespace.equals(template.name)]
			
			if(matchedImport == null) {
				val templates = root.templates
				val matchedTemplate = templates.findFirst[it.name.equals(template.name)]
				
				if(matchedTemplate == null) {
					error('Missing import for template ' + template.name,
							CharacterScriptPackage.Literals.CHARACTER__TEMPLATE, UNRESOLVED_TEMPLATE, template.name)
				}
			}
		}
		
	}

	def boolean isValidCustom(CustomProperty property, EList<CustomAttribute> list) {
		if (list.contains(property.customAttributeRef.eContainer)) {
			return true
		}
		false
	}

	def dispatch boolean isValidDefault(FullName property, EList<String> list) {
		if (list.contains('full name')) {
			return true
		}
		false
	}

	def dispatch boolean isValidDefault(Age property, EList<String> list) {
		if (list.contains('age')) {
			return true
		}
		false
	}

	def dispatch boolean isValidDefault(Sex property, EList<String> list) {
		if (list.contains('sex')) {
			return true
		}
		false
	}

	def dispatch boolean isValidDefault(Description property, EList<String> list) {
		if (list.contains('description')) {
			return true
		}
		false
	}

	def dispatch boolean isValidDefault(Type property, EList<String> list) {  
		if (list.contains('type')) {
			return true
		}
		false
	}

	def dispatch boolean isValidDefault(DefaultProperty property, EList<String> list) {
		throw new RuntimeException("Missing evaluation for this default property: " + property.class)
	}
}
