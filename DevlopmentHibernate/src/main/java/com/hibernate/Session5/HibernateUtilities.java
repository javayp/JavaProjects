package com.hibernate.Session5;

import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;

public class HibernateUtilities {
	private static SessionFactory sessionFactory;
	private  static ServiceRegistry serviceRegistry;
	
	static{
		Configuration configuration=new Configuration().configure();
		try{
			serviceRegistry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			sessionFactory=configuration.buildSessionFactory(serviceRegistry);
		}catch(HibernateException exception){
			System.out.println("exception caused!!!");
			exception.printStackTrace();
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
}
