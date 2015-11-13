package com.internousdev.ukiukiutopia.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import com.internousdev.ukiukiutopia.dao.BuyCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyInsertAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;
	private int userId;
	private int ticketId;
	private int sheets;
	private int orderId;
	private int buyTotal;
	private String email;
	private String token;
	private String number;
	private String registeredDate;
//	private String ticketName;
//	private int price;
//	private int subtotal;

	public String execute() throws Exception {

		BuyCompleteDAO daoUpdate = new BuyCompleteDAO();

		session.put("userEmail", email);
		session.put("buyCordToken", token);
		session.put("buyCordNumber", number);
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
		session.put("buyTotal", buyTotal);
		daoInsertToOrderTicket.insertToOrderTicket(orderId, ticketId, sheets, buyTotal, registeredDate);

		return "success";

	}

	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

}
