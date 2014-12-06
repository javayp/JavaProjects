package com.hibernate.Session1;


import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class HibernateUtilities {
	
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	static{
		try{
			System.out.println("Configuration process Started!!!");
			Configuration configuration=new Configuration().configure();
			serviceRegistry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			sessionFactory=configuration.buildSessionFactory(serviceRegistry);
		}catch(HibernateException exception){
			System.out.println("Problem connecting the database!!!!");
			exception.printStackTrace();
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}		
}
