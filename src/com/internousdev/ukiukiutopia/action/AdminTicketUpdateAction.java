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

	/**
	 * 生成したシリアルID
	 */
	private static final long serialVersionUID = -1940426436979713361L;
	/***
	 * 編集したいチケットのID
	 */
	private int id;
	/***
	 * 編集したいチケット名
	 */
	private String name;
	/***
	 * 編集したいチケットの値段
	 */
	private float price;
	/***
	 * 編集したいチケットの種類
	 */
	private String ticketType;
	/***
	 * 編集したいチケットの販売状態
	 */
	private boolean isSale;
	/***
	 * 編集したいチケットの更新日
	 */
	private String renewDate;
	/***
	 * 編集したいチケットの詳細情報
	 */
	private String ticketInformation;

	/***
	 * DAOの実行成功数
	 */
	int count=0;
	/***
	 * チケット名変更実行成功
	 */
	int countName=0;
	/***
	 * 値段変更実行成功
	 */
	int countPrice=0;
	/***
	 * チケット種類変更実行成功
	 */
	int countTicketType=0;
	/***
	 * 販売状態変更実行成功
	 */
	int countIsSale=0;
	/***
	 * チケット実行成功
	 */
	int countTicketInformationrmation=0;
	/***
	 * DAOの実行成功数
	 */
	int countRenewDate=0;
	
	/***
	 * 実行結果
	 */
	public String result=ERROR;

	/***
	 * チケット編集ができなかった際のエラーメッセージ
	 */
	private String errorTicketUpdate;
	
	/**
	 * 管理者ページからチケットを編集するメソッド
	 * @return チケット編集の可否
	 */
		public String execute() throws Exception {
		
		DateTime dt = new DateTime();
		renewDate = dt.toString(DateTimeFormat.mediumDateTime());

		AdminTicketUpdateDAO dao = new AdminTicketUpdateDAO();
		
		if(id > 0){
		 if(("".equals(name)) == false){
			 countName = dao.updateName(id,name);
		   }
		 
		 if(price> 0){
			 countPrice = dao.updatePrice(id,price);
		   }
		 
		 if(("".equals(isSale)) == false){
			 countIsSale = dao.updateIsSale(id,isSale);
		   }
		 
		 if(("".equals(ticketType)) == false){
			 countTicketType = dao.updateTicketType(id,ticketType);
		   }
		 
		 if(("".equals(ticketInformation)) == false){
			 countTicketInformationrmation = dao.updateTicketInformation(id,ticketInformation);
		   }
		 
		 
		 countRenewDate = dao.updateRenewDate(id,renewDate);
		 
		 count = countName + countPrice + countIsSale + countTicketType + countTicketInformationrmation + countRenewDate;
		
		 if(count<1){
			 setErrorTicketUpdate("チケット情報の編集に失敗しました");
			 result = ERROR;
		 }
		 
		if(count >= 2){
			result = SUCCESS;
		 }
		}
		return result;
		}

		/**
		 * エラーメッセージを取得するメソッド
		 * @return errorTicketUpdate
		 */
		public String getErrorTicketUpdate(){
			return errorTicketUpdate;
		}
		/**
		 * エラーメッセージを格納するメソッド
		 * @param errorTicketUpdate エラーメッセージ
		 */
		public void setErrorTicketUpdate(String errorTicketUpdate) {
			this.errorTicketUpdate = errorTicketUpdate;
		}

		/**
		 * 編集したいチケットのID取得するメソッド
		 * @return updateId
		 */
		public int getUpdateId() {
			return id;
		}
		/**
		 * 編集したいチケットのID格納するメソッド
		 * @param updateId 編集したいチケットのID
		 */
		public void setUpdateId(int updateId) {
			this.id = updateId;
		}
		/**
		 * 編集したいチケット名取得するメソッド
		 * @return updateName
		 */
		public String getUpdateName() {
			return name;
		}
		/**
		 * 編集したいチケット名格納するメソッド
		 * @param updateName 編集したいチケット名
		 */
		public void setUpdateName(String updateName) {
			this.name = updateName;
		}
		
		/**
		 * 編集したいチケットの値段取得するメソッド
		 * @return updatePrice
		 */
		public float getUpdatePrice() {
			return price;
		}
		/**
		 * 編集したいチケットの値段格納するメソッド
		 * @param updatePrice 編集したいチケットの値段
		 */
		public void setUpdatePrice(int updatePrice) {
			this.price = updatePrice;
		}

		/**
		 * 編集したいチケットの種類取得するメソッド
		 * @return updateTicketType
		 */
		public String getUpdateTicketType() {
			return ticketType;
		}
		/**
		 * 編集したいチケットの種類格納するメソッド
		 * @param updateTicketType 編集したいチケットの種類
		 */
		public void setUpdateTicketType(String updateTicketType) {
			this.ticketType = updateTicketType;
		}

		/**
		 * 編集したいチケットの販売状態取得するメソッド
		 * @return updateIsSale
		 */
		public boolean getUpdateIsSale() {
			return isSale;
		}
		/**
		 * 編集したいチケットの販売状態格納するメソッド
		 * @param updateIsSale 編集したいチケットの販売状態
		 */
		public void setUpdateIsSale(boolean updateIsSale) {

			this.isSale = updateIsSale;
		}

		/**
		 * 編集したいチケットの詳細取得するメソッド
		 * @return ticketInformation
		 */
		public String getTicketInformation() {
			return ticketInformation;
		}
		/**
		 * 編集したいチケットの詳細格納するメソッド
		 * @param ticketInformation 編集したいチケットの詳細
		 */
		public void setTicketInformation(String ticketInformation) {
			this.ticketInformation = ticketInformation;
		}
		
		/**
		 * 編集したいチケットの詳細取得するメソッド
		 * @return updateRenewDate
		 */
		public String getUpdateRenewDate() {
			return renewDate;
		}
		/**
		 * 編集したいチケットの詳細格納するメソッド
		 * @param updateRenewDate 編集したいチケットの詳細
		 */
		public void setUpdateRenewDate(String updateRenewDate) {
			this.renewDate = updateRenewDate;
		}
}
