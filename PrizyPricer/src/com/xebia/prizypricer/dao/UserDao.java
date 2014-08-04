package com.xebia.prizypricer.dao;

import java.sql.SQLException;
import java.util.Date;

import com.xebia.prizypricer.pojo.User;

public interface UserDao {
	 public boolean find(String name, String password,String role);
public void updateLogout(String name);
public Date getlastlogouttime(String username) throws SQLException;
}
