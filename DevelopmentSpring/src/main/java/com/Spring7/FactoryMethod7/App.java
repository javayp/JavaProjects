//this app is mainly about the factory method and we are not using the bean to instantiate the bean file to instantiate it

//we are using the factory method and using the method getInstance and using the attribute factory-method=" "

//we can create new class and use the attributes factory-bean=" "

package com.Spring7.FactoryMethod7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring0/beanConfigurationFile/beans.xml");
		Person person=(Person)context.getBean("factoryMethod");
		person.setId(777);
		System.out.println(person);
		Person person2=(Person)context.getBean("factoryMethod");
		System.out.println(person2);
		((ClassPathXmlApplicationContext)context).close();
	}
}
