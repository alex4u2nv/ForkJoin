package com.swazzy.model;

import org.junit.*;

import com.thoughtworks.xstream.XStream;

import static org.junit.Assert.*;

/**
 * The class <code>ResultTest</code> contains tests for the class <code>{@link Result}</code>.
 *
 * @generatedBy CodePro at 9/26/13 12:41 PM
 * @author Alex
 * @version $Revision: 1.0 $
 */
public class ResultTest {
	/**
	 * Run the Result() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testResult_1()
		throws Exception {

		Result result = new Result();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Result [value=null, name=null, nsCompleted=null, data=null, nanoStart=null]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getData());
		assertEquals(null, result.getNsCompleted());
		assertEquals(0, result.getCalculationOrder());
		assertEquals(null, result.getNanoStart());
		assertEquals(null, result.getDid());
	}

	/**
	 * Run the Result(Float,String,Data) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testResult_2()
		throws Exception {
		Float value = new Float(1.0f);
		String name = "";
		Data data = new Data();

		Result result = new Result(value, name, data);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Result [value=1.0, name=, nsCompleted=0, data=Data [id=null, dataA=null, dataB=null, dataC=null], nanoStart=null]", result.toString());
		assertEquals("", result.getName());
		assertEquals(new Float(1.0f), result.getValue());
		assertEquals(new Long(0L), result.getNsCompleted());
		assertEquals(0, result.getCalculationOrder());
		assertEquals(null, result.getNanoStart());
		assertEquals(null, result.getDid());
	}

	/**
	 * Run the Result(Float,String,Long,Data) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testResult_3()
		throws Exception {
		Float value = new Float(1.0f);
		String name = "";
		Long nsCompleted = new Long(1L);
		Data data = new Data();

		Result result = new Result(value, name, nsCompleted, data);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Result [value=1.0, name=, nsCompleted=1, data=Data [id=null, dataA=null, dataB=null, dataC=null], nanoStart=null]", result.toString());
		assertEquals("", result.getName());
		assertEquals(new Float(1.0f), result.getValue());
		assertEquals(new Long(1L), result.getNsCompleted());
		assertEquals(0, result.getCalculationOrder());
		assertEquals(null, result.getNanoStart());
		assertEquals(null, result.getDid());
	}

	/**
	 * Run the Result(Float,String,Long,Data,Long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testResult_4()
		throws Exception {
		Float value = new Float(1.0f);
		String name = "";
		Long nsCompleted = new Long(1L);
		Data data = new Data();
		Long nanoStart = new Long(1L);

		Result result = new Result(value, name, nsCompleted, data, nanoStart);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Result [value=1.0, name=, nsCompleted=1, data=Data [id=null, dataA=null, dataB=null, dataC=null], nanoStart=1]", result.toString());
		assertEquals("", result.getName());
		assertEquals(new Float(1.0f), result.getValue());
		assertEquals(new Long(1L), result.getNsCompleted());
		assertEquals(0, result.getCalculationOrder());
		assertEquals(new Long(1L), result.getNanoStart());
		assertEquals(null, result.getDid());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));
		Result obj = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		obj.setCalculationOrder(1);
		obj.setDid(new Long(1L));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));
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
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));
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
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));
		Object obj = new Result(new Float(1.0f), "", new Long(1L), new Data());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));
		Object obj = new Result(new Float(1.0f), "", new Long(1L), new Data());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));
		Object obj = new Result(new Float(1.0f), "", new Long(1L), new Data());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));
		Object obj = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));
		Object obj = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testEquals_9()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));
		Object obj = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testEquals_10()
		throws Exception {
		Result fixture = new Result((Float) null, "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));
		Object obj = new Result((Float) null, "", new Long(1L), new Data(), new Long(1L));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the int getCalculationOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testGetCalculationOrder_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));

		int result = fixture.getCalculationOrder();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Data getData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testGetData_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));

		Data result = fixture.getData();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Data [id=null, dataA=null, dataB=null, dataC=null]", result.toString());
		assertEquals(null, result.getId());
		assertEquals(null, result.getDataC());
		assertEquals(null, result.getDataB());
		assertEquals(null, result.getDataA());
	}

	/**
	 * Run the Long getDid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testGetDid_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));

		Long result = fixture.getDid();

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
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Long getNanoStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testGetNanoStart_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));

		Long result = fixture.getNanoStart();

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
	 * Run the Long getNsCompleted() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testGetNsCompleted_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));

		Long result = fixture.getNsCompleted();

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
	 * Run the Float getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));

		Float result = fixture.getValue();

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
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", (Long) null, (Data) null, new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1093982398, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		Result fixture = new Result((Float) null, (String) null, new Long(1L), new Data(), (Long) null);
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1778795521, result);
	}

	/**
	 * Run the void setCalculationOrder(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testSetCalculationOrder_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));
		int calculationOrder = 1;

		fixture.setCalculationOrder(calculationOrder);

		// add additional test code here
	}

	/**
	 * Run the void setData(Data) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testSetData_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));
		Data data = new Data(new Long(1L), new Float(1.0f), new Float(1.0f), new Float(1.0f));

		fixture.setData(data);

		// add additional test code here
	}

	/**
	 * Run the void setDid(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testSetDid_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));
		Long did = new Long(1L);

		fixture.setDid(did);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setNanoStart(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testSetNanoStart_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));
		Long nanoStart = new Long(1L);

		fixture.setNanoStart(nanoStart);

		// add additional test code here
	}

	/**
	 * Run the void setNsCompleted(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testSetNsCompleted_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));
		Long nsCompleted = new Long(1L);

		fixture.setNsCompleted(nsCompleted);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));
		Float value = new Float(1.0f);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Result fixture = new Result(new Float(1.0f), "", new Long(1L), new Data(), new Long(1L));
		fixture.setCalculationOrder(1);
		fixture.setDid(new Long(1L));

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Result [value=1.0, name=, nsCompleted=1, data=Data [id=null, dataA=null, dataB=null, dataC=null], nanoStart=1]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 9/26/13 12:41 PM
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
	 * @generatedBy CodePro at 9/26/13 12:41 PM
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
	 * @generatedBy CodePro at 9/26/13 12:41 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ResultTest.class);
	}
	
	/**
	 * Generate Xml
	 */
	
	@Test
	public void testXMl() {
		XStream xStream = new XStream();
		Result result = new Result();
		result.setCalculationOrder(1);
		result.setData(new Data());
		result.setDid(1L);
		result.setName("fib");
		result.setNsCompleted(1111L);
		result.setValue(4234f);
		String xmlString=xStream.toXML(result);
		System.out.println(xmlString);
	}
	 
}