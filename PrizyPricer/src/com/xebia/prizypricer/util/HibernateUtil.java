package com.xebia.prizypricer.util;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.xebia.prizypricer.pojo.ProductSurvay;
import com.xebia.prizypricer.pojo.User;

public class HibernateUtil {
	 
    private static final SessionFactory sessionFactory=buildSessionFactory();
 
   public static SessionFactory buildSessionFactory(){
        try {
            return new AnnotationConfiguration().addPackage("com.xebia.prizyPricer.pojo").configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    }
    
    
    