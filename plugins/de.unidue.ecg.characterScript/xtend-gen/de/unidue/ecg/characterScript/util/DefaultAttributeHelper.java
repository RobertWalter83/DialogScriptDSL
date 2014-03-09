package de.unidue.ecg.characterScript.util;

import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class DefaultAttributeHelper {
  private String _name;
  
  public String getName() {
    return this._name;
  }
  
  public void setName(final String name) {
    this._name = name;
  }
  
  private String _type;
  
  public String getType() {
    return this._type;
  }
  
  public void setType(final String type) {
    this._type = type;
  }
  
  private EClass _eClass;
  
  public EClass getEClass() {
    return this._eClass;
  }
  
  public void setEClass(final EClass eClass) {
    this._eClass = eClass;
  }
  
  public DefaultAttributeHelper(final String name, final String type, final EClass eClass) {
    this.setName(name);
    this.setType(type);
    this.setEClass(eClass);
  }
}
