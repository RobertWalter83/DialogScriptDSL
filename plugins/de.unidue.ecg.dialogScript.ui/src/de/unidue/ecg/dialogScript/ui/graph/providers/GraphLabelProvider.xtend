package de.unidue.ecg.dialogScript.ui.graph.providers

import de.unidue.ecg.dialogScript.dialogScript.Conditional
import de.unidue.ecg.dialogScript.dialogScript.DialogLine
import de.unidue.ecg.dialogScript.dialogScript.Scene
import de.unidue.ecg.dialogScript.ui.views.DialogGraphView
import org.eclipse.gef4.zest.core.viewers.EntityConnectionData
import org.eclipse.gef4.zest.core.viewers.IConnectionStyleProvider
import org.eclipse.gef4.zest.core.viewers.IEntityStyleProvider
import org.eclipse.gef4.zest.core.widgets.GraphNode
import org.eclipse.gef4.zest.core.widgets.ZestStyles
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.Color
import org.eclipse.swt.graphics.Font
import org.eclipse.swt.widgets.Display
import de.unidue.ecg.dialogScript.dialogScript.FirstTime
import de.unidue.ecg.dialogScript.dialogScript.Defaults
import org.eclipse.emf.ecore.EObject
import de.unidue.ecg.dialogScript.dialogScript.PartingLines
import org.eclipse.gef4.zest.core.widgets.GraphConnection
import org.eclipse.draw2d.Label
import org.eclipse.gef4.zest.core.viewers.IFigureProvider
import org.eclipse.draw2d.IFigure
import org.eclipse.draw2d.Ellipse
import org.eclipse.draw2d.geometry.Dimension
import org.eclipse.draw2d.geometry.Rectangle
import org.eclipse.draw2d.RectangleFigure
import org.eclipse.draw2d.Border

class GraphLabelProvider extends LabelProvider implements IFigureProvider, IEntityStyleProvider, IConnectionStyleProvider {

	var DialogGraphView view

	new(DialogGraphView view) {
		this.view = view
	}

	override getText(Object entity) {

		if (entity != null) {
			val node = this.view.graphViewer.findGraphItem(entity)

			switch (node) {
				GraphNode: node.setFont(new Font(node.font.device, "Courier New", 10, SWT.BOLD))
				GraphConnection: node.setFont(new Font(node.font.device, "Courier New", 8, SWT.BOLD))
			}

			switch (entity) {
				Scene:
					return if (this.view.abbreviate && entity.name.length > 12) {
						entity.name.substring(0, 8) + ' ...'
					} else
						entity.name
				DialogLine:
					return entity.character.name.toUpperCase + '\n' + if (this.view.abbreviate &&
						entity.lines.length > 12) {

						entity.lines.substring(0, 8) + ' ...'
					} else
						entity.lines.replaceAll("\\s+", " ")
				Conditional: {
					return 'Conditional'
				}
				Defaults: {
					return 'Default Lines'
				}
				FirstTime: {
					return 'First time condition'
				}
				PartingLines: {
					return 'Parting'
				}
				EntityConnectionData: {
					val source = entity.source
					val destination = entity.dest

					switch (source) {
						FirstTime: {
							if (source.body?.statements.contains(destination)) {
								return 'first time'
							} else if (source.otherTimes?.body?.statements.contains(destination)) {
								return 'else'
							}
						}
						Conditional: {
							if (source.body?.statements.contains(destination)) {
								return source.conditionList?.conditions.join(
									'''
										 
										or
									''')[name]
							} else {

								for (otherwise : source.otherwiseList) {
									if (otherwise.body?.statements.contains(destination)) {
										if (otherwise.conditionList?.conditions == null) {
											return "else"
										}
										return otherwise.conditionList?.conditions.join(
											'''
												 
												or
											''')[name]
									}
								}

							}
						}
					}
				}
			}

		}
	}

	override fisheyeNode(Object entity) {
		true
	}

	override getBackgroundColour(Object entity) {
		switch (entity) {
			Defaults:
				new Color(Display.^default, 255, 175, 0)
			FirstTime:
				new Color(Display.^default, 255, 175, 0)
			Conditional:
				new Color(Display.^default, 255, 215, 0)
			Scene:
				new Color(Display.^default, 255, 255, 255)
			PartingLines:
				new Color(Display.^default, 255, 175, 0)
		}
	}

	override getBorderColor(Object entity) {
		switch (entity) {
			DialogLine: {
				if (entity.IsDefault)
					return new Color(Display.^default, 0, 0, 0)
				else
					return new Color(Display.^default, 20, 60, 255)
			}
			Defaults: {
				return new Color(Display.^default, 0, 0, 0)
			}
			default: {
				return new Color(Display.^default, 20, 60, 255)
			}
		}
	}

	override getBorderHighlightColor(Object entity) {
	}

	override getBorderWidth(Object entity) {
		switch (entity) {
			DialogLine: {
				if (entity.IsDefault)
					2
				else
					1
			}
			Defaults:
				2
			default:
				1
		}
	}

	def boolean IsDefault(EObject context) {
		if (context == null)
			return false
		else if (context instanceof Defaults) {
			return true
		} else
			return IsDefault(context.eContainer)
	}

	override getForegroundColour(Object entity) {
		switch (entity) {
			Scene:
				new Color(Display.^default, 0, 0, 0)
			Defaults:
				new Color(Display.^default, 0, 0, 0)
			FirstTime:
				new Color(Display.^default, 0, 0, 0)
			PartingLines:
				new Color(Display.^default, 0, 0, 0)
		}
	}

	override getNodeHighlightColor(Object entity) {

		var color = getBackgroundColour(entity)

		if (color == null) {
			val node = view.graphViewer.findGraphItem(entity)
			if (node != null && node instanceof GraphNode) {
				val graphNode = node as GraphNode
				color = graphNode.backgroundColor
			}
		}

		return color.brightenedBy(0.5)
	}

	def brightenedBy(Color color, double correction) {
		val r = (255 - color.red) * correction + color.red;
		val g = (255 - color.green) * correction + color.green
		val b = (255 - color.blue) * correction + color.blue

		return new Color(Display.^default, r as int, g as int, b as int)
	}

	override getTooltip(Object entity) {
		switch (entity) {
			case (entity instanceof DialogLine || entity instanceof Scene): {
				val temp = this.view.abbreviate
				this.view.abbreviate = false
				val tt = new Label(getText(entity))
				this.view.abbreviate = temp
				return tt
			}
		}
		return null
	}

	override getColor(Object rel) {
		new Color(Display.^default, 0, 0, 0)
	}

	override getConnectionDecorator(Object rel) {
		null
	}

	override getConnectionStyle(Object rel) {
		ZestStyles.CONNECTIONS_DIRECTED
	}

	override getHighlightColor(Object rel) {
		null
	}

	override getLineWidth(Object rel) {
		0
	}

	override getRouter(Object rel) {
		null
	}
	
	override getFigure(Object element) {
//		var figure = new RectangleFigure()
//		figure.size = new Dimension(100,40)
//		figure.setBackgroundColor(new Color(Display.^default, 128,214,254))
//		
//		return figure
	}

//	override selfStyleConnection(Object element, GraphConnection connection) {
//		connection.setConnectionStyle(ZestStyles.CONNECTIONS_DIRECTED)
//	}
//
//	override selfStyleNode(Object element, GraphNode node) {
////		node.setFont(new Font(node.font.device, "Courier New", 10, node.style.bitwiseOr(SWT.CENTER)))
////		val graphLabel = node.figure as GraphLabel
////		graphLabel.setTextAlignment(SWT.CENTER)
//
//	//		node.graphModel.setNodeStyle(SWT.CENTER)
//	//		node.nodeStyle = node.style.bitwiseOr(SWT.CENTER)
//	}
}
