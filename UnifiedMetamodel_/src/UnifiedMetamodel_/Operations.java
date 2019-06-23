/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.Operations#getOperates_on <em>Operates on</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getOperations()
 * @model
 * @generated
 */
public interface Operations extends EObject {
	/**
	 * Returns the value of the '<em><b>Operates on</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operates on</em>' reference.
	 * @see #setOperates_on(Entity)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getOperations_Operates_on()
	 * @model required="true"
	 * @generated
	 */
	Entity getOperates_on();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Operations#getOperates_on <em>Operates on</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operates on</em>' reference.
	 * @see #getOperates_on()
	 * @generated
	 */
	void setOperates_on(Entity value);

} // Operations
