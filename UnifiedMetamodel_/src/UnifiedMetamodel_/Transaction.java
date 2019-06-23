/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.Transaction#getOperates_on <em>Operates on</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Operates on</b></em>' reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.GeneralEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operates on</em>' reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getTransaction_Operates_on()
	 * @model required="true"
	 * @generated
	 */
	EList<GeneralEntity> getOperates_on();

} // Transaction
