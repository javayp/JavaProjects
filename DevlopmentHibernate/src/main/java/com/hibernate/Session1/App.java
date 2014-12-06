package com.hibernate.Session1;

import org.hibernate.Session;

public class App {
	public static void main(String[] args){
		Session session=HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		User user=new User();
		user.setName("joe");
		user.setGoal(250);
		session.save(user);
		session.getTransaction().commit();
		
		session.beginTransaction();
		User loaded=(User)session.get(User.class,5);
		System.out.println("user loaded is "+loaded.getName()+" and the id is "+loaded.getId()+" with set goal of "+loaded.getTotal());
		session.getTransaction().commit();
		
		//Session shouldn't be closed while retrving the user,it is closed then we should build the sessionFactpry once again and thus it is accessed.
		session.close();
		HibernateUtilities.getSessionFactory().close();
	}
}
