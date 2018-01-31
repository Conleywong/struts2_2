package com.sxt.struts.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private String userName;
	private String userPwd;
	
	@Override
	public String execute() throws Exception {
		if ("admin".equals(userName)&&"23".equals(userPwd)) {
			return Action.SUCCESS;
		}else {
			return Action.ERROR;
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	
}
