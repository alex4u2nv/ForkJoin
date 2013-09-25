package com.swazzy.computer;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import org.junit.*;
import static org.junit.Assert.*;
import com.swazzy.model.Data;
import com.swazzy.model.Result;
import com.swazzy.service.Calculator;
import com.swazzy.service.impl.DefaultCalculator;

/**
 * The class <code>ForkJoinComputerTest</code> contains tests for the class <code>{@link ForkJoinComputer}</code>.
 *
 * @generatedBy CodePro at 9/25/13 6:54 PM
 * @author Alex
 * @version $Revision: 1.0 $
 */
public class ForkJoinComputerTest {
	/**
	 * Run the ForkJoinComputer(Data,Calculator) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Test
	public void testForkJoinComputer_1()
		throws Exception {
		Data data = new Data();
		Calculator calculator = new DefaultCalculator();

		ForkJoinComputer result = new ForkJoinComputer(data, calculator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.log4j.LogManager
		//       at org.apache.log4j.Logger.getLogger(Logger.java:117)
		//       at com.swazzy.model.Data.<clinit>(Data.java:19)
		assertNotNull(result);
	}

	/**
	 * Run the ForkJoinComputer(BlockingQueue<Data>,Calculator) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Test
	public void testForkJoinComputer_2()
		throws Exception {
		BlockingQueue<Data> blockingQueue = new LinkedBlockingDeque();
		Calculator calculator = new DefaultCalculator();

		ForkJoinComputer result = new ForkJoinComputer(blockingQueue, calculator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.service.impl.DefaultCalculator
		assertNotNull(result);
	}

	/**
	 * Run the Result compute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Test
	public void testCompute_1()
		throws Exception {
		ForkJoinComputer fixture = new ForkJoinComputer(new LinkedBlockingDeque(), new DefaultCalculator());
		fixture.results = new LinkedList();

		Result result = fixture.compute();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.service.impl.DefaultCalculator
		assertNotNull(result);
	}

	/**
	 * Run the Result compute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Test
	public void testCompute_2()
		throws Exception {
		ForkJoinComputer fixture = new ForkJoinComputer(new LinkedBlockingDeque(), new DefaultCalculator());
		fixture.results = new LinkedList();

		Result result = fixture.compute();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.service.impl.DefaultCalculator
		assertNotNull(result);
	}

	/**
	 * Run the Result compute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Test
	public void testCompute_3()
		throws Exception {
		ForkJoinComputer fixture = new ForkJoinComputer(new LinkedBlockingDeque(), new DefaultCalculator());
		fixture.results = new LinkedList();

		Result result = fixture.compute();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.service.impl.DefaultCalculator
		assertNotNull(result);
	}

	/**
	 * Run the List<Result> getResults() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Test
	public void testGetResults_1()
		throws Exception {
		ForkJoinComputer fixture = new ForkJoinComputer(new LinkedBlockingDeque(), new DefaultCalculator());
		fixture.results = new LinkedList();

		List<Result> result = fixture.getResults();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:117)
		//       at com.swazzy.service.impl.DefaultCalculator.<clinit>(DefaultCalculator.java:18)
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
		new org.junit.runner.JUnitCore().run(ForkJoinComputerTest.class);
	}
}