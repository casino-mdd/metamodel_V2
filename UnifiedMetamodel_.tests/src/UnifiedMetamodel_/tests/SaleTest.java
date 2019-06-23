/**
 */
package UnifiedMetamodel_.tests;

import UnifiedMetamodel_.Sale;
import UnifiedMetamodel_.UnifiedMetamodel_Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sale</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SaleTest extends TransactionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SaleTest.class);
	}

	/**
	 * Constructs a new Sale test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Sale getFixture() {
		return (Sale)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UnifiedMetamodel_Factory.eINSTANCE.createSale());
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

} //SaleTest
