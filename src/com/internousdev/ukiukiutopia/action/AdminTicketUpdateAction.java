/**
 * 
 */
package com.internousdev.ukiukiutopia.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ukiukiutopia.dao.AdminTicketUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class AdminTicketUpdateAction extends ActionSupport implements SessionAware{

	private int updateid;
	private String updatename;
	private float updateprice;
	private String updatetickettype;
	private boolean updateissale;
	private String updaterenewdate;
	
	String up=null;
	public String result=ERROR;
	private Map<String, Object> session;
	
	private static final long serialVersionUID = 1L;

		public String execute() throws Exception {


		AdminTicketUpdateDAO dao = new AdminTicketUpdateDAO();
		
		int updateid =  (int)session.get("id");
		System.out.println(updateid);
		
		int up = dao.update(updateid,updatename,updateprice,updatetickettype,updateissale,updaterenewdate);

		if(up > 0){
			result = SUCCESS;
		}
		return result;
		}

		public int getUpdateid() {
			return updateid;
		}

		public void setUpdateid(int updateid) {
			this.updateid = updateid;
		}

		public void setSession(Map<String, Object> session) {
			this.session = session;
			
		}
}
