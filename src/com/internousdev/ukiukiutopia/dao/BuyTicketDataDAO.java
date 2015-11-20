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
 * @author N.Minami
 * @version 1.1
 * @since 1.0
 */
public class BuyTicketDataDAO {

	/**
	 * 購入するチケットの合計金額
	 */
	private int totalAmount = 0;
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
	 * 
	 * @param id 購入する施設利用チケットのID
	 * @param sheets 購入する施設利用チケットの枚数
	 * @return result 購入する施設利用チケット情報のリスト
	 * @throws Exception
	 */
	public boolean createBuyUseTicketList(int id, int sheets) throws Exception {
		boolean result = false;
		Connection con = DBConnector.getConnection();
		try {
			String sql = "select id,name,price,ticket_type from ticket where ticket_type='use' and id=?";

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
			dto.setSubTotal(sheets * rs.getInt(3));
			totalAmount += dto.getSubTotal();

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
	 * 購入するオプションチケット情報のリストを作成するメソッド
	 * @param id 購入すオプションチケットのID
	 * @param sheets 購入するオプションチケットの枚数
	 * @return result 購入するオプションチケットの枚数
	 * @throws Exception
	 */
	public boolean createBuyOptionTicketList(int id, int sheets) throws Exception {
		boolean result = false;
		Connection con = DBConnector.getConnection();
		try {
			String sql = "select id,name,price,ticket_type from ticket where ticket_type='option' and id=?";

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
			dto.setSubTotal(sheets * rs.getInt(3));
			totalAmount += dto.getSubTotal();

			buyOptionTicketList.add(dto);
			result = true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

		return result;
	}

	/**
	 * 購入する施設利用チケット情報のリストの取得メソッド
	 * @return buyUseTicketList 購入する施設利用チケット情報のリスト
	 */
	public List<TicketDataDTO> getBuyUseTicketList() {
		return this.buyUseTicketList;
	}

	/**
	 * 購入するオプションチケット情報のリストの取得メソッド
	 * @return buyOptionTicketList 購入するオプションチケット情報のリスト
	 */
	public List<TicketDataDTO> getBuyOptionTicketList() {
		return this.buyOptionTicketList;
	}

	/**
	 * 購入するチケットの合計金額取得メソッド
	 * @return totalAmount 購入するチケットの合計金額
	 */
	public int getTotalAmount() {
		return this.totalAmount;
	}

	/**
	 * 購入する施設利用チケット情報のリストの格納メソッド
	 * @param buyUseTicketList 購入する施設利用チケット情報のリスト
	 */
	public void setBuyUseTicketList(List<TicketDataDTO> buyUseTicketList) {
		this.buyUseTicketList = buyUseTicketList;
	}

	/**
	 * 購入するオプションチケット情報のリストの格納メソッド
	 * @param buyOptionTicketList 購入するオプションチケット情報のリスト
	 */
	public void setBuyOptionTicketList(List<TicketDataDTO> buyOptionTicketList) {
		this.buyOptionTicketList = buyOptionTicketList;
	}
}
