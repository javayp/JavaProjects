package com.hibernate.session2;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class HibernateUtilities {
	private static  SessionFactory sessionFactory;
	private  static ServiceRegistry serviceRegistry;
	
	static{
		Configuration configuration=new Configuration().configure();
		try{
			serviceRegistry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			sessionFactory=configuration.buildSessionFactory(serviceRegistry);
			
		}catch(HibernateException exception){
			System.out.println("Problem perists in creating session and serviceRegistry!!");
			exception.printStackTrace();
		}
	}
	public static SessionFactory getSessionFactory(){
		System.out.println("session Factory set!!!");
		return sessionFactory;
	}
}
