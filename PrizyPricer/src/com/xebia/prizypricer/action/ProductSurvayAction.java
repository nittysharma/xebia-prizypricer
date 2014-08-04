package com.xebia.prizypricer.action;

import java.util.Date;

import com.xebia.prizypricer.dao.UserDao;
import com.xebia.prizypricer.daoimpl.ProductSurvayDaoImpl;
import com.xebia.prizypricer.daoimpl.UserDaoImpl;
import com.xebia.prizypricer.pojo.ProductSurvay;

public class ProductSurvayAction {
private ProductSurvay productSurvay;
private long barcode;
public long getBarcode() {
	return barcode;
}

public void setBarcode(long barcode) {
	this.barcode = barcode;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public String getNotedes() {
	return notedes;
}

public void setNotedes(String notedes) {
	this.notedes = notedes;
}

public String getProductdes() {
	return productdes;
}

public void setProductdes(String productdes) {
	this.productdes = productdes;
}

public String getProductname() {
	return productname;
}

public void setProductname(String productname) {
	this.productname = productname;
}

public long getStoreid() {
	return storeid;
}

public void setStoreid(long storeid) {
	this.storeid = storeid;
}

public double getSuggestedprice() {
	return suggestedprice;
}

public void setSuggestedprice(double suggestedprice) {
	this.suggestedprice = suggestedprice;
}

public long getUserid() {
	return userid;
}

public void setUserid(long userid) {
	this.userid = userid;
}
private String category;
private String notedes;
private String productdes;
private String productname;
private long storeid;
private double suggestedprice;
private long userid;
private String username;
private long productid;

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public ProductSurvay getProductSurvay() {
	return productSurvay;
}

public void setProductSurvay(ProductSurvay productSurvay) {
	this.productSurvay = productSurvay;
}
public String saveSurvay(){
	ProductSurvayDaoImpl productSurvayDaoImpl=new ProductSurvayDaoImpl();
	System.out.println(" 1 "+productdes+" 2 "+barcode+" 3 "+category+" 4 "+notedes+" 5 "+productid+" 6 "+productname+" 7 "+storeid+" 8 "+suggestedprice+" 9 "+username);
		

	productSurvayDaoImpl.saveSurvay(productid,barcode,category,notedes,productdes,username,productname,storeid,suggestedprice);
	
	
	return "success";
}

public long getProductid() {
	return productid;
}

public void setProductid(long productid) {
	this.productid = productid;
}
}
