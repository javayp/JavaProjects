package com.hibernate.Session6;

import org.hibernate.Session;
import java.util.Scanner;
import java.util.Date;

public class App {
	private Session session;
	private String exit="no";
	private Scanner scanner=new Scanner(System.in);
	
	public void insertData(){
		session=HibernateUtilities.getSessionFactory().openSession();
		User user=new User();
		session.beginTransaction();
		while(exit.equals("no")){
			System.out.print("please entry the key");
			user.setId(scanner.nextInt());
			System.out.print("please entry the name");
			user.setName(scanner.next());
			System.out.println("enter the user entry message");
			user.getUserhistory().add(new UserHistory(new Date(),scanner.nextLine()));
			System.out.println("enter yes-->exit no-->continue");
			exit=scanner.next();
		}
		session.save(user);
		session.getTransaction().commit();
	}
	public void retriveData(){
		
	}
	public static void main(String[] args){
		App app=new App();
		app.insertData();
	}
}
