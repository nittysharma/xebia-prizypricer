package com.xebia.prizypricer.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productMaster")
public class ProductModel {
private long id;
@Id @GeneratedValue
@Column(name = "productid")
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
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
}
