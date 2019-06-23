/**
 */
package UnifiedMetamodel_.tests;

import UnifiedMetamodel_.UnifiedMetamodel_Factory;
import UnifiedMetamodel_.War;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>War</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WarTest extends LayerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WarTest.class);
	}

	/**
	 * Constructs a new War test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this War test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected War getFixture() {
		return (War)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UnifiedMetamodel_Factory.eINSTANCE.createWar());
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

} //WarTest
