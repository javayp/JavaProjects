//this App main idea is about dependency injection through setter properties and using ref attribute in the bean tag of the parent class
package com.spring4.Session4.DIref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring0/beanConfigurationFile/beans.xml");
		Demo demo=(Demo) context.getBean("refDeoendencyInjectionMode");
		System.out.println(demo);
		((ClassPathXmlApplicationContext)context).close();
	}
}
