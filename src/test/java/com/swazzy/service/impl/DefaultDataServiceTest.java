package com.swazzy.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

import com.swazzy.model.Data;

/**
 * The class <code>DefaultDataServiceTest</code> contains tests for the class <code>{@link DefaultDataService}</code>.
 *
 * @generatedBy CodePro at 9/25/13 6:54 PM
 * @author Alex
 * @version $Revision: 1.0 $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring/application-context.xml" })
public class DefaultDataServiceTest {
	/**
	 * Run the DefaultDataService() constructor test.
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Test
	public void testDefaultDataService_1()
		throws Exception {
		DefaultDataService result = new DefaultDataService();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the List<Data> loadData(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Test
	public void testLoadData_1()
		throws Exception {
		DefaultDataService fixture = new DefaultDataService();
		int max = 1;

		List<Data> result = fixture.loadData(max);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.service.impl.DefaultDataService
		assertNotNull(result);
	}

	/**
	 * Run the List<Data> loadData(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Test
	public void testLoadData_2()
		throws Exception {
		DefaultDataService fixture = new DefaultDataService();
		int max = 0;

		List<Data> result = fixture.loadData(max);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.service.impl.DefaultDataService
		assertNotNull(result);
	}

	/**
	 * Run the BlockingQueue<Data> prioritizeData(List<Data>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 6:54 PM
	 */
	@Test
	public void testPrioritizeData_1()
		throws Exception {
		DefaultDataService fixture = new DefaultDataService();
		List<Data> data = fixture.loadData(100);

		BlockingQueue<Data> result = fixture.prioritizeData(data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:117)
		//       at com.swazzy.service.impl.DefaultDataService.<clinit>(DefaultDataService.java:24)
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
		new org.junit.runner.JUnitCore().run(DefaultDataServiceTest.class);
	}
}