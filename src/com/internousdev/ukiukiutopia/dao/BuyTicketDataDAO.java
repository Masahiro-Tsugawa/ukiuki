package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ukiukiutopia.dto.TicketDataDTO;
import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * 購入するチケットの情報をリストに格納する為のクラス
 * @author  N.Minami
 * @version 1.1
 * @since 1.0
 */
public class BuyTicketDataDAO {

	/**
	 * 購入するチケットの合計金額
	 */
	private int totalAmount=0;
	/**
	 * 購入する施設利用チケット情報のリスト
	 */
	private List<TicketDataDTO> buyUseTicketList = new ArrayList<TicketDataDTO>();
	/**
	 * 購入するオプションチケット情報のリスト
	 */
	private List<TicketDataDTO> buyOptionTicketList = new ArrayList<TicketDataDTO>();
	

	/**
	 * 購入する施設利用チケット情報のリストを作成するメソッド
	 * @param id 購入する施設利用チケットのID
	 * @param sheets 購入する施設利用チケットの枚数
	 * @return result 
	 * @throws Exception
	 */
	public boolean createBuyUseTicketList(int id, int sheets) throws Exception {
		boolean result = false;
		Connection con = DBConnector.getConnection();
		try {
			String sql = "select * from ticket where ticket_type='use' and id=?";

			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			rs.next();
			TicketDataDTO dto = new TicketDataDTO();

			dto.setId(rs.getInt(1));
			dto.setName(rs.getString(2));
			dto.setPrice(rs.getInt(3));
			dto.setType(rs.getString(4));
			dto.setSheets(sheets);
			dto.setSubTotal(sheets*rs.getInt(3));
			totalAmount+=dto.getSubTotal();
			
			buyUseTicketList.add(dto);
			result = true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

		return result;
	}
	
	
	/**
	 * 購入する施設利用チケット情報のリストを作成するメソッド
	 * @param id
	 * @param sheets
	 * @return result
	 * @throws Exception
	 */
	public boolean createBuyOptionTicketList(int id, int sheets) throws Exception {
		boolean result = false;
		Connection con = DBConnector.getConnection();
		try {
			String sql = "select * from ticket where ticket_type='option' and id=?";

			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			rs.next();

			TicketDataDTO dto = new TicketDataDTO();

			dto.setId(rs.getInt(1));
			dto.setName(rs.getString(2));
			dto.setPrice(rs.getInt(3));
			dto.setType(rs.getString(4));
			dto.setSheets(sheets);
			dto.setSubTotal(sheets*rs.getInt(3));
			totalAmount+=dto.getSubTotal();

			buyOptionTicketList.add(dto);
			result = true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

		return result;
	}

	public List<TicketDataDTO> getBuyUseTicketList() {
		return this.buyUseTicketList;
	}

	public List<TicketDataDTO> getBuyOptionTicketList() {
		return this.buyOptionTicketList;
	}
	
	public int getTotalAmount(){
		return this.totalAmount;
	}

	public void setBuyUseTicketList(List<TicketDataDTO> buyUseTicketList) {
		this.buyUseTicketList = buyUseTicketList;
	}

	public void setBuyOptionTicketList(List<TicketDataDTO> buyOptionTicketList) {
		this.buyOptionTicketList = buyOptionTicketList;
	}
}
