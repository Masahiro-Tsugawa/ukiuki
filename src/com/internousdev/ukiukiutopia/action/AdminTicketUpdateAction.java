/**
 * 
 */
package com.internousdev.ukiukiutopia.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.internousdev.ukiukiutopia.dao.AdminTicketUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理ページからチケットを編集する為のクラス
 * 
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
	 * 編集したいチケットの詳細情報
	 */
	private String ticketInformation;

	/***
	 * チケット編集ができなかった際のエラーメッセージ
	 */
	private String errorTicketUpdate;

	/**
	 * 管理者ページからチケットを編集するメソッド
	 * @return result チケット編集の可否
	 */
	public String execute() {

		String result = ERROR;
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String renewDate = sdf.format(c.getTime());

		AdminTicketUpdateDAO dao = new AdminTicketUpdateDAO();

		int count = 0;
		boolean isShow = dao.selectIsShow(updateId);
		
		if (isShow) {
			
			if (("".equals(updateName)) == false) {
				count += dao.updateName(updateId, updateName);
			}

			if (updatePrice > 0) {
				count += dao.updatePrice(updateId, updatePrice);
			}

			if (("".equals(updateIsSale)) == false) {
				count += dao.updateIsSale(updateId, updateIsSale);
			}

			if (("".equals(updateTicketType)) == false) {
				count += dao.updateTicketType(updateId, updateTicketType);
			}

			if (("".equals(ticketInformation)) == false) {
				count += dao.updateTicketInformation(updateId, ticketInformation);
			}

			count += dao.updateRenewDate(updateId, renewDate);

			if (count < 1) {
				setErrorTicketUpdate("チケット情報の編集に失敗しました");
				result = ERROR;
			}

			if (count >= 2) {
				result = SUCCESS;
			}
		}
		return result;
	}

	/**
	 * エラーメッセージを取得するメソッド
	 * @return errorTicketUpdate エラーメッセージ
	 */
	public String getErrorTicketUpdate() {
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
	 * 
	 * @return updateId 編集したいチケット
	 */
	public int getUpdateId() {
		return updateId;
	}

	/**
	 * 編集したいチケットのID格納するメソッド
	 * 
	 * @param updateId  編集したいチケットのID
	 */
	public void setUpdateId(int updateId) {
		this.updateId = updateId;
	}

	/**
	 * 編集したいチケット名取得するメソッド
	 * 
	 * @return updateName 編集したいチケット名
	 */
	public String getUpdateName() {
		return updateName;
	}

	/**
	 * 編集したいチケット名格納するメソッド
	 * 
	 * @param updateName  編集したいチケット名
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	/**
	 * 編集したいチケットの値段取得するメソッド
	 * 
	 * @return updatePrice 編集したいチケット
	 */
	public float getUpdatePrice() {
		return updatePrice;
	}

	/**
	 * 編集したいチケットの値段格納するメソッド
	 * 
	 * @param updatePrice 編集したいチケットの値段
	 */
	public void setUpdatePrice(int updatePrice) {
		this.updatePrice = updatePrice;
	}

	/**
	 * 編集したいチケットの種類取得するメソッド
	 * 
	 * @return updateTicketType 編集したいチケットの種類
	 */
	public String getUpdateTicketType() {
		return updateTicketType;
	}

	/**
	 * 編集したいチケットの種類格納するメソッド
	 * 
	 * @param updateTicketType 編集したいチケットの種類
	 */
	public void setUpdateTicketType(String updateTicketType) {
		this.updateTicketType = updateTicketType;
	}

	/**
	 * 編集したいチケットの販売状態取得するメソッド
	 * 
	 * @return updateIsSale 編集したいチケットの販売状態
	 */
	public boolean getUpdateIsSale() {
		return updateIsSale;
	}

	/**
	 * 編集したいチケットの販売状態格納するメソッド
	 * 
	 * @param updateIsSale 編集したいチケットの販売状態
	 */
	public void setUpdateIsSale(boolean updateIsSale) {

		this.updateIsSale = updateIsSale;
	}

	/**
	 * 編集したいチケットの詳細取得するメソッド
	 * 
	 * @return ticketInformation 編集したいチケットの詳細
	 */
	public String getTicketInformation() {
		return ticketInformation;
	}

	/**
	 * 編集したいチケットの詳細格納するメソッド
	 * 
	 * @param ticketInformation 編集したいチケットの詳細
	 */
	public void setTicketInformation(String ticketInformation) {
		this.ticketInformation = ticketInformation;
	}

}
