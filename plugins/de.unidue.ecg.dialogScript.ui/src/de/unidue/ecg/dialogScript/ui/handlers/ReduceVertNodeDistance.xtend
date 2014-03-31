package de.unidue.ecg.dialogScript.ui.handlers

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.ui.handlers.HandlerUtil
import de.unidue.ecg.dialogScript.ui.views.DialogGraphView

class ReduceVertNodeDistance extends AbstractHandler {
	
	override execute(ExecutionEvent event) throws ExecutionException {
		val view = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().findView(
			"de.unidue.ecg.dialogScript.ui.views.DialogGraphView");
		if (view != null) {
			val dialogGraphView = view as DialogGraphView;
			dialogGraphView.reduceVerticalNodeDistance();
		}
		return null;
	}
	
	
	
}