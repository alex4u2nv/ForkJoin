package com.swazzy.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ResultTest</code> contains tests for the class <code>{@link Result}</code>.
 *
 * @generatedBy CodePro at 9/25/13 11:10 PM
 * @author Alex
 * @version $Revision: 1.0 $
 */
public class ResultTest {
	/**
	 * Run the Result() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testResult_1()
		throws Exception {

		Result result = new Result();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.log4j.LogManager
		//       at org.apache.log4j.Logger.getLogger(Logger.java:117)
		//       at com.swazzy.model.Result.<clinit>(Result.java:20)
		assertNotNull(result);
	}

	/**
	 * Run the Result(Float,String,Data) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testResult_2()
		throws Exception {
		Float value = new Float(1.0f);
		String name = "";
		Data data = new Data();

		Result result = new Result(value, name, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
		assertNotNull(result);
	}

	/**
	 * Run the Result(Float,String,Long,Data) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testResult_3()
		throws Exception {
		Float value = new Float(1.0f);
		String name = "";
		Long msCompleted = new Long(1L);
		Data data = new Data();

		Result result = new Result(value, name, msCompleted, data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
		assertNotNull(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data());
		Object obj = new Result(new Float(1.0f), "", new Long(1L), new Data());

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data());
		Object obj =new Result(new Float(1.0f), "", new Long(1L), new Data());

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data());
		Object obj = new Result(new Float(1.0f), "", new Long(1L), new Data());

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data());
		Object obj = new Result(new Float(1.0f), "", new Long(1L), new Data());
		
		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data());
		Object obj = new Result(new Float(1.0f), "", new Long(1L), new Data());

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data());
		Object obj = new Result(new Float(1.0f), "", new Long(1L), new Data());

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data());
		Object obj = new Result(new Float(1.0f), "", new Long(1L), new Data());

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data());
		Object obj = new Result(new Float(1.0f), "", new Long(1L), new Data());

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testEquals_9()
		throws Exception {
		Result fixture = new Result((Float) null, "", new Long(1L), new Data());
		Object obj = new Result((Float) null, "", new Long(1L), new Data());

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
		assertTrue(result);
	}

	/**
	 * Run the Data getData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testGetData_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data());

		Data result = fixture.getData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
		assertNotNull(result);
	}

	/**
	 * Run the Long getMsCompleted() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testGetMsCompleted_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data());

		Long result = fixture.getNsCompleted();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data());

		String result = fixture.getName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
		assertNotNull(result);
	}

	/**
	 * Run the Float getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data());

		Float result = fixture.getValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:117)
		//       at com.swazzy.model.Data.<clinit>(Data.java:19)
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", (Long) null, (Data) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1066276737, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		Result fixture = new Result((Float) null, (String) null, new Long(1L), new Data());

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1743734817, result);
	}

	/**
	 * Run the void setData(Data) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testSetData_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data());
		Data data = new Data();

		fixture.setData(data);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
	}

	/**
	 * Run the void setMsCompleted(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testSetMsCompleted_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data());
		Long msCompleted = new Long(1L);

		fixture.setNsCompleted(msCompleted);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data());
		String name = "";

		fixture.setName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
	}

	/**
	 * Run the void setValue(Float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data());
		Float value = new Float(1.0f);

		fixture.setValue(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data());

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.swazzy.model.Data
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 9/25/13 11:10 PM
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
	 * @generatedBy CodePro at 9/25/13 11:10 PM
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
	 * @generatedBy CodePro at 9/25/13 11:10 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ResultTest.class);
	}
}