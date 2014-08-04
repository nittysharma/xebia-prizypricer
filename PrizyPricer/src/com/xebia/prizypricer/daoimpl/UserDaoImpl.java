package com.xebia.prizypricer.daoimpl;

import java.io.Serializable;
import java.util.Date;

import com.xebia.prizypricer.dao.UserDao;











import org.hibernate.*;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.xebia.prizypricer.pojo.ProductModel;
import com.xebia.prizypricer.pojo.User;
import com.xebia.prizypricer.util.HibernateUtil;
	 
public class UserDaoImpl implements UserDao{

	 
	    public boolean find(String username, String password, String role) {
boolean result=false;	    
int numRows = 0;
	        Session session = HibernateUtil.getSessionFactory().openSession();
try{
	        Criteria criteria = session.createCriteria(User.class);
	        criteria.add(Restrictions.eq("username", username));
	        criteria.add(Restrictions.eq("password", password));
	        criteria.add(Restrictions.eq("role", role));
	        criteria.setProjection(Projections.rowCount());
	        numRows = (Integer)criteria.uniqueResult();
}
catch(NullPointerException e)
{
	System.out.println("no row exists");
}
System.out.println("numrows is"+numRows);
if(numRows>0)
{
	 result=true;       
}
else
{
	result=false;
}
	        session.close();
	      return result;
	    }

		@Override
		public void updateLogout(String username) {
			// TODO Auto-generated method stub
			 Session session = HibernateUtil.getSessionFactory().openSession();
try{
			 session.beginTransaction();			 


			String hql = "update User set lastlogouttime = :lastlogouttime "+ 
		             "WHERE username = :username";
			System.out.println(hql);
		Query query = session.createQuery(hql);
		System.out.println("1");
		System.out.println("username"+username);
		query.setParameter("username", username);
		query.setParameter("lastlogouttime", new Date());
		query.executeUpdate();
		System.out.println("updated successfully");	
}
catch(Exception e)
{
	System.out.println("exception during update"+e.getMessage());
}

		session.beginTransaction().commit();

		}

		@Override
		public Date getlastlogouttime(String username) {
			 Session session = HibernateUtil.getSessionFactory().openSession();
			 User user = null;		
			 Date lastlogouttime=null;
			 try{
				 Criteria criteria = session.createCriteria(User.class);
			        criteria.add(Restrictions.eq("username", username));
	user=(User)criteria.list().get(0);
			 user=(User) session.get(User.class, user.getId());
			 lastlogouttime=user.getLastlogouttime();
			 }
			 catch(HibernateException e)
			 {
			 System.out.println("exception while getting product "+e);
			 }
			 		return lastlogouttime;
			 	}
		public static User getUserbyName(String username) {
			 Session session = HibernateUtil.getSessionFactory().openSession();
			 User user = null;		
			 Date lastlogouttime=null;
			 try{
				 Criteria criteria = session.createCriteria(User.class);
			        criteria.add(Restrictions.eq("username", username));
	user=(User)criteria.list().get(0);
			 user=(User) session.get(User.class, user.getId());
			 
			 }
			 catch(HibernateException e)
			 {
			 System.out.println("exception while getting product "+e);
			 }
			 		return user;
			 	}
	}