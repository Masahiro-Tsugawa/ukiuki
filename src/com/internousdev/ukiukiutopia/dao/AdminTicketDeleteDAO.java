/**
 * 
 */
package com.internousdev.ukiukiutopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.ukiukiutopia.util.DBConnector;

/**
 * @author internous
 *
 */
public class AdminTicketDeleteDAO {

	Connection con;
	boolean action;

//削除するメソッド
	public int delete(int delid)throws Exception{
		System.out.println("select - メソッド実行");
		
		con = DBConnector.getConnection();
		int rscount=0;
		
		try{
		String sql = "delete from user where email=?";

		PreparedStatement ps;
		ps = con.prepareStatement(sql);
		ps.setInt(1,delid);
		System.out.println("test");
		rscount = ps.executeUpdate();
		System.out.println("delete");

		if(rscount > 0){
			System.out.println("delete - デリート成功");
		}else{
			System.out.println("delete - デリート失敗");
		}

	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}//finally

		return rscount;
	}
}
