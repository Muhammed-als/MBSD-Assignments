/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.VarRef#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVarRef()
 * @model
 * @generated
 */
public interface VarRef extends Value
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(VarDef)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVarRef_Ref()
   * @model
   * @generated
   */
  VarDef getRef();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.VarRef#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(VarDef value);

} // VarRef
