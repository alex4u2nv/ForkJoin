package com.swazzy.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DataTest</code> contains tests for the class <code>{@link Data}</code>.
 *
 * @generatedBy CodePro at 9/26/13 9:16 AM
 * @author Alex
 * @version $Revision: 1.0 $
 */
public class DataTest {
	/**
	 * Run the Data() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testData_1()
		throws Exception {

		Data result = new Data();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Data [id=null, dataA=null, dataB=null, dataC=null]", result.toString());
		assertEquals(null, result.getId());
		assertEquals(null, result.getDataC());
		assertEquals(null, result.getDataA());
		assertEquals(null, result.getDataB());
	}

	/**
	 * Run the Data(Float,Float,Float) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testData_2()
		throws Exception {
		Float dataA = new Float(1.0f);
		Float dataB = new Float(1.0f);
		Float dataC = new Float(1.0f);

		Data result = new Data(dataA, dataB, dataC);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Data [id=null, dataA=1.0, dataB=1.0, dataC=1.0]", result.toString());
		assertEquals(null, result.getId());
		assertEquals(new Float(1.0f), result.getDataC());
		assertEquals(new Float(1.0f), result.getDataA());
		assertEquals(new Float(1.0f), result.getDataB());
	}

	/**
	 * Run the Data(Long,Float,Float,Float) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testData_3()
		throws Exception {
		Long id = new Long(1L);
		Float dataA = new Float(1.0f);
		Float dataB = new Float(1.0f);
		Float dataC = new Float(1.0f);

		Data result = new Data(id, dataA, dataB, dataC);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Data [id=1, dataA=1.0, dataB=1.0, dataC=1.0]", result.toString());
		assertEquals(new Long(1L), result.getId());
		assertEquals(new Float(1.0f), result.getDataC());
		assertEquals(new Float(1.0f), result.getDataA());
		assertEquals(new Float(1.0f), result.getDataB());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Data fixture = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));
		Object obj = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Data fixture = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));
		Object obj = null;

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Data fixture = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		Data fixture = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));
		Object obj = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		Data fixture = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));
		Object obj = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		Data fixture = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));
		Object obj = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		Data fixture = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));
		Object obj = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		Data fixture = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));
		Object obj = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testEquals_9()
		throws Exception {
		Data fixture = new Data((Long) null, new Float(1.0f), new Float(1.0f), new Float(1.0f));
		Object obj = new Data((Long) null, new Float(1.0f), new Float(1.0f), new Float(1.0f));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Float getDataA() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testGetDataA_1()
		throws Exception {
		Data fixture = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));

		Float result = fixture.getDataA();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1.0", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
		assertEquals(false, result.isNaN());
		assertEquals(false, result.isInfinite());
	}

	/**
	 * Run the Float getDataB() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testGetDataB_1()
		throws Exception {
		Data fixture = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));

		Float result = fixture.getDataB();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1.0", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
		assertEquals(false, result.isNaN());
		assertEquals(false, result.isInfinite());
	}

	/**
	 * Run the Float getDataC() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testGetDataC_1()
		throws Exception {
		Data fixture = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));

		Float result = fixture.getDataC();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1.0", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
		assertEquals(false, result.isNaN());
		assertEquals(false, result.isInfinite());
	}

	/**
	 * Run the Long getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		Data fixture = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));

		Long result = fixture.getId();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Data fixture = new Data(new Long(1L), (Float) null, (Float) null, new Float(1.0f));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1332865150, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		Data fixture = new Data((Long) null, new Float(1.0f), new Float(1.0f), (Float) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-267511935, result);
	}

	/**
	 * Run the void setDataA(Float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testSetDataA_1()
		throws Exception {
		Data fixture = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));
		Float dataA = new Float(1.0f);

		fixture.setDataA(dataA);

		// add additional test code here
	}

	/**
	 * Run the void setDataB(Float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testSetDataB_1()
		throws Exception {
		Data fixture = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));
		Float dataB = new Float(1.0f);

		fixture.setDataB(dataB);

		// add additional test code here
	}

	/**
	 * Run the void setDataC(Float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testSetDataC_1()
		throws Exception {
		Data fixture = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));
		Float dataC = new Float(1.0f);

		fixture.setDataC(dataC);

		// add additional test code here
	}

	/**
	 * Run the void setId(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		Data fixture = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));
		Long id = new Long(1L);

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Data fixture = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Data [id=1, dataA=1.0, dataB=1.0, dataC=1.0]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 9/26/13 9:16 AM
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
	 * @generatedBy CodePro at 9/26/13 9:16 AM
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
	 * @generatedBy CodePro at 9/26/13 9:16 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DataTest.class);
	}
}