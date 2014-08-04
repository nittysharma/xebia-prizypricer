package com.xebia.prizypricer.daoimpl;


import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

import com.xebia.prizypricer.dao.ProductSurvayDao;
import com.xebia.prizypricer.pojo.ProductSurvay;
import com.xebia.prizypricer.util.HibernateUtil;

public class ProductSurvayDaoImpl implements ProductSurvayDao{
@Override
	public void saveSurvay(long productid, long barcode, String category,
			String notedes, String productdes,String username, String productname,
			long storeid, double suggestedprice) {
	 Session session = HibernateUtil.getSessionFactory().openSession();
	 ProductSurvay productSurvay=new ProductSurvay();
try{
	
	 session.beginTransaction().begin();;			 
		productSurvay.setProductid(productid);
		productSurvay.setBarcode(barcode);
		productSurvay.setCategory(category);
		productSurvay.setNotedes(notedes);
		productSurvay.setProductdes(productdes);
		productSurvay.setProductname(productname);
		productSurvay.setStoreid(storeid);
		productSurvay.setSuggestedprice(suggestedprice);
		productSurvay.setTimestumptaken(new Date());
		productSurvay.setWorkerid(UserDaoImpl.getUserbyName(username).getId());
	 
	 
	 
	 
session.save(productSurvay);


}
catch(Exception e)
{
System.out.println("exception during save survay"+e.getMessage());
}

session.beginTransaction().commit();
	}

public static int getcount()

{int count = 0;
	Session session = HibernateUtil.getSessionFactory().openSession();
try{
    Criteria criteria = session.createCriteria(ProductSurvay.class);
  count= (Integer)criteria.list().size();
}
catch(NullPointerException e)
{
System.out.println("no row exists");
}
return count;
}
}