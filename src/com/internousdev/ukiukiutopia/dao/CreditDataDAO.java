package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ukiukiutopia.util.DBConnector;


public class CreditDataDAO {
	
	private List<String> creditData = new ArrayList<String>();
	
	public boolean select(String email) throws Exception {
		System.out.println("select - メソッド実行");
		System.out.println("EmailAddr:" + email + "を検索");
		Connection con = DBConnector.getConnection();
		boolean result = false;
		try {
			String sql = "select * from user where email = ?";
			
			PreparedStatement ps;
			ps = con.prepareStatement(sql);

			System.out.println("select - ps - " + ps);
			ps.setString(1, email);
			System.out.println("select - sql実行");
			ResultSet rs = ps.executeQuery();
			System.out.println(rs);
			if (rs.next()) {
				String creditToken = rs.getString(9);
				creditData.add(creditToken);
				String creditNum = rs.getString(10);
				creditData.add(creditNum);
				result = true;
				System.out.println("select - itemList - OK");
			} // while

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		} // finally

		return result;
		
	}

	public List<String> getCreditData() {
		return creditData;
	}

	public void setCreditData(List<String> creditData) {
		this.creditData = creditData;
	}

}
