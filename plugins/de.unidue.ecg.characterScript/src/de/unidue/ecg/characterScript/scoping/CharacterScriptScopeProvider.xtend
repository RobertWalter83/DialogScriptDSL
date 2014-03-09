package de.unidue.ecg.characterScript.scoping

import de.unidue.ecg.characterScript.characterScript.Character
import de.unidue.ecg.characterScript.characterScript.Characters
import de.unidue.ecg.characterScript.characterScript.CustomAttribute
import de.unidue.ecg.characterScript.characterScript.CustomProperty
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

class CharacterScriptScopeProvider extends AbstractDeclarativeScopeProvider {

	def IScope scope_CustomProperty_customAttributeRef(Character character, EReference eReference) {

		if (character.template != null) {
			Scopes.scopeFor(character.template.customs.map[it.caName])
		} else {
			var EObject root = character

			do
				root = root.eContainer
			while (root.eContainer != null)

			val characters = root as Characters
			val globals = characters.globals

			if (globals != null) {
				return Scopes.scopeFor(globals.customs.map[it.caName])
			} else
				IScope.NULLSCOPE

		}
	}

	def IScope scope_CustomProperty_enumValue(CustomProperty cp, EReference eReference) {
		Scopes.scopeFor((cp.customAttributeRef.eContainer as CustomAttribute).enumValues)
	}
}
