/**
 *
 */
package com.internousdev.ukiukiutopia.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdev.ukiukiutopia.dto.AdminLoginDTO;

/**
 * @author minamiyasuyuki
 *
 */
public class AdminLoginDTOTest {
	private int testInt0;
	private int testIntMax;
	private int testIntMin;

	private String testStringNull;
	private String testStringKara;
	private String testStringSpace;
	private String testStringHankaku;
	private String testStringZenkaku;


	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		testInt0 = 0;
		testIntMax = Integer.MAX_VALUE;
		testIntMin = Integer.MIN_VALUE;

		testStringNull = null;
		testStringKara = "";
		testStringSpace = " ";
		testStringHankaku = "abc123";
		testStringZenkaku = "ａｂｃ１２３あいう漢字";

	}

	/**
	 * Test method for {@link com.internousdev.ukiukiutopia.dto.AdminLoginDTO#getName()}.
	 */
	@Test
	public void testGetName1() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = testStringNull;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testGetName2() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = testStringKara;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testGetName3() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = testStringSpace;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testGetName4() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = testStringHankaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testGetName5() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link com.internousdev.ukiukiutopia.dto.AdminLoginDTO#setName(java.lang.String)}.
	 */
	@Test
	public void testSetName1() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = testStringNull;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testSetName2() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = testStringKara;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testSetName3() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = testStringSpace;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testSetName4() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = testStringHankaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testSetName5() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link com.internousdev.ukiukiutopia.dto.AdminLoginDTO#getId()}.
	 */
	@Test
	public void testGetId1() {
		AdminLoginDTO test = new AdminLoginDTO();
		int expected = testInt0;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}

	/**
	 *
	 */
	@Test
	public void testGetId2() {
		AdminLoginDTO test = new AdminLoginDTO();
		int expected = testIntMax;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}
	/**
	 *
	 */
	@Test
	public void testGetId3() {
		AdminLoginDTO test = new AdminLoginDTO();
		int expected = testIntMin;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link com.internousdev.ukiukiutopia.dto.AdminLoginDTO#setId(int)}.
	 */
	@Test
	public void testSetId1() {
		AdminLoginDTO test = new AdminLoginDTO();
		int expected = testInt0;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testSetId2(){
		AdminLoginDTO test = new AdminLoginDTO();
		int expected = testIntMax;
		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testSetId3(){
		AdminLoginDTO test = new AdminLoginDTO();
		int expected = testIntMin;
		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}

}
