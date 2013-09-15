/**
 */
package de.unidue.ecg.dialogScript.dialogScript;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Modifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.unidue.ecg.dialogScript.dialogScript.DialogScriptPackage#getModifier()
 * @model
 * @generated
 */
public enum Modifier implements Enumerator
{
  /**
   * The '<em><b>Single</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SINGLE_VALUE
   * @generated
   * @ordered
   */
  SINGLE(0, "single", "single"),

  /**
   * The '<em><b>Random</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RANDOM_VALUE
   * @generated
   * @ordered
   */
  RANDOM(1, "random", "random");

  /**
   * The '<em><b>Single</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Single</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SINGLE
   * @model name="single"
   * @generated
   * @ordered
   */
  public static final int SINGLE_VALUE = 0;

  /**
   * The '<em><b>Random</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Random</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RANDOM
   * @model name="random"
   * @generated
   * @ordered
   */
  public static final int RANDOM_VALUE = 1;

  /**
   * An array of all the '<em><b>Modifier</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Modifier[] VALUES_ARRAY =
    new Modifier[]
    {
      SINGLE,
      RANDOM,
    };

  /**
   * A public read-only list of all the '<em><b>Modifier</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Modifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Modifier</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Modifier get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Modifier result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Modifier</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Modifier getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Modifier result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Modifier</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Modifier get(int value)
  {
    switch (value)
    {
      case SINGLE_VALUE: return SINGLE;
      case RANDOM_VALUE: return RANDOM;
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
  private Modifier(int value, String name, String literal)
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
  
} //Modifier
