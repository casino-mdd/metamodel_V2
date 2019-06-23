/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.Annotation;
import UnifiedMetamodel_.EClass;
import UnifiedMetamodel_.MethodBack;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Back</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.MethodBackImpl#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.MethodBackImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.MethodBackImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.MethodBackImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodBackImpl extends MinimalEObjectImpl.Container implements MethodBack {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The cached value of the '{@link #getReturn() <em>Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected EClass return_;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodBackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.eclipse.emf.ecore.EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.METHOD_BACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.METHOD_BACK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation getAnnotation() {
		if (annotation != null && annotation.eIsProxy()) {
			InternalEObject oldAnnotation = (InternalEObject)annotation;
			annotation = (Annotation)eResolveProxy(oldAnnotation);
			if (annotation != oldAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnifiedMetamodel_Package.METHOD_BACK__ANNOTATION, oldAnnotation, annotation));
			}
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation basicGetAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotation(Annotation newAnnotation) {
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.METHOD_BACK__ANNOTATION, oldAnnotation, annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturn() {
		if (return_ != null && return_.eIsProxy()) {
			InternalEObject oldReturn = (InternalEObject)return_;
			return_ = (EClass)eResolveProxy(oldReturn);
			if (return_ != oldReturn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnifiedMetamodel_Package.METHOD_BACK__RETURN, oldReturn, return_));
			}
		}
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetReturn() {
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturn(EClass newReturn) {
		EClass oldReturn = return_;
		return_ = newReturn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.METHOD_BACK__RETURN, oldReturn, return_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClass> getArguments() {
		if (arguments == null) {
			arguments = new EObjectResolvingEList<EClass>(EClass.class, this, UnifiedMetamodel_Package.METHOD_BACK__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnifiedMetamodel_Package.METHOD_BACK__NAME:
				return getName();
			case UnifiedMetamodel_Package.METHOD_BACK__ANNOTATION:
				if (resolve) return getAnnotation();
				return basicGetAnnotation();
			case UnifiedMetamodel_Package.METHOD_BACK__RETURN:
				if (resolve) return getReturn();
				return basicGetReturn();
			case UnifiedMetamodel_Package.METHOD_BACK__ARGUMENTS:
				return getArguments();
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
			case UnifiedMetamodel_Package.METHOD_BACK__NAME:
				setName((String)newValue);
				return;
			case UnifiedMetamodel_Package.METHOD_BACK__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case UnifiedMetamodel_Package.METHOD_BACK__RETURN:
				setReturn((EClass)newValue);
				return;
			case UnifiedMetamodel_Package.METHOD_BACK__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends EClass>)newValue);
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
			case UnifiedMetamodel_Package.METHOD_BACK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UnifiedMetamodel_Package.METHOD_BACK__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case UnifiedMetamodel_Package.METHOD_BACK__RETURN:
				setReturn((EClass)null);
				return;
			case UnifiedMetamodel_Package.METHOD_BACK__ARGUMENTS:
				getArguments().clear();
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
			case UnifiedMetamodel_Package.METHOD_BACK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UnifiedMetamodel_Package.METHOD_BACK__ANNOTATION:
				return annotation != null;
			case UnifiedMetamodel_Package.METHOD_BACK__RETURN:
				return return_ != null;
			case UnifiedMetamodel_Package.METHOD_BACK__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MethodBackImpl
