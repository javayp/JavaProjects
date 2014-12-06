package com.spring2.session2.Constructors2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/spring/beanConfigurationFile/beans.xml");
		ConstructorDemo consdemo=(ConstructorDemo)context.getBean("constrcutorDemo");
		System.out.println(consdemo);
		((ClassPathXmlApplicationContext)context).close();
	}
}
