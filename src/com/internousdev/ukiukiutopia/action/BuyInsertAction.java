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
	 * チケット注文情報をデータベースに格納するメソッド
	 * @return result チケット注文情報がデータベースに格納できたか否か
	 */
	public String execute() {

		String result = ERROR;
		BuyCompleteDAO dao = new BuyCompleteDAO();

		String email = (String) session.get("userEmail");
		String token = (String) session.get("buyCordToken");
		String number = (String) session.get("buyCordNumber");
		dao.updateToUser(token, number, email);

		int userId = dao.selectUserId(email);

		DateTime dt = new DateTime();
		String registeredDate = dt.toString(DateTimeFormat.mediumDateTime());
		dao.insertToOrder(userId, registeredDate);

		int orderId = dao.selectOrderId(userId, registeredDate);

		List<TicketDataDTO> useList = (ArrayList<TicketDataDTO>) session.get("buyUseTicket");
		List<TicketDataDTO> optionList = (ArrayList<TicketDataDTO>) session.get("buyOptionTicket");
		
		for (int i = 0; i < useList.size(); i++) {
			TicketDataDTO dto = useList.get(i);
			int ticketId = dto.getId();
			int sheets = dto.getSheets();
			int buySubTotal = dto.getSubTotal();
			dao.insertToOrderTicket(orderId, ticketId, sheets, buySubTotal, registeredDate);
		}

		for (int i = 0; i < optionList.size(); i++) {
			TicketDataDTO dto = optionList.get(i);
			int ticketId = dto.getId();
			int sheets = dto.getSheets();
			int buySubTotal = dto.getSubTotal();
			dao.insertToOrderTicket(orderId, ticketId, sheets, buySubTotal, registeredDate);
		}

		result = SUCCESS;
		return result;

	}

	/**
     * セッションの設定メソッド
     * @param session セッション
     */
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

}
