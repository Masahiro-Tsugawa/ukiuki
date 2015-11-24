package com.internousdev.ukiukiutopia.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * セッションをクリアしヘッダーからホーム画面へ遷移する為のクラス
 * @author N.Minami
 * @version 1.1
 * @since 1.0
 */
public class GoHomeAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 4111710358039483767L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 *セッションをクリアするメソッド
	 * @return SUCCESS 必ずSUCCESSを返す
	 */
	public String execute() {
		session.clear();
		return SUCCESS;
	}

	/**
	 * セッション格納メソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}