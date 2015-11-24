/**
 * 
 */
package com.internousdev.ukiukiutopia.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdev.ukiukiutopia.dto.AdminBoughtDTO;

/**
 * @author minamiyasuyuki
 *
 */
public class AdminBoughtDTOTest {
	
	private int testInt0;
	private int testIntMax;
	private int testIntMin;
	
	private float testFloatNan;
	private float testFloatMax;
	private float testFloatPInf;
	private float testFloatNInf;
	private float testFloatDelta;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		testInt0 = 0;
		testIntMax = Integer.MAX_VALUE;
		testIntMin = Integer.MIN_VALUE;

		testFloatNan = Float.NaN;
		testFloatMax = Float.MAX_VALUE;
		testFloatPInf = Float.POSITIVE_INFINITY;
		testFloatNInf = Float.NEGATIVE_INFINITY;
		testFloatDelta = 0.0F;

	}

	/**
	 * Test method for {@link com.internousdev.ukiukiutopia.dto.AdminBoughtDTO#getOrderId()}.
	 */
	@Test
	public void testGetOrderId1() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testInt0;

		test.setOrderId(expected);
		int actual = test.getOrderId();

		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetOrderId2() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testIntMax;

		test.setOrderId(expected);
		int actual = test.getOrderId();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetOrderId3() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testIntMin;

		test.setOrderId(expected);
		int actual = test.getOrderId();

		assertEquals(expected, actual);
	}
	/**
	 * Test method for {@link com.internousdev.ukiukiutopia.dto.AdminBoughtDTO#setOrderId(int)}.
	 */
	@Test
	public void testSetOrderId1() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testInt0;

		test.setOrderId(expected);
		int actual = test.getOrderId();

		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetOrderIｄ2() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testIntMax;

		test.setOrderId(expected);
		int actual = test.getOrderId();

		assertEquals(expected, actual);
	}
	@Test
	public void testSetOrderIｄ3() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testIntMin;

		test.setOrderId(expected);
		int actual = test.getOrderId();

		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link com.internousdev.ukiukiutopia.dto.AdminBoughtDTO#getTicketId()}.
	 */
	@Test
	public void testGetTicketId() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testInt0;

		test.setTicketId(expected);
		int actual = test.getTicketId();

		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetTicketId2() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testIntMax;

		test.setTicketId(expected);
		int actual = test.getTicketId();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetTicketId3() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testIntMin;

		test.setTicketId(expected);
		int actual = test.getTicketId();

		assertEquals(expected, actual);
	}
	

	/**
	 * Test method for {@link com.internousdev.ukiukiutopia.dto.AdminBoughtDTO#setTicketId(int)}.
	 */
	@Test
	public void testSetTicketId() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testInt0;

		test.setTicketId(expected);
		int actual = test.getTicketId();

		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetTicketIｄ2() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testIntMax;

		test.setTicketId(expected);
		int actual = test.getTicketId();

		assertEquals(expected, actual);
	}
	@Test
	public void testSetTicketIｄ3() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testIntMin;

		test.setTicketId(expected);
		int actual = test.getTicketId();

		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link com.internousdev.ukiukiutopia.dto.AdminBoughtDTO#getSheets()}.
	 */
	@Test
	public void testGetSheets1() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testInt0;

		test.setSheets(expected);
		int actual = test.getSheets();

		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetSheets2() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testIntMax;

		test.setSheets(expected);
		int actual = test.getSheets();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetSheets3() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testIntMin;

		test.setSheets(expected);
		int actual = test.getSheets();

		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link com.internousdev.ukiukiutopia.dto.AdminBoughtDTO#setSheets(int)}.
	 */
	@Test
	public void testSetSheets1() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testInt0;

		test.setSheets(expected);
		int actual = test.getSheets();

		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetSheets2() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testIntMax;

		test.setSheets(expected);
		int actual = test.getSheets();

		assertEquals(expected, actual);
	}
	@Test
	public void testSetSheets3() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		int expected = testIntMin;

		test.setSheets(expected);
		int actual = test.getSheets();

		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link com.internousdev.ukiukiutopia.dto.AdminBoughtDTO#getTotalAmount()}.
	 */
	@Test
	public void testGetTotalAmount1() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		float expected = testFloatNan;

		test.setTotalAmount(expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testGetTotalAmount2() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		float expected = testFloatMax;

		test.setTotalAmount(expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testGetTotalAmount3() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		float expected = testFloatPInf;

		test.setTotalAmount(expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testGetTotalAmount4() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		float expected = testFloatNInf;

		test.setTotalAmount(expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testGetTotalAmount5() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		float expected = testFloatDelta;

		test.setTotalAmount(expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}

	/**
	 * Test method for {@link com.internousdev.ukiukiutopia.dto.AdminBoughtDTO#setTotalAmount(float)}.
	 */
	@Test
	public void testSetTotalAmount1() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		float expected = testFloatNan;

		test.setTotalAmount(expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testSetTotalAmount2() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		float expected = testFloatMax;

		test.setTotalAmount(expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testSetTotalAmount3() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		float expected = testFloatPInf;

		test.setTotalAmount(expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testSetTotalAmount4() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		float expected = testFloatNInf;

		test.setTotalAmount(expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testSetTotalAmount5() {
		AdminBoughtDTO test = new AdminBoughtDTO();
		float expected = testFloatDelta;

		test.setTotalAmount(expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}

}
