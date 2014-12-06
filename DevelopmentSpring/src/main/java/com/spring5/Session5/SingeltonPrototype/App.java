//this example demos the use of bean scopes singelton and prototype..
//Singelton allows the bean to be instantiated only once and every time the client makes the request for 
//a new bean same bean is handed over and it does not create bean more than once

//prototype allows the bean to instantiated more than once and it can generate N number on new objects when
// the client places the request

package com.spring5.Session5.SingeltonPrototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
	
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring0/beanConfigurationFile/beans.xml");
		Person person=(Person)context.getBean("singelton_prototype");
		person.setId(555);
		System.out.println("person="+person);
		Person person2=(Person)context.getBean("singelton_prototype");
		System.out.println("perosn 2"+person2);
		((ClassPathXmlApplicationContext)context).close();
		
	}
}
