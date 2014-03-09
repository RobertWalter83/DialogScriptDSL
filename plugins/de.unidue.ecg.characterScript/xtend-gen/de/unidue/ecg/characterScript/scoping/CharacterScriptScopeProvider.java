package de.unidue.ecg.characterScript.scoping;

import com.google.common.base.Objects;
import de.unidue.ecg.characterScript.characterScript.Characters;
import de.unidue.ecg.characterScript.characterScript.CustomAttribute;
import de.unidue.ecg.characterScript.characterScript.CustomAttributeName;
import de.unidue.ecg.characterScript.characterScript.CustomProperty;
import de.unidue.ecg.characterScript.characterScript.EnumValue;
import de.unidue.ecg.characterScript.characterScript.Globals;
import de.unidue.ecg.characterScript.characterScript.Template;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CharacterScriptScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_CustomProperty_customAttributeRef(final de.unidue.ecg.characterScript.characterScript.Character character, final EReference eReference) {
    IScope _xifexpression = null;
    Template _template = character.getTemplate();
    boolean _notEquals = (!Objects.equal(_template, null));
    if (_notEquals) {
      Template _template_1 = character.getTemplate();
      EList<CustomAttribute> _customs = _template_1.getCustoms();
      final Function1<CustomAttribute,CustomAttributeName> _function = new Function1<CustomAttribute,CustomAttributeName>() {
        public CustomAttributeName apply(final CustomAttribute it) {
          CustomAttributeName _caName = it.getCaName();
          return _caName;
        }
      };
      List<CustomAttributeName> _map = ListExtensions.<CustomAttribute, CustomAttributeName>map(_customs, _function);
      IScope _scopeFor = Scopes.scopeFor(_map);
      _xifexpression = _scopeFor;
    } else {
      IScope _xblockexpression = null;
      {
        EObject root = character;
        boolean _dowhile = false;
        do {
          EObject _eContainer = root.eContainer();
          root = _eContainer;
          EObject _eContainer_1 = root.eContainer();
          boolean _notEquals_1 = (!Objects.equal(_eContainer_1, null));
          _dowhile = _notEquals_1;
        } while(_dowhile);
        final Characters characters = ((Characters) root);
        final Globals globals = characters.getGlobals();
        IScope _xifexpression_1 = null;
        boolean _notEquals_2 = (!Objects.equal(globals, null));
        if (_notEquals_2) {
          EList<CustomAttribute> _customs_1 = globals.getCustoms();
          final Function1<CustomAttribute,CustomAttributeName> _function_1 = new Function1<CustomAttribute,CustomAttributeName>() {
            public CustomAttributeName apply(final CustomAttribute it) {
              CustomAttributeName _caName = it.getCaName();
              return _caName;
            }
          };
          List<CustomAttributeName> _map_1 = ListExtensions.<CustomAttribute, CustomAttributeName>map(_customs_1, _function_1);
          return Scopes.scopeFor(_map_1);
        } else {
          _xifexpression_1 = IScope.NULLSCOPE;
        }
        _xblockexpression = (_xifexpression_1);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public IScope scope_CustomProperty_enumValue(final CustomProperty cp, final EReference eReference) {
    CustomAttributeName _customAttributeRef = cp.getCustomAttributeRef();
    EObject _eContainer = _customAttributeRef.eContainer();
    EList<EnumValue> _enumValues = ((CustomAttribute) _eContainer).getEnumValues();
    IScope _scopeFor = Scopes.scopeFor(_enumValues);
    return _scopeFor;
  }
}
