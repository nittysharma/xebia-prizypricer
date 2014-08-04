package com.xebia.prizypricer.daoimpl;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.xebia.prizypricer.dao.ProductDao;
import com.xebia.prizypricer.pojo.ProductModel;
import com.xebia.prizypricer.pojo.User;
import com.xebia.prizypricer.util.HibernateUtil;

public class ProductDaoImpl implements ProductDao{

	
	public List<ProductModel> getProductList() {
		// TODO Auto-generated method stub
		List<ProductModel> list=null;
		 Session session = HibernateUtil.getSessionFactory().openSession();
	
try{

Query query=session.createQuery("from ProductModel");
list=query.list();

}
catch(Exception e)
{
System.out.println("exception while getting list "+e);
}
		return list;
	}
@Override
	public ProductModel getProductbyBarcode(long barcode) {
	 Session session = HibernateUtil.getSessionFactory().openSession();
ProductModel productModel = null;		
try{

productModel=(ProductModel) session.get(ProductModel.class, barcode);

}
catch(HibernateException e)
{
System.out.println("exception while getting product "+e);
}
		return productModel;
	}
	}


