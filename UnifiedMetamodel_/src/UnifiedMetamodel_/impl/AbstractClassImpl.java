/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.AbstractClass;
import UnifiedMetamodel_.AbstractMethod;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.AbstractClassImpl#getAbstractmethod <em>Abstractmethod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractClassImpl extends EClassImpl implements AbstractClass {
	/**
	 * The cached value of the '{@link #getAbstractmethod() <em>Abstractmethod</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractmethod()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethod> abstractmethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.ABSTRACT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractMethod> getAbstractmethod() {
		if (abstractmethod == null) {
			abstractmethod = new EObjectContainmentEList<AbstractMethod>(AbstractMethod.class, this, UnifiedMetamodel_Package.ABSTRACT_CLASS__ABSTRACTMETHOD);
		}
		return abstractmethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnifiedMetamodel_Package.ABSTRACT_CLASS__ABSTRACTMETHOD:
				return ((InternalEList<?>)getAbstractmethod()).basicRemove(otherEnd, msgs);
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
			case UnifiedMetamodel_Package.ABSTRACT_CLASS__ABSTRACTMETHOD:
				return getAbstractmethod();
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
			case UnifiedMetamodel_Package.ABSTRACT_CLASS__ABSTRACTMETHOD:
				getAbstractmethod().clear();
				getAbstractmethod().addAll((Collection<? extends AbstractMethod>)newValue);
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
			case UnifiedMetamodel_Package.ABSTRACT_CLASS__ABSTRACTMETHOD:
				getAbstractmethod().clear();
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
			case UnifiedMetamodel_Package.ABSTRACT_CLASS__ABSTRACTMETHOD:
				return abstractmethod != null && !abstractmethod.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractClassImpl
