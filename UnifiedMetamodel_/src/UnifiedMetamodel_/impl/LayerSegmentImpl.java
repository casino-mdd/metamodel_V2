/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.LayerSegment;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.LayerSegmentImpl#getAllowToUse <em>Allow To Use</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.LayerSegmentImpl#getLayersegment <em>Layersegment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerSegmentImpl extends MinimalEObjectImpl.Container implements LayerSegment {
	/**
	 * The cached value of the '{@link #getAllowToUse() <em>Allow To Use</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowToUse()
	 * @generated
	 * @ordered
	 */
	protected EList<LayerSegment> allowToUse;

	/**
	 * The cached value of the '{@link #getLayersegment() <em>Layersegment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayersegment()
	 * @generated
	 * @ordered
	 */
	protected EList<LayerSegment> layersegment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.LAYER_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LayerSegment> getAllowToUse() {
		if (allowToUse == null) {
			allowToUse = new EObjectResolvingEList<LayerSegment>(LayerSegment.class, this, UnifiedMetamodel_Package.LAYER_SEGMENT__ALLOW_TO_USE);
		}
		return allowToUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LayerSegment> getLayersegment() {
		if (layersegment == null) {
			layersegment = new EObjectContainmentEList<LayerSegment>(LayerSegment.class, this, UnifiedMetamodel_Package.LAYER_SEGMENT__LAYERSEGMENT);
		}
		return layersegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnifiedMetamodel_Package.LAYER_SEGMENT__LAYERSEGMENT:
				return ((InternalEList<?>)getLayersegment()).basicRemove(otherEnd, msgs);
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
			case UnifiedMetamodel_Package.LAYER_SEGMENT__ALLOW_TO_USE:
				return getAllowToUse();
			case UnifiedMetamodel_Package.LAYER_SEGMENT__LAYERSEGMENT:
				return getLayersegment();
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
			case UnifiedMetamodel_Package.LAYER_SEGMENT__ALLOW_TO_USE:
				getAllowToUse().clear();
				getAllowToUse().addAll((Collection<? extends LayerSegment>)newValue);
				return;
			case UnifiedMetamodel_Package.LAYER_SEGMENT__LAYERSEGMENT:
				getLayersegment().clear();
				getLayersegment().addAll((Collection<? extends LayerSegment>)newValue);
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
			case UnifiedMetamodel_Package.LAYER_SEGMENT__ALLOW_TO_USE:
				getAllowToUse().clear();
				return;
			case UnifiedMetamodel_Package.LAYER_SEGMENT__LAYERSEGMENT:
				getLayersegment().clear();
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
			case UnifiedMetamodel_Package.LAYER_SEGMENT__ALLOW_TO_USE:
				return allowToUse != null && !allowToUse.isEmpty();
			case UnifiedMetamodel_Package.LAYER_SEGMENT__LAYERSEGMENT:
				return layersegment != null && !layersegment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LayerSegmentImpl
