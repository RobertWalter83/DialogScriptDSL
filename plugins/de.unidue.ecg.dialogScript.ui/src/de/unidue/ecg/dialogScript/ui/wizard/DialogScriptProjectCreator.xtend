package de.unidue.ecg.dialogScript.ui.wizard

import com.google.common.collect.ImmutableList
import com.google.inject.Inject
import com.google.inject.Provider
import java.io.ByteArrayInputStream
import java.io.IOException
import java.lang.reflect.InvocationTargetException
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.SubMonitor
import org.eclipse.ui.actions.WorkspaceModifyOperation
import org.eclipse.xtext.ui.XtextProjectHelper
import org.eclipse.xtext.ui.util.ProjectFactory
import org.eclipse.xtext.ui.wizard.IProjectCreator
import org.eclipse.xtext.ui.wizard.IProjectInfo
import org.eclipse.xtext.ui.wizard.Messages

class DialogScriptProjectCreator extends WorkspaceModifyOperation implements IProjectCreator {

	@Inject var Provider<ProjectFactory> projectFactoryProvider

	var IFile result
	var IProjectInfo projectInfo
	static val SCRIPT_ROOT = "scripts"
	val FOLDER_LIST = ImmutableList.of(SCRIPT_ROOT)
	val PROJECT_NATURES = ImmutableList.of(XtextProjectHelper.NATURE_ID)
	val BUILDER_IDS = ImmutableList.of(XtextProjectHelper.BUILDER_ID)

	override protected execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
		val subMonitor = SubMonitor.convert(monitor, getCreateModelProjectMessage(), 2)

		try { 
			val project = createProject(subMonitor.newChild(1))
			if (project == null)
				return;

			result = enhanceProject(project, subMonitor.newChild(1))
		} finally {
			subMonitor.done();
		}
	}

	override getResult() {
		result
	}

	override setProjectInfo(IProjectInfo projectInfo) {
		this.projectInfo = projectInfo
	}

	def getCreateModelProjectMessage() {
		return Messages.AbstractProjectCreator_0 + projectInfo.projectName;
	}

	def createProject(IProgressMonitor monitor) {
		val factory = projectFactoryProvider.get()
		configureProjectFactory(factory)
		factory.createProject(monitor, null);
	}

	def configureProjectFactory(ProjectFactory factory) {
		factory.setProjectName(projectInfo.projectName)
		factory.addFolders(FOLDER_LIST)
		factory.addProjectNatures(PROJECT_NATURES)
		factory.addBuilderIds(BUILDER_IDS)
		return factory
	}

	def enhanceProject(IProject project, IProgressMonitor monitor) throws CoreException {
		val charaPath = new Path('./' + SCRIPT_ROOT + '/characters')
		val dialogPath = new Path('./' + SCRIPT_ROOT + '/dialog')
		
		project.createFile('Characters.chara', charaPath, createCharacterContent.toString, monitor)
		val dialogFile = project.createFile('Dialog.dialog', dialogPath, createDialogContent.toString, monitor)

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		return dialogFile
	}
	
	def private createFile(IProject project, String fileNameWithExtension, Path path, String content, IProgressMonitor monitor) {
		val folder = project.getFolder(path)
		folder.create(true, true, monitor)
		val file = folder.getFile(new Path(fileNameWithExtension))
		var stream = null as ByteArrayInputStream
		try {
			stream = new ByteArrayInputStream(content.bytes)
			file.create(stream, true, monitor)
			return file
		} catch (IOException io) {
		} 
		finally {
			stream.close
		}
	}

	def createDialogContent() '''
/* Some useful shortcuts
 * CTRL+SPACE: Get context sensitive help at the current cursor position
 * CTRL+SHIFT+F: Auto-format your file
 */
characters: Leia, Han

scene "The Sealing" 

	Leia: "I love you."
	Han: "I know."

end scene
		'''
		
	def createCharacterContent() '''
/* Some useful shortcuts
 * CTRL+SPACE: Get context sensitive help at the current cursor position
 * CTRL+SHIFT+F: Auto-format your file
 */
character Leia
	full name "Leia Organa"
	description "Princess of Alderaan, daughter of Padme Amidala and Anakin Skywalker."
	age 22
	sex female
	type NPC
end

character Han
	full name "Han Solo"
	description "Corellian Smuggler"
	age 32
	sex male
	type PC
end
		'''

	def getEncoding() throws CoreException {
		ResourcesPlugin.workspace.root.defaultCharset
	}
}
