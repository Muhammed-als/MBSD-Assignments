/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mdsd.math;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mdsd.math.LetBinding#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.xtext.example.mdsd.math.LetBinding#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mdsd.math.MathPackage#getLetBinding()
 * @model
 * @generated
 */
public interface LetBinding extends Expression, Binding
{
  /**
   * Returns the value of the '<em><b>Binding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binding</em>' containment reference.
   * @see #setBinding(Expression)
   * @see org.xtext.example.mdsd.math.MathPackage#getLetBinding_Binding()
   * @model containment="true"
   * @generated
   */
  Expression getBinding();

  /**
   * Sets the value of the '{@link org.xtext.example.mdsd.math.LetBinding#getBinding <em>Binding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binding</em>' containment reference.
   * @see #getBinding()
   * @generated
   */
  void setBinding(Expression value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Expression)
   * @see org.xtext.example.mdsd.math.MathPackage#getLetBinding_Body()
   * @model containment="true"
   * @generated
   */
  Expression getBody();

  /**
   * Sets the value of the '{@link org.xtext.example.mdsd.math.LetBinding#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Expression value);

} // LetBinding
