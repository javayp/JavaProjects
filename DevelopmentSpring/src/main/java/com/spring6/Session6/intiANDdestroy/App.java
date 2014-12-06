//if the beans scope is set to Singelton,then the init and destroy method will be called automatically

//if the bean scope is set to prototype then the destroy method is called to manually.

//we can create the global bean for creation and destroy methods

package com.spring6.Session6.intiANDdestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;;
public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring0/beanConfigurationFile/beans.xml");
		Person person=(Person)context.getBean("initANDdestroy");
		System.out.println(person);
		person.onDestroy();
		((ClassPathXmlApplicationContext)context).close();
	}
}
