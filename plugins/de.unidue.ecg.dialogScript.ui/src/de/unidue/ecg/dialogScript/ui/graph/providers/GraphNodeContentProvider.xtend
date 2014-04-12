package de.unidue.ecg.dialogScript.ui.graph.providers

import de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog
import de.unidue.ecg.dialogScript.dialogScript.Conditional
import de.unidue.ecg.dialogScript.dialogScript.ConditionalBody
import de.unidue.ecg.dialogScript.dialogScript.ConditionalChoiceDialog
import de.unidue.ecg.dialogScript.dialogScript.Defaults
import de.unidue.ecg.dialogScript.dialogScript.Dialog
import de.unidue.ecg.dialogScript.dialogScript.DialogLine
import de.unidue.ecg.dialogScript.dialogScript.Exit
import de.unidue.ecg.dialogScript.dialogScript.FirstTime
import de.unidue.ecg.dialogScript.dialogScript.Hub
import de.unidue.ecg.dialogScript.dialogScript.HubFragment
import de.unidue.ecg.dialogScript.dialogScript.InvokeHub
import de.unidue.ecg.dialogScript.dialogScript.InvokeScene
import de.unidue.ecg.dialogScript.dialogScript.PartingLines
import de.unidue.ecg.dialogScript.dialogScript.Scene
import de.unidue.ecg.dialogScript.dialogScript.Statement
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.gef4.zest.core.viewers.IGraphEntityContentProvider
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.xtext.EcoreUtil2
import de.unidue.ecg.dialogScript.dialogScript.Jump
import de.unidue.ecg.dialogScript.ui.views.DialogGraphView
import de.unidue.ecg.dialogScript.dialogScript.ConditionList
import de.unidue.ecg.dialogScript.dialogScript.OtherwiseChoice

class GraphNodeContentProvider extends ArrayContentProvider implements IGraphEntityContentProvider {

	var DialogGraphView view

	new(DialogGraphView view) {
		this.view = view
	}

	private def isNullOrEmpty(ConditionalBody body) {
		if (body == null ||
			body.statements.empty && body.switchOn == null && body.switchOff == null && body.jump == null)
			return true
		return false
	}

	private def Iterable<EObject> getActualSiblingsFor(EObject in, Iterable<? extends EObject> candidates) {
		var needsSibling = true
		val actualSiblings = <EObject>newArrayList()

		for (EObject candidate : candidates) {
			if (needsSibling) {
				switch (candidate) {
					DialogLine: { // if we found a DialogLine, look no further
						actualSiblings.add(candidate)
						needsSibling = false
					}
					Conditional: {
						actualSiblings.add(candidate)
						val ^else = candidate.otherwiseList.findFirst[it.conditionList == null]
						if (^else != null && !^else.body?.statements.empty) { // this conditional has an else-branch, so the ones below are of no concern anymore
							needsSibling = false
						}
					}
					ChoiceDialog: {
						actualSiblings.addAll(getAllDestinations(in, candidate))
						var lookForNextChoice = true
						var EObject nextSibling = candidate
						while (lookForNextChoice) { // look for all direct choice siblings and add them
							nextSibling = EcoreUtil2.getNextSibling(nextSibling)
							if (nextSibling != null) {
								val nextChoice = nextSibling as HubFragment
								switch (nextChoice) {
									ChoiceDialog: {
										actualSiblings.addAll(getAllDestinations(in, nextChoice))
									}
									default:
										lookForNextChoice = false
								}
							} else {
								lookForNextChoice = false
							}
						}
						needsSibling = false
					}
					Hub: {
						if (!candidate.isHidden) {
							actualSiblings.add(candidate)
							needsSibling = false
						}
					}
					ConditionalChoiceDialog: {
						actualSiblings.add(candidate)
						val ^else = candidate.otherwiseChoices.findFirst[it.conditionList == null]
						if (^else != null) { // this conditional has an else-branch, so the ones below are of no concern anymore
							needsSibling = false
						}
					}
				}
			} else {
				return actualSiblings
			}
		}

		// we looked at all siblings and found sth, but
		// if our blocks ends with an conditional without an else branch, we need to look further
		// we can pass the last element of our actualSiblings since this case is only true if the last sibling
		// is a conditional with no else branch (I guess)
		if (needsSibling && !actualSiblings.empty) {
			actualSiblings.addAll(getAllOuterSiblings(actualSiblings.last, <EObject>newArrayList))
		}
		return actualSiblings
	}

	private def getJumpTargets(EObject context, Jump jump) {
		val result = newArrayList()
		switch (jump) {
			Exit: {
				if (jump.exitHub) {
					val hubContainer = EcoreUtil2.getContainerOfType(context, Hub)
					val hubSiblings = newArrayList
					getAllFollowingSiblings(hubContainer, hubSiblings)

					if (!hubSiblings.empty && hubSiblings.head instanceof DialogLine) {
						val cd = EcoreUtil2.getContainerOfType(jump, ChoiceDialog);
						if (cd != null) {
							this.view.addChoiceHelper(context, hubSiblings.head, cd)
						}
						result.add(hubSiblings.head)
					} else {
						val actualSiblings = getAllOuterSiblings(hubContainer, hubSiblings)
						val cd = EcoreUtil2.getContainerOfType(jump, ChoiceDialog);
						if (cd != null) {
							actualSiblings.forEach [
								this.view.addChoiceHelper(context, it, cd)
							]
						}
						if (!actualSiblings.empty) {
							result.addAll(actualSiblings)
						} else {
							// handle end of scene
						}
					}
				} else if (jump.exitScene) {
					// handle end of scene
				}
			}
			InvokeHub: {
				val cd = EcoreUtil2.getContainerOfType(jump, ChoiceDialog);
				if (cd != null) {
					this.view.addChoiceHelper(context, jump.hub, cd)
				}
				result.add(jump.hub)
			}
			InvokeScene: {
				val cd = EcoreUtil2.getContainerOfType(jump, ChoiceDialog);
				if (cd != null) {
					this.view.addChoiceHelper(context, jump.scene, cd)
				}
				result.add(jump.scene)
			}
		}
		return result
	}

	private def getAllDestinations(EObject context, ChoiceDialog cd) {
		val firstStatement = cd.body?.statements?.head
		if (firstStatement != null) {
			return newArrayList(firstStatement)
		} else if (cd.body?.jump != null) {
			return getJumpTargets(context, cd.body.jump)
		}
	}

	override getConnectedTo(Object entity) {
		if (entity != null) {

			// dynamic dispatch on entity type
			return getNodeModelChildren(entity)
		}
		return null
	}

	dispatch def Object[] getNodeModelChildren(Scene in) {
		val result = newArrayList()
		if (!in.dialog?.defaults?.body.nullOrEmpty) {
			result.add(in.dialog.defaults)
			return result
		} else if (!in.dialog?.firstTime?.body.nullOrEmpty) {
			result.add(in.dialog.firstTime)
			if (in.dialog.firstTime.otherTimes != null) {

				// if we have an else-path, we don't need to look further
				return result
			}
		}

		// if we arrive here, we haven't found valid kids yet or need to add further
		// if there are no recursives, we have to check for partingLines 
		if (in.dialog?.recursives.empty) {
			if (!in.dialog?.partingLines?.body.nullOrEmpty) {
				result.add(in.dialog.partingLines)
			}
		} else {
			result.addAll(getActualSiblingsFor(in, in.dialog.recursives))
		}

		return result
	}

	dispatch def Object[] getNodeModelChildren(Defaults in) {
		return newArrayList(in.body?.statements?.head)
	}

	dispatch def Object[] getNodeModelChildren(FirstTime in) {
		val result = newArrayList()

		result.add(in.body?.statements?.head)
		result.add(in.otherTimes?.body?.statements?.head)

		return result
	}

	dispatch def Object[] getNodeModelChildren(Conditional in) {
		val result = newArrayList()

		// get the first element of this body
		result.add(in.body?.statements?.head)

		// add all first elements of this "level"
		in.otherwiseList?.forEach[result.add(it.body?.statements?.head)]

		return result
	}

	dispatch def Object[] getNodeModelChildren(PartingLines in) {
		return newArrayList(in.body?.statements?.head)
	}

	dispatch def Object[] getNodeModelChildren(Hub in) {
		val result = newArrayList()

		result.addAll(getActualSiblingsFor(in, in.hubFragments))

		//		val candidate = in.hubFragments.head
		//		if (candidate != null) {
		//			switch (candidate) {
		//				DialogLine: { // we are done when we find a dialogLine
		//					result.add(candidate)
		//				}
		//				ChoiceDialog: { // hub directly contains choices. we need to find all for this "virtual group"
		//					result.addAll(getAllDestinations(in, candidate))
		//					var lookForNextChoice = true
		//					var EObject nextSibling = candidate
		//					while (lookForNextChoice) { // look for all direct choice siblings and add them
		//						nextSibling = EcoreUtil2.getNextSibling(nextSibling)
		//						if (nextSibling != null) {
		//							val nextChoice = nextSibling as HubFragment
		//							switch (nextChoice) {
		//								ChoiceDialog: {
		//									result.addAll(getAllDestinations(in, nextChoice))
		//								}
		//								default:
		//									lookForNextChoice = false
		//							}
		//						} else {
		//							lookForNextChoice = false
		//						}
		//					}
		//				}
		//				Conditional: {
		//					val actualSiblings = getSiblingsInCaseOfCondition(in, hubFragments)
		//
		//					if (!actualSiblings.empty) {
		//						result.addAll(actualSiblings)
		//					}
		//				}
		//				ConditionalChoiceDialog: {
		//					val actualSiblings = getSiblingsInCaseOfCondition(in, hubFragments)
		//
		//					if (!actualSiblings.empty) {
		//						result.addAll(actualSiblings)
		//					}
		//				}
		//			}
		//		}
		return result
	}

	dispatch def Object[] getNodeModelChildren(ConditionalChoiceDialog in) {
		val result = newArrayList()

		// add conditionList for necessary special handling of cond choices
		result.add(in.conditionList)

		// add all alternative cond choices
		result.addAll(in.otherwiseChoices)

		return result
	}

	/**
	 * we use ConditionalList as a helper to display additional nodes between conditional choices and their actual conditions
	 */
	dispatch def Object[] getNodeModelChildren(ConditionList in) {
		val result = newArrayList()
		val condChoice = in.eContainer as ConditionalChoiceDialog // must apply!

		// here we search for the destination for all available choices
		// this includes jump statements
		condChoice.choiceDialogs.forEach[cd|result.addAll(getAllDestinations(in, cd))]

		return result
	}

	dispatch def Object[] getNodeModelChildren(OtherwiseChoice in) {
		val result = newArrayList()
		in.choices.forEach[cd|result.addAll(getAllDestinations(in, cd))]
		return result
	}

	dispatch def Object[] getNodeModelChildren(DialogLine in) {
		val allSiblings = newArrayList()
		getAllFollowingSiblings(in, allSiblings)

		val result = <EObject>newArrayList
		var EObject sibling = null
		var needsSibling = true
		if (!allSiblings.empty && allSiblings.head instanceof DialogLine) {
			sibling = allSiblings.head
			needsSibling = false
			result.add(sibling)
		} else {
			val actualSiblings = getActualSiblingsFor(in, allSiblings)

			if (!actualSiblings.empty) {
				result.addAll(actualSiblings)
				needsSibling = false
			}
		}

		if (needsSibling) {
			val body = EcoreUtil2.getContainerOfType(in, ConditionalBody)

			if (body?.jump != null) {
				val jump = body.jump
				result.addAll(getJumpTargets(in, jump))

			} else { // we are at the end of a block and need to look for outer siblings
				result.addAll(getAllOuterSiblings(in, newArrayList))
				return result
			}
		}
		return result
	}

	// default dispatch
	dispatch def Object[] getNodeModelChildren(Object in) {
		null
	}

	def EObject[] getAllOuterSiblings(EObject in, List<EObject> result) {
		var context = in.nextOuterContext
		if (context == null)
			return null // we are at the end of a scene!

		switch (context) {
			Dialog: { // we are at a dialogline on the very top level of a scene with no siblings (conditionals or dialog lines)

				// so the only valid chance to have siblings is a parting statement
				result.add(context.partingLines)
				return result
			}
			Defaults: {
				val dialog = context.eContainer as Dialog
				if (dialog.firstTime != null) {
					result.add(dialog.firstTime)

					if (dialog.firstTime.otherTimes == null) {
						if (dialog?.recursives.empty) {
							if (!dialog?.partingLines?.body.nullOrEmpty) {
								result.add(dialog.partingLines)
							}
						} else {
							result.addAll(getActualSiblingsFor(in, dialog.recursives))
						}
					}
				} else if (dialog.recursives.empty && dialog.partingLines != null) {
					result.add(dialog.partingLines)
				} else {
					result.add(dialog.recursives?.head)
				}
				return result
			}
			FirstTime: {
				val dialog = context.eContainer as Dialog
				if (dialog.recursives.empty && dialog.partingLines != null) {
					result.add(dialog.partingLines)
				} else {
					result.add(dialog.recursives?.head)
				}
				return result
			}
			Conditional: {
				val candidates = newArrayList
				context.getAllFollowingSiblings(candidates)
				result.addAll(getActualSiblingsFor(context, candidates))

			//				if (nextSibling != null) {
			//
			//					switch (nextSibling) {
			//						DialogLine: {
			//							result.add(nextSibling)
			//							return result
			//						}
			//						Conditional: {
			//							val candidates = newArrayList
			//							getAllFollowingSiblings(context, candidates)
			//							result.addAll(getActualSiblingsFor(context, candidates))
			//							return result
			//						}
			//						ConditionalChoiceDialog: {
			//							result.add(nextSibling)
			//							return result
			//						}
			//						ChoiceDialog: {
			//
			//							var lookForNextChoice = true
			//							var EObject next = context
			//							while (lookForNextChoice) { // look for all direct choice siblings and add them
			//								next = EcoreUtil2.getNextSibling(next)
			//								if (next != null) {
			//									val nextChoice = next as HubFragment
			//									switch (nextChoice) {
			//										ChoiceDialog: {
			//											result.addAll(getAllDestinations(in, nextChoice))
			//										}
			//										default:
			//											lookForNextChoice = false
			//									}
			//								} else {
			//									lookForNextChoice = false
			//								}
			//							}
			//							return result
			//						}
			//					}
			//				}
			}
			ConditionalChoiceDialog: {
				val candidates = newArrayList
				context.getAllFollowingSiblings(candidates)
				result.addAll(getActualSiblingsFor(context, candidates))
			}
			ChoiceDialog: { // look for non-choiceDialog siblings
				val candidates = newArrayList
				context.getAllFollowingSiblings(candidates)
				result.addAll(getActualSiblingsFor(context, candidates.filter[!(it instanceof ChoiceDialog)]))

			//				var nextSibling = EcoreUtil2.getNextSibling(context)
			//
			//				while (nextSibling != null) {
			//					switch (nextSibling) {
			//						Statement: {
			//							result.add(nextSibling)
			//							return result
			//						}
			//						ConditionalChoiceDialog: {
			//							result.add(nextSibling)
			//							return result
			//						}
			//						ChoiceDialog: {
			//							nextSibling = EcoreUtil2.getNextSibling(nextSibling)
			//						}
			//					}
			//				}
			}
			PartingLines: {

				// end of a scene
				return result
			}
			Hub: { // if context is a hub, this line ends a hub and needs to loop back
				if (!context.isHidden) {
					result.add(context)
					return result
				}
			}
		}

		if (result.empty) {
			return getAllOuterSiblings(context, result)
		} else {
			return result
		}
	}

	def void getAllFollowingSiblings(EObject object, List<EObject> outResult) {
		if (object != null) {
			val sibling = EcoreUtil2.getNextSibling(object)

			if (sibling != null) {
				switch (sibling) {
					Hub: {
						if (!sibling.isHidden) {
							outResult.add(sibling)
						}
					}
					default:
						outResult.add(sibling)
				}

				getAllFollowingSiblings(sibling, outResult)
			}
		}
	}

	def EObject nextOuterContext(EObject element) {
		val parent = element?.eContainer
		switch (parent) {
			Conditional: return parent
			FirstTime: return parent
			Defaults: return parent
			PartingLines: return parent
			Dialog: return parent
			Hub: return parent
			ChoiceDialog: return parent
			ConditionalChoiceDialog: return parent
			//			OtherwiseChoice: return parent
			default: return parent?.nextOuterContext
		}
	}
}
