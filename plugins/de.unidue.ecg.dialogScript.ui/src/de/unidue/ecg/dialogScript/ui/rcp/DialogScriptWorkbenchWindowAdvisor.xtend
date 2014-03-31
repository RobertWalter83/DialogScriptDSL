package de.unidue.ecg.dialogScript.ui.rcp

import org.eclipse.ui.application.WorkbenchWindowAdvisor
import org.eclipse.ui.application.IWorkbenchWindowConfigurer
import org.eclipse.swt.graphics.Point

class DialogScriptWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	new(IWorkbenchWindowConfigurer configurer) {
		super(configurer)
	}

	override preWindowOpen() {
		val configurer = getWindowConfigurer();
		configurer.setInitialSize(new Point(400, 300));
		configurer.setShowStatusLine(false);
		configurer.setShowCoolBar(true);
		configurer.setTitle("DialogScript Application");
	}
}
