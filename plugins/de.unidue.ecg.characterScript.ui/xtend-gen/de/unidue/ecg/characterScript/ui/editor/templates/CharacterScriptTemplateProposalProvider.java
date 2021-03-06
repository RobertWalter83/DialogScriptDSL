package de.unidue.ecg.characterScript.ui.editor.templates;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import de.unidue.ecg.characterScript.characterScript.AttributeType;
import de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage;
import de.unidue.ecg.characterScript.characterScript.CustomAttribute;
import de.unidue.ecg.characterScript.characterScript.CustomAttributeName;
import de.unidue.ecg.characterScript.characterScript.EnumValue;
import de.unidue.ecg.characterScript.services.CharacterScriptGrammarAccess;
import de.unidue.ecg.characterScript.util.DefaultAttributeHelper;
import de.unidue.ecg.characterScript.util.LanguageUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateAcceptor;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class CharacterScriptTemplateProposalProvider extends DefaultTemplateProposalProvider {
  private ContextTypeIdHelper helper = ((ContextTypeIdHelper) null);
  
  private int numberTemplateCounter = 0;
  
  @Inject
  private CharacterScriptGrammarAccess grammarAccess;
  
  @Inject
  public CharacterScriptTemplateProposalProvider(final TemplateStore templateStore, final ContextTypeRegistry registry, final ContextTypeIdHelper helper) {
    super(templateStore, registry, helper);
    this.helper = helper;
  }
  
  protected void createTemplates(final TemplateContext templateContext, final ContentAssistContext context, final ITemplateAcceptor acceptor) {
    super.createTemplates(templateContext, context, acceptor);
    this.numberTemplateCounter = 0;
    if ((templateContext instanceof XtextTemplateContext)) {
      final XtextTemplateContext xTemplateContext = ((XtextTemplateContext) templateContext);
      ParserRule _characterRule = this.grammarAccess.getCharacterRule();
      final String id = this.helper.getId(_characterRule);
      TemplateContextType _contextType = xTemplateContext.getContextType();
      String _id = _contextType.getId();
      boolean _equals = _id.equals(id);
      if (_equals) {
        EObject _currentModel = context.getCurrentModel();
        boolean _notEquals = (!Objects.equal(_currentModel, null));
        if (_notEquals) {
          final IScopeProvider scopProvider = xTemplateContext.getScopeProvider();
          EObject _currentModel_1 = context.getCurrentModel();
          final IScope scope = scopProvider.getScope(_currentModel_1, 
            CharacterScriptPackage.Literals.CHARACTER__TEMPLATE);
          final ArrayList<Template> templates = CollectionLiterals.<Template>newArrayList();
          Iterable<IEObjectDescription> _allElements = scope.getAllElements();
          final Procedure1<IEObjectDescription> _function = new Procedure1<IEObjectDescription>() {
            public void apply(final IEObjectDescription it) {
              EObject _eObjectOrProxy = it.getEObjectOrProxy();
              XtextResource _resource = context.getResource();
              ResourceSet _resourceSet = _resource.getResourceSet();
              final EObject resolved = EcoreUtil2.resolve(_eObjectOrProxy, _resourceSet);
              if ((resolved instanceof de.unidue.ecg.characterScript.characterScript.Template)) {
                final de.unidue.ecg.characterScript.characterScript.Template source = ((de.unidue.ecg.characterScript.characterScript.Template) resolved);
                Template _createDynamicTemplate = CharacterScriptTemplateProposalProvider.this.createDynamicTemplate(source);
                templates.add(_createDynamicTemplate);
              }
            }
          };
          IterableExtensions.<IEObjectDescription>forEach(_allElements, _function);
          final Procedure1<Template> _function_1 = new Procedure1<Template>() {
            public void apply(final Template it) {
              Image _image = CharacterScriptTemplateProposalProvider.this.getImage(it);
              int _relevance = CharacterScriptTemplateProposalProvider.this.getRelevance(it);
              final TemplateProposal proposal = CharacterScriptTemplateProposalProvider.this.createProposal(it, templateContext, context, _image, _relevance);
              acceptor.accept(proposal);
            }
          };
          IterableExtensions.<Template>forEach(templates, _function_1);
        }
      }
    }
  }
  
  public Template createDynamicTemplate(final de.unidue.ecg.characterScript.characterScript.Template source) {
    String _name = source.getName();
    String _plus = ("template: " + _name);
    String _name_1 = source.getName();
    String _plus_1 = ("insert character template for " + _name_1);
    String _name_2 = source.getName();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("character ${name} uses ");
    String _name_3 = source.getName();
    _builder.append(_name_3, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("// default attributes ");
    _builder.newLine();
    _builder.append("\t");
    String _createDefaultTemplateEntries = this.createDefaultTemplateEntries();
    _builder.append(_createDefaultTemplateEntries, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("// template attributes");
    _builder.newLine();
    {
      EList<CustomAttribute> _customs = source.getCustoms();
      for(final CustomAttribute c : _customs) {
        _builder.append("\t");
        String _createCustomTemplateEntry = this.createCustomTemplateEntry(c);
        _builder.append(_createCustomTemplateEntry, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("end");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("${cursor}");
    _builder.newLine();
    Template _template = new Template(_plus, _plus_1, _name_2, _builder.toString(), 
      true);
    return _template;
  }
  
  public String createCustomTemplateEntry(final CustomAttribute attribute) {
    String result = "";
    CustomAttributeName _caName = attribute.getCaName();
    String _name = _caName.getName();
    String _plus = (result + _name);
    String _plus_1 = (_plus + " ");
    result = _plus_1;
    String _createCustomValueTemplateExpression = this.createCustomValueTemplateExpression(attribute);
    String _plus_2 = (result + _createCustomValueTemplateExpression);
    String _plus_3 = (_plus_2 + " ");
    result = _plus_3;
    return result;
  }
  
  public String createCustomValueTemplateExpression(final CustomAttribute attribute) {
    EList<EnumValue> _enumValues = attribute.getEnumValues();
    boolean _isEmpty = _enumValues.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<EnumValue> _enumValues_1 = attribute.getEnumValues();
      EnumValue _get = null;
      if (_enumValues_1!=null) {
        _get=_enumValues_1.get(0);
      }
      String _name = _get.getName();
      String _plus = ("(${" + _name);
      return (_plus + ":Enum(\'value\')})");
    }
    AttributeType _type = attribute.getType();
    String _name_1 = _type.getName();
    final String _switchValue = _name_1;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"NUMBER")) {
        _matched=true;
        int _numberTemplateCounter = this.numberTemplateCounter = (this.numberTemplateCounter + 1);
        String _plus_1 = ("${" + Integer.valueOf(_numberTemplateCounter));
        return (_plus_1 + "}");
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"TEXT")) {
        _matched=true;
        CustomAttributeName _caName = attribute.getCaName();
        String _name_2 = _caName.getName();
        String _replaceAll = _name_2.replaceAll("\\s+", "");
        String _plus_2 = ("\"${" + _replaceAll);
        return (_plus_2 + "Value}\"");
      }
    }
    return null;
  }
  
  public String createDefaultTemplateEntries() {
    String _xblockexpression = null;
    {
      HashMap<String,DefaultAttributeHelper> _defaultAttributes = LanguageUtil.getDefaultAttributes();
      final Collection<DefaultAttributeHelper> defaults = _defaultAttributes.values();
      String result = "";
      for (final DefaultAttributeHelper v : defaults) {
        {
          String _name = v.getName();
          String _plus = (result + _name);
          String _plus_1 = (_plus + " ");
          result = _plus_1;
          String _createDefaultValueTemplateExpression = this.createDefaultValueTemplateExpression(v);
          String _plus_2 = (result + _createDefaultValueTemplateExpression);
          String _plus_3 = (_plus_2 + "\n");
          result = _plus_3;
        }
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public String createDefaultValueTemplateExpression(final DefaultAttributeHelper helper) {
    String _type = helper.getType();
    final String _switchValue = _type;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,"NUMBER")) {
        _matched=true;
        int _numberTemplateCounter = this.numberTemplateCounter = (this.numberTemplateCounter + 1);
        String _plus = ("${" + Integer.valueOf(_numberTemplateCounter));
        return (_plus + "}");
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"TEXT")) {
        _matched=true;
        String _name = helper.getName();
        String _replaceAll = _name.replaceAll("\\s+", "");
        String _plus_1 = ("\"${" + _replaceAll);
        return (_plus_1 + "Value}\"");
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,"ENUM")) {
        _matched=true;
        String _name_1 = helper.getName();
        boolean _equals = _name_1.equals("sex");
        if (_equals) {
          return "${female:Enum(\'CharaSex\')}";
        } else {
          String _name_2 = helper.getName();
          boolean _equals_1 = _name_2.equals("type");
          if (_equals_1) {
            return "${PC:Enum(\'CharaType\')}";
          }
        }
      }
    }
    return null;
  }
}
