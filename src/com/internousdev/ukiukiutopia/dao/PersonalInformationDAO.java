package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
	/**
	 * 個人情報
	 */
	private PersonalInformationDTO personal = new PersonalInformationDTO();
	
	/**
	 * 購入履歴のリスト
	 */
	private List<PurchaseHistoryDTO> historylList = new ArrayList<PurchaseHistoryDTO>();

	/**
	 * 個人情報を検索するメソッド
	 * @param emailAddress メールアドレス
	 * @return result 処理が行われたか否か
	 */
	public boolean select(String emailAddress){
		
		boolean result = false;
		Connection con = DBConnector.getConnection();

		try {
			String sql = "select id,name,tel_num,email,postal_code,address from user where email = ?";

			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ps.setString(1, emailAddress);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				personal.setId(rs.getInt(1));
				personal.setName(rs.getString(2));
				personal.setTelNum(rs.getString(3));
				personal.setEmail(rs.getString(4));
				personal.setPostalCode(rs.getString(5));
				personal.setAddress(rs.getString(6));

				result = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
		return result;
	}

	
	/**
	 * 購入履歴を検索するメソッド
	 * @param userId ユーザーID
	 * @return result 処理が行われたか否か
	 */
	public boolean selectHistory(int userId){
		
		boolean result = false;
		Connection con = DBConnector.getConnection();

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

			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
				
				dto.setTotalAmount(rs.getInt(4));
				dto.setName(rs.getString(1));
				dto.setSheets(rs.getInt(3));
				dto.setPrice(rs.getInt(2));

				historylList.add(dto);
				result = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	/**
	 * 個人情報を取得するメソッド
	 * @return personal 個人情報
	 */
	public PersonalInformationDTO getPersonal() {
		return personal;
	}
    
	/**
	 * 個人情報を格納するメソッド
	 * @param personal 個人情報
	 */
	public void setPersonal(PersonalInformationDTO personal) {
		this.personal = personal;
	}
    /**
     * 購入履歴を取得するメソッド
     * @return historylList 購入履歴
     */
	public List<PurchaseHistoryDTO> getHistorylList() {
		return historylList;
	}
	

}
