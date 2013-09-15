package de.unidue.ecg.dialogScript.ui.wizard;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.intro.IIntroPart;
import org.eclipse.ui.navigator.resources.ProjectExplorer;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import org.eclipse.xtext.ui.wizard.IProjectInfo;

import com.google.inject.Inject;

public class CustomDialogScriptNewProjectWizard extends org.eclipse.xtext.ui.wizard.XtextNewProjectWizard {

	private WizardNewProjectCreationPage mainPage;

	
	@Inject
	public CustomDialogScriptNewProjectWizard(IProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New DialogScript Project");
	}

	
	@Override
	public boolean performFinish() {

		boolean result = super.performFinish();
		final IWorkbench workbench = PlatformUI.getWorkbench();
		final IIntroPart introPart = workbench.getIntroManager().getIntro();
		workbench.getIntroManager().closeIntro(introPart);
		IWorkbenchWindow activeWorkbenchWindow = workbench
				.getActiveWorkbenchWindow();

		if (activeWorkbenchWindow != null) {
			IWorkbenchPage[] pages = activeWorkbenchWindow.getPages();

			for (IWorkbenchPage page : pages) {
				for (IViewReference viewReference : page.getViewReferences()) {
					IViewPart part = viewReference.getView(false);
					if(part instanceof ProjectExplorer) {
						ProjectExplorer projectExplorer = (ProjectExplorer)part;
						projectExplorer.setLinkingEnabled(true);	
					}
				}
			}
		}
		return result;
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	public void addPages() {
		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
		mainPage.setTitle("DialogScript Project");
		mainPage.setDescription("Create a new DialogScript project.");
		addPage(mainPage);
	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IProjectInfo getProjectInfo() {
		de.unidue.ecg.dialogScript.ui.wizard.DialogScriptProjectInfo projectInfo = new de.unidue.ecg.dialogScript.ui.wizard.DialogScriptProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		return projectInfo;
	}

}
