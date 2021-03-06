/*
* generated by Xtext
*/
package de.unidue.ecg.dialogScript.ui.outline

import de.unidue.ecg.dialogScript.dialogScript.Dialog
import de.unidue.ecg.dialogScript.dialogScript.Otherwise
import de.unidue.ecg.dialogScript.dialogScript.Switch
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider

/**
 * Customization of the default outline structure.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
class DialogScriptOutlineTreeProvider extends DefaultOutlineTreeProvider {

//	def protected _createNode(IOutlineNode parentNode, SwitchList switchlist) {
//		this._createChildren(parentNode, switchlist)
//	}
	
	def protected _createNode(IOutlineNode parentNode, Switch ^switch) {
		this._createChildren(parentNode, ^switch)
	}
	
//	def protected _createNode(IOutlineNode parentNode, ConditionDefinition conditionDefintion) {
//		this._createChildren(parentNode, conditionDefintion)
//	}

	def protected _createNode(IOutlineNode parentNode, Otherwise otherwise) {
		this._createChildren(parentNode, otherwise)
	}

	def protected _createNode(IOutlineNode parentNode, Dialog dialog) {
		this._createChildren(parentNode, dialog)
	}
}
