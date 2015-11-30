/**
 * 
 */
package com.internousdev.ukiukiutopia.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdev.ukiukiutopia.dto.AdminBoughtDTO;
import com.internousdev.ukiukiutopia.dto.PersonalInformationDTO;
import com.internousdev.ukiukiutopia.dto.PurchaseHistoryDTO;

/**
 * @author internous
 *
 */
public class PurchaseHistoryDTOTest {
	
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
		
		testStringNull = null;
		testStringKara = "";
		testStringSpace = " ";
		testStringHankaku = "abc123";
		testStringZenkaku = "ａｂｃ１２３あいう漢字";
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PurchaseHistoryDTO#setName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetName1() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
        String expected = testStringNull;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetName2() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
        String expected = testStringKara;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetName3() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetName4() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetName5() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PurchaseHistoryDTO#getName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetName1() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
        String expected = testStringNull;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetName2() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
        String expected = testStringKara;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetName3() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetName4() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetName5() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PurchaseHistoryDTO#setSheets(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSheets1() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		int expected = testInt0;

		test.setSheets(expected);
		int actual = test.getSheets();

		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetSheets2() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		int expected = testIntMax;

		test.setSheets(expected);
		int actual = test.getSheets();

		assertEquals(expected, actual);
	}
	@Test
	public void testSetSheets3() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		int expected = testIntMin;

		test.setSheets(expected);
		int actual = test.getSheets();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PurchaseHistoryDTO#getSheets()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSheets1() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		int expected = testInt0;

		test.setSheets(expected);
		int actual = test.getSheets();

		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetId2() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		int expected = testIntMax;

		test.setSheets(expected);
		int actual = test.getSheets();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetId3() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		int expected = testIntMin;

		test.setSheets(expected);
		int actual = test.getSheets();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PurchaseHistoryDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatNan;

		test.setPrice((int) expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testSetPrice2() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatMax;

		test.setPrice((int) expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testSetPrice3() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatPInf;

		test.setPrice((int) expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testSetPrice4() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatNInf;

		test.setPrice((int) expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testSetPrice5() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatDelta;

		test.setPrice((int) expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0F);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PurchaseHistoryDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatNan;

		test.setPrice((int) expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testGetPrice2() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatMax;

		test.setPrice((int) expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testGetPrice3() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatPInf;

		test.setPrice((int) expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testGetPrice4() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatNInf;

		test.setPrice((int) expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testGetPrice5() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatDelta;

		test.setPrice((int) expected);
		float actual = test.getPrice();

		assertEquals(expected, actual,0.0F);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PurchaseHistoryDTO#setTotalAmount(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetTotalAmount1() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatNan;

		test.setTotalAmount((int) expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testSetTotalAmount2() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatMax;

		test.setTotalAmount((int) expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testSetTotalAmount3() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatPInf;

		test.setTotalAmount((int) expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testSetTotalAmount4() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatNInf;

		test.setTotalAmount((int) expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testSetTotalAmount5() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatDelta;

		test.setTotalAmount((int) expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.PurchaseHistoryDTO#getTotalAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTotalAmount1() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatNan;

		test.setTotalAmount((int) expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testGetTotalAmount2() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatMax;

		test.setTotalAmount((int) expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testGetTotalAmount3() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatPInf;

		test.setTotalAmount((int) expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testGetTotalAmount4() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatNInf;

		test.setTotalAmount((int) expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}
	@Test
	public void testGetTotalAmount5() {
		PurchaseHistoryDTO test = new PurchaseHistoryDTO();
		float expected = testFloatDelta;

		test.setTotalAmount((int) expected);
		float actual = test.getTotalAmount();

		assertEquals(expected, actual,0.0F);
	}

}
