/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.ArquitectureMetamodel;
import UnifiedMetamodel_.Component;
import UnifiedMetamodel_.RelationArch;
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
 * An implementation of the model object '<em><b>Arquitecture Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.ArquitectureMetamodelImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.ArquitectureMetamodelImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArquitectureMetamodelImpl extends MinimalEObjectImpl.Container implements ArquitectureMetamodel {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationArch> relations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArquitectureMetamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.ARQUITECTURE_METAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, UnifiedMetamodel_Package.ARQUITECTURE_METAMODEL__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelationArch> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<RelationArch>(RelationArch.class, this, UnifiedMetamodel_Package.ARQUITECTURE_METAMODEL__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnifiedMetamodel_Package.ARQUITECTURE_METAMODEL__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case UnifiedMetamodel_Package.ARQUITECTURE_METAMODEL__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
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
			case UnifiedMetamodel_Package.ARQUITECTURE_METAMODEL__COMPONENTS:
				return getComponents();
			case UnifiedMetamodel_Package.ARQUITECTURE_METAMODEL__RELATIONS:
				return getRelations();
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
			case UnifiedMetamodel_Package.ARQUITECTURE_METAMODEL__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case UnifiedMetamodel_Package.ARQUITECTURE_METAMODEL__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends RelationArch>)newValue);
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
			case UnifiedMetamodel_Package.ARQUITECTURE_METAMODEL__COMPONENTS:
				getComponents().clear();
				return;
			case UnifiedMetamodel_Package.ARQUITECTURE_METAMODEL__RELATIONS:
				getRelations().clear();
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
			case UnifiedMetamodel_Package.ARQUITECTURE_METAMODEL__COMPONENTS:
				return components != null && !components.isEmpty();
			case UnifiedMetamodel_Package.ARQUITECTURE_METAMODEL__RELATIONS:
				return relations != null && !relations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArquitectureMetamodelImpl
