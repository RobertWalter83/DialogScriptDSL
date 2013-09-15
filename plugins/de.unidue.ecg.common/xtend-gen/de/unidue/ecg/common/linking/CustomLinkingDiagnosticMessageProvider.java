package de.unidue.ecg.common.linking;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider.ILinkingDiagnosticContext;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.linking.impl.LinkingDiagnosticMessageProvider;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class CustomLinkingDiagnosticMessageProvider extends LinkingDiagnosticMessageProvider {
  public DiagnosticMessage getUnresolvedProxyMessage(final ILinkingDiagnosticContext context) {
    EReference _reference = context.getReference();
    final EClass referenceType = _reference.getEReferenceType();
    String linkText = "";
    try {
      String _linkText = context.getLinkText();
      linkText = _linkText;
    } catch (final Throwable _t) {
      if (_t instanceof IllegalNodeException) {
        final IllegalNodeException e = (IllegalNodeException)_t;
        INode _node = e.getNode();
        String _text = _node.getText();
        linkText = _text;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    String _name = referenceType.getName();
    String _plus = ("Couldn\'t resolve reference to " + _name);
    String _plus_1 = (_plus + " \'");
    String _plus_2 = (_plus_1 + linkText);
    final String msg = (_plus_2 + "\'.");
    String _name_1 = referenceType.getName();
    DiagnosticMessage _diagnosticMessage = new DiagnosticMessage(msg, Severity.ERROR, Diagnostic.LINKING_DIAGNOSTIC, _name_1, linkText);
    return _diagnosticMessage;
  }
  
  /**
   * Method for Linking diagnostics which contain the EClass name and the link
   * text as user data.
   * 
   * @param issue
   * @param eClassifier
   * @return
   */
  public String getLinkText(final Issue issue, final EClassifier eClassifier) {
    boolean _or = false;
    String[] _data = issue.getData();
    boolean _equals = Objects.equal(_data, null);
    if (_equals) {
      _or = true;
    } else {
      String[] _data_1 = issue.getData();
      int _length = _data_1.length;
      boolean _lessThan = (_length < 2);
      _or = (_equals || _lessThan);
    }
    if (_or) {
      return null;
    }
    String[] _data_2 = issue.getData();
    final String refClass = _data_2[0];
    String[] _data_3 = issue.getData();
    final String linkText = _data_3[1];
    boolean _or_1 = false;
    boolean _isEmpty = Strings.isEmpty(linkText);
    if (_isEmpty) {
      _or_1 = true;
    } else {
      boolean _isEmpty_1 = Strings.isEmpty(refClass);
      _or_1 = (_isEmpty || _isEmpty_1);
    }
    if (_or_1) {
      return null;
    }
    String _name = eClassifier.getName();
    boolean _equals_1 = refClass.equals(_name);
    if (_equals_1) {
      return linkText;
    }
    return null;
  }
}
