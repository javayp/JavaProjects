package com.spring1.session1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
  public static void main(String[] args){
	 //ApplicationContext is a interface and it is made for collecting the new instance of FileSystemApplicationContext
	  //FileSystemXmlApplicationContext return a string which contains the path of bean configuration file
	  //ApplicationContext has the  ability to load file resources in a generic fashion.
	  
	 //FileSystemXmlApplicationConetxt==will have to give the full qualified name for the beans file
	  //ClassPathXmlApplicationContext=just have to mention the package name for the bean file access
	  
	 ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/beanConfigurationFile/beans.xml");
	 Demo demo=(Demo)context.getBean("demoApp");
	 demo.message();
	 ((ClassPathXmlApplicationContext)(context)).close();
  }
}
