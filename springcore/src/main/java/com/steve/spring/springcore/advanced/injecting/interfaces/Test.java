package com.steve.spring.springcore.advanced.injecting.interfaces;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/steve/spring/springcore/advanced/injecting/interfaces/config.xml");
		OrderBo bo = (OrderBo) ctx.getBean("bo");
		bo.order();
		
		

	}

}
