//here the main aim of this app is to pass ref to the parent class constructor arg 
package com.spring3.Session3.BeanProperties3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExtraApp {
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring0/beanConfigurationFile/beans.xml");
		ExtraDemo demo=(ExtraDemo)context.getBean("extraDemoRef");
		System.out.println(demo);
		((ClassPathXmlApplicationContext)context).close();
	}
}
