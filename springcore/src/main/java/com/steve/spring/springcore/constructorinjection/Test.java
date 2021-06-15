package com.steve.spring.springcore.constructorinjection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/steve/spring/springcore/constructorinjection/config.xml");
		Employee employee = (Employee) ctx.getBean("employee");
		System.out.println(employee);
		
		

	}

}
