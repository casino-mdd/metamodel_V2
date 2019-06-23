/**
 */
package UnifiedMetamodel_.tests;

import UnifiedMetamodel_.Ejb;
import UnifiedMetamodel_.UnifiedMetamodel_Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ejb</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EjbTest extends LayerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EjbTest.class);
	}

	/**
	 * Constructs a new Ejb test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ejb test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Ejb getFixture() {
		return (Ejb)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UnifiedMetamodel_Factory.eINSTANCE.createEjb());
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

} //EjbTest
