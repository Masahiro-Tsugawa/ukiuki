/**
 * 
 */
package com.internousdev.ukiukiutopia.action;

import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import com.internousdev.ukiukiutopia.dao.AdminTicketUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理ページからチケットを編集する為のクラス
 * @author S.Mizukoshi
 * @version 1.1
 * @since 1.0
 */
public class AdminTicketUpdateAction extends ActionSupport {

	/**
	 * 生成したシリアルID
	 */
	private static final long serialVersionUID = -1940426436979713361L;
	/***
	 * 編集したいチケットのID
	 */
	private int updateId;
	/***
	 * 編集したいチケット名
	 */
	private String updateName;
	/***
	 * 編集したいチケットの値段
	 */
	private float updatePrice;
	/***
	 * 編集したいチケットの種類
	 */
	private String updateTicketType;
	/***
	 * 編集したいチケットの販売状態
	 */
	private boolean updateIsSale;
	/***
	 * 編集したいチケットの更新日
	 */
	private String updateRenewDate;
	/***
	 * 編集したいチケットの詳細情報
	 */
	private String updateTicketInfo;

	/***
	 * DAOの実行成功数
	 */
	int up=0;
	/***
	 * チケット名変更実行成功
	 */
	int upN=0;
	/***
	 * 値段変更実行成功
	 */
	int upP=0;
	/***
	 * 販売状態変更実行成功
	 */
	int upI=0;
	/***
	 * チケット種類変更実行成功
	 */
	int upTT=0;
	/***
	 * チケット実行成功
	 */
	int upTI=0;
	/***
	 * DAOの実行成功数
	 */
	int upRD=0;
	
	/***
	 * 実行結果
	 */
	public String result=ERROR;
	
	/**
	 * 管理者ページからチケットを編集するメソッド
	 * @return SUCCESS
	 */
		public String execute() throws Exception {
		
		DateTime dt = new DateTime();
		updateRenewDate = dt.toString(DateTimeFormat.mediumDateTime());

		AdminTicketUpdateDAO dao = new AdminTicketUpdateDAO();
		
		if(("".equals(updateId)) == false){
		 if(("".equals(updateName)) == false){
			 upN = dao.updateName(updateId,updateName);
		   }
		 
		 if(("".equals(updatePrice)) == false){
			 upP = dao.updatePrice(updateId,updatePrice);
		   }
		 
		 if(("".equals(updateIsSale)) == false){
			 upI = dao.updateIsSale(updateId,updateIsSale);
		   }
		 
		 if(("".equals(updateTicketType)) == false){
			 upTT = dao.updateTicketType(updateId,updateTicketType);
		   }
		 
		 if(("".equals(updateTicketInfo)) == false){
			 upTI = dao.updateTicketInfo(updateId,updateTicketInfo);
		   }
		 
		 
		upRD = dao.updateRenewDate(updateId,updateRenewDate);
		 
		up = upN + upP + upI + upTT + upTI + upRD;
		
		if(up > 2){
			result = SUCCESS;
		  
		 }
		}
		return result;
		}

		/**
		 * 編集したいチケットのID取得するメソッド
		 * @return updateId
		 */
		public int getUpdateId() {
			return updateId;
		}
		/**
		 * 編集したいチケットのID格納するメソッド
		 * @param updateId 編集したいチケットのID
		 */
		public void setUpdateId(int updateId) {
			this.updateId = updateId;
		}
		/**
		 * 編集したいチケット名取得するメソッド
		 * @return updateName
		 */
		public String getUpdateName() {
			return updateName;
		}
		/**
		 * 編集したいチケット名格納するメソッド
		 * @param updateName 編集したいチケット名
		 */
		public void setUpdateName(String updateName) {
			this.updateName = updateName;
		}
		
		/**
		 * 編集したいチケットの値段取得するメソッド
		 * @return updatePrice
		 */
		public float getUpdatePrice() {
			return updatePrice;
		}
		/**
		 * 編集したいチケットの値段格納するメソッド
		 * @param updatePrice 編集したいチケットの値段
		 */
		public void setUpdatePrice(int updatePrice) {
			this.updatePrice = updatePrice;
		}

		/**
		 * 編集したいチケットの種類取得するメソッド
		 * @return updateTicketType
		 */
		public String getUpdateTicketType() {
			return updateTicketType;
		}
		/**
		 * 編集したいチケットの種類格納するメソッド
		 * @param updateTicketType 編集したいチケットの種類
		 */
		public void setUpdateTicketType(String updateTicketType) {
			this.updateTicketType = updateTicketType;
		}

		/**
		 * 編集したいチケットの販売状態取得するメソッド
		 * @return updateIsSale
		 */
		public boolean getUpdateIsSale() {
			return updateIsSale;
		}
		/**
		 * 編集したいチケットの販売状態格納するメソッド
		 * @param updateIsSale 編集したいチケットの販売状態
		 */
		public void setUpdateIsSale(boolean updateIsSale) {

			this.updateIsSale = updateIsSale;
		}

		/**
		 * 編集したいチケットの詳細取得するメソッド
		 * @return updateTicketInfo
		 */
		public String getUpdateTicketInfo() {
			return updateTicketInfo;
		}
		/**
		 * 編集したいチケットの詳細格納するメソッド
		 * @param updateTicketInfo 編集したいチケットの詳細
		 */
		public void setUpdateTicketInfo(String updateTicketInfo) {
			this.updateTicketInfo = updateTicketInfo;
		}
		
		/**
		 * 編集したいチケットの詳細取得するメソッド
		 * @return updateRenewDate
		 */
		public String getUpdateRenewDate() {
			return updateRenewDate;
		}
		/**
		 * 編集したいチケットの詳細格納するメソッド
		 * @param updateRenewDate 編集したいチケットの詳細
		 */
		public void setUpdateRenewDate(String updateRenewDate) {
			this.updateRenewDate = updateRenewDate;
		}
}
