package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.internousdev.ukiukiutopia.dao.BuyTicketDataDAO;
import com.internousdev.ukiukiutopia.dto.TicketDataDTO;
import com.internousdev.util.CreditCard;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * チケット購入画面で入力された値をセッションに格納する為のクラス
 * @author  N.Minami
 * @version 1.1
 * @since 1.0
 */
public class CreateOrderAction extends ActionSupport implements SessionAware {
	
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -6618589045944198322L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;
	/**
	 * 購入する施設利用チケットIDのリスト
	 */
	private List<Integer> useId;
	/**
	 * 購入する施設利用チケット枚数のリスト
	 */
	private List<Integer> useSheets;
	/**
	 * 購入するオプションチケットIDのリスト
	 */
	private List<Integer> optionId;
	/**
	 * 購入するオプションチケット枚数のリスト
	 */
	private List<Integer> optionSheets;
	/**
	 * 購入する施設利用チケットのリスト
	 */
	private List<TicketDataDTO> buyUseTicket = new ArrayList<TicketDataDTO>();
	/**
	 * 購入するオプションチケットのリスト
	 */
	private List<TicketDataDTO> buyOptionTicket = new ArrayList<TicketDataDTO>();
	/**
	 * 支払い方法
	 */
	private String payInfo;
	/**
	 * 新しく登録するクレジットカード番号
	 */
	private String creditNum;
	/**
	 * 新しく登録するクレジットカードの有効期限(月)
	 */
	private String creditMonth;
	/**
	 * 新しく登録するクレジットカードの有効期限(年)
	 */
	private String creditYear;
	/**
	 * 新しく登録するクレジットカードのセキュアコード
	 */
	private String secureCode;

	/**
	 * チケット購入画面で入力された値をセッションに格納するメソッド
	 * @return result すべての処理が完了したか否か
	 */
	public String execute() throws Exception {

		String result = ERROR;
		boolean resultDAO = false;

		BuyTicketDataDAO dao = new BuyTicketDataDAO();

		for (int i = 0; i < (int) session.get("useListSize"); i++) {
			if (useSheets.get(i) != 0) {
				resultDAO = dao.createBuyUseTicketList(useId.get(i), useSheets.get(i));
			}
		}

		for (int i = 0; i < (int) session.get("optionListSize"); i++) {
			if (optionSheets.get(i) != 0) {
				resultDAO = dao.createBuyOptionTicketList(optionId.get(i), optionSheets.get(i));
			}
		}

		if (resultDAO) {
			buyUseTicket.addAll(dao.getBuyUseTicketList());
			session.put("buyUseTicket", buyUseTicket);
			buyOptionTicket.addAll(dao.getBuyOptionTicketList());
			session.put("buyOptionTicket", buyOptionTicket);
			session.put("buyTotal", dao.getTotalAmount());
			result = SUCCESS;
		}else{
			session.put("errorMessege", "すべてのチケットの購入枚数が0枚になっています");
			return result;
		}

		session.put("buyPayInfo", payInfo);
		
		if (payInfo.equals("クレジットカード払い")) {
			CreditCard credit = new CreditCard();
			if (credit.isExists(creditNum)) {
				String creditDate = creditMonth + "/" + creditYear;
				credit.insert(creditNum, creditDate, secureCode, (int) session.get("userId"));
				session.put("buyCardToken", credit.getToken());
				session.put("buyCardNumber", credit.getCardNumber());
			}else{
				result = ERROR;
				session.put("errorMessege", "クレジットカードの入力情報に誤りがあります");
				return result;
			}
		}
		
		session.remove("errorMessege");

		return result;
	}

	/**
	 * セッション格納メソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 購入する施設利用チケットIDのリスト取得メソッド
	 * @return　useId　購入する施設利用チケットIDのリスト
	 */
	public List<Integer> getUseId() {
		return this.useId;
	}

	/**
	 * 購入する施設利用チケットIDのリスト格納メソッド
	 * @param useId 購入する施設利用チケットIDのリスト
	 */
	public void setUseId(List<Integer> useId) {
		this.useId = useId;
	}

	/**
	 * 購入する施設利用チケット枚数のリスト取得メソッド
	 * @return　useSheets　購入する施設利用チケット枚数のリスト
	 */
	public List<Integer> getUseSheets() {
		return this.useSheets;
	}

	/**
	 * 購入する施設利用チケット枚数のリスト格納メソッド
	 * @param useSheets 購入する施設利用チケット枚数のリスト
	 */
	public void setUseSheets(List<Integer> useSheets) {
		this.useSheets = useSheets;
	}

	/**
	 * 購入するオプションチケットIDのリスト取得メソッド
	 * @return　optionId　購入するオプションチケットIDのリスト
	 */
	public List<Integer> getOptionId() {
		return this.optionId;
	}

	/**
	 * 購入するオプションチケットIDのリスト格納メソッド
	 * @param optionId 購入するオプションチケットIDのリスト
	 */
	public void setOptionId(List<Integer> optionId) {
		this.optionId = optionId;
	}

	/**
	 * 購入するオプションチケット枚数のリスト取得メソッド
	 * @return　optionSheets　購入するオプションチケット枚数のリスト
	 */
	public List<Integer> getOptionSheets() {
		return this.optionSheets;
	}

	/**
	 * 購入するオプションチケット枚数のリスト格納メソッド
	 * @param optionSheets 購入するオプションチケット枚数のリスト
	 */
	public void setOptionSheets(List<Integer> optionSheets) {
		this.optionSheets = optionSheets;
	}

	/**
	 * 支払い方法取得メソッド
	 * @return　payInfo　支払い方法
	 */
	public String getPayInfo() {
		return payInfo;
	}

	/**
	 * 支払い方法格納メソッド
	 * @param payInfo 支払い方法
	 */
	public void setPayInfo(String payInfo) {
		this.payInfo = payInfo;
	}

	/**
	 * 新しく登録するクレジットカード番号取得メソッド
	 * @return　creditNum　新しく登録するクレジットカード番号
	 */
	public String getCreditNum() {
		return creditNum;
	}

	/**
	 * 新しく登録するクレジットカード番号格納メソッド
	 * @param creditNum 新しく登録するクレジットカード番号
	 */
	public void setCreditNum(String creditNum) {
		this.creditNum = creditNum;
	}

	/**
	 * 新しく登録するクレジットカードの有効期限(月)取得メソッド
	 * @return　creditMonth　新しく登録するクレジットカードの有効期限(月)
	 */
	public String getCreditMonth() {
		return creditMonth;
	}

	/**
	 * 新しく登録するクレジットカードの有効期限(月)格納メソッド
	 * @param creditMonth 新しく登録するクレジットカードの有効期限(月)
	 */
	public void setCreditMonth(String creditMonth) {
		this.creditMonth = creditMonth;
	}

	/**
	 * 新しく登録するクレジットカードの有効期限(年)取得メソッド
	 * @return　creditYear　新しく登録するクレジットカードの有効期限(年)
	 */
	public String getCreditYear() {
		return creditYear;
	}

	/**
	 * 新しく登録するクレジットカードの有効期限(年)格納メソッド
	 * @param creditYear 新しく登録するクレジットカードの有効期限(年)
	 */
	public void setCreditYear(String creditYear) {
		this.creditYear = creditYear;
	}

	/**
	 * 新しく登録するクレジットカードのセキュアコード取得メソッド
	 * @return　secureCode　新しく登録するクレジットカードのセキュアコード
	 */
	public String getSecureCode() {
		return secureCode;
	}

	/**
	 * 新しく登録するクレジットカードのセキュアコード格納メソッド
	 * @param secureCode 新しく登録するクレジットカードのセキュアコード
	 */
	public void setSecureCode(String secureCode) {
		this.secureCode = secureCode;
	}

}
