/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.DomainMetamodel#getModule <em>Module</em>}</li>
 *   <li>{@link UnifiedMetamodel_.DomainMetamodel#getRelationdom <em>Relationdom</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getDomainMetamodel()
 * @model
 * @generated
 */
public interface DomainMetamodel extends EObject {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getDomainMetamodel_Module()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<UnifiedMetamodel_.Module> getModule();

	/**
	 * Returns the value of the '<em><b>Relationdom</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.RelationDom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationdom</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getDomainMetamodel_Relationdom()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RelationDom> getRelationdom();

} // DomainMetamodel
