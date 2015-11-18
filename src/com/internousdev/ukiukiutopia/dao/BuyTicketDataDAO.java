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
 *
 */
public class BuyTicketDataDAO {

	private Connection con;
	private boolean action = false;
	private int totalAmount=0;

	private List<TicketDataDTO> buyUseTicketList = new ArrayList<TicketDataDTO>();
	private List<TicketDataDTO> buyOptionTicketList = new ArrayList<TicketDataDTO>();

	public boolean setBuyUseTicketList(int id, int sheets) throws Exception {
		con = DBConnector.getConnection();
		try {
			String sql = "select * from ticket where ticket_type='use' and id=?";

			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			System.out.println("select - ps - " + ps);

			ResultSet rs = ps.executeQuery();
			System.out.println("select - sql実行");

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
			action = true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		} // finally

		return action;
	}
	
	public boolean setBuyOptionTicketList(int id, int sheets) throws Exception {
		con = DBConnector.getConnection();
		try {
			String sql = "select * from ticket where ticket_type='option' and id=?";

			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			System.out.println("select - ps - " + ps);

			ResultSet rs = ps.executeQuery();
			System.out.println("select - sql実行");

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
			action = true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		} // finally

		return action;
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
