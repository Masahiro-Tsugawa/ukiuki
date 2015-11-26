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
 * 
 * @author K.Kato
 * @version 1.1
 * @since 1.0
 */
public class GoMyPageAction extends ActionSupport implements SessionAware {
	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = 5755890205879217612L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * チケット購入履歴のリスト
	 */
	private List<PurchaseHistoryDTO> historylList = new ArrayList<PurchaseHistoryDTO>();

	/**
	 * 名前
	 */
	private String name;

	/**
	 * 電話番号
	 */
	private String telNum;

	/**
	 * メールアドレス
	 */
	private String email;

	/**
	 * 郵便番号
	 */
	private String postalCode;

	/**
	 * 住所
	 */
	private String address;

	/**
	 * 登録者情報をDAOから取得し、登録者情報を格納するメソッド
	 * 
	 * @return result 処理が行われているか否か

	 */
	public String execute() {
		String result = ERROR;
		String emailAddress = (String) session.get("userEmail");
		if (emailAddress == null) {
			return result;
		}

		PersonalInformationDAO dao = new PersonalInformationDAO();
		if (!dao.select(emailAddress)) {
			return result;
		}

		PersonalInformationDTO dto = dao.getPersonal();
		name = dto.getName();
		telNum = dto.getTelNum();
		email = dto.getEmail();
		postalCode = dto.getPostalCode();
		address = dto.getAddress();

		int id = (int) session.get("userId");
		if (!dao.selectHistory(id)) {
			return result;
		}
		session.remove("errorMessage");
		session.remove("errorCardMessage");
		historylList.addAll(dao.getHistorylList());
		result = SUCCESS;
		return result;
	
	}

	/**
	 * セッションの値を格納するメソッド
	 * 
	 * @param session
	 *            セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 名前を取得するメソッド
	 * 
	 * @return name ユーザー名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 名前を格納するメソッド
	 * 
	 * @param name
	 *            ユーザー名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 電話番号を取得するメソッド
	 * 
	 * @return telNum 電話番号
	 */
	public String getTelNum() {
		return telNum;
	}

	/**
	 * 電話番号を格納するメソッド
	 * 
	 * @param telNum
	 *            電話番号
	 */
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	/**
	 * メールアドレスを取得するメソッド
	 * 
	 * @return email メールアドレス
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * メールアドレスを格納するメソッド
	 * 
	 * @param email
	 *            メールアドレス
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 郵便番号を取得するメソッド
	 * 
	 * @return postalCode 郵便番号
	 */

	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * 郵便番号を格納するメソッド
	 * 
	 * @param postalCode
	 *            郵便番号
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * 住所を取得するメソッド
	 * 
	 * @return address 住所
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 住所を格納するメソッド
	 * 
	 * @param address
	 *            住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 購入履歴リストを取得するメソッド
	 * 
	 * @return historylList 購入履歴のリスト
	 */
	public List<PurchaseHistoryDTO> getHistorylList() {
		return historylList;
	}

	/**
	 * 購入履歴リストを格納するメソッド
	 * 
	 * @param historylList
	 *            購入履歴のリスト
	 */
	public void setHistorylList(List<PurchaseHistoryDTO> historylList) {
		this.historylList = historylList;
	}

}