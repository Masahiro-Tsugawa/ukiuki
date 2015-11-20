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
	boolean result=false;

	/**
	 * 管理者画面から任意のチケット情報を販売中止に変更するメソッド
	 * @param deleteId 
	 * @return rsIsSale 1以上なら販売中止に変更成功
	 * @throws Exception 
	 */
	public int updateIsSale(int deleteId)throws Exception{
		
		con = DBConnector.getConnection();
		int rsIsSale=0;
		
		try{
		String sql = "update ticket set is_sale=false where id=?";

		PreparedStatement ps;
		ps = con.prepareStatement(sql);
		ps.setInt(1,deleteId);
		rsIsSale = ps.executeUpdate();
		
		}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}
		return rsIsSale;
	}
	
	/**
	 * 管理者画面から任意のチケット情報を非表示に変更するメソッド
	 * @param deleteId 
	 * @return true
	 * @throws Exception 
	 */
	public int updateIsShow(int deleteId)throws Exception{
		
		con = DBConnector.getConnection();
		int rsIsShow=0;
		
		try{
		
		String sql = "update ticket set is_show=false where id=?";

		PreparedStatement ps;
		ps = con.prepareStatement(sql);
		ps.setInt(1,deleteId);
		rsIsShow = ps.executeUpdate();

		}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}
		return rsIsShow;
	}
}
