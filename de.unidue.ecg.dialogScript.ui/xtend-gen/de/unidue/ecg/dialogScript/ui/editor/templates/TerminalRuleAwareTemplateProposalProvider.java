package de.unidue.ecg.dialogScript.ui.editor.templates;

import com.google.inject.Inject;
import de.unidue.ecg.dialogScript.ui.editor.templates.TerminalRuleAwareFollowElementAcceptor;
import java.util.Collection;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.xtext.ui.editor.contentassist.IFollowElementAcceptor;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;

@SuppressWarnings("all")
public final class TerminalRuleAwareTemplateProposalProvider extends DefaultTemplateProposalProvider {
  protected final ContextTypeRegistry registry;
  
  protected final ContextTypeIdHelper helper;
  
  @Inject
  public TerminalRuleAwareTemplateProposalProvider(final TemplateStore templateStoreArg, final ContextTypeRegistry registryArg, final ContextTypeIdHelper helperArg) {
    super(templateStoreArg, registryArg, helperArg);
    this.registry = registryArg;
    this.helper = helperArg;
  }
  
  protected IFollowElementAcceptor createFollowElementAcceptor(final Collection<TemplateContextType> result) {
    TerminalRuleAwareFollowElementAcceptor _terminalRuleAwareFollowElementAcceptor = new TerminalRuleAwareFollowElementAcceptor(result, this);
    return _terminalRuleAwareFollowElementAcceptor;
  }
}
