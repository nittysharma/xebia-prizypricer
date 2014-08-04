package com.xebia.prizypricer.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xebia.prizypricer.daoimpl.ProductDaoImpl;
import com.xebia.prizypricer.daoimpl.UserDaoImpl;
import com.xebia.prizypricer.pojo.ProductModel;
public class LoginAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private List<ProductModel> productlist;
    public long getTotalsurvay() {
		return totalsurvay;
	}
	public void setTotalsurvay(long totalsurvay) {
		this.totalsurvay = totalsurvay;
	}
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	private long totalsurvay;
    private String formula;
    public List<ProductModel> getProductlist() {
    	return productlist;
    }
    public void setProductlist(List<ProductModel> productlist) {
    	this.productlist = productlist;
    } 
    private String username;
    private String password;
    public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String role;
    UserDaoImpl userdaoDaoImpl=new UserDaoImpl();
    ProductDaoImpl productDaoImpl=new ProductDaoImpl();
    @Override
    public void validate(){
        if(username.length()==(0))
            this.addFieldError("name", "Name is required");
        if(password.length()==(0))
            this.addFieldError("password", "Password is required");
    
    if(role.length()==(0))
        this.addFieldError("role", "role is required");
}
   
    public String loginCheck(){
    	System.out.println("username--->"+username);
        if(userdaoDaoImpl.find(username,password,role))
        { System.out.println(username);
        productlist=productDaoImpl.getProductList();
        System.out.println("product list"+productlist);
        Map session = ActionContext.getContext().getSession();
        session.put("login","true");
        session.put("role",role);
        session.put("username",username);
        session.put("store", "changestore");

        if(userdaoDaoImpl.getlastlogouttime(username)!=null)
		session.put("lastlogouttime", userdaoDaoImpl.getlastlogouttime(username));
		else
			  session.put("lastlogouttime", "first time login");
        	return role;
        }
        	else
        		System.out.println("inside else");
            this.addActionError("Invalid username and password");
            return "error";
    }
   
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}