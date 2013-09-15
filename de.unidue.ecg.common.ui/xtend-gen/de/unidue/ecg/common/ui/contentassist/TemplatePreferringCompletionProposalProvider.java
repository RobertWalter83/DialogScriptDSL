package de.unidue.ecg.common.ui.contentassist;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalComparator;
import org.eclipse.xtext.ui.editor.quickfix.QuickAssistCompletionProposal;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class TemplatePreferringCompletionProposalProvider implements ICompletionProposalComparator {
  private final static Integer PREMIUM_RELEVANCE = ((Integer) Integer.valueOf(2));
  
  private final static Integer HIGH_RELEVANCE = ((Integer) Integer.valueOf(1));
  
  private final static Integer MEDIUM_RELEVANCE = ((Integer) Integer.valueOf(0));
  
  private final static int LOW_RELEVANCE = new Function0<Integer>() {
    public Integer apply() {
      int _minus = (-(((Integer) Integer.valueOf(1))).intValue());
      return _minus;
    }
  }.apply();
  
  public int compare(final ICompletionProposal o1, final ICompletionProposal o2) {
    Integer _relevance = this.getRelevance(o1);
    Integer relevance1 = ((Integer) _relevance);
    Integer _relevance_1 = this.getRelevance(o2);
    Integer relevance2 = ((Integer) _relevance_1);
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(relevance1, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(relevance2, null));
      _and = (_notEquals && _notEquals_1);
    }
    if (_and) {
      final int res = relevance2.compareTo(relevance1);
      boolean _notEquals_2 = (res != 0);
      if (_notEquals_2) {
        return res;
      }
    }
    String _displayString = o1.getDisplayString();
    String _displayString_1 = o2.getDisplayString();
    return _displayString.compareTo(_displayString_1);
  }
  
  protected Integer _getRelevance(final TemplateProposal proposal) {
    Integer _xifexpression = null;
    String _displayString = proposal.getDisplayString();
    boolean _startsWith = _displayString.startsWith("template: ");
    if (_startsWith) {
      _xifexpression = TemplatePreferringCompletionProposalProvider.PREMIUM_RELEVANCE;
    } else {
      _xifexpression = TemplatePreferringCompletionProposalProvider.HIGH_RELEVANCE;
    }
    return _xifexpression;
  }
  
  protected Integer _getRelevance(final ConfigurableCompletionProposal proposal) {
    return TemplatePreferringCompletionProposalProvider.MEDIUM_RELEVANCE;
  }
  
  protected Integer _getRelevance(final QuickAssistCompletionProposal proposal) {
    return TemplatePreferringCompletionProposalProvider.LOW_RELEVANCE;
  }
  
  protected Integer _getRelevance(final Object o) {
    return null;
  }
  
  public Integer getRelevance(final Object proposal) {
    if (proposal instanceof TemplateProposal) {
      return _getRelevance((TemplateProposal)proposal);
    } else if (proposal instanceof ConfigurableCompletionProposal) {
      return _getRelevance((ConfigurableCompletionProposal)proposal);
    } else if (proposal instanceof QuickAssistCompletionProposal) {
      return _getRelevance((QuickAssistCompletionProposal)proposal);
    } else if (proposal != null) {
      return _getRelevance(proposal);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(proposal).toString());
    }
  }
}
