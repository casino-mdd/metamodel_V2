/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arquitecture Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.ArquitectureMetamodel#getComponents <em>Components</em>}</li>
 *   <li>{@link UnifiedMetamodel_.ArquitectureMetamodel#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getArquitectureMetamodel()
 * @model
 * @generated
 */
public interface ArquitectureMetamodel extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getArquitectureMetamodel_Components()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.RelationArch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getArquitectureMetamodel_Relations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RelationArch> getRelations();

} // ArquitectureMetamodel
