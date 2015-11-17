package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.internousdev.ukiukiutopia.dto.PersonalInformationDTO;
import com.internousdev.ukiukiutopia.dto.PurchaseHistoryDTO;
import com.internousdev.ukiukiutopia.util.DBConnector;

public class PersonalInformationDAO {

	Connection con;
	boolean action;

	private PersonalInformationDTO personal = new PersonalInformationDTO();
	private List<PurchaseHistoryDTO> historylList = new ArrayList<PurchaseHistoryDTO>();

	// 検索するメソッド
	public boolean select(String emailaddress) throws Exception {
		System.out.println("select - メソッド実行");
		System.out.println("EmailAddr:" + emailaddress + "を検索");
		action = false;
		con = DBConnector.getConnection();

		try {
			String sql = "select * from user where email = ?";

			PreparedStatement ps2;
			ps2 = con.prepareStatement(sql);

			System.out.println("select - ps2 - " + ps2);
			ps2.setString(1, emailaddress);
			System.out.println("select - sql実行");
			ResultSet rs = ps2.executeQuery();
			System.out.println(rs);
			if (rs.next()) {
				action = true;

				PersonalInformationDTO dto = new PersonalInformationDTO();
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(6));

				dto.setId(rs.getInt(1));
				dto.setName(rs.getString(4));
				dto.setTelNum(rs.getString(5));
				dto.setEmail(rs.getString(2));
				dto.setPostalCode(rs.getString(6));
				dto.setAddress(rs.getString(7));
				personal = dto;
				System.out.println("select - itemList - OK");
			} // while

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		} // finally
		System.out.println("select - return - " + action);
		return action;
		
	}

	
	
	public boolean selectHistory(int userId) throws Exception {
		System.out.println("select - メソッド実行");
		System.out.println("EmailAddr:" + userId + "を検索");
		action = false;
		con = DBConnector.getConnection();

		try {
			String sql = "SELECT "
							+ "t.name, "
							+ "t.price, "
							+ "ot.sheets, "
					        + "ot.total_amount "
					   + "FROM user u "
					        + "LEFT OUTER JOIN `order` o ON u.id = o.user_id "
					        + "LEFT OUTER JOIN order_ticket ot ON o.id = ot.order_id "
					        + "LEFT OUTER JOIN ticket t ON ot.ticket_id = t.id "
					   + "WHERE u.id = ? order by o.id desc limit 5";

			PreparedStatement ps2;
			ps2 = con.prepareStatement(sql);

			System.out.println("select - ps2 - " + ps2);
			ps2.setInt(1, userId);
			System.out.println("select - sql実行");
			ResultSet rs = ps2.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				action = true;
				System.out.println("tanaka");

				PurchaseHistoryDTO dto = new PurchaseHistoryDTO();

				dto.setTotalAmount(rs.getFloat(4));
				dto.setName(rs.getString(1));
				dto.setSheets(rs.getInt(3));
				dto.setPrice(rs.getFloat(2));

				historylList.add(dto);
				System.out.println("select - itemList - OK");
			} // while

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		} // finally
		System.out.println("select - return - " + action);
		return action;
	}
	
	public PersonalInformationDTO getPersonal() {
		return personal;
	}

	public void setPersonal(PersonalInformationDTO personal) {
		this.personal = personal;
	}

	public List<PurchaseHistoryDTO> getHistorylList() {
		return historylList;
	}
	

}
