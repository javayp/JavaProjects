package com.hibernate.Session8;

import org.hibernate.service.ServiceRegistry;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtilities {
	private static ServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	
	static{
		Configuration configure=new Configuration().configure();
		try{
			serviceRegistry=new ServiceRegistryBuilder().applySettings(configure.getProperties()).buildServiceRegistry();
			sessionFactory=configure.buildSessionFactory(serviceRegistry);
		}catch(HibernateException exception){
			System.out.println("excepption Caused!!!");
			exception.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
