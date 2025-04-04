/**
 * generated by Xtext 2.38.0
 */
package dk.sdu.mmmi.mdsd.math;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.Plus#getLeft <em>Left</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.Plus#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getPlus()
 * @model
 * @generated
 */
public interface Plus extends Exp
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Exp)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getPlus_Left()
   * @model containment="true"
   * @generated
   */
  Exp getLeft();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.Plus#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Exp value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Exp)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getPlus_Right()
   * @model containment="true"
   * @generated
   */
  Exp getRight();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.Plus#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Exp value);

} // Plus
