package com.G2.Model;

public class LoginValidate {

	public static boolean isLoginValid(String uName, String pwd)
	{
		return "admin".equals(uName) && "admin".equals(pwd)?true:false;
	}
}
