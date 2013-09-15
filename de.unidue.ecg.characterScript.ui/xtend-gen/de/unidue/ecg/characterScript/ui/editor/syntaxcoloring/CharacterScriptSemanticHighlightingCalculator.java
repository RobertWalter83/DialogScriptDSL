package de.unidue.ecg.characterScript.ui.editor.syntaxcoloring;

import com.google.common.base.Objects;
import de.unidue.ecg.characterScript.characterScript.CustomAttribute;
import de.unidue.ecg.characterScript.characterScript.CustomAttributeName;
import de.unidue.ecg.characterScript.characterScript.Property;
import de.unidue.ecg.characterScript.characterScript.Template;
import de.unidue.ecg.characterScript.ui.editor.syntaxcoloring.CharacterScriptHighlightingConfiguration;
import de.unidue.ecg.characterScript.util.DefaultAttributeHelper;
import de.unidue.ecg.characterScript.util.LanguageUtil;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
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
public class CharacterScriptSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {
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
        EObject _semanticElement = it.getSemanticElement();
        if ((_semanticElement instanceof Property)) {
          EObject _grammarElement = it.getGrammarElement();
          boolean _filterForCrossReferencedEnumValues = CharacterScriptSemanticHighlightingCalculator.this.filterForCrossReferencedEnumValues(_grammarElement);
          if (_filterForCrossReferencedEnumValues) {
            int _offset = it.getOffset();
            int _length = it.getLength();
            acceptor.addPosition(_offset, _length, CharacterScriptHighlightingConfiguration.FEATURE_KEYWORD);
          } else {
            EObject _grammarElement_1 = it.getGrammarElement();
            if ((_grammarElement_1 instanceof RuleCall)) {
              EObject _grammarElement_2 = it.getGrammarElement();
              final AbstractRule rule = ((RuleCall) _grammarElement_2).getRule();
              boolean _or = false;
              boolean _and = false;
              if (!(rule instanceof TerminalRule)) {
                _and = false;
              } else {
                boolean _or_1 = false;
                String _name = rule.getName();
                boolean _equals = _name.equals("STRING");
                if (_equals) {
                  _or_1 = true;
                } else {
                  String _name_1 = rule.getName();
                  boolean _equals_1 = _name_1.equals("INT");
                  _or_1 = (_equals || _equals_1);
                }
                _and = ((rule instanceof TerminalRule) && _or_1);
              }
              if (_and) {
                _or = true;
              } else {
                _or = (_and || 
                  (rule instanceof EnumRule));
              }
              if (_or) {
                int _offset_1 = it.getOffset();
                int _length_1 = it.getLength();
                acceptor.addPosition(_offset_1, _length_1, CharacterScriptHighlightingConfiguration.DEFAULT_ID);
              }
            }
          }
        } else {
          boolean _and_1 = false;
          ICompositeNode _parent = it.getParent();
          EObject _semanticElement_1 = null;
          if (_parent!=null) {
            _semanticElement_1=_parent.getSemanticElement();
          }
          if (!(_semanticElement_1 instanceof Template)) {
            _and_1 = false;
          } else {
            EObject _grammarElement_3 = it.getGrammarElement();
            _and_1 = ((_semanticElement_1 instanceof Template) && (_grammarElement_3 instanceof Keyword));
          }
          if (_and_1) {
            EObject _grammarElement_4 = it.getGrammarElement();
            final Keyword keyword = ((Keyword) _grammarElement_4);
            HashMap<String,DefaultAttributeHelper> _defaultAttributes = LanguageUtil.getDefaultAttributes();
            String _value = keyword.getValue();
            DefaultAttributeHelper _get = _defaultAttributes.get(_value);
            boolean _notEquals = (!Objects.equal(_get, null));
            if (_notEquals) {
              int _offset_2 = it.getOffset();
              int _length_2 = it.getLength();
              acceptor.addPosition(_offset_2, _length_2, CharacterScriptHighlightingConfiguration.FEATURE_KEYWORD);
            }
          } else {
            EObject _semanticElement_2 = it.getSemanticElement();
            if ((_semanticElement_2 instanceof CustomAttributeName)) {
              EObject _grammarElement_5 = it.getGrammarElement();
              if ((_grammarElement_5 instanceof RuleCall)) {
                EObject _grammarElement_6 = it.getGrammarElement();
                final AbstractRule rule_1 = ((RuleCall) _grammarElement_6).getRule();
                String _name_2 = rule_1.getName();
                boolean _equals_2 = _name_2.equals("ID");
                if (_equals_2) {
                  int _offset_3 = it.getOffset();
                  int _length_3 = it.getLength();
                  acceptor.addPosition(_offset_3, _length_3, CharacterScriptHighlightingConfiguration.FEATURE_KEYWORD);
                }
              }
            } else {
              EObject _semanticElement_3 = it.getSemanticElement();
              if ((_semanticElement_3 instanceof CustomAttribute)) {
                EObject _grammarElement_7 = it.getGrammarElement();
                if ((_grammarElement_7 instanceof RuleCall)) {
                  EObject _grammarElement_8 = it.getGrammarElement();
                  final AbstractRule rule_2 = ((RuleCall) _grammarElement_8).getRule();
                  String _name_3 = rule_2.getName();
                  boolean _equals_3 = _name_3.equals("AttributeType");
                  if (_equals_3) {
                    int _offset_4 = it.getOffset();
                    int _length_4 = it.getLength();
                    acceptor.addPosition(_offset_4, _length_4, CharacterScriptHighlightingConfiguration.DEFAULT_ID);
                  }
                }
              }
            }
          }
        }
      }
    };
    IterableExtensions.<INode>forEach(_asTreeIterable, _function);
  }
  
  private boolean _filterForCrossReferencedEnumValues(final EObject obj) {
    return false;
  }
  
  private boolean _filterForCrossReferencedEnumValues(final Keyword kw) {
    return true;
  }
  
  private boolean _filterForCrossReferencedEnumValues(final CrossReference cr) {
    EObject _eContainer = cr.eContainer();
    if ((_eContainer instanceof Assignment)) {
      EObject _eContainer_1 = cr.eContainer();
      final Assignment assignment = ((Assignment) _eContainer_1);
      final String feature = assignment.getFeature();
      boolean _equals = feature.equals("enumValue");
      if (_equals) {
        return false;
      }
    }
    return true;
  }
  
  private boolean filterForCrossReferencedEnumValues(final EObject cr) {
    if (cr instanceof CrossReference) {
      return _filterForCrossReferencedEnumValues((CrossReference)cr);
    } else if (cr instanceof Keyword) {
      return _filterForCrossReferencedEnumValues((Keyword)cr);
    } else if (cr != null) {
      return _filterForCrossReferencedEnumValues(cr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(cr).toString());
    }
  }
}
