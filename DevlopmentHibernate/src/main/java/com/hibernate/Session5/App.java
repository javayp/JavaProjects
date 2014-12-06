package com.hibernate.Session5;

import org.hibernate.Session;
import java.util.Date;
import java.util.Map;

public class App {
	public static void main(String[] args){
		Session session=HibernateUtilities.getSessionFactory().openSession();
		System.out.println("session created!");
		session.beginTransaction();
		User user=new User();
		user.setId(25);
		user.setName("Jeef bezoz");
		user.getProtienData().setGoal(1002043);
		user.getProtienData().setTotal(200043);
		user.getMaptype().put("prashanth", new UserHistory(new Date(),"hi i am trying to minmize the goal!!!!"));
		session.save(user);
		System.out.println("session saved!!!");
		session.getTransaction().commit();
		
		//fetching the data
		
		System.out.println("fetching the data!!!");
		session.beginTransaction(); 
		User userLoaded=(User)session.load(User.class,55);
		System.out.println("Id="+userLoaded.getId());
		System.out.println("Name="+userLoaded.getName());
		for(Map.Entry<String,UserHistory> mapextractor:userLoaded.getMaptype().entrySet() ){
				System.out.println("key is "+mapextractor.getKey()+" value is"+mapextractor.getValue().getEntry_time()+" "+mapextractor.getValue().getEntry());
		}
		session.getTransaction().commit();
		HibernateUtilities.getSessionFactory().close();
	}
}
