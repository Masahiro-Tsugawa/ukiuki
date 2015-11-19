package com.internousdev.ukiukiutopia.dao;
/**
 * 
 */


import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.ukiukiutopia.util.DBConnector;



/**
 * @author internous
 *
 */
public class AdminUserDeleteDAO {
	/***
	 * DBと接続
	 */
	Connection con;
	/***
	 * 実行結果
	 */
	int rscount=0;

	/**
	 * 購入情報を検索するメソッド
	 * @param delmail 
	 * @param dto 
	 * @return rscout true：削除成功
	 * @throws Exception 
	 */
	public int delete(String delmail)throws Exception{
		
		con = DBConnector.getConnection();
		
		try{
		String sql = "delete from user where email=?";

		PreparedStatement ps;
		ps = con.prepareStatement(sql);
		ps.setString(1,delmail);
		rscount = ps.executeUpdate();

		if(rscount < 0){
			
			return rscount;
		}

	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}//finally

		return rscount;
	}
} //class

