package de.unidue.ecg.dialogScript.ui.graph.filters

import de.unidue.ecg.dialogScript.dialogScript.Conditional
import de.unidue.ecg.dialogScript.dialogScript.ConditionalBody
import de.unidue.ecg.dialogScript.dialogScript.Defaults
import de.unidue.ecg.dialogScript.dialogScript.DialogLine
import de.unidue.ecg.dialogScript.dialogScript.FirstTime
import de.unidue.ecg.dialogScript.dialogScript.Hub
import de.unidue.ecg.dialogScript.dialogScript.PartingLines
import de.unidue.ecg.dialogScript.dialogScript.Scene
import org.eclipse.gef4.zest.core.viewers.EntityConnectionData
import org.eclipse.jface.viewers.Viewer
import org.eclipse.jface.viewers.ViewerFilter
import de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog
import de.unidue.ecg.dialogScript.dialogScript.ConditionList
import de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice

class GraphNodeFilter extends ViewerFilter {

	override select(Viewer viewer, Object parentElement, Object element) {
		switch (element) {
			Scene:
				return true
			Defaults case !element.body.nullOrEmpty:
				return true
			FirstTime case !element.body.nullOrEmpty:
				return true
			DialogLine:
				return true
			Conditional case !element.body.nullOrEmpty:
				return true
			ConditionalChoiceDialog case !element.choiceDialogs.nullOrEmpty:
				return true
			ConditionList case element.eContainer instanceof ConditionalChoiceDialog:
				return true
			OtherwiseChoice case !element.choices.nullOrEmpty:
				return true
			PartingLines case !element.body.nullOrEmpty:
				return true
			Hub:
				return true
//			ChoiceDialog:
//				return true
			EntityConnectionData:
				return true
		}
		false
	}
	
	private def isNullOrEmpty(ConditionalBody body) {
		if (body == null ||
			body.statements.empty && body.switchOn == null && body.switchOff == null && body.jump == null)
			return true
		return false
	}

}
