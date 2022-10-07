package com.G2.Actions;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.SessionMap;

public class Logout extends ActionSupport{
    public String execute(){
        return LOGIN;
    }
}