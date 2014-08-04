package com.xebia.prizypricer.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Store {
@Id
@GeneratedValue
@Column(name="storeid")
private long id;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getStorename() {
	return storename;
}
public void setStorename(String storename) {
	this.storename = storename;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
private String storename;
private String location;





}
