package com.steve.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/steve/spring/springcore/list/listconfig.xml");
		Hospital hsptl = (Hospital) ctx.getBean("hospital");
		System.out.println(hsptl.getName());
		System.out.println(hsptl.getDepartments());
		

	}

}
