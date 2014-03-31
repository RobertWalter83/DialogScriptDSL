package de.unidue.ecg.dialogScript.ui.graph.providers

import de.unidue.ecg.dialogScript.dialogScript.Conditional
import de.unidue.ecg.dialogScript.dialogScript.Dialog
import de.unidue.ecg.dialogScript.dialogScript.DialogLine
import de.unidue.ecg.dialogScript.dialogScript.Otherwise
import org.eclipse.emf.ecore.EObject
import org.eclipse.gef4.zest.core.viewers.IGraphEntityContentProvider
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.xtext.EcoreUtil2
import java.util.List
import de.unidue.ecg.dialogScript.dialogScript.Scene
import de.unidue.ecg.dialogScript.dialogScript.FirstTime
import de.unidue.ecg.dialogScript.dialogScript.Defaults
import de.unidue.ecg.dialogScript.dialogScript.PartingLines

class GraphNodeContentProvider extends ArrayContentProvider implements IGraphEntityContentProvider {

	override getConnectedTo(Object entity) {
		if (entity != null) {
			return getNodeModelChildren(entity)
		}
		return null
	}

	dispatch def Object[] getNodeModelChildren(Object in) {
		null
	}

	dispatch def Object[] getNodeModelChildren(Scene in) {
		val result = newArrayList()
		var foundSth = false
		if(in.dialog?.defaults != null) {
			result.add(in.dialog.defaults)
			foundSth = true
		} else if (in.dialog?.firstTime != null) {
			result.add(in.dialog.firstTime)
			foundSth = true
		}
		
		if(!foundSth) {
			result.add(in.dialog?.recursives.head)
			return result
		}
		else {
			return result
		}
	}
	
	dispatch def Object[] getNodeModelChildren(Defaults in) {
		return newArrayList(in.body?.statements?.head)
	}
	
	dispatch def Object[] getNodeModelChildren(FirstTime in) {
		val result = newArrayList()

		// get the first element of this body
		result.add(in.body?.statements?.head)

		// add all first elements of this "level"
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
			val innerConditionals = allSiblings.filter(Conditional)

			for (EObject t : allSiblings) {
				if (needsSibling) {
					switch (t) {
						DialogLine: {
							sibling = t
							needsSibling = false
						}
						Conditional: {
							val ^else = t.otherwiseList.findFirst[it.conditionList == null]
							if (^else != null) {
								needsSibling = false
							}
						}
					}
				} 
			}

			if (!innerConditionals.empty)
				result.addAll(innerConditionals)
			if (sibling != null)
				result.add(sibling)
		}

		if (needsSibling) { // we are at the end of a block and need to look for outer siblings
			result.add(getFirstFollowingSiblingsRec(in))
			return result
		}

		return result
	}

	def EObject getFirstFollowingSiblingsRec(EObject in) {
		var conditionalContext = in.nextOuterConditional
		if (conditionalContext == null)
			return null // we are at the end of a scene!
			
		var EObject result;
		
		switch(conditionalContext) {
			Dialog: { // we are at a dialogline on the very top level of a scene with no siblings (conditionals or dialog lines)
				// so the only valid chance to have siblings is a parting statement
				return conditionalContext.partingLines
			}
			Defaults: {
				val dialog = conditionalContext.eContainer as Dialog
				if(dialog.firstTime != null) {
					result = dialog.firstTime
				} else if(dialog.recursives.empty && dialog.partingLines != null) {
					result = dialog.partingLines
				} else {
					result = dialog.recursives?.head
				}
			}
			FirstTime: {
				val dialog = conditionalContext.eContainer as Dialog
				if(dialog.recursives.empty && dialog.partingLines != null) {
					result = dialog.partingLines
				} else {
					result = dialog.recursives?.head
				}
			}
			Conditional:
				result = EcoreUtil2.getNextSibling(conditionalContext)
			PartingLines: {
				// end of a scene
				return null
			}
		}		

		if (result == null) {
			return getFirstFollowingSiblingsRec(conditionalContext)
		} else {
			return result
		}
	}

	def void getAllFollowingSiblings(EObject object, List<EObject> result) {
		if (object != null) {
			val sibling = EcoreUtil2.getNextSibling(object)

			if (sibling != null) {
				result.add(sibling)
				getAllFollowingSiblings(sibling, result)
			}
		}
	}
	
	dispatch def EObject getChildren(DialogLine sibling) {
		return sibling
	}

	dispatch def EObject getChildren(Conditional sibling) {
		return sibling
	}

	def EObject nextOuterConditional(EObject element) {
		val parent = element?.eContainer
		switch (parent) {
			Conditional: return parent
			FirstTime: return parent
			Defaults: return parent
			PartingLines: return parent
			Dialog: return parent
			default: return parent?.nextOuterConditional
		}
	}

	def Object getNextDialogLine(EObject parent) {
		EcoreUtil2.getNextSibling(parent)
	}

	def Object getNextDialogLine(Dialog parent) {
		EcoreUtil2.getNextSibling(parent)
	}

	def Object getNextDialogLine(Conditional parent) {
		EcoreUtil2.getNextSibling(parent)
	}

	def Object getNextDialogLine(Otherwise parent) {
		EcoreUtil2.getNextSibling(parent.eContainer)
	}

}
