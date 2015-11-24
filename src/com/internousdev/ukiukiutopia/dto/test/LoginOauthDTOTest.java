/**
 * 
 */
package com.internousdev.ukiukiutopia.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdev.ukiukiutopia.dto.LoginOauthDTO;

/**
 * @author internous
 *
 */
public class LoginOauthDTOTest {
	private int testInt0;
	private int testIntMax;
	private int testIntMin;

	private double testDoubleNan;
	private double testDoubleMax;
	private double testDoublePInf;
	private double testDoubleNInf;
	private double testDoubleDelta;

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

		testDoubleNan = Double.NaN;
		testDoubleMax = Double.MAX_VALUE;
		testDoublePInf = Double.POSITIVE_INFINITY;
		testDoubleNInf = Double.NEGATIVE_INFINITY;
		testDoubleDelta = 0.0D;

		testStringNull = null;
		testStringKara = "";
		testStringSpace = " ";
		testStringHankaku = "abc123";
		testStringZenkaku = "ａｂｃ１２３あいう漢字";

	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.LoginOauthDTO#getUserName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName1() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringNull;
		
		test.setUserName(expected);
		String actual = test.getUserName();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetUserName2() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringKara;
		
		test.setUserName(expected);
		String actual = test.getUserName();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetUserName3() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringSpace;
		
		test.setUserName(expected);
		String actual = test.getUserName();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetUserName4() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringHankaku;
		
		test.setUserName(expected);
		String actual = test.getUserName();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetUserName5() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringZenkaku;
		
		test.setUserName(expected);
		String actual = test.getUserName();
		
		assertEquals(expected, actual);
	}
	

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.LoginOauthDTO#setUserName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName1() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringNull;
		
		test.setUserName(expected);
		String actual = test.getUserName();
		
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserName2() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringKara;
		
		test.setUserName(expected);
		String actual = test.getUserName();
		
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserName3() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringSpace;
		
		test.setUserName(expected);
		String actual = test.getUserName();
		
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserName4() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringHankaku;
		
		test.setUserName(expected);
		String actual = test.getUserName();
		
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserName5() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringZenkaku;
		
		test.setUserName(expected);
		String actual = test.getUserName();
		
		assertEquals(expected, actual);
	}
	
	

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.LoginOauthDTO#getUserEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserEmail1() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringNull;
		
		test.setUserEmail(expected);
		String actual = test.getUserEmail();
		
		assertEquals(expected, actual);
	}
	public void testGetUserEmail2() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringKara;
		
		test.setUserEmail(expected);
		String actual = test.getUserEmail();
		
		assertEquals(expected, actual);
	}
	public void testGetUserEmail3() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringSpace;
		
		test.setUserEmail(expected);
		String actual = test.getUserEmail();
		
		assertEquals(expected, actual);
	}
	public void testGetUserEmail4() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringHankaku;
		
		test.setUserEmail(expected);
		String actual = test.getUserEmail();
		
		assertEquals(expected, actual);
	}
	public void testGetUserEmail5() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringZenkaku;
		
		test.setUserEmail(expected);
		String actual = test.getUserEmail();
		
		assertEquals(expected, actual);
	}
	
	

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.LoginOauthDTO#setUserEmail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserEmail1() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringNull;
		
		test.setUserEmail(expected);
		String actual = test.getUserEmail();
		
		assertEquals(expected, actual);
	}
	
	public void testSetUserEmail2() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringKara;
		
		test.setUserEmail(expected);
		String actual = test.getUserEmail();
		
		assertEquals(expected, actual);
	}
	
	public void testSetUserEmail3() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringSpace;
		
		test.setUserEmail(expected);
		String actual = test.getUserEmail();
		
		assertEquals(expected, actual);
	}
	
	public void testSetUserEmail4() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringHankaku;
		
		test.setUserEmail(expected);
		String actual = test.getUserEmail();
		
		assertEquals(expected, actual);
	}
	
	public void testSetUserEmail5() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringZenkaku;
		
		test.setUserEmail(expected);
		String actual = test.getUserEmail();
		
		assertEquals(expected, actual);
	}
	
	/**
	 * {@link com.internousdev.ukiukiutopia.dto.LoginOauthDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId1() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringNull;
		
		test.setUserId(expected);
		String actual = test.getUserId();
		
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId2() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringKara;
		
		test.setUserId(expected);
		String actual = test.getUserId();
		
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId3() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringSpace;
		
		test.setUserId(expected);
		String actual = test.getUserId();
		
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId4() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringHankaku;
		
		test.setUserId(expected);
		String actual = test.getUserId();
		
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId5() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringZenkaku;
		
		test.setUserId(expected);
		String actual = test.getUserId();
		
		assertEquals(expected, actual);
	}
	

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.LoginOauthDTO#setUserId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringNull;
		
		test.setUserId(expected);
		String actual = test.getUserId();
		
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId2() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringKara;
		
		test.setUserId(expected);
		String actual = test.getUserId();
		
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId3() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringSpace;
		
		test.setUserId(expected);
		String actual = test.getUserId();
		
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId4() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringHankaku;
		
		test.setUserId(expected);
		String actual = test.getUserId();
		
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId5() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringZenkaku;
		
		test.setUserId(expected);
		String actual = test.getUserId();
		
		assertEquals(expected, actual);
	}

}
