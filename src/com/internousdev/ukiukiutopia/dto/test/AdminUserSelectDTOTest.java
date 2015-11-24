/**
 * 
 */
package com.internousdev.ukiukiutopia.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO;

/**
 * @author internous
 *
 */
public class AdminUserSelectDTOTest {
	
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
		
		testStringNull = null;
		testStringKara = "";
		testStringSpace = " ";
		testStringHankaku = "abc123";
		testStringZenkaku = "ａｂｃ１２３あいう漢字";
		
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO#setEmail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail1() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringNull;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetEmail2() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringKara;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetEmail3() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringSpace;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetEmail4() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringHankaku;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetEmail5() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringZenkaku;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO#getEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail1() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringNull;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetEmail2() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringKara;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetEmail3() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringSpace;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetEmail4() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringHankaku;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetEmail5() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringZenkaku;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword1() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringNull;

        test.setPassword(expected);
        String actual = test.getPassword();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetPassword2() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringKara;

        test.setPassword(expected);
        String actual = test.getPassword();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetPassword3() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringSpace;

        test.setPassword(expected);
        String actual = test.getPassword();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetPassword4() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringHankaku;

        test.setPassword(expected);
        String actual = test.getPassword();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetPassword5() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringZenkaku;

        test.setPassword(expected);
        String actual = test.getPassword();

        assertEquals(expected, actual);
    }

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword1() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringNull;

        test.setPassword(expected);
        String actual = test.getPassword();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetPassword2() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringKara;

        test.setPassword(expected);
        String actual = test.getPassword();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetPassword3() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringSpace;

        test.setPassword(expected);
        String actual = test.getPassword();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetPassword4() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringHankaku;

        test.setPassword(expected);
        String actual = test.getPassword();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetPassword5() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringZenkaku;

        test.setPassword(expected);
        String actual = test.getPassword();

        assertEquals(expected, actual);
    }

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO#setName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetName1() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringNull;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetName2() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringKara;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetName3() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringSpace;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetName4() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringHankaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetName5() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO#getName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetName() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringNull;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetName2() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringKara;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetName3() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringSpace;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetName4() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringHankaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetName5() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO#setTelNum(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetTelNum1() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringNull;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetTelNum2() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringKara;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetTelNum3() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringSpace;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetTelNum4() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringHankaku;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetTelNum5() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringZenkaku;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO#getTelNum()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTelNum1() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringNull;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetTelNum2() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringKara;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetTelNum3() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringSpace;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetTelNum4() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringHankaku;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetTelNum5() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringZenkaku;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO#setPostalCode(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPostalCode1() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringNull;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetPostalCode2() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringKara;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetPostalCode3() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringSpace;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetPostalCode4() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringHankaku;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetPostalCode5() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringZenkaku;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO#getPostalCode()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPostalCode() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringNull;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetPostalCode2() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringKara;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetPostalCode3() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringSpace;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetPostalCode4() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringHankaku;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetPostalCode5() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringZenkaku;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO#setAddress(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddress1() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringNull;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetAddress2() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringKara;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetAddress3() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringSpace;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetAddress4() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringHankaku;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetAddress5() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringZenkaku;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
    }

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringNull;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetAddress2() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringKara;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetAddress3() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringSpace;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetAddress4() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringHankaku;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetAddress5() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringZenkaku;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
    }

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO#setRenewDate(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRenewDate1() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringNull;

        test.setRenewDate(expected);
        String actual = test.getRenewDate();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetRenewDate2() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringKara;

        test.setRenewDate(expected);
        String actual = test.getRenewDate();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetRenewDate3() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringSpace;

        test.setRenewDate(expected);
        String actual = test.getRenewDate();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetRenewDate4() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringHankaku;

        test.setRenewDate(expected);
        String actual = test.getRenewDate();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetRenewDate5() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringZenkaku;

        test.setRenewDate(expected);
        String actual = test.getRenewDate();

        assertEquals(expected, actual);
    }

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.AdminUserSelectDTO#getRenewDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRenewDate() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringNull;

        test.setRenewDate(expected);
        String actual = test.getRenewDate();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetRenewDate2() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringKara;

        test.setRenewDate(expected);
        String actual = test.getRenewDate();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetRenewDate3() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringSpace;

        test.setRenewDate(expected);
        String actual = test.getRenewDate();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetRenewDate4() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringHankaku;

        test.setRenewDate(expected);
        String actual = test.getRenewDate();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetRenewDate5() {
		AdminUserSelectDTO test = new AdminUserSelectDTO();
        String expected = testStringZenkaku;

        test.setRenewDate(expected);
        String actual = test.getRenewDate();

        assertEquals(expected, actual);
    }

}
