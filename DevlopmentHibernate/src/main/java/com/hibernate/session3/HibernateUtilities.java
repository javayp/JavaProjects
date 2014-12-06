package com.hibernate.session3;

import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;

public class HibernateUtilities {
	
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	static{
			Configuration configuration=new Configuration().configure();
		try{
			serviceRegistry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			//buildSessionFactory returns SessionFactory
			sessionFactory=configuration.buildSessionFactory(serviceRegistry);
		}catch(HibernateException exception){
			System.out.println("exception in creating the session!!!");
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
