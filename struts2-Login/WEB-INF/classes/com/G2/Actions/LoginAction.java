package com.G2.Actions;

import com.G2.Model.LoginValidate;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.SessionMap;

public class LoginAction extends ActionSupport {

	String uName,pwd;
	String nextAction;
	
	@Override
	public String execute() throws Exception {
		boolean res = LoginValidate.isLoginValid(uName, pwd);
		
		if(res)
			nextAction = "LoginSuccess";
		else
			nextAction = "LoginInput";

		
		return  "next";
	}






	public String getNextAction() {
		return nextAction;
	}

	public void setNextAction(String nextAction) {
		this.nextAction = nextAction;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
