package com.hibernate.Session7;

import org.hibernate.Session; 
import java.util.Date;
public class App {
	
	public static void main(String[] args){
		
		Session session=HibernateUtilities.getSessionFactory().openSession();
		System.out.println("process of creating table is over and foreign " +
				"key update is also done \n seeting the value started!!!");
		session.beginTransaction();
		
		User user=new User();
		user.setId(23);
		user.setName("prashanth");
		
		//addUserHistory method is important since we have to set the value of the
		//instance variable user in the userHistory class.
		
		//because userHistory user will be associate with the primary key
		user.addUserHistory(new UserHistory(233, new Date(), "prashanth message entry"));
		session.save(user);
		session.getTransaction().commit();
		HibernateUtilities.getSessionFactory().close();
	}
}
