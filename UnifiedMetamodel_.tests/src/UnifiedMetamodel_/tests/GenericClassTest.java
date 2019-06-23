/**
 */
package UnifiedMetamodel_.tests;

import UnifiedMetamodel_.GenericClass;
import UnifiedMetamodel_.UnifiedMetamodel_Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generic Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericClassTest extends EClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GenericClassTest.class);
	}

	/**
	 * Constructs a new Generic Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Generic Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GenericClass getFixture() {
		return (GenericClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UnifiedMetamodel_Factory.eINSTANCE.createGenericClass());
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

} //GenericClassTest
