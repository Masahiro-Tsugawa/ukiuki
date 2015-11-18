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
		System.out.println("test");
		rscount1 = ps.executeUpdate();
		System.out.println("delete");
		
		String sql2 = "update ticket set is_show=false where id=?";

		PreparedStatement ps2;
		ps2 = con.prepareStatement(sql2);
		ps2.setInt(1,deleteId);
		System.out.println("test");
		rscount2 = ps2.executeUpdate();
		System.out.println("delete");

		if(rscount1 > 0 | rscount2 > 0){
			System.out.println("delete - デリート成功");
			rscount=1;
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
