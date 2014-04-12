package de.unidue.ecg.dialogScript.ui.builderParticipant

import org.eclipse.xtext.builder.BuilderParticipant
import org.eclipse.xtext.resource.IResourceDescription.Delta
import org.eclipse.xtext.builder.IXtextBuilderParticipant.IBuildContext
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2
import org.eclipse.core.runtime.CoreException
import de.unidue.ecg.dialogScript.ui.views.DialogGraphView
import com.google.inject.Inject

class DialogScriptBuilderParticipant extends BuilderParticipant {

	@Inject
	DialogGraphView graphView

	override protected handleChangedContents(Delta delta, IBuildContext context,
		EclipseResourceFileSystemAccess2 fileSystemAccess) throws CoreException {
 
		val resource = context.resourceSet.getResource(delta.uri, true);
		if (shouldGenerate(resource, context)) {
			try {
				if (graphView != null && graphView.graphViewer != null) {
					graphView.refresh(resource)
				}
			} catch (RuntimeException e) {
				if (e.cause instanceof CoreException) {
					throw e.cause as CoreException
				}
				throw e;
			}
		}
		super.handleChangedContents(delta, context, fileSystemAccess)
	}

}
