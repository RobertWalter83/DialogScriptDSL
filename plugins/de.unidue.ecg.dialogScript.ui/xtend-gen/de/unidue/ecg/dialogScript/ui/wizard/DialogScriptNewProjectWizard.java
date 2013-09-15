package de.unidue.ecg.dialogScript.ui.wizard;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import de.unidue.ecg.dialogScript.ui.wizard.DialogScriptProjectInfo;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.intro.IIntroManager;
import org.eclipse.ui.intro.IIntroPart;
import org.eclipse.ui.navigator.resources.ProjectExplorer;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class DialogScriptNewProjectWizard extends XtextNewProjectWizard {
  private WizardNewProjectCreationPage mainPage = null;
  
  @Inject
  public DialogScriptNewProjectWizard(final IProjectCreator projectCreator) {
    super(projectCreator);
    this.setWindowTitle("New DialogScript Project");
  }
  
  public boolean performFinish() {
    final boolean result = super.performFinish();
    final IWorkbench workbench = PlatformUI.getWorkbench();
    IIntroManager _introManager = workbench.getIntroManager();
    final IIntroPart introPart = _introManager.getIntro();
    IIntroManager _introManager_1 = workbench.getIntroManager();
    _introManager_1.closeIntro(introPart);
    final IWorkbenchWindow activeWorkbenchWindow = workbench.getActiveWorkbenchWindow();
    boolean _notEquals = (!Objects.equal(activeWorkbenchWindow, null));
    if (_notEquals) {
      final IWorkbenchPage[] pages = activeWorkbenchWindow.getPages();
      final Procedure1<IWorkbenchPage> _function = new Procedure1<IWorkbenchPage>() {
        public void apply(final IWorkbenchPage it) {
          IViewReference[] _viewReferences = it.getViewReferences();
          final Procedure1<IViewReference> _function = new Procedure1<IViewReference>() {
            public void apply(final IViewReference it) {
              final IViewPart part = it.getView(false);
              boolean _matched = false;
              if (!_matched) {
                if (part instanceof ProjectExplorer) {
                  final ProjectExplorer _projectExplorer = (ProjectExplorer)part;
                  _matched=true;
                  _projectExplorer.setLinkingEnabled(true);
                }
              }
            }
          };
          IterableExtensions.<IViewReference>forEach(((Iterable<IViewReference>)Conversions.doWrapArray(_viewReferences)), _function);
        }
      };
      IterableExtensions.<IWorkbenchPage>forEach(((Iterable<IWorkbenchPage>)Conversions.doWrapArray(pages)), _function);
    }
    return result;
  }
  
  /**
   * Use this method to add pages to the wizard.
   * The one-time generated version of this class will add a default new project page to the wizard.
   */
  public void addPages() {
    WizardNewProjectCreationPage _wizardNewProjectCreationPage = new WizardNewProjectCreationPage("basicNewProjectPage");
    this.mainPage = _wizardNewProjectCreationPage;
    this.mainPage.setTitle("DialogScript Project");
    this.mainPage.setDescription("Create a new DialogScript project.");
    this.addPage(this.mainPage);
  }
  
  /**
   * Use this method to read the project settings from the wizard pages and feed them into the project info class.
   */
  public IProjectInfo getProjectInfo() {
    DialogScriptProjectInfo _dialogScriptProjectInfo = new DialogScriptProjectInfo();
    final DialogScriptProjectInfo projectInfo = _dialogScriptProjectInfo;
    String _projectName = this.mainPage.getProjectName();
    projectInfo.setProjectName(_projectName);
    return projectInfo;
  }
}
