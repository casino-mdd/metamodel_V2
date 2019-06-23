/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.DomainMetamodel;
import UnifiedMetamodel_.RelationDom;
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
 * An implementation of the model object '<em><b>Domain Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.DomainMetamodelImpl#getModule <em>Module</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.DomainMetamodelImpl#getRelationdom <em>Relationdom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainMetamodelImpl extends MinimalEObjectImpl.Container implements DomainMetamodel {
	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected EList<UnifiedMetamodel_.Module> module;

	/**
	 * The cached value of the '{@link #getRelationdom() <em>Relationdom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationdom()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationDom> relationdom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainMetamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.DOMAIN_METAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnifiedMetamodel_.Module> getModule() {
		if (module == null) {
			module = new EObjectContainmentEList<UnifiedMetamodel_.Module>(UnifiedMetamodel_.Module.class, this, UnifiedMetamodel_Package.DOMAIN_METAMODEL__MODULE);
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelationDom> getRelationdom() {
		if (relationdom == null) {
			relationdom = new EObjectContainmentEList<RelationDom>(RelationDom.class, this, UnifiedMetamodel_Package.DOMAIN_METAMODEL__RELATIONDOM);
		}
		return relationdom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnifiedMetamodel_Package.DOMAIN_METAMODEL__MODULE:
				return ((InternalEList<?>)getModule()).basicRemove(otherEnd, msgs);
			case UnifiedMetamodel_Package.DOMAIN_METAMODEL__RELATIONDOM:
				return ((InternalEList<?>)getRelationdom()).basicRemove(otherEnd, msgs);
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
			case UnifiedMetamodel_Package.DOMAIN_METAMODEL__MODULE:
				return getModule();
			case UnifiedMetamodel_Package.DOMAIN_METAMODEL__RELATIONDOM:
				return getRelationdom();
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
			case UnifiedMetamodel_Package.DOMAIN_METAMODEL__MODULE:
				getModule().clear();
				getModule().addAll((Collection<? extends UnifiedMetamodel_.Module>)newValue);
				return;
			case UnifiedMetamodel_Package.DOMAIN_METAMODEL__RELATIONDOM:
				getRelationdom().clear();
				getRelationdom().addAll((Collection<? extends RelationDom>)newValue);
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
			case UnifiedMetamodel_Package.DOMAIN_METAMODEL__MODULE:
				getModule().clear();
				return;
			case UnifiedMetamodel_Package.DOMAIN_METAMODEL__RELATIONDOM:
				getRelationdom().clear();
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
			case UnifiedMetamodel_Package.DOMAIN_METAMODEL__MODULE:
				return module != null && !module.isEmpty();
			case UnifiedMetamodel_Package.DOMAIN_METAMODEL__RELATIONDOM:
				return relationdom != null && !relationdom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainMetamodelImpl
