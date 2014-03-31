package de.unidue.ecg.dialogScript.ui.wizard;

import de.unidue.ecg.dialogScript.ui.wizard.DialogScriptNewDialogScriptWizardPage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class DialogScriptNewDialogScriptWizard extends Wizard implements INewWizard {
  private DialogScriptNewDialogScriptWizardPage page = null;
  
  private ISelection selection = null;
  
  public DialogScriptNewDialogScriptWizard() {
    super();
    this.setNeedsProgressMonitor(true);
  }
  
  public void init(final IWorkbench workbench, final IStructuredSelection selection) {
    this.selection = selection;
  }
  
  public void addPages() {
    DialogScriptNewDialogScriptWizardPage _dialogScriptNewDialogScriptWizardPage = new DialogScriptNewDialogScriptWizardPage(this.selection);
    this.page = _dialogScriptNewDialogScriptWizardPage;
    this.addPage(this.page);
  }
  
  public boolean performFinish() {
    final String containerName = this.page.getContainerName();
    final String fileName = this.page.getFileName();
    try {
      IWizardContainer _container = this.getContainer();
      final IRunnableWithProgress _function = new IRunnableWithProgress() {
        public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
          try {
            DialogScriptNewDialogScriptWizard.this.doFinish(containerName, fileName, monitor);
          } catch (final Throwable _t) {
            if (_t instanceof CoreException) {
              final CoreException e = (CoreException)_t;
              InvocationTargetException _invocationTargetException = new InvocationTargetException(e);
              throw _invocationTargetException;
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          } finally {
            monitor.done();
          }
        }
      };
      _container.run(true, false, _function);
    } catch (final Throwable _t) {
      if (_t instanceof InterruptedException) {
        final InterruptedException e = (InterruptedException)_t;
        return false;
      } else if (_t instanceof InvocationTargetException) {
        final InvocationTargetException e_1 = (InvocationTargetException)_t;
        final Throwable realException = e_1.getTargetException();
        Shell _shell = this.getShell();
        String _message = realException.getMessage();
        MessageDialog.openError(_shell, "Error", _message);
        return false;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return true;
  }
  
  public void doFinish(final String containerName, final String inFileName, final IProgressMonitor monitor) throws CoreException {
    try {
      String fileName = inFileName;
      int _indexOf = fileName.indexOf(".");
      boolean _lessThan = (_indexOf < 0);
      if (_lessThan) {
        fileName = (fileName + ".dialog");
      }
      monitor.beginTask(("Creating " + fileName), 2);
      IWorkspace _workspace = ResourcesPlugin.getWorkspace();
      final IWorkspaceRoot root = _workspace.getRoot();
      Path _path = new Path(containerName);
      final IResource resource = root.findMember(_path);
      boolean _or = false;
      boolean _exists = resource.exists();
      boolean _not = (!_exists);
      if (_not) {
        _or = true;
      } else {
        _or = (_not || (!(resource instanceof IContainer)));
      }
      if (_or) {
        this.throwCoreException((("Folder \"" + containerName) + "\" does not exist."));
      }
      final IContainer container = ((IContainer) resource);
      Path _path_1 = new Path(fileName);
      final IFile file = container.getFile(_path_1);
      final ByteArrayInputStream stream = this.openContentStream();
      try {
        boolean _exists_1 = file.exists();
        if (_exists_1) {
          file.setContents(stream, true, true, monitor);
        } else {
          file.create(stream, true, monitor);
        }
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException e = (IOException)_t;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      } finally {
        stream.close();
      }
      monitor.worked(1);
      monitor.setTaskName("Opening file for editing...");
      Shell _shell = this.getShell();
      Display _display = _shell.getDisplay();
      final Runnable _function = new Runnable() {
        public void run() {
          IWorkbench _workbench = PlatformUI.getWorkbench();
          IWorkbenchWindow _activeWorkbenchWindow = _workbench.getActiveWorkbenchWindow();
          final IWorkbenchPage page = _activeWorkbenchWindow.getActivePage();
          try {
            IDE.openEditor(page, file, true);
          } catch (final Throwable _t) {
            if (_t instanceof PartInitException) {
              final PartInitException e = (PartInitException)_t;
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
      };
      _display.asyncExec(_function);
      monitor.worked(1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public ByteArrayInputStream openContentStream() {
    final String contents = "";
    byte[] _bytes = contents.getBytes();
    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
    return _byteArrayInputStream;
  }
  
  public void throwCoreException(final String message) {
    try {
      Status _status = new Status(IStatus.ERROR, "de.unidue.ecg.dialogScript.ui", IStatus.OK, message, null);
      final Status status = _status;
      CoreException _coreException = new CoreException(status);
      throw _coreException;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
