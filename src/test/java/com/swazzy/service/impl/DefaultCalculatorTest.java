package com.swazzy.service.impl;

import org.junit.*;
import static org.junit.Assert.*;
import com.swazzy.model.Data;
import com.swazzy.model.Result;

/**
 * The class <code>DefaultCalculatorTest</code> contains tests for the class <code>{@link DefaultCalculator}</code>.
 *
 * @generatedBy CodePro at 9/25/13 6:54 PM
 * @author Alex
 * @version $Revision: 1.0 $
 */
public class DefaultCalculatorTest {
	/**
	 * Run the DefaultCalculator() constructor test.
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Test
	public void testDefaultCalculator_1()
		throws Exception {
		DefaultCalculator result = new DefaultCalculator();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Result add(Result,Result) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		DefaultCalculator fixture = new DefaultCalculator();
		Result result01 = new Result(new Float(1.0f), "", new Data());
		Result result02 = new Result(new Float(1.0f), "", new Data());

		Result result = fixture.add(result01, result02);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.service.impl.DefaultCalculator
		assertNotNull(result);
	}

	/**
	 * Run the Result calculate(Data) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Test
	public void testCalculate_1()
		throws Exception {
		DefaultCalculator fixture = new DefaultCalculator();
		Data data = new Data();

		Result result = fixture.calculate(data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:117)
		//       at com.swazzy.service.impl.DefaultCalculator.<clinit>(DefaultCalculator.java:18)
		assertNotNull(result);
	}

	/**
	 * Run the Result calculateFibonacci(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Test
	public void testCalculateFibonacci_1()
		throws Exception {
		DefaultCalculator fixture = new DefaultCalculator();
		int n = 1;

		Result result = fixture.calculateFibonacci(n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.service.impl.DefaultCalculator
		assertNotNull(result);
	}

	/**
	 * Run the Result calculateFibonacci(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Test
	public void testCalculateFibonacci_2()
		throws Exception {
		DefaultCalculator fixture = new DefaultCalculator();
		int n = 2;

		Result result = fixture.calculateFibonacci(n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.service.impl.DefaultCalculator
		assertNotNull(result);
	}

	/**
	 * Run the Result calculateProduct(Data) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Test
	public void testCalculateProduct_1()
		throws Exception {
		DefaultCalculator fixture = new DefaultCalculator();
		Data data = new Data(new Float(1.0f), new Float(1.0f), new Float(1.0f));

		Result result = fixture.calculateProduct(data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.service.impl.DefaultCalculator
		assertNotNull(result);
	}

	/**
	 * Run the Result calculateSum(Data) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Test
	public void testCalculateSum_1()
		throws Exception {
		DefaultCalculator fixture = new DefaultCalculator();
		Data data = new Data(new Float(1.0f), new Float(1.0f), new Float(1.0f));

		Result result = fixture.calculateSum(data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.service.impl.DefaultCalculator
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@After
	public void tearDown()
		throws Exception {
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
		new org.junit.runner.JUnitCore().run(DefaultCalculatorTest.class);
	}
}