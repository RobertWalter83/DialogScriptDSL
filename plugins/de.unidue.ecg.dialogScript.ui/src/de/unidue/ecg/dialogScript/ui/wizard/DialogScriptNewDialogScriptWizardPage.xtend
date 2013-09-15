package de.unidue.ecg.dialogScript.ui.wizard

import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.jface.dialogs.IDialogPage
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.wizard.WizardPage
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Shell
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.dialogs.ContainerSelectionDialog

class DialogScriptNewDialogScriptWizardPage extends WizardPage {
	var Text containerText = null;

	var Text fileText = null;

	var ISelection selection = null;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	new(ISelection selection) {
		super("wizardPage")
		title = "New Dialog Script"
		description = "Creates a new dialog script."
		this.selection = selection
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	override createControl(Composite parent) {
		val container = new Composite(parent, SWT.NULL)
		val layout = new GridLayout()
		container.setLayout(layout)
		layout.numColumns = 3
		layout.verticalSpacing = 9
		var label = new Label(container, SWT.NULL)
		label.text = "&Folder name:"

		containerText = new Text(container, SWT.BORDER.bitwiseOr(SWT.SINGLE))
		containerText.layoutData = new GridData(GridData.FILL_HORIZONTAL)
		containerText.addModifyListener [ e |
			dialogChanged()
		]

		val button = new Button(container, SWT.PUSH);
		button.text = "Browse..."
		button.addSelectionListener(new DialogScriptSelectionAdapter(shell, containerText))
		label = new Label(container, SWT.NULL)
		label.setText("&Script name:")

		fileText = new Text(container, SWT.BORDER.bitwiseOr(SWT.SINGLE))
		fileText.layoutData = new GridData(GridData.FILL_HORIZONTAL)
		fileText.addModifyListener [
			dialogChanged
		]
		initialize
		dialogChanged
		control = container
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */
	def initialize() {
		if (selection != null && selection.isEmpty() == false && selection instanceof IStructuredSelection) {
			val ssel = selection as IStructuredSelection

			if (ssel.size > 1)
				return

			val obj = ssel.getFirstElement()
			if (obj instanceof IResource) {
				var IContainer container;
				if (obj instanceof IContainer)
					container = obj as IContainer
				else
					container = (obj as IResource).parent
				containerText.text = container.fullPath.toString()
			}
		}
		fileText.setText("script.dialog");
	}

	/**
	 * Ensures that both text fields are set.
	 */
	def dialogChanged() {
		val container = ResourcesPlugin.workspace.root.findMember(new Path(containerName))
		val fileName = fileName

		if (containerName.length == 0) {
			updateStatus("Please specify a folder for your new script")
			return
		}
		if (container == null || (container.getType().bitwiseAnd((IResource.PROJECT.bitwiseOr(IResource.FOLDER)))) == 0) {
			updateStatus("Folder does not exist")
			return
		}
		if (!container.isAccessible) {
			updateStatus("You don't seem to have writing permission in this project")
			return
		}
		if (fileName.length == 0) {
			updateStatus("Please specify a name for your new script")
			return
		}
		if (fileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("The current name is invalid; please don't use \'\\\' (back slash) symbols")
			return
		}
		val dotLoc = fileName.lastIndexOf('.')
		if (dotLoc != -1) {
			val ext = fileName.substring(dotLoc + 1)
			if (ext.equalsIgnoreCase("dialog") == false) {
				updateStatus("File extension has to be \"dialog\"")
				return
			}
		}
		updateStatus(null)
	}

	def updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	def getContainerName() {
		return containerText.text
	}

	def getFileName() {
		return fileText.text
	}
}

class DialogScriptSelectionAdapter extends SelectionAdapter {

	var Shell shell = null
	var Text containerText = null

	new(Shell shell, Text containerText) {
		this.shell = shell
		this.containerText = containerText
	}

	override widgetSelected(SelectionEvent e) {
		handleBrowse();
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */
	def handleBrowse() {
		val dialog = new ContainerSelectionDialog(shell, ResourcesPlugin.workspace.root, false,
			"Select new file container")
		if (dialog.open == ContainerSelectionDialog.OK) {
			val result = dialog.result
			if (result.length == 1) {
				containerText.text = (result.get(0) as Path).toString()
			}
		}
	}
}
