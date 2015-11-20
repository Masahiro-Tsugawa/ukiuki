package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.PersonalInformationDAO;
import com.internousdev.ukiukiutopia.dto.PersonalInformationDTO;
import com.internousdev.ukiukiutopia.dto.PurchaseHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

    /**
     * マイページ画面を出力するためのクラス
     * @author K.Kato
     * @version 1.1
     * @since 1.0
     */
public class GoMyPageAction extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = 5755890205879217612L;
	
	private Map<String, Object> session;
	
	private List<PurchaseHistoryDTO> historylList = new ArrayList<PurchaseHistoryDTO>();
	private String result = ERROR;
	
	/**
	 * 名前を表示
	 */
	private String name;
	
	/**
	 * 電話番号を表示
	 */
	private String telNum;
	
	/**
	 * メールアドレスを表示
	 */
	private String email;
	
	/**
	 * 郵便番号を表示
	 */
	private String postalCode;
	
	/**
	 * 住所を表示
	 */
	private String address;
	
    /**
     * 登録者情報をDAOから取得し、登録者情報を格納するメソッド
     * @return result
     */
	public String execute() throws Exception{
		String emailAddress = (String)session.get("userEmail");
		System.out.println(session.get("userEmail"));
		if (emailAddress == null) {
			return ERROR;
		}
		
		
		PersonalInformationDAO pd = new PersonalInformationDAO();
		boolean resultDAO = pd.select(emailAddress);
		if (!resultDAO) {
			return ERROR;
		}
		
		
		PersonalInformationDTO personal = pd.getPersonal();
		name = personal.getName();
		telNum = personal.getTelNum();
		email = personal.getEmail();
		postalCode = personal.getPostalCode();
		address = personal.getAddress();
	
		int id = (int)session.get("userId");
		PersonalInformationDAO hd = new PersonalInformationDAO();
		boolean historyDAO = hd.selectHistory(id);
		if (!historyDAO) {
			return ERROR;
		}
		
		historylList.addAll(hd.getHistorylList());
		result = SUCCESS;
		return result;
	}

	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	
    /**
     * 名前を取得するメソッド
     * @return name　
     */
	public String getName() {
		return name;
	}
    
	/**
	 * 名前を設定するメソッド
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 電話番号を取得するメソッド
	 * @return telNum
	 */ 
	public String getTelNum() {
		return telNum;
	}
	
	/**
	 * 電話番号を設定するメソッド
	 * @param telNum
	 */
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	
    /**
     * メールアドレスを取得するメソッド
     * @return email
     */
	public String getEmail() {
		return email;
	}
	
    /**
     * メールアドレスを設定するメソッド
     * @param email
     */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 郵便番号を取得するメソッド
	 * @return postalCode
	 */

	public String getPostalCode() {
		return postalCode;
	}
	
    /**
     * 郵便番号を設定するメソッド
     * @param postalCode
     */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	/**
	 * 住所を所得するメソッド
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * 住所を設定するメソッド
	 * @param address 
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * リストを取得するメソッド
	 * @return 購入履歴のリスト
	 */
	public List<PurchaseHistoryDTO> getHistorylList() {
		return historylList;
	}
	
    /**
     * リストを設定するメソッド
     * @param historylList 購入履歴のリスト
     */
	public void setHistorylList(List<PurchaseHistoryDTO> historylList) {
		this.historylList = historylList;
	}
	
}