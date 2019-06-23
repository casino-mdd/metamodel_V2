/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Back</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.MethodBack#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.MethodBack#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link UnifiedMetamodel_.MethodBack#getReturn <em>Return</em>}</li>
 *   <li>{@link UnifiedMetamodel_.MethodBack#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getMethodBack()
 * @model
 * @generated
 */
public interface MethodBack extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getMethodBack_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.MethodBack#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' reference.
	 * @see #setAnnotation(Annotation)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getMethodBack_Annotation()
	 * @model
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.MethodBack#getAnnotation <em>Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' reference.
	 * @see #setReturn(EClass)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getMethodBack_Return()
	 * @model
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.MethodBack#getReturn <em>Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(EClass value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getMethodBack_Arguments()
	 * @model
	 * @generated
	 */
	EList<EClass> getArguments();

} // MethodBack
