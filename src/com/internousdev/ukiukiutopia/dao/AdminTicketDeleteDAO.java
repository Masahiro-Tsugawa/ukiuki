/**
 * 
 */
package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * DBからチケット情報の削除を実行する為のクラス
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminTicketDeleteDAO {
	/***
	 * DBと接続
	 */
	Connection con;
	/***
	 * 実行結果
	 */
	boolean action;

	/**
	 * チケット情報を削除するメソッド
	 * @param deleteId 
	 * @return true
	 * @throws Exception 
	 */
	public int delete(int deleteId)throws Exception{
		System.out.println("select - メソッド実行");
		System.out.println(deleteId);
		
		con = DBConnector.getConnection();
		int rscount=0;
		int rscount1=0;
		int rscount2=0;
		try{
		String sql1 = "update ticket set is_sale=false where id=?";

		PreparedStatement ps;
		ps = con.prepareStatement(sql1);
		ps.setInt(1,deleteId);
		rscount1 = ps.executeUpdate();
		
		String sql2 = "update ticket set is_show=false where id=?";

		PreparedStatement ps2;
		ps2 = con.prepareStatement(sql2);
		ps2.setInt(1,deleteId);
		rscount2 = ps2.executeUpdate();

		if(rscount1 > 0 | rscount2 > 0){
			rscount=1;
	     }
		}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}//finally

		return rscount;
	}
}
