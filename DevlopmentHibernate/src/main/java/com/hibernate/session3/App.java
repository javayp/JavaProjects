//This program is mainly about adding collection set to the hibernate parent class 
package com.hibernate.session3;

import java.util.Date;

import org.hibernate.Session;
public class App {
	public static void main(String[] args){
		Session session=HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		User user=new User();
		user.setId(5);
		user.setName("austin");
		user.getProtienData().setGoal(565);
		user.getProtienData().setTotal(110);
		user.getUserHistory().add(new UserHistory(new Date(),"want to have the goal set to 100"));
		
		User user2=new User();
		user2.setId(55544);
		user2.setName("austin junior");
		user2.getProtienData().setGoal(5585);
		user2.getProtienData().setTotal(1110);
		user2.getUserHistory().add(new UserHistory(new Date(),"want to have the goal set to 120"));
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		HibernateUtilities.getSessionFactory().close();
	}
}
