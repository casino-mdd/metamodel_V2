/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.LayerSegment#getAllowToUse <em>Allow To Use</em>}</li>
 *   <li>{@link UnifiedMetamodel_.LayerSegment#getSublayersegment <em>Sublayersegment</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getLayerSegment()
 * @model
 * @generated
 */
public interface LayerSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Allow To Use</b></em>' reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.LayerSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow To Use</em>' reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getLayerSegment_AllowToUse()
	 * @model
	 * @generated
	 */
	EList<LayerSegment> getAllowToUse();

	/**
	 * Returns the value of the '<em><b>Sublayersegment</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.SubLayerSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sublayersegment</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getLayerSegment_Sublayersegment()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubLayerSegment> getSublayersegment();

} // LayerSegment
