package de.unidue.ecg.dialogScript.ui.wizard

import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage
import com.google.inject.Inject
import org.eclipse.xtext.ui.wizard.IProjectCreator
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.navigator.resources.ProjectExplorer

class DialogScriptNewProjectWizard extends XtextNewProjectWizard {
	var WizardNewProjectCreationPage mainPage = null
		
	@Inject
	new(IProjectCreator projectCreator) {
		super(projectCreator)
		setWindowTitle("New DialogScript Project")
	}

	
	override boolean performFinish() {

		val result = super.performFinish()
		val workbench = PlatformUI.workbench
		val introPart = workbench.introManager.intro
		workbench.introManager.closeIntro(introPart)
		
		val activeWorkbenchWindow = workbench.activeWorkbenchWindow

		if (activeWorkbenchWindow != null) {
			val pages = activeWorkbenchWindow.getPages();

			pages.forEach[
				viewReferences.forEach[
					val part = getView(false)
					switch part {
						ProjectExplorer: {
							part.setLinkingEnabled(true)
						}
					}
				]
			]
		}
		return result
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	override addPages() {
		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
		mainPage.title = "DialogScript Project"
		mainPage.description = "Create a new DialogScript project."
		addPage(mainPage)
	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	override getProjectInfo() {
		val projectInfo = new DialogScriptProjectInfo()
		projectInfo.projectName = mainPage.projectName
		return projectInfo
	}
}