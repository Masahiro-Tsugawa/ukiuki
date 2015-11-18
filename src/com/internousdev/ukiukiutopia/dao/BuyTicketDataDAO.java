package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ukiukiutopia.dto.BuyTicketDataDTO;
import com.internousdev.ukiukiutopia.util.DBConnector;


public class BuyTicketDataDAO {

	private Connection con;
	private boolean action = false;
	private int totalAmount=0;

	private List<BuyTicketDataDTO> buyUseTicketList = new ArrayList<BuyTicketDataDTO>();
	private List<BuyTicketDataDTO> buyOptionTicketList = new ArrayList<BuyTicketDataDTO>();

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

			BuyTicketDataDTO dto = new BuyTicketDataDTO();

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

			BuyTicketDataDTO dto = new BuyTicketDataDTO();

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

	public List<BuyTicketDataDTO> getBuyUseTicketList() {
		return this.buyUseTicketList;
	}

	public List<BuyTicketDataDTO> getBuyOptionTicketList() {
		return this.buyOptionTicketList;
	}
	
	public int getTotalAmount(){
		return this.totalAmount;
	}

	public void setBuyUseTicketList(List<BuyTicketDataDTO> buyUseTicketList) {
		this.buyUseTicketList = buyUseTicketList;
	}

	public void setBuyOptionTicketList(List<BuyTicketDataDTO> buyOptionTicketList) {
		this.buyOptionTicketList = buyOptionTicketList;
	}
}
