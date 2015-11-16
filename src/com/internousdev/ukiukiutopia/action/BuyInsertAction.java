package com.internousdev.ukiukiutopia.action;

import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import com.internousdev.ukiukiutopia.dao.BuyCompleteDAO;
import com.internousdev.ukiukiutopia.dto.TicketDataDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyInsertAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;
	private int userId;//
	private int ticketId;
	private int sheets;
	private int orderId;
	private int buyTotal;//
	private int buySubTotal;//
	private String email;//
	private String token;//
	private String number;//
	private String registeredDate;//
	// private String ticketName;
	// private int price;
	// private int subtotal;

	public String execute() throws Exception {

		BuyCompleteDAO daoUpdate = new BuyCompleteDAO();

		email = (String) session.get("userEmail");
		token = (String) session.get("buyCordToken");
		number = (String) session.get("buyCordNumber");
		daoUpdate.updateToUser(token, number, email);

		BuyCompleteDAO daoSelectUserId = new BuyCompleteDAO();
		userId = daoSelectUserId.selectUserId(email);

		BuyCompleteDAO daoInsertOrder = new BuyCompleteDAO();
		DateTime dt = new DateTime();
		registeredDate = dt.toString(DateTimeFormat.mediumDateTime());
		daoInsertOrder.insertToOrder(userId, registeredDate);

		BuyCompleteDAO daoSelectOrderId = new BuyCompleteDAO();
		orderId = daoSelectOrderId.selectOrderId(userId, registeredDate);

		BuyCompleteDAO daoInsertToOrderTicket = new BuyCompleteDAO();

		List<TicketDataDTO> useList = (List<TicketDataDTO>) session.get("buyUseTicket");
		List<TicketDataDTO> optionList = (List<TicketDataDTO>) session.get("buyOptionTicket");

		for (int i = 0; i < useList.size(); i++) {
			TicketDataDTO dto = useList.get(i);
			ticketId = dto.getId();
			sheets = dto.getSheets();
			buySubTotal = dto.getSubTotal();
			daoInsertToOrderTicket.insertToOrderTicket(orderId, ticketId, sheets, buySubTotal, registeredDate);

		}
		
		for (int i = 0; i < optionList.size(); i++) {
			TicketDataDTO dto = optionList.get(i);
			ticketId = dto.getId();
			sheets = dto.getSheets();
			buySubTotal = dto.getSubTotal();
			daoInsertToOrderTicket.insertToOrderTicket(orderId, ticketId, sheets, buySubTotal, registeredDate);

		}
		
		return "success";

	}

	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

}
