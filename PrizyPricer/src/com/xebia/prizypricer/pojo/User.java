package com.xebia.prizypricer.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
private long id;
@Id @GeneratedValue
@Column(name = "userid")
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
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
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Date getLastlogouttime() {
	return lastlogouttime;
}
public void setLastlogouttime(Date lastlogouttime) {
	this.lastlogouttime = lastlogouttime;
}
private String username;
private String password;
private String role;
private Date lastlogouttime;
}
