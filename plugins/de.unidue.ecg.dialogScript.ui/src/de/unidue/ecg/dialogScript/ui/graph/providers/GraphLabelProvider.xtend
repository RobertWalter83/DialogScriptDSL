package de.unidue.ecg.dialogScript.ui.graph.providers

import de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog
import de.unidue.ecg.dialogScript.dialogScript.Conditional
import de.unidue.ecg.dialogScript.dialogScript.Defaults
import de.unidue.ecg.dialogScript.dialogScript.DialogLine
import de.unidue.ecg.dialogScript.dialogScript.FirstTime
import de.unidue.ecg.dialogScript.dialogScript.Hub
import de.unidue.ecg.dialogScript.dialogScript.PartingLines
import de.unidue.ecg.dialogScript.dialogScript.Scene
import de.unidue.ecg.dialogScript.dialogScript.Statement
import de.unidue.ecg.dialogScript.ui.views.DialogGraphView
import org.eclipse.draw2d.Label
import org.eclipse.emf.ecore.EObject
import org.eclipse.gef4.zest.core.viewers.EntityConnectionData
import org.eclipse.gef4.zest.core.viewers.IConnectionStyleProvider
import org.eclipse.gef4.zest.core.viewers.IEntityStyleProvider
import org.eclipse.gef4.zest.core.viewers.IFigureProvider
import org.eclipse.gef4.zest.core.widgets.GraphConnection
import org.eclipse.gef4.zest.core.widgets.GraphNode
import org.eclipse.gef4.zest.core.widgets.ZestStyles
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.Color
import org.eclipse.swt.graphics.Font
import org.eclipse.swt.widgets.Display
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.xbase.lib.Pair
import de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog
import de.unidue.ecg.dialogScript.dialogScript.ConditionList
import de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice
import java.util.List

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
					return abbreviate(entity.name)
				DialogLine:
					return entity.character.name.toUpperCase + '\n' + abbreviate(entity.lines)
				Conditional: {
					return 'Conditional'
				}
				Defaults: {
					return 'Defaults'
				}
				FirstTime: {
					return 'First Time'
				}
				PartingLines: {
					return 'Parting'
				}
				Hub: {
					return abbreviate(entity.name)
				}
				ChoiceDialog: {
					return abbreviate(entity.name)
				}
				ConditionalChoiceDialog: {
					return 'Conditional Choices'
				}
				ConditionList: {
					return 'Choices'
				}
				OtherwiseChoice: {
					return 'Choices'
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
											return 'else'
										}
										return otherwise.conditionList?.conditions.join(
											'''
												 
												or
											''')[name]
									}
								}

							}
						}
						ConditionalChoiceDialog: {
							switch (destination) {
								ConditionList: {
									return source.conditionList?.conditions.join(
										'''
											 
											or
										''')[name]
								}
								OtherwiseChoice case destination.conditionList != null: {
									destination.conditionList.conditions.join(
										'''
											 
											or
										''')[name]
								}
								OtherwiseChoice case destination.conditionList == null: {
									return 'else'
								}
							}
						}
						Statement: {
							switch (destination) {
								DialogLine: {
									val cd = EcoreUtil2.getContainerOfType(destination, ChoiceDialog)
									if (cd != null && cd.body?.statements.indexOf(destination) == 0)
										return abbreviate(cd.name)
								}
							}
							return null
						}
						Hub: {
							switch (destination) {
								DialogLine: {
									val cd = EcoreUtil2.getContainerOfType(destination, ChoiceDialog)
									if (cd != null && cd.body?.statements.indexOf(destination) == 0)
										return abbreviate(cd.name)
								}
								EObject: {
									val cd = this.view.getChoiceHelperMap().get(new Pair(source, destination))
									if (cd != null) //&& cd.body?.statements.indexOf(destination) == 0)
										return abbreviate(cd.name)
								}
							}
							return null
						}
						ConditionList: {
							findConnectionTextForCondChoices((source.eContainer as ConditionalChoiceDialog).choiceDialogs, destination as Statement)
						}
						OtherwiseChoice: {
							findConnectionTextForCondChoices(source.choices, destination as Statement)
						}
					}
				}
			}

		}
	}

	private def findConnectionTextForCondChoices(List<ChoiceDialog> choices, Statement destination) {

		for (ChoiceDialog candidate : choices) {
			if (candidate.body?.statements.contains(destination)) {
				return abbreviate(candidate.name)
			}
		}

		return null
	}

	private def abbreviate(String text) {
		if (this.view.abbreviate && text.length > 12) {
			text.replaceAll("\\s+", " ").substring(0, 8) + ' ...'
		} else
			text.replaceAll("\\s+", " ")
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
			ConditionalChoiceDialog:
				new Color(Display.^default, 255, 215, 0)
			OtherwiseChoice:
				new Color(Display.^default, 255, 175, 0)
			ConditionList:
				new Color(Display.^default, 255, 175, 0)
			Scene:
				new Color(Display.^default, 255, 255, 255)
			PartingLines:
				new Color(Display.^default, 255, 175, 0)
			Hub:
				new Color(Display.^default, 0, 200, 0)
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
			Hub:
				new Color(Display.^default, 0, 80, 0)
			default: {
				return new Color(Display.^default, 20, 60, 255)
			}
		}
	}

	override getBorderHighlightColor(Object entity) {
		switch (entity) {
			Hub:
				new Color(Display.^default, 0, 80, 0)
			default: {
				null
			}
		}
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
			Hub:
				new Color(Display.^default, 255, 255, 255)
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
			case (entity instanceof DialogLine || entity instanceof Scene || entity instanceof Hub ||
				entity instanceof ChoiceDialog || entity instanceof EntityConnectionData): {
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
		switch (rel) {
			EntityConnectionData: {
				val destination = rel.dest
				switch (destination) {
					EObject case EcoreUtil2.getContainerOfType(destination, ChoiceDialog) != null || this.view.
						choiceHelperMap.get(new Pair(rel.source as EObject, destination)) != null: {
						return new Color(Display.^default, 200, 0, 0)
					}
				}
			}
		}
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
		null
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
