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
	public void testSetName1() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringNull;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetName2() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringKara;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetName3() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringSpace;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetName4() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringHankaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetName5() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#getName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetName1() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringNull;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetName2() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringKara;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetName3() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringSpace;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetName4() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringHankaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetName5() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#setTelNum(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetTelNum1() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringNull;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetTelNum2() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringKara;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetTelNum3() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringSpace;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetTelNum4() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringHankaku;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetTelNum5() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringZenkaku;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#getTelNum()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTelNum1() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringNull;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetTelNum2() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringKara;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetTelNum3() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringSpace;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetTelNum4() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringHankaku;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetTelNum5() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringZenkaku;

        test.setTelNum(expected);
        String actual = test.getTelNum();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#setEmail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail1() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringNull;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetEmail2() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringKara;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetEmail3() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringSpace;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetEmail4() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringHankaku;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetEmail5() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringZenkaku;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#getEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail1() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringNull;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetEmail2() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringKara;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetEmail3() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringSpace;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetEmail4() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringHankaku;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetEmail5() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringZenkaku;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#setPostalCode(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPostalCode1() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringNull;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetPostalCode2() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringKara;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetPostalCode3() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringSpace;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetPostalCode4() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringHankaku;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetPostalCode5() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringZenkaku;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#getPostalCode()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPostalCode1() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringNull;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetPostalCode2() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringKara;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetPostalCode3() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringSpace;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetPostalCode4() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringHankaku;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetPostalCode5() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringZenkaku;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#setAddress(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddress1() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringNull;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetAddress2() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringKara;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetAddress3() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringSpace;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetAddress4() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringHankaku;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetAddress5() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringZenkaku;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PersonalInformationDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress1() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringNull;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetAddress2() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringKara;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetAddress3() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringSpace;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetAddress4() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringHankaku;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetAddress5() {
		PersonalInformationDTO test = new PersonalInformationDTO();
        String expected = testStringZenkaku;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
	}

}
