/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.Directory;
import UnifiedMetamodel_.Functionality;
import UnifiedMetamodel_.ModuleFront;
import UnifiedMetamodel_.ReactApp;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>React App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.ReactAppImpl#getFunctionalities <em>Functionalities</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.ReactAppImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.ReactAppImpl#getDirectories <em>Directories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactAppImpl extends MinimalEObjectImpl.Container implements ReactApp {
	/**
	 * The cached value of the '{@link #getFunctionalities() <em>Functionalities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalities()
	 * @generated
	 * @ordered
	 */
	protected EList<Functionality> functionalities;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleFront> modules;

	/**
	 * The cached value of the '{@link #getDirectories() <em>Directories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectories()
	 * @generated
	 * @ordered
	 */
	protected EList<Directory> directories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.REACT_APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Functionality> getFunctionalities() {
		if (functionalities == null) {
			functionalities = new EObjectContainmentEList<Functionality>(Functionality.class, this, UnifiedMetamodel_Package.REACT_APP__FUNCTIONALITIES);
		}
		return functionalities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModuleFront> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentEList<ModuleFront>(ModuleFront.class, this, UnifiedMetamodel_Package.REACT_APP__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Directory> getDirectories() {
		if (directories == null) {
			directories = new EObjectContainmentEList<Directory>(Directory.class, this, UnifiedMetamodel_Package.REACT_APP__DIRECTORIES);
		}
		return directories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnifiedMetamodel_Package.REACT_APP__FUNCTIONALITIES:
				return ((InternalEList<?>)getFunctionalities()).basicRemove(otherEnd, msgs);
			case UnifiedMetamodel_Package.REACT_APP__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case UnifiedMetamodel_Package.REACT_APP__DIRECTORIES:
				return ((InternalEList<?>)getDirectories()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnifiedMetamodel_Package.REACT_APP__FUNCTIONALITIES:
				return getFunctionalities();
			case UnifiedMetamodel_Package.REACT_APP__MODULES:
				return getModules();
			case UnifiedMetamodel_Package.REACT_APP__DIRECTORIES:
				return getDirectories();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UnifiedMetamodel_Package.REACT_APP__FUNCTIONALITIES:
				getFunctionalities().clear();
				getFunctionalities().addAll((Collection<? extends Functionality>)newValue);
				return;
			case UnifiedMetamodel_Package.REACT_APP__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends ModuleFront>)newValue);
				return;
			case UnifiedMetamodel_Package.REACT_APP__DIRECTORIES:
				getDirectories().clear();
				getDirectories().addAll((Collection<? extends Directory>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UnifiedMetamodel_Package.REACT_APP__FUNCTIONALITIES:
				getFunctionalities().clear();
				return;
			case UnifiedMetamodel_Package.REACT_APP__MODULES:
				getModules().clear();
				return;
			case UnifiedMetamodel_Package.REACT_APP__DIRECTORIES:
				getDirectories().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UnifiedMetamodel_Package.REACT_APP__FUNCTIONALITIES:
				return functionalities != null && !functionalities.isEmpty();
			case UnifiedMetamodel_Package.REACT_APP__MODULES:
				return modules != null && !modules.isEmpty();
			case UnifiedMetamodel_Package.REACT_APP__DIRECTORIES:
				return directories != null && !directories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReactAppImpl
