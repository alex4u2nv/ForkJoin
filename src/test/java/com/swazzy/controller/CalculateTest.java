package com.swazzy.controller;

import com.swazzy.service.Calculator;
import com.swazzy.service.DataService;
import com.swazzy.service.impl.DefaultCalculator;
import com.swazzy.service.impl.DefaultDataService;
import junit.framework.*;

/**
 * The class <code>CalculateTest</code> contains tests for the class <code>{@link Calculate}</code>.
 *
 * @generatedBy CodePro at 9/25/13 6:54 PM, using the Spring generator
 * @author Alex
 * @version $Revision: 1.0 $
 */
public class CalculateTest extends TestCase {
	/**
	 * Run the Calculate() constructor test.
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	public void testCalculate_1()
		throws Exception {
		Calculate result = new Calculate();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void performCalculation(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	public void testPerformCalculation_1()
		throws Exception {
		Calculate fixture = new Calculate();
		fixture.dataService = new DefaultDataService();
		fixture.calculator = new DefaultCalculator();
		Integer size = Integer.valueOf(50);

		fixture.performCalculation(size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:117)
		//       at com.swazzy.controller.Calculate.<clinit>(Calculate.java:26)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @see TestCase#setUp()
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	protected void setUp()
		throws Exception {
		super.setUp();
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @see TestCase#tearDown()
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	protected void tearDown()
		throws Exception {
		super.tearDown();
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			// Run all of the tests
			junit.textui.TestRunner.run(CalculateTest.class);
		} else {
			// Run only the named tests
			TestSuite suite = new TestSuite("Selected tests");
			for (int i = 0; i < args.length; i++) {
				TestCase test = new CalculateTest();
				test.setName(args[i]);
				suite.addTest(test);
			}
			junit.textui.TestRunner.run(suite);
		}
	}
}