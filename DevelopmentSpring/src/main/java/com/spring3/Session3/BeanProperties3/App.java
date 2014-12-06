//main aim of the program is to set the variables and value and getting initialized through setters and we use the tag property in the xml file

package com.spring3.Session3.BeanProperties3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring0/beanConfigurationFile/beans.xml");
		Demo demo=(Demo)context.getBean("propertiesDemo");
		System.out.println(demo);
		((ClassPathXmlApplicationContext)context).close();
	}
}
