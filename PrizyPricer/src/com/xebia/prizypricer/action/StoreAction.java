package com.xebia.prizypricer.action;

import java.util.List;

import com.xebia.prizypricer.daoimpl.StoreDaoImpl;
import com.xebia.prizypricer.pojo.Store;

public class StoreAction{
	private List<Store> storelist;
public List<Store> getStore() {
		return storelist;
	}
	public void setStore(List<Store> storelist) {
		this.storelist = storelist;
	}
private String storename;
public String getStorename() {
	return storename;
}
public void setStorename(String storename) {
	this.storename = storename;
}
public String getStorelocation() {
	return storelocation;
}
public void setStorelocation(String storelocation) {
	this.storelocation = storelocation;
}
public long getStoreid() {
	return storeid;
}
public void setStoreid(long storeid) {
	this.storeid = storeid;
}
private String storelocation;
private long storeid;	
public String getStoreList()
{
	StoreDaoImpl storeDaoImpl=new StoreDaoImpl();
	storelist=storeDaoImpl.getStoreList();
	return "success";
}



}
