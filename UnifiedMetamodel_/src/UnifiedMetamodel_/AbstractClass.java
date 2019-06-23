/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.AbstractClass#getAbstractmethod <em>Abstractmethod</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getAbstractClass()
 * @model
 * @generated
 */
public interface AbstractClass extends EClass {

	/**
	 * Returns the value of the '<em><b>Abstractmethod</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.AbstractMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstractmethod</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getAbstractClass_Abstractmethod()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractMethod> getAbstractmethod();
} // AbstractClass
