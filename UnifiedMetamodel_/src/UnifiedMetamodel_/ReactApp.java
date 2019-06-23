/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>React App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.ReactApp#getFunctionalities <em>Functionalities</em>}</li>
 *   <li>{@link UnifiedMetamodel_.ReactApp#getModules <em>Modules</em>}</li>
 *   <li>{@link UnifiedMetamodel_.ReactApp#getDirectories <em>Directories</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getReactApp()
 * @model
 * @generated
 */
public interface ReactApp extends EObject {
	/**
	 * Returns the value of the '<em><b>Functionalities</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Functionality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionalities</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getReactApp_Functionalities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Functionality> getFunctionalities();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.ModuleFront}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getReactApp_Modules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ModuleFront> getModules();

	/**
	 * Returns the value of the '<em><b>Directories</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Directory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directories</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getReactApp_Directories()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Directory> getDirectories();

} // ReactApp
