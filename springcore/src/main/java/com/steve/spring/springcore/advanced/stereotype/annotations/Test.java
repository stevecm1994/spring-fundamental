package com.steve.spring.springcore.advanced.stereotype.annotations;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/steve/spring/springcore/advanced/stereotype/annotations/config.xml");
		Instructor inst = (Instructor) ctx.getBean("inst");
		System.out.println(inst);
		Instructor inst2 = (Instructor) ctx.getBean("inst");
		System.out.println(inst2);
		
		

	}

}
