package com.xebia.prizypricer.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class ProductSurvay{
	
private long id;
@Id
@GeneratedValue
@Column(name="survayid")
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public double getSuggestedprice() {
	return suggestedprice;
}
public void setSuggestedprice(double suggestedprice) {
	this.suggestedprice = suggestedprice;
}
public long getStoreid() {
	return storeid;
}
public void setStoreid(long storeid) {
	this.storeid = storeid;
}
public long getWorkerid() {
	return workerid;
}
public void setWorkerid(long workerid) {
	this.workerid = workerid;
}
public Date getTimestumptaken() {
	return timestumptaken;
}
public void setTimestumptaken(Date timestumptaken) {
	this.timestumptaken = timestumptaken;
}
private double suggestedprice;
private long storeid;
private long workerid;
private Date timestumptaken;
private String notedes;
@Column(name="note_descriotion")
public String getNotedes() {
	return notedes;
}
public void setNotedes(String notedes) {
	this.notedes = notedes;
}
private String productname;
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
@Column(name="productdescription")
public String getProductdes() {
	return productdes;
}
public void setProductdes(String productdes) {
	this.productdes = productdes;
}
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
private String productdes;
private long barcode;
private String category;
private long productid;
public long getProductid() {
	return productid;
}
public void setProductid(long productid) {
	this.productid = productid;
}
}
