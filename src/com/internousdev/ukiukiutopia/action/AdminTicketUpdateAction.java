/**
 * 
 */
package com.internousdev.ukiukiutopia.action;

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
	
	/***
	 * 生成したシリアルID
	 */
	private static final long serialVersionUID = 1L;

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
	String up=null;
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
		
		
		int up = dao.update(updateId,updateName,updatePrice,updateTicketType,updateIsSale,
				updateRenewDate,updateTicketInfo);
		
		if(up > 0){
			result = SUCCESS;
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
		
}
