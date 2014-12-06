package com.hibernate.Session4;

import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;

public class HibernateUtilities {
	
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	static{
		Configuration configure=new Configuration().configure();
		try{
			serviceRegistry=new ServiceRegistryBuilder().applySettings(configure.getProperties()).buildServiceRegistry();
			sessionFactory=configure.buildSessionFactory(serviceRegistry);
		}catch(HibernateException exception){
			System.out.println("Exception Caused!!!");
			exception.printStackTrace();
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
