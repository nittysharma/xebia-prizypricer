package com.xebia.prizypricer.dao;


public interface ProductSurvayDao {
public void saveSurvay(long productid, long barcode, String category,
		String notedes, String productdes, String productname,String username,
		long storeid, double suggestedprice);

}
