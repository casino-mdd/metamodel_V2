/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.Entity;
import UnifiedMetamodel_.Operations;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.OperationsImpl#getOperates_on <em>Operates on</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationsImpl extends MinimalEObjectImpl.Container implements Operations {
	/**
	 * The cached value of the '{@link #getOperates_on() <em>Operates on</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperates_on()
	 * @generated
	 * @ordered
	 */
	protected Entity operates_on;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.OPERATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getOperates_on() {
		if (operates_on != null && operates_on.eIsProxy()) {
			InternalEObject oldOperates_on = (InternalEObject)operates_on;
			operates_on = (Entity)eResolveProxy(oldOperates_on);
			if (operates_on != oldOperates_on) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnifiedMetamodel_Package.OPERATIONS__OPERATES_ON, oldOperates_on, operates_on));
			}
		}
		return operates_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetOperates_on() {
		return operates_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperates_on(Entity newOperates_on) {
		Entity oldOperates_on = operates_on;
		operates_on = newOperates_on;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.OPERATIONS__OPERATES_ON, oldOperates_on, operates_on));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnifiedMetamodel_Package.OPERATIONS__OPERATES_ON:
				if (resolve) return getOperates_on();
				return basicGetOperates_on();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UnifiedMetamodel_Package.OPERATIONS__OPERATES_ON:
				setOperates_on((Entity)newValue);
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
			case UnifiedMetamodel_Package.OPERATIONS__OPERATES_ON:
				setOperates_on((Entity)null);
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
			case UnifiedMetamodel_Package.OPERATIONS__OPERATES_ON:
				return operates_on != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationsImpl
