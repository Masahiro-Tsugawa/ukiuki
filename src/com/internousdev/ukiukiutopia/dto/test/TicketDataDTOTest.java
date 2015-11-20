/**
 * 
 */
package com.internousdev.ukiukiutopia.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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
	    
	    testDoubleNan   = Double.NaN;
        testDoubleMax   = Double.MAX_VALUE;
        testDoublePInf  = Double.POSITIVE_INFINITY;
        testDoubleNInf  = Double.NEGATIVE_INFINITY;
        testDoubleDelta = 0.0D;
	    
	    testStringNull    = null;
	    testStringKara    = "";
	    testStringSpace   = " ";
	    testStringHankaku = "abc123";
	    testStringZenkaku = "ａｂｃ１２３あいう漢字";
		
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#setId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetId() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetId() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#setName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetName() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#getName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetName() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#setType(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetType() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#getType()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetType() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#setInfo(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetInfo() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#getInfo()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetInfo() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#setSheets(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSheets() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#getSheets()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSheets() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#setSubTotal(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubTotal() {
		fail("まだ実装されていません");
	}

	/**
	 * {@link com.internousdev.ukiukiutopia.dto.TicketDataDTO#getSubTotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubTotal() {
		fail("まだ実装されていません");
	}

}
