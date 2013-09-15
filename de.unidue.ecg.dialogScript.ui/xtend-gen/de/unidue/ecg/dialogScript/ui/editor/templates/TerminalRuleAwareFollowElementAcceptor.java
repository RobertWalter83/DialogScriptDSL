package de.unidue.ecg.dialogScript.ui.editor.templates;

import com.google.common.base.Objects;
import de.unidue.ecg.dialogScript.ui.editor.templates.TerminalRuleAwareTemplateProposalProvider;
import java.util.Collection;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.ui.editor.contentassist.IFollowElementAcceptor;
import org.eclipse.xtext.util.XtextSwitch;

@SuppressWarnings("all")
public class TerminalRuleAwareFollowElementAcceptor extends XtextSwitch<Boolean> implements IFollowElementAcceptor {
  private TerminalRuleAwareTemplateProposalProvider provider;
  
  private Collection<TemplateContextType> result;
  
  public TerminalRuleAwareFollowElementAcceptor(final Collection<TemplateContextType> resultArg, final TerminalRuleAwareTemplateProposalProvider providerArg) {
    this.result = resultArg;
    this.provider = providerArg;
  }
  
  public Boolean defaultCase(final EObject object) {
    return Boolean.TRUE;
  }
  
  public Boolean caseKeyword(final Keyword object) {
    Boolean _xblockexpression = null;
    {
      this.addContextType(object);
      Boolean _defaultCase = this.defaultCase(object);
      _xblockexpression = (_defaultCase);
    }
    return _xblockexpression;
  }
  
  public Boolean caseRuleCall(final RuleCall object) {
    Boolean _xblockexpression = null;
    {
      AbstractRule _rule = object.getRule();
      this.doSwitch(_rule);
      Boolean _defaultCase = this.defaultCase(object);
      _xblockexpression = (_defaultCase);
    }
    return _xblockexpression;
  }
  
  public Boolean caseParserRule(final ParserRule object) {
    Boolean _xblockexpression = null;
    {
      this.addContextType(object);
      Boolean _defaultCase = this.defaultCase(object);
      _xblockexpression = (_defaultCase);
    }
    return _xblockexpression;
  }
  
  public Boolean caseAssignment(final Assignment object) {
    Boolean _xblockexpression = null;
    {
      AbstractElement _terminal = object.getTerminal();
      this.accept(_terminal);
      Boolean _defaultCase = this.defaultCase(object);
      _xblockexpression = (_defaultCase);
    }
    return _xblockexpression;
  }
  
  public void accept(final AbstractElement element) {
    this.doSwitch(element);
  }
  
  public Boolean caseTerminalRule(final TerminalRule object) {
    Boolean _xblockexpression = null;
    {
      this.addContextType(object);
      Boolean _defaultCase = this.defaultCase(object);
      _xblockexpression = (_defaultCase);
    }
    return _xblockexpression;
  }
  
  public Boolean addContextType(final ParserRule rule) {
    String _id = this.provider.helper.getId(rule);
    Boolean _addContextType = this.addContextType(_id);
    return _addContextType;
  }
  
  public Boolean addContextType(final Keyword keyword) {
    String _id = this.provider.helper.getId(keyword);
    Boolean _addContextType = this.addContextType(_id);
    return _addContextType;
  }
  
  public Boolean addContextType(final String id) {
    Boolean _xblockexpression = null;
    {
      final TemplateContextType contextType = this.provider.registry.getContextType(id);
      Boolean _xifexpression = null;
      boolean _notEquals = (!Objects.equal(contextType, null));
      if (_notEquals) {
        boolean _add = this.result.add(contextType);
        _xifexpression = Boolean.valueOf(_add);
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public Boolean addContextType(final TerminalRule rule) {
    Grammar _grammar = GrammarUtil.getGrammar(rule);
    String _name = _grammar.getName();
    String _plus = (_name + ".");
    String _name_1 = rule.getName();
    String _plus_1 = (_plus + _name_1);
    Boolean _addContextType = this.addContextType(_plus_1);
    return _addContextType;
  }
}
