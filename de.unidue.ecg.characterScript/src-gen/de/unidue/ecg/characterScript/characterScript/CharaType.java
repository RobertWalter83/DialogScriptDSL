/**
 */
package de.unidue.ecg.characterScript.characterScript;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Chara Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.unidue.ecg.characterScript.characterScript.CharacterScriptPackage#getCharaType()
 * @model
 * @generated
 */
public enum CharaType implements Enumerator
{
  /**
   * The '<em><b>PC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PC_VALUE
   * @generated
   * @ordered
   */
  PC(0, "PC", "PC"),

  /**
   * The '<em><b>NPC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NPC_VALUE
   * @generated
   * @ordered
   */
  NPC(1, "NPC", "NPC");

  /**
   * The '<em><b>PC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PC
   * @model
   * @generated
   * @ordered
   */
  public static final int PC_VALUE = 0;

  /**
   * The '<em><b>NPC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NPC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NPC
   * @model
   * @generated
   * @ordered
   */
  public static final int NPC_VALUE = 1;

  /**
   * An array of all the '<em><b>Chara Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final CharaType[] VALUES_ARRAY =
    new CharaType[]
    {
      PC,
      NPC,
    };

  /**
   * A public read-only list of all the '<em><b>Chara Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<CharaType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Chara Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CharaType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CharaType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Chara Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CharaType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CharaType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Chara Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CharaType get(int value)
  {
    switch (value)
    {
      case PC_VALUE: return PC;
      case NPC_VALUE: return NPC;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private CharaType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //CharaType
