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

   /**
    * 個人情報と購入履歴を検索して取得するクラス
    * @author K.Kato
    * @version 1.1
    * @since 1.0
    */
public class PersonalInformationDAO {

	Connection con;
	boolean action;

	private PersonalInformationDTO personal = new PersonalInformationDTO();
	private List<PurchaseHistoryDTO> historylList = new ArrayList<PurchaseHistoryDTO>();

	/**
	 * 個人情報を検索するメソッド
	 * @param emailaddress
	 * @return action
	 * @throws Exception
	 */
	public boolean select(String emailaddress) throws Exception {
		action = false;
		con = DBConnector.getConnection();

		try {
			String sql = "select * from user where email = ?";

			PreparedStatement ps2;
			ps2 = con.prepareStatement(sql);
			ps2.setString(1, emailaddress);
			ResultSet rs = ps2.executeQuery();
			if (rs.next()) {
				action = true;

				PersonalInformationDTO dto = new PersonalInformationDTO();
				dto.setId(rs.getInt(1));
				dto.setName(rs.getString(4));
				dto.setTelNum(rs.getString(5));
				dto.setEmail(rs.getString(2));
				dto.setPostalCode(rs.getString(6));
				dto.setAddress(rs.getString(7));
				personal = dto;

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		} 
		return action;
		
	}

	
	/**
	 * 購入履歴を検索するメソッド
	 * @param userId
	 * @return action
	 * @throws Exception
	 */
	public boolean selectHistory(int userId) throws Exception {
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
			ps2.setInt(1, userId);
			ResultSet rs = ps2.executeQuery();
			while (rs.next()) {
				action = true;

				PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
				
				dto.setTotalAmount(rs.getFloat(4));
				dto.setName(rs.getString(1));
				dto.setSheets(rs.getInt(3));
				dto.setPrice(rs.getFloat(2));

				historylList.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		} // finally
		return action;
	}
	
	/**
	 * 個人情報を格納するメソッド
	 * @return personal
	 */
	public PersonalInformationDTO getPersonal() {
		return personal;
	}
    
	/**
	 * 個人情報を設定するメソッド
	 * @param personal
	 */
	public void setPersonal(PersonalInformationDTO personal) {
		this.personal = personal;
	}
    /**
     * 購入履歴を格納するメソッド
     * @return historylList
     */
	public List<PurchaseHistoryDTO> getHistorylList() {
		return historylList;
	}
	

}
