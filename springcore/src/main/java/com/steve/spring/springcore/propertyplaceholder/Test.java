package com.steve.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/steve/spring/springcore/propertyplaceholder/config.xml");
		MyDao dao = (MyDao) ctx.getBean("mydao");
		System.out.println(dao);
	}

}
