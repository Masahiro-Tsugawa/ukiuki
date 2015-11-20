/**
 * 
 */
package com.internousdev.ukiukiutopia.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdev.ukiukiutopia.dto.TicketDataDTO;

/**
 * @author internous
 *
 */
public class TicketDataDTOTest {

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
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#setId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetIｄ1() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testInt0;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetIｄ2() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testIntMax;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}
	@Test
	public void testSetIｄ3() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testIntMin;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#getId()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetId1() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testInt0;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetId2() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testIntMax;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetId3() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testIntMin;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#setName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetName1() {
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
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#getName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetName1() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringNull;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetName2() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringKara;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetName3() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringSpace;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetName4() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringHankaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetName5() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#setPrice(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testInt0;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetPrice2() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testIntMax;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice3() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testIntMin;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#getPrice()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testInt0;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetPrice2() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testIntMax;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice3() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testIntMin;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#setType(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetType1() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringNull;

        test.setType(expected);
        String actual = test.getType();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetType2() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringKara;

        test.setType(expected);
        String actual = test.getType();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetType3() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringSpace;

        test.setType(expected);
        String actual = test.getType();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetType4() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringHankaku;

        test.setType(expected);
        String actual = test.getType();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetType5() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringZenkaku;

        test.setType(expected);
        String actual = test.getType();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#getType()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetType1() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringNull;

        test.setType(expected);
        String actual = test.getType();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetType2() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringKara;

        test.setType(expected);
        String actual = test.getType();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetType3() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringSpace;

        test.setType(expected);
        String actual = test.getType();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetType4() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringHankaku;

        test.setType(expected);
        String actual = test.getType();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetType5() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringZenkaku;

        test.setType(expected);
        String actual = test.getType();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#setInfo(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetInfo1(){
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringNull;

        test.setInfo(expected);
        String actual = test.getInfo();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetInfo2() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringKara;

        test.setInfo(expected);
        String actual = test.getInfo();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetInfo3() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringSpace;

        test.setInfo(expected);
        String actual = test.getInfo();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetInfo4() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringHankaku;

        test.setInfo(expected);
        String actual = test.getInfo();

        assertEquals(expected, actual);
    }
	@Test
	public void testSetInfo5() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringZenkaku;

        test.setInfo(expected);
        String actual = test.getInfo();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#getInfo()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetInfo1() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringNull;

        test.setInfo(expected);
        String actual = test.getInfo();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetInfo2() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringKara;

        test.setInfo(expected);
        String actual = test.getInfo();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetInfo3() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringSpace;

        test.setInfo(expected);
        String actual = test.getInfo();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetInfo4() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringHankaku;

        test.setInfo(expected);
        String actual = test.getInfo();

        assertEquals(expected, actual);
    }
	@Test
	public void testGetInfo5() {
		TicketDataDTO test = new TicketDataDTO();
        String expected = testStringZenkaku;

        test.setInfo(expected);
        String actual = test.getInfo();

        assertEquals(expected, actual);
    }

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#setSheets(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSheets1() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testInt0;

		test.setSheets(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}
	@Test
	public void testSetSheets2() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testIntMax;

		test.setSheets(expected);
		int actual = test.getSheets();

		assertEquals(expected, actual);
	}
	@Test
	public void testSetSheets3() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testIntMin;

		test.setSheets(expected);
		int actual = test.getSheets();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#getSheets()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSheets1() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testInt0;

		test.setSheets(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetSheets2() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testIntMax;

		test.setSheets(expected);
		int actual = test.getSheets();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetSheets3() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testIntMin;

		test.setSheets(expected);
		int actual = test.getSheets();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#setSubTotal(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubTotal1() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testInt0;

		test.setSubTotal(expected);
		int actual = test.getSubTotal();

		assertEquals(expected, actual);
	}
	@Test
	public void testSetSubTotal2() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testIntMax;

		test.setSubTotal(expected);
		int actual = test.getSubTotal();

		assertEquals(expected, actual);
	}
	@Test
	public void testSetSubTotal3() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testIntMin;

		test.setSubTotal(expected);
		int actual = test.getSubTotal();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#getSubTotal()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubTotal1() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testInt0;

		test.setSubTotal(expected);
		int actual = test.getSubTotal();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetSubTotal2() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testIntMax;

		test.setSubTotal(expected);
		int actual = test.getSubTotal();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetSubTotal3() {
		TicketDataDTO test = new TicketDataDTO();
		int expected = testIntMin;

		test.setSubTotal(expected);
		int actual = test.getSubTotal();

		assertEquals(expected, actual);
	}
}
