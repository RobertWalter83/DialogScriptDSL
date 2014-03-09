package de.unidue.ecg.characterScript.util

import de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage
import org.eclipse.emf.ecore.EClass

class LanguageUtil {
	
	static val defaults = <String, DefaultAttributeHelper>newHashMap
	static val defaults2 = <EClass, String>newHashMap	
	
	static public def getDefaultAttributes() {
		if(defaults.empty) {
			defaults.put('full name', new DefaultAttributeHelper('full name', 'TEXT', CharacterScriptPackage.Literals.FULL_NAME))
			defaults.put('age', new DefaultAttributeHelper('age', 'NUMBER', CharacterScriptPackage.Literals.AGE))
			defaults.put('sex', new DefaultAttributeHelper('sex', 'ENUM', CharacterScriptPackage.Literals.SEX))
			defaults.put('type', new DefaultAttributeHelper('type', 'ENUM', CharacterScriptPackage.Literals.TYPE))
			defaults.put('description', new DefaultAttributeHelper('description', 'TEXT', CharacterScriptPackage.Literals.DESCRIPTION))
		}
		defaults	
	}
	
	static private def getDefaultAttributes2() {
		if(defaults2.empty) {
			defaults2.put(CharacterScriptPackage.Literals.FULL_NAME, 'full name')
			defaults2.put(CharacterScriptPackage.Literals.AGE, 'age')
			defaults2.put(CharacterScriptPackage.Literals.SEX, 'sex')
			defaults2.put(CharacterScriptPackage.Literals.TYPE, 'type')
			defaults2.put(CharacterScriptPackage.Literals.DESCRIPTION, 'description')
		}
		defaults2	
	}	
	
	static def getEClassFor(String key) {
		getDefaultAttributes.get(key).EClass
	}	
	
	
	static def getKeywordValueFor(EClass key) {
		getDefaultAttributes2.get(key)
	}	
}

class DefaultAttributeHelper {
	@Property String name
	@Property String type
	@Property EClass eClass
	
	new(String name, String type, EClass eClass) {
		this.name = name
		this.type = type
		this.EClass = eClass
	}
}