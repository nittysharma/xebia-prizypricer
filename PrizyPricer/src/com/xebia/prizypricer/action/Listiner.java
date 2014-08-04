package com.xebia.prizypricer.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.xebia.prizypricer.daoimpl.UserDaoImpl;

public class Listiner {
	private String username; 
    UserDaoImpl userdaoDaoImpl=new UserDaoImpl();
	public String updateLogout(){
	    	System.out.println("inside logout");
	    	Map session = ActionContext.getContext().getSession();
	    	System.out.println(session.get("username"));
	        userdaoDaoImpl.updateLogout(session.get("username").toString());
	        session.put("login", "false");        
	            return "success";
	    }
	    public String getUsername() {
	        return username;
	    }
	    public void setUsername(String username) {
	        this.username = username;
	    }

}
