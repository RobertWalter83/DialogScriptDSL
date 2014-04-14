package de.unidue.ecg.dialogScript.ui.views

import com.google.inject.Singleton
import de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog
import de.unidue.ecg.dialogScript.ui.graph.filters.GraphNodeFilter
import de.unidue.ecg.dialogScript.ui.graph.providers.GraphLabelProvider
import de.unidue.ecg.dialogScript.ui.graph.providers.GraphNodeContentProvider
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.gef4.geometry.planar.Dimension
import org.eclipse.gef4.layout.algorithms.TreeLayoutAlgorithm
import org.eclipse.gef4.zest.core.viewers.GraphViewer
import org.eclipse.gef4.zest.core.viewers.IZoomableWorkbenchPart
import org.eclipse.gef4.zest.core.viewers.ZoomContributionViewItem
import org.eclipse.gef4.zest.core.widgets.ZestStyles
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.part.ViewPart
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.xbase.lib.Pair

@Singleton
class DialogGraphView extends ViewPart implements IZoomableWorkbenchPart {

	public static val ID = "de.unidue.ecg.dialogScript.ui.views.DialogGraphView"

	var GraphViewer graphViewer
	var TreeLayoutAlgorithm defaultAlgorithm
	var List<EObject> currentModelAsFlatList
	var Dimension vertNodeSpace
	var Dimension horizNodeSpace
	var Map<Pair<EObject, EObject>, ChoiceDialog> choiceHelperMap = <Pair<EObject, EObject>, ChoiceDialog>newHashMap()
	
	def addChoiceHelper(EObject src, EObject dest, ChoiceDialog cd) {
		val key = new Pair(src, dest)
		if(!choiceHelperMap.containsKey(key))
			choiceHelperMap.put(key, cd)
	}

	def getChoiceHelperMap() {
		choiceHelperMap
	}

	def getGraphViewer() {
		graphViewer
	}

	override createPartControl(Composite parent) {
		graphViewer = new GraphViewer(parent, SWT.BORDER)
		graphViewer.contentProvider = new GraphNodeContentProvider(this) 
		graphViewer.labelProvider = new GraphLabelProvider(this)
		graphViewer.setConnectionStyle(ZestStyles.CONNECTIONS_DIRECTED)
		val filter = new GraphNodeFilter
		val filters = newArrayList()
		filters.add(filter)
		graphViewer.setFilters(filters)
		graphViewer.setInput(null)

		vertNodeSpace = new Dimension(120d, 100d)
		horizNodeSpace = new Dimension(160d, 100d)
		defaultAlgorithm = new TreeLayoutAlgorithm(TreeLayoutAlgorithm.TOP_DOWN, vertNodeSpace)
		graphViewer.setLayoutAlgorithm(defaultAlgorithm)

//		val stl = new SpaceTreeLayoutAlgorithm(TreeLayoutAlgorithm.TOP_DOWN, false)
//		graphViewer.setLayoutAlgorithm(stl)
		

		fillToolBar
	}

	override setFocus() {
	}

	def fillToolBar() {
		val toolbarZoomContributionViewItem = new ZoomContributionViewItem(this)
		val bars = viewSite.actionBars
		bars.menuManager.add(toolbarZoomContributionViewItem);
	}

	var layout = 1

	var boolean doGraphUpdate = true

	var boolean abbreviate = true

	def getAbbreviate() {
		abbreviate
	}

	def setAbbreviate(boolean value) {
		abbreviate = value
	}

	def setLayoutManager() {
		switch (this.defaultAlgorithm.direction) {
			case TreeLayoutAlgorithm.TOP_DOWN: {
				this.defaultAlgorithm.setDirection(TreeLayoutAlgorithm.LEFT_RIGHT)
				this.defaultAlgorithm.setNodeSpace(this.horizNodeSpace)
				layout = layout + 1
				this.graphViewer.applyLayout
			}
			case TreeLayoutAlgorithm.LEFT_RIGHT: {
				this.defaultAlgorithm.setDirection(TreeLayoutAlgorithm.TOP_DOWN)
				this.defaultAlgorithm.setNodeSpace(this.vertNodeSpace)
				layout = 1
				this.graphViewer.applyLayout
			}
		}
	}

	override getZoomableViewer() {
		getGraphViewer
	}

	def refresh(Resource resource) {
		if (this.doGraphUpdate) {
			EcoreUtil2.resolveAll(resource)
			var newModelAsFlatList = resource.allContents.toList

			if (currentModelAsFlatList == null || !EcoreUtil.equals(newModelAsFlatList, currentModelAsFlatList)) {

				currentModelAsFlatList = resource.allContents.toList
				Display.^default.syncExec [ |
					graphViewer.setInput(currentModelAsFlatList)
				]
			}
		}
	}

	def increaseHorizontalNodeDistance() {
		switch (this.defaultAlgorithm.direction) {
			case TreeLayoutAlgorithm.TOP_DOWN: {
				if (this.vertNodeSpace.width < 200) {
					this.vertNodeSpace = new Dimension(this.vertNodeSpace.width + 10d, this.vertNodeSpace.height)
					this.defaultAlgorithm.setNodeSpace(this.vertNodeSpace)
					this.graphViewer.applyLayout
				}
			}
			case TreeLayoutAlgorithm.LEFT_RIGHT: {
				if (this.horizNodeSpace.width < 260) {
					this.horizNodeSpace = new Dimension(this.horizNodeSpace.width + 10d, this.horizNodeSpace.height)
					this.defaultAlgorithm.setNodeSpace(this.horizNodeSpace)
					this.graphViewer.applyLayout
				}
			}
		}
	}

	def reduceHorizontalNodeDistance() {
		switch (this.defaultAlgorithm.direction) {
			case TreeLayoutAlgorithm.TOP_DOWN: {
				if (this.vertNodeSpace.width > 70) {
					this.vertNodeSpace = new Dimension(this.vertNodeSpace.width - 10d, this.vertNodeSpace.height)
					this.defaultAlgorithm.setNodeSpace(this.vertNodeSpace)
					this.graphViewer.applyLayout
				}
			}
			case TreeLayoutAlgorithm.LEFT_RIGHT: {
				if (this.horizNodeSpace.width > 70) {
					this.horizNodeSpace = new Dimension(this.horizNodeSpace.width - 10d, this.horizNodeSpace.height)
					this.defaultAlgorithm.setNodeSpace(this.horizNodeSpace)
					this.graphViewer.applyLayout
				}
			}
		}
	}

	def increaseVerticalNodeDistance() {
		switch (this.defaultAlgorithm.direction) {
			case TreeLayoutAlgorithm.TOP_DOWN: {
				if (this.vertNodeSpace.height < 160) {
					this.vertNodeSpace = new Dimension(this.vertNodeSpace.width, this.vertNodeSpace.height + 10d)
					this.defaultAlgorithm.setNodeSpace(this.vertNodeSpace)
					this.graphViewer.applyLayout
				}
			}
			case TreeLayoutAlgorithm.LEFT_RIGHT: {
				if (this.horizNodeSpace.height < 160) {
					this.horizNodeSpace = new Dimension(this.horizNodeSpace.width, this.horizNodeSpace.height + 10d)
					this.defaultAlgorithm.setNodeSpace(this.horizNodeSpace)
					this.graphViewer.applyLayout
				}
			}
		}
	}

	def reduceVerticalNodeDistance() {
		switch (this.defaultAlgorithm.direction) {
			case TreeLayoutAlgorithm.TOP_DOWN: {
				if (this.vertNodeSpace.height > 50) {
					this.vertNodeSpace = new Dimension(this.vertNodeSpace.width, this.vertNodeSpace.height - 10d)
					this.defaultAlgorithm.setNodeSpace(this.vertNodeSpace)
					this.graphViewer.applyLayout
				}
			}
			case TreeLayoutAlgorithm.LEFT_RIGHT: {
				if (this.horizNodeSpace.height > 50) {
					this.horizNodeSpace = new Dimension(this.horizNodeSpace.width, this.horizNodeSpace.height - 10d)
					this.defaultAlgorithm.setNodeSpace(this.horizNodeSpace)
					this.graphViewer.applyLayout
				}
			}
		}
	}

	def toggleGraphUpdate() {
		this.doGraphUpdate = !this.doGraphUpdate
		if (this.doGraphUpdate)
			this.graphViewer.applyLayout
	}

	def toggleTextAbbreviation() {
		this.abbreviate = !this.abbreviate
		this.graphViewer.refresh(true)
		this.graphViewer.applyLayout
	}

}
