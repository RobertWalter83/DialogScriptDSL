package de.unidue.ecg.common.linking

import org.eclipse.xtext.linking.impl.LinkingDiagnosticMessageProvider
import org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider.ILinkingDiagnosticContext
import org.eclipse.xtext.linking.impl.IllegalNodeException
import org.eclipse.xtext.diagnostics.DiagnosticMessage
import org.eclipse.xtext.diagnostics.Severity
import org.eclipse.xtext.diagnostics.Diagnostic
import org.eclipse.xtext.validation.Issue
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.xtext.util.Strings

class CustomLinkingDiagnosticMessageProvider extends LinkingDiagnosticMessageProvider {

	override def getUnresolvedProxyMessage(ILinkingDiagnosticContext context) {

		val referenceType = context.reference.EReferenceType
		var linkText = ""
		try {
			linkText = context.linkText
		} catch (IllegalNodeException e) {
			linkText = e.getNode().getText();
		}
		val msg = "Couldn't resolve reference to " + referenceType.name + " '" + linkText + "'."
		return new DiagnosticMessage(msg, Severity.ERROR, Diagnostic.LINKING_DIAGNOSTIC, referenceType.name,
			linkText)
	}

	/**
	 * Method for Linking diagnostics which contain the EClass name and the link
	 * text as user data.
	 * 
	 * @param issue
	 * @param eClassifier
	 * @return
	 */
	def getLinkText(Issue issue, EClassifier eClassifier) {
		if (issue.data == null || issue.data.length < 2) {
			return null
		}
		val refClass = issue.data.get(0)
		val linkText = issue.data.get(1)
		
		if (Strings.isEmpty(linkText) || Strings.isEmpty(refClass)) {
			return null
		}
		if (refClass.equals(eClassifier.name)) {
			return linkText
		}
		return null
	}
}
