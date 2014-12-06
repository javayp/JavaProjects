//this example shows combining two different objects in java without having to create two different tables.
package com.hibernate.session2;

import org.hibernate.Session;
public class App {
	public static void main(String[] args){
		System.out.println("Hibernate Operation Started!!");
		//we can access the static methods by its class name
		System.out.println("transcation to be sarted!!!");
		
		Session session=HibernateUtilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		User user=new User();
		user.setName("josh");
		user.getProtienData().setGoal(44);
		user.getProtienData().setTotal(88);
		System.out.println("all the data have been set!!!");
		session.save(user);
		session.getTransaction().commit();
		HibernateUtilities.getSessionFactory().close();
	}
}
