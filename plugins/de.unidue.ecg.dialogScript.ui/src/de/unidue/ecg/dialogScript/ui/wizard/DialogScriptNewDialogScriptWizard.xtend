package de.unidue.ecg.dialogScript.ui.wizard

import org.eclipse.jface.wizard.Wizard
import org.eclipse.ui.INewWizard
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IWorkbench
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.core.runtime.CoreException
import java.lang.reflect.InvocationTargetException
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.core.resources.IContainer
import java.io.IOException
import org.eclipse.ui.PartInitException
import org.eclipse.ui.ide.IDE
import org.eclipse.ui.PlatformUI
import java.io.ByteArrayInputStream
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.IStatus

class DialogScriptNewDialogScriptWizard extends Wizard implements INewWizard {
	var DialogScriptNewDialogScriptWizardPage page = null
	var ISelection selection = null

	protected new() {
		super();
		setNeedsProgressMonitor(true)
	}
	
	override init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection
	}

	override addPages() {
		page = new DialogScriptNewDialogScriptWizardPage(selection)
		addPage(page)
	}

	override performFinish() {
		val containerName = page.containerName
		val fileName = page.fileName

		try {
			getContainer().run(true, false) [ monitor |
				try {
					doFinish(containerName, fileName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			]
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			val realException = e.targetException
			MessageDialog.openError(shell, "Error", realException.getMessage())
			return false
		}
		return true
	}

	def doFinish(String containerName, String inFileName, IProgressMonitor monitor) throws CoreException {
		var fileName = inFileName
		if (fileName.indexOf('.') < 0) {
			fileName = fileName + ".dialog"
		}
		monitor.beginTask("Creating " + fileName, 2)
		val root = ResourcesPlugin.workspace.root
		val resource = root.findMember(new Path(containerName))
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Folder \"" + containerName + "\" does not exist.")
		}
		val container = resource as IContainer
		val file = container.getFile(new Path(fileName))
		try {
			val stream = openContentStream()
			if (file.exists()) {
				file.setContents(stream, true, true, monitor)
			} else {
				file.create(stream, true, monitor)
			}
			stream.close()
		} catch (IOException e) {
		}
		monitor.worked(1);
		monitor.taskName = "Opening file for editing..."
		shell.display.asyncExec [ |
			val page = PlatformUI.workbench.activeWorkbenchWindow.activePage
			try {
				IDE.openEditor(page, file, true);
			} catch (PartInitException e) {
			}
		]
		monitor.worked(1)
	}

	def openContentStream() {
		val contents = "";
		return new ByteArrayInputStream(contents.getBytes())
	}

	def throwCoreException(String message) {
		val status = new Status(IStatus.ERROR, "de.unidue.ecg.dialogScript.ui",
				IStatus.OK, message, null);
		throw new CoreException(status);
	}
}
