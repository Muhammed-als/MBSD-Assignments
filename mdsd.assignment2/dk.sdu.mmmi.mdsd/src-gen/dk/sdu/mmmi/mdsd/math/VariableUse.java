/**
 * generated by Xtext 2.38.0
 */
package dk.sdu.mmmi.mdsd.math;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.VariableUse#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getVariableUse()
 * @model
 * @generated
 */
public interface VariableUse extends Primary
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(MathExp)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getVariableUse_Ref()
   * @model
   * @generated
   */
  MathExp getRef();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.VariableUse#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(MathExp value);

} // VariableUse
