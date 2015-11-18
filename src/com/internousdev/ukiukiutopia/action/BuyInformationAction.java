package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.ukiukiutopia.dto.TicketDataDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * セッションに格納された購入情報を取得する為のクラス
 * @author M.Namatame　
 * @version　1.1
 * @since　1.0
 */
public class BuyInformationAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルのバージョン
	 */
	private static final long serialVersionUID = 3335803111845911636L;
	/**
	 * セッションを利用するためのフィールド
	 */
	private Map<String, Object> session;
	/**
	 * AssayListをインスタンス化
	 */
	private List<TicketDataDTO> use = new ArrayList<TicketDataDTO>();
	/**
	 * AssayListをインスタンス化
	 */
	private List<TicketDataDTO> option = new ArrayList<TicketDataDTO>();


	public String execute() {
		use = (ArrayList<TicketDataDTO>) session.get("buyUseTicket");
		option = (ArrayList<TicketDataDTO>) session.get("buyOptionTicket");
		
		return SUCCESS;
	}

	/**
	 * 利用券リスト取得メソッド
	 * @return 購入する利用券の情報
	 */
	public List<TicketDataDTO> getUseList() {
		return use;
	}

	/**
	 * オプション券取得メソッド
	 * @return　購入するオプション券の情報
	 */
	public List<TicketDataDTO> getOptionList() {
		return option;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
}
