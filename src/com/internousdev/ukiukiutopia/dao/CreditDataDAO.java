package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * クレジットカード情報をリストに格納する為のクラス
 * @author  N.Minami
 * @version 1.1
 * @since 1.0
 *
 */
public class CreditDataDAO {
	
	/**
	 * 購入可能な施設利用チケットのリスト
	 */
	private List<String> creditDataList = new ArrayList<String>();
	
	/**
	 * ログインしている会員のクレジットカード情報取得メソッド
	 * @param email  ログインしている会員のメールアドレス
	 * @return result ログインしている会員のクレジットカード情報の有無
	 * @throws Exception データベースとの接続が終了しなかった際に起こるエラー
	 */
	public boolean select(String email) throws Exception {
		
		boolean result = false;
		Connection con = DBConnector.getConnection();
		
		try {
			String sql = "select credit_token,credit_num from user where email = ?";
			
			PreparedStatement ps;
			ps = con.prepareStatement(sql);

			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				String creditToken = rs.getString("credit_token");
				creditDataList.add(creditToken);
				String creditNum = rs.getString("credit_num");
				creditDataList.add(creditNum);
				result = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

		return result;
		
	}

	/**
	 * 購入可能な施設利用チケットのリスト取得メソッド
	 * @return creditDataList 購入可能な施設利用チケットのリスト
	 */
	public List<String> getCreditData() {
		return creditDataList;
	}

	/**
	 * 購入可能な施設利用チケットのリスト格納メソッド
	 * @param creditData 購入可能な施設利用チケットのリスト
	 */
	public void setCreditData(List<String> creditData) {
		this.creditDataList = creditData;
	}

}
