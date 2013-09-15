package de.unidue.ecg.characterScript.util

class LanguageUtil {
	
	static val defaults = <String, DefaultAttributeHelper>newHashMap
	
	static def getDefaultAttributes() {
		if(defaults.empty) {
			defaults.put('full name', new DefaultAttributeHelper('full name', 'TEXT'))
			defaults.put('age', new DefaultAttributeHelper('age', 'NUMBER'))
			defaults.put('sex', new DefaultAttributeHelper('sex', 'ENUM'))
			defaults.put('type', new DefaultAttributeHelper('type', 'ENUM'))
			defaults.put('description', new DefaultAttributeHelper('description', 'TEXT'))
		}
		defaults	
	}
}

class DefaultAttributeHelper {
	@Property String name
	@Property String type
	
	new(String name, String type) {
		this.name = name
		this.type = type
	}
}