package de.unidue.ecg.dialogScript.ui.editor.syntaxcoloring;

import com.google.common.base.Objects;
import de.unidue.ecg.dialogScript.dialogScript.ChoiceDialog;
import de.unidue.ecg.dialogScript.dialogScript.Hub;
import de.unidue.ecg.dialogScript.dialogScript.Scene;
import de.unidue.ecg.dialogScript.ui.editor.syntaxcoloring.DialogScriptHighlightingConfiguration;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.BidiTreeIterable;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class DialogScriptSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {
  public void provideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor) {
    boolean _or = false;
    boolean _equals = Objects.equal(resource, null);
    if (_equals) {
      _or = true;
    } else {
      IParseResult _parseResult = resource.getParseResult();
      boolean _equals_1 = Objects.equal(_parseResult, null);
      _or = (_equals || _equals_1);
    }
    if (_or) {
      return;
    }
    IParseResult _parseResult_1 = resource.getParseResult();
    final ICompositeNode root = _parseResult_1.getRootNode();
    BidiTreeIterable<INode> _asTreeIterable = root.getAsTreeIterable();
    final Procedure1<INode> _function = new Procedure1<INode>() {
      public void apply(final INode it) {
        final EObject grammarElement = it.getGrammarElement();
        boolean _matched = false;
        if (!_matched) {
          if (grammarElement instanceof RuleCall) {
            final RuleCall _ruleCall = (RuleCall)grammarElement;
            _matched=true;
            final AbstractRule rule = _ruleCall.getRule();
            String _name = rule.getName();
            final String _switchValue = _name;
            boolean _matched_1 = false;
            if (!_matched_1) {
              if (Objects.equal(_switchValue,"COMMENT")) {
                _matched_1=true;
                int _offset = it.getOffset();
                int _length = it.getLength();
                acceptor.addPosition(_offset, _length, DialogScriptHighlightingConfiguration.MY_COMMENT_ID);
              }
            }
            if (!_matched_1) {
              if (Objects.equal(_switchValue,"StringID")) {
                _matched_1=true;
                ICompositeNode _parent = it.getParent();
                EObject _semanticElement = _parent.getSemanticElement();
                if ((_semanticElement instanceof Scene)) {
                  int _offset_1 = it.getOffset();
                  int _length_1 = it.getLength();
                  acceptor.addPosition(_offset_1, _length_1, DialogScriptHighlightingConfiguration.SCENE_NAME);
                } else {
                  boolean _or = false;
                  ICompositeNode _parent_1 = it.getParent();
                  EObject _semanticElement_1 = _parent_1.getSemanticElement();
                  if ((_semanticElement_1 instanceof Hub)) {
                    _or = true;
                  } else {
                    ICompositeNode _parent_2 = it.getParent();
                    EObject _semanticElement_2 = _parent_2.getSemanticElement();
                    _or = ((_semanticElement_1 instanceof Hub) || (_semanticElement_2 instanceof ChoiceDialog));
                  }
                  if (_or) {
                    int _offset_2 = it.getOffset();
                    int _length_2 = it.getLength();
                    acceptor.addPosition(_offset_2, _length_2, DialogScriptHighlightingConfiguration.HUB_NAME);
                  }
                }
              }
            }
            if (!_matched_1) {
              if (Objects.equal(_switchValue,"StringLiteral")) {
                _matched_1=true;
                int _offset_3 = it.getOffset();
                int _length_3 = it.getLength();
                acceptor.addPosition(_offset_3, _length_3, DialogScriptHighlightingConfiguration.STRING_LITERAL);
              }
            }
          }
        }
        if (!_matched) {
          if (grammarElement instanceof CrossReference) {
            final CrossReference _crossReference = (CrossReference)grammarElement;
            _matched=true;
            int _offset = it.getOffset();
            int _length = it.getLength();
            acceptor.addPosition(_offset, _length, DialogScriptHighlightingConfiguration.CROSSREF_STRING);
          }
        }
      }
    };
    IterableExtensions.<INode>forEach(_asTreeIterable, _function);
  }
}
