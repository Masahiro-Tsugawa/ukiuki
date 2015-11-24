/**
 *
 */
package com.internousdev.ukiukiutopia.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO;

/**
 * @author internous
 *
 */
public class AdminTicketSelectDTOTest {
	private int testInt0;
	private int testIntMax;
	private int testIntMin;

	private float testFloatNan;
	private float testFloatMax;
	private float testFloatPInf;
	private float testFloatNInf;
	private float testFloatDelta;

	private String testStringNull;
	private String testStringKara;
	private String testStringSpace;
	private String testStringHankaku;
	private String testStringZenkaku;

	private boolean testBooleanTrue;
	private boolean testBooleanFalse;
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

		testBooleanTrue = true;
		testBooleanFalse = false;
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetId1() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
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
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
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
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		int expected = testIntMin;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO#setId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetId1() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		int expected = testInt0;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testSetId2(){
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		int expected = testIntMax;
		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testSetId3(){
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		int expected = testIntMin;
		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO#getName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetName1() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringNull;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testGetName2() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringKara;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testGetName3() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringSpace;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testGetName4() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringHankaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testGetName5() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO#setName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetName1() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringNull;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testSetName2() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringKara;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testSetName3() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringSpace;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testSetName4() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringHankaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testSetName5() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 float expected = testFloatNan;

		test.setPrice(expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0f);
	}

	/**
	 *
	 */
	public void testGetPrice2() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 float expected = testFloatMax;

		test.setPrice(expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0f);
	}

	/**
	 *
	 */
	public void testGetPrice3() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 float expected = testFloatPInf;

		test.setPrice(expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0f);
	}

	/**
	 *
	 */
	public void testGetPrice4() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 float expected = testFloatNInf;

		test.setPrice(expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0f);
	}

	/**
	 *
	 */
	public void testGetPrice5() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 float expected = testFloatDelta;

		test.setPrice(expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0f);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 float expected = testFloatNan;

		test.setPrice(expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0f);
	}

	/**
	 *
	 */
	public void testSetPrice2() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 float expected = testFloatMax;

		test.setPrice(expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0f);
	}

	/**
	 *
	 */
	public void testSetPrice3() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 float expected = testFloatPInf;

		test.setPrice(expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0f);
	}

	/**
	 *
	 */
	public void testSetPrice4() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 float expected = testFloatNInf;

		test.setPrice(expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0f);
	}

	/**
	 *
	 */
	public void testSetPrice5() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 float expected = testFloatDelta;

		test.setPrice(expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0f);
	}
	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO#getTicketType()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTicketType1() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 String expected = testStringNull;

		 test.setTicketType(expected);
		 String actual = test.getTicketType();

		assertEquals(expected, actual);
	}

	public void testGetTicketType2() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 String expected = testStringKara;

		 test.setTicketType(expected);
		 String actual = test.getTicketType();

		assertEquals(expected, actual);
	}

	public void testGetTicketType3() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 String expected = testStringSpace;

		 test.setTicketType(expected);
		 String actual = test.getTicketType();

		assertEquals(expected, actual);
	}

	public void testGetTicketType4() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 String expected = testStringHankaku;

		 test.setTicketType(expected);
		 String actual = test.getTicketType();

		assertEquals(expected, actual);
	}

	public void testGetTicketType5() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 String expected = testStringZenkaku;

		 test.setTicketType(expected);
		 String actual = test.getTicketType();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO#setTicketType(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetTicketType1() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 String expected = testStringNull;

		 test.setTicketType(expected);
		 String actual = test.getTicketType();

		assertEquals(expected, actual);
	}

	public void testSetTicketType2() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 String expected = testStringKara;

		 test.setTicketType(expected);
		 String actual = test.getTicketType();

		assertEquals(expected, actual);
	}

	public void testSetTicketType3() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 String expected = testStringSpace;

		 test.setTicketType(expected);
		 String actual = test.getTicketType();

		assertEquals(expected, actual);
	}

	public void testSetTicketType4() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 String expected = testStringHankaku;

		 test.setTicketType(expected);
		 String actual = test.getTicketType();

		assertEquals(expected, actual);
	}

	public void testSetTicketType5() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		 String expected = testStringZenkaku;

		 test.setTicketType(expected);
		 String actual = test.getTicketType();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO#getIsSale()} のためのテスト・メソッド。
	 */

	public void testGetIsSale1() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		boolean expected = testBooleanTrue;
		test.setIsSale(expected);
		 boolean actual = test.getIsSale();

		assertEquals(expected, actual);
	}

	public void testGetIsSale2() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		boolean expected = testBooleanFalse;
		test.setIsSale(expected);
		 boolean actual = test.getIsSale();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO#setIsSale(boolean)} のためのテスト・メソッド。
	 */
	public void testSetIsSale1() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		boolean expected = testBooleanTrue;
		test.setIsSale(expected);
		 boolean actual = test.getIsSale();

		assertEquals(expected, actual);
	}

	public void testSetIsSale2() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		boolean expected = testBooleanFalse;
		test.setIsSale(expected);
		 boolean actual = test.getIsSale();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO#getTicketInfo()} のためのテスト・メソッド。
	 */
	@Test
	public void GetTicketInfo1() {
			AdminTicketSelectDTO test = new AdminTicketSelectDTO();
			String expected = testStringNull;

	        test.setTicketInfo(expected);
	        String actual = test.getTicketInfo();

	        assertEquals(expected, actual);
		}

		/**
		 *
		 */
		public void GetTicketInfo2() {
			AdminTicketSelectDTO test = new AdminTicketSelectDTO();
			String expected = testStringKara;

	        test.setTicketInfo(expected);
	        String actual = test.getTicketInfo();

	        assertEquals(expected, actual);
		}

		/**
		 *
		 */
		public void GetTicketInfo3() {
			AdminTicketSelectDTO test = new AdminTicketSelectDTO();
			String expected = testStringSpace;

	        test.setTicketInfo(expected);
	        String actual = test.getTicketInfo();

	        assertEquals(expected, actual);
		}

		/**
		 *
		 */
		public void GetTicketInfo4() {
			AdminTicketSelectDTO test = new AdminTicketSelectDTO();
			String expected = testStringHankaku;

	        test.setTicketInfo(expected);
	        String actual = test.getTicketInfo();

	        assertEquals(expected, actual);
		}

		/**
		 *
		 */
		public void GetTicketInfo5() {
			AdminTicketSelectDTO test = new AdminTicketSelectDTO();
			String expected = testStringZenkaku;

	        test.setTicketInfo(expected);
	        String actual = test.getTicketInfo();

	        assertEquals(expected, actual);
		}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO#setTicketInfo(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void SetTicketInfo1() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringNull;

        test.setTicketInfo(expected);
        String actual = test.getTicketInfo();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void SetTicketInfo2() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringKara;

        test.setTicketInfo(expected);
        String actual = test.getTicketInfo();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void SetTicketInfo3() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringSpace;

        test.setTicketInfo(expected);
        String actual = test.getTicketInfo();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void SetTicketInfo4() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringHankaku;

        test.setTicketInfo(expected);
        String actual = test.getTicketInfo();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void SetTicketInfo5() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringZenkaku;

        test.setTicketInfo(expected);
        String actual = test.getTicketInfo();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO#getRenewDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRenewDate1() {
			AdminTicketSelectDTO test = new AdminTicketSelectDTO();
			String expected = testStringNull;

	        test.setRenewDate(expected);
	        String actual = test.getRenewDate();

	        assertEquals(expected, actual);
		}

		/**
		 *
		 */
		public void testGetRenewDate2() {
			AdminTicketSelectDTO test = new AdminTicketSelectDTO();
			String expected = testStringKara;

	        test.setRenewDate(expected);
	        String actual = test.getRenewDate();

	        assertEquals(expected, actual);
		}

		/**
		 *
		 */
		public void testGetRenewDate3() {
			AdminTicketSelectDTO test = new AdminTicketSelectDTO();
			String expected = testStringSpace;

	        test.setRenewDate(expected);
	        String actual = test.getRenewDate();

	        assertEquals(expected, actual);
		}

		/**
		 *
		 */
		public void testGetRenewDate4() {
			AdminTicketSelectDTO test = new AdminTicketSelectDTO();
			String expected = testStringHankaku;

	        test.setRenewDate(expected);
	        String actual = test.getRenewDate();

	        assertEquals(expected, actual);
		}

		/**
		 *
		 */
		public void testGetRenewDate5() {
			AdminTicketSelectDTO test = new AdminTicketSelectDTO();
			String expected = testStringZenkaku;

	        test.setRenewDate(expected);
	        String actual = test.getRenewDate();

	        assertEquals(expected, actual);
		}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminTicketSelectDTO#setRenewData(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRenewDate1() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringNull;

        test.setRenewDate(expected);
        String actual = test.getRenewDate();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testSetRenewDate2() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringKara;

        test.setRenewDate(expected);
        String actual = test.getRenewDate();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testSetRenewDate3() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringSpace;

        test.setRenewDate(expected);
        String actual = test.getRenewDate();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testSetRenewDate4() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringHankaku;

        test.setRenewDate(expected);
        String actual = test.getRenewDate();

        assertEquals(expected, actual);
	}

	/**
	 *
	 */
	public void testSetRenewDate5() {
		AdminTicketSelectDTO test = new AdminTicketSelectDTO();
		String expected = testStringZenkaku;

        test.setRenewDate(expected);
        String actual = test.getRenewDate();

        assertEquals(expected, actual);
	}
}
