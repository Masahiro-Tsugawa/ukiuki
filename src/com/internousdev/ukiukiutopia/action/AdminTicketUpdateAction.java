/**
 * 
 */
package com.internousdev.ukiukiutopia.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import com.internousdev.ukiukiutopia.dao.AdminTicketUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class AdminTicketUpdateAction extends ActionSupport implements SessionAware{

	private int updateId;
	private String updateName;
	private float updatePrice;
	private String updateTicketType;
	private boolean updateIsSale;
	private String updateRenewDate;
	private String updateTicketInfo;
	
	String up=null;
	public String result=ERROR;
	private Map<String, Object> session;
	
	private static final long serialVersionUID = 1L;

		public String execute() throws Exception {
		
		DateTime dt = new DateTime();
		updateRenewDate = dt.toString(DateTimeFormat.mediumDateTime());

		AdminTicketUpdateDAO dao = new AdminTicketUpdateDAO();
		
		
		int up = dao.update(updateId,updateName,updatePrice,updateTicketType,updateIsSale,updateRenewDate,updateTicketInfo);

		if(up > 0){
			result = SUCCESS;
		}
		return result;
		}

		public int getUpdateId() {
			return updateId;
		}

		public void setUpdateId(int updateId) {
			this.updateId = updateId;
		}
		public String getUpdateName() {
			return updateName;
		}

		public void setUpdateName(String updateName) {
			this.updateName = updateName;
		}
		public float getUpdatePrice() {
			return updatePrice;
		}

		public void setUpdatePrice(int updatePrice) {
			this.updatePrice = updatePrice;
		}
		public String getUpdateTicketType() {
			return updateTicketType;
		}

		public void setUpdateTicketType(String updateTicketType) {
			this.updateTicketType = updateTicketType;
		}
		public boolean getUpdateIsSale() {
			return updateIsSale;
		}

		public void setUpdateIsSale(boolean updateIsSale) {
			if(updateIsSale=true)
				updateIsSale=true;
			else
				updateIsSale=false;
			this.updateIsSale = updateIsSale;
		}

		public void setSession(Map<String, Object> session) {
			this.session = session;
			
		}

		public String getUpdateTicketInfo() {
			return updateTicketInfo;
		}

		public void setUpdateTicketInfo(String updateTicketInfo) {
			this.updateTicketInfo = updateTicketInfo;
		}
}
