//this program mainly deals with the Set Collections
package com.hibernate.Session4;

import org.hibernate.Session;
import java.util.Date;
public class App {
	
	public static void main(String[] args){
		Session session=HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		User user=new User();
		user.setId(5560);
		user.setName("John taker");
		user.getProtienData().setGoal(5555);
		user.getProtienData().setTotal(44444);
		user.getUserHistory().add(new UserHistory(new Date(),"get Going to set the time to 3000"));
		session.save(user);
		session.getTransaction().commit();
		HibernateUtilities.getSessionFactory().close();
	}
}
