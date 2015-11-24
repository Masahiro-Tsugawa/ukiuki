/**
 * 
 */
package com.internousdev.ukiukiutopia.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdev.ukiukiutopia.dto.PersonalInformationDTO;
import com.internousdev.ukiukiutopia.dto.TicketDataDTO;

/**
 * @author internous
 *
 */
public class PersonalInformationDTOTest {
	
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
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#setId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetId1() {
		PersonalInformationDTO test = new PersonalInformationDTO();
		int expected = testInt0;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetId2() {
		PersonalInformationDTO test = new PersonalInformationDTO();
		int expected = testIntMax;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}
	@Test
	public void testSetId3() {
		PersonalInformationDTO test = new PersonalInformationDTO();
		int expected = testIntMin;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetId1() {
		PersonalInformationDTO test = new PersonalInformationDTO();
		int expected = testInt0;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetId2() {
		PersonalInformationDTO test = new PersonalInformationDTO();
		int expected = testIntMax;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetId3() {
		PersonalInformationDTO test = new PersonalInformationDTO();
		int expected = testIntMin;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#setName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetName() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#getName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetName() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#setTelNum(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetTelNum() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#getTelNum()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTelNum() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#setEmail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#getEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#setPostalCode(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPostalCode1() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringNull;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetName2() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringKara;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetName3() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringSpace;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetName4() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringHankaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetName5() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#getPostalCode()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPostalCode() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#setAddress(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddress() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress() {
		fail("まだ実装されていません");
	}

}
