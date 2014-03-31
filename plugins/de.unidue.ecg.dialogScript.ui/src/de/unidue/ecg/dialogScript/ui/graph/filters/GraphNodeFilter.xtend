package de.unidue.ecg.dialogScript.ui.graph.filters

import de.unidue.ecg.dialogScript.dialogScript.Conditional
import de.unidue.ecg.dialogScript.dialogScript.Defaults
import de.unidue.ecg.dialogScript.dialogScript.DialogLine
import de.unidue.ecg.dialogScript.dialogScript.Scene
import org.eclipse.gef4.zest.core.viewers.EntityConnectionData
import org.eclipse.jface.viewers.Viewer
import org.eclipse.jface.viewers.ViewerFilter
import de.unidue.ecg.dialogScript.dialogScript.FirstTime
import de.unidue.ecg.dialogScript.dialogScript.PartingLines

class GraphNodeFilter extends ViewerFilter {

	override select(Viewer viewer, Object parentElement, Object element) {
		switch (element) {
			Scene:
				return true
			Defaults:
				return true
			FirstTime:
				return true
			DialogLine:
				return true
			Conditional:
				return true
			PartingLines:
				return true
			EntityConnectionData:
				return true
		}
		false
	}

}
