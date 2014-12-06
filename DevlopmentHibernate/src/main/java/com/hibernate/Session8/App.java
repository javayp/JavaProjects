package com.hibernate.Session8;

import org.hibernate.Session;
import java.util.Date;

public class App {
	public static void main(String[] args){
		Session session=HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		User user=new User();
		user.setUserName("prashanth");
		user.getProteinData().add(new ProtienData(23, 45));
		user.getPersonMap().put("yeshvanth",new UserHistory(new Date(),"yp"));
		session.save(user);
		session.getTransaction().commit();
		HibernateUtilities.getSessionFactory().close();
	}
}
