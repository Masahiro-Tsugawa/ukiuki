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
	Connection con;
	boolean action;

//削除するメソッド
	public int delete(String delmail)throws Exception{
		System.out.println("select - メソッド実行");
		
		con = DBConnector.getConnection();
		int rscount=0;
		
		try{
		String sql = "delete from user where email=?";

		PreparedStatement ps;
		ps = con.prepareStatement(sql);
		ps.setString(1,delmail);
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
} //class

