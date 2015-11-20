package com.internousdev.ukiukiutopia.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import com.internousdev.ukiukiutopia.dao.BuyCompleteDAO;
import com.internousdev.ukiukiutopia.dto.TicketDataDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ユーザーのチケット購入情報をDBへ登録する為のクラス
 * @author M.Namatame
 * @version 1.1
 * @since 1.0
 */
public class BuyInsertAction extends ActionSupport implements SessionAware {

	/**
	 * 生成されたシリアルID
	 */
	private static final long serialVersionUID = -122351250439871014L;

	/**
	 * セッションを利用
	 */
	private Map<String, Object> session;
	/**
	 * ユーザーID
	 */
	private int userId;
	/**
	 * チケットID
	 */
	private int ticketId;
	/**
	 * チケット購入枚数
	 */
	private int sheets;
	/**
	 * 注文ID
	 */
	private int orderId;
	/**
	 * 各チケットの小計
	 */
	private int buySubTotal;
	/**
	 * メールアドレス
	 */
	private String email;
	/**
	 * クレジットカードトークン
	 */
	private String token;
	/**
	 * クレジットカード下四桁
	 */
	private String number;
	/**
	 *　年月日秒を取得
	 */
	private String registeredDate;
	
	/**
	 * チケット注文情報をデータベースに格納するメソッド
	 * @return チケット注文情報がデータベースに格納できたか否か
	 */
	public String execute() throws Exception {

		BuyCompleteDAO dao = new BuyCompleteDAO();

		email = (String) session.get("userEmail");
		token = (String) session.get("buyCordToken");
		number = (String) session.get("buyCordNumber");
		dao.updateToUser(token, number, email);

		userId = dao.selectUserId(email);

		DateTime dt = new DateTime();
		registeredDate = dt.toString(DateTimeFormat.mediumDateTime());
		dao.insertToOrder(userId, registeredDate);

		orderId = dao.selectOrderId(userId, registeredDate);

		List<TicketDataDTO> useList = new ArrayList<TicketDataDTO>();
		useList.add((TicketDataDTO) session.get("buyUseTicket"));
		List<TicketDataDTO> optionList = new ArrayList<TicketDataDTO>();
		useList.add((TicketDataDTO) session.get("buyOptionTicket"));
		
		for (int i = 0; i < useList.size(); i++) {
			TicketDataDTO dto = useList.get(i);
			ticketId = dto.getId();
			sheets = dto.getSheets();
			buySubTotal = dto.getSubTotal();
			dao.insertToOrderTicket(orderId, ticketId, sheets, buySubTotal, registeredDate);

		}

		for (int i = 0; i < optionList.size(); i++) {
			TicketDataDTO dto = optionList.get(i);
			ticketId = dto.getId();
			sheets = dto.getSheets();
			buySubTotal = dto.getSubTotal();
			dao.insertToOrderTicket(orderId, ticketId, sheets, buySubTotal, registeredDate);

		}

		return SUCCESS;

	}

	/**
     * セッションの設定メソッド
     * @param session セッション
     */
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

}
