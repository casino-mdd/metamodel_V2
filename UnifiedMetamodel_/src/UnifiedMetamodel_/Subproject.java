/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subproject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.Subproject#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Subproject#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Subproject#getPackage <em>Package</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Subproject#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getSubproject()
 * @model
 * @generated
 */
public interface Subproject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getSubproject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Subproject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Descriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getSubproject_Descriptor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Descriptor> getDescriptor();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Epackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getSubproject_Package()
	 * @model containment="true"
	 * @generated
	 */
	EList<Epackage> getPackage();

	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Library}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getSubproject_Library()
	 * @model containment="true"
	 * @generated
	 */
	EList<Library> getLibrary();

} // Subproject
