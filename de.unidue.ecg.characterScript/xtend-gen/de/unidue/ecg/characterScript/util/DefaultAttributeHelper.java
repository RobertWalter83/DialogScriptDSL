package de.unidue.ecg.characterScript.util;

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
  
  public DefaultAttributeHelper(final String name, final String type) {
    this.setName(name);
    this.setType(type);
  }
}
