package com.xebia.prizypricer.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.xebia.prizypricer.dao.StoreDao;
import com.xebia.prizypricer.pojo.ProductModel;
import com.xebia.prizypricer.pojo.Store;
import com.xebia.prizypricer.util.HibernateUtil;

public class StoreDaoImpl implements StoreDao{

	public static List<Store> getStoreList() {
		List<Store> list=null;
		 Session session = HibernateUtil.getSessionFactory().openSession();
	
try{

Query query=session.createQuery("from Store");
list=query.list();

}
catch(Exception e)
{
System.out.println("exception while getting list "+e);
}
		return list;
	}

	@Override
	public void changeStore() {
		// TODO Auto-generated method stub
		
	}

}
