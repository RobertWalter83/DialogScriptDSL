package de.unidue.ecg.dialogScript.ui.editor.templates;

import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContextType;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContextTypeRegistry;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class TerminalRuleAwareTemplateContextTypeRegistry extends XtextTemplateContextTypeRegistry {
  @Inject
  public TerminalRuleAwareTemplateContextTypeRegistry(final IGrammarAccess grammarAccess, final Provider<XtextTemplateContextType> ctxTypeProvider, final ContextTypeIdHelper helper) {
    super(grammarAccess, ctxTypeProvider, helper);
  }
  
  protected void registerContextTypes(final IGrammarAccess grammarAccess, final Provider<XtextTemplateContextType> ctxTypeProvider) {
    super.registerContextTypes(grammarAccess, ctxTypeProvider);
    Grammar _grammar = grammarAccess.getGrammar();
    final List<TerminalRule> terminalRules = GrammarUtil.allTerminalRules(_grammar);
    final ArrayList<XtextTemplateContextType> allContextTypes = CollectionLiterals.<XtextTemplateContextType>newArrayList();
    final Procedure1<TerminalRule> _function = new Procedure1<TerminalRule>() {
      public void apply(final TerminalRule it) {
        XtextTemplateContextType type = ctxTypeProvider.get();
        String _name = it.getName();
        type.setName(_name);
        String _id = TerminalRuleAwareTemplateContextTypeRegistry.this.getId(it);
        type.setId(_id);
        allContextTypes.add(type);
      }
    };
    IterableExtensions.<TerminalRule>forEach(terminalRules, _function);
    Collections.<XtextTemplateContextType>sort(allContextTypes);
    final Procedure1<XtextTemplateContextType> _function_1 = new Procedure1<XtextTemplateContextType>() {
      public void apply(final XtextTemplateContextType it) {
        TerminalRuleAwareTemplateContextTypeRegistry.this.addContextType(it);
      }
    };
    IterableExtensions.<XtextTemplateContextType>forEach(allContextTypes, _function_1);
  }
  
  public final String getId(final TerminalRule rule) {
    Grammar _grammar = GrammarUtil.getGrammar(rule);
    String _name = _grammar.getName();
    String _plus = (_name + ".");
    String _name_1 = rule.getName();
    String _plus_1 = (_plus + _name_1);
    return _plus_1;
  }
}
