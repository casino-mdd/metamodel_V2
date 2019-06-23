/**
 */
package UnifiedMetamodel_.tests;

import UnifiedMetamodel_.UnifiedMetamodel_Factory;
import UnifiedMetamodel_.Visualizer;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Visualizer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizerTest extends UIFrontTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VisualizerTest.class);
	}

	/**
	 * Constructs a new Visualizer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Visualizer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Visualizer getFixture() {
		return (Visualizer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UnifiedMetamodel_Factory.eINSTANCE.createVisualizer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //VisualizerTest
