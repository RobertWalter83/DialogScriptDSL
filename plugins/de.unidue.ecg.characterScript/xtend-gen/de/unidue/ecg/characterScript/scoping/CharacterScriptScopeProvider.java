package de.unidue.ecg.characterScript.scoping;

import com.google.common.base.Objects;
import de.unidue.ecg.characterScript.characterScript.Characters;
import de.unidue.ecg.characterScript.characterScript.CustomAttribute;
import de.unidue.ecg.characterScript.characterScript.CustomAttributeName;
import de.unidue.ecg.characterScript.characterScript.CustomProperty;
import de.unidue.ecg.characterScript.characterScript.Customs;
import de.unidue.ecg.characterScript.characterScript.EnumValue;
import de.unidue.ecg.characterScript.characterScript.Template;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

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
        Customs _customs_1 = ((Characters) root).getCustoms();
        EList<CustomAttribute> _customAttributes = _customs_1.getCustomAttributes();
        final Function1<CustomAttribute,CustomAttributeName> _function_1 = new Function1<CustomAttribute,CustomAttributeName>() {
          public CustomAttributeName apply(final CustomAttribute it) {
            CustomAttributeName _caName = it.getCaName();
            return _caName;
          }
        };
        List<CustomAttributeName> _map_1 = ListExtensions.<CustomAttribute, CustomAttributeName>map(_customAttributes, _function_1);
        IScope _scopeFor_1 = Scopes.scopeFor(_map_1);
        _xblockexpression = (_scopeFor_1);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public IScope scope_CustomProperty_enumValue(final CustomProperty cp, final EReference eReference) {
    IScope _xblockexpression = null;
    {
      EObject _eContainer = cp.eContainer();
      final de.unidue.ecg.characterScript.characterScript.Character character = ((de.unidue.ecg.characterScript.characterScript.Character) _eContainer);
      IScope _xifexpression = null;
      Template _template = character.getTemplate();
      boolean _notEquals = (!Objects.equal(_template, null));
      if (_notEquals) {
        IScope _xblockexpression_1 = null;
        {
          Template _template_1 = character.getTemplate();
          final EList<CustomAttribute> customs = _template_1.getCustoms();
          final ArrayList<EnumValue> result = CollectionLiterals.<EnumValue>newArrayList();
          final Procedure1<CustomAttribute> _function = new Procedure1<CustomAttribute>() {
            public void apply(final CustomAttribute it) {
              EList<EnumValue> _enumValues = it.getEnumValues();
              final Procedure1<EnumValue> _function = new Procedure1<EnumValue>() {
                public void apply(final EnumValue enumValue) {
                  CustomAttributeName _customAttributeRef = cp.getCustomAttributeRef();
                  EObject _eContainer = _customAttributeRef.eContainer();
                  final CustomAttribute ca = ((CustomAttribute) _eContainer);
                  EList<EnumValue> _enumValues = ca.getEnumValues();
                  boolean _contains = _enumValues.contains(enumValue);
                  if (_contains) {
                    result.add(enumValue);
                  }
                }
              };
              IterableExtensions.<EnumValue>forEach(_enumValues, _function);
            }
          };
          IterableExtensions.<CustomAttribute>forEach(customs, _function);
          IScope _scopeFor = Scopes.scopeFor(result);
          _xblockexpression_1 = (_scopeFor);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
}
