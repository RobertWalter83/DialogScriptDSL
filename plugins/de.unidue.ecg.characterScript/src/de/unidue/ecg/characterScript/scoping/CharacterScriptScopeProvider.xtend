package de.unidue.ecg.characterScript.scoping

import de.unidue.ecg.characterScript.characterScript.Character
import de.unidue.ecg.characterScript.characterScript.Characters
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import de.unidue.ecg.characterScript.characterScript.CustomProperty
import de.unidue.ecg.characterScript.characterScript.EnumValue
import de.unidue.ecg.characterScript.characterScript.CustomAttribute

class CharacterScriptScopeProvider extends AbstractDeclarativeScopeProvider {
	//	def IScope scope_Character_properties(de.unidue.ecg.characterScript.characterScript.Property property, EReference eReference) {
//		Scopes.scopeFor()
//	}

//	new() {
//		this.setDelegate(new CharacterScriptImportScopeProvider)
//	}
		
	def IScope scope_CustomProperty_customAttributeRef(Character character, EReference eReference) {
		
		if(character.template != null) {
			Scopes.scopeFor(character.template.customs.map[it.caName])
		} else {
			var EObject root = character
			
			do
				root = root.eContainer
			while(root.eContainer != null)
			
			Scopes.scopeFor((root as Characters).customs.customAttributes.map[it.caName])
		}
	}	
	
	def IScope scope_CustomProperty_enumValue(CustomProperty cp, EReference eReference) {
		val character = cp.eContainer as Character
		
		if(character.template != null) {
			val customs = character.template.customs
			val result = newArrayList()
			customs.forEach[
				it.enumValues.forEach[enumValue|
					val ca = cp.customAttributeRef.eContainer as CustomAttribute
					
					if(ca.enumValues.contains(enumValue))
						result.add(enumValue)
				]
			]
			Scopes.scopeFor(result)
		}
	}		   
			  
}