package com.steve.spring.springcore.advanced.injecting.interfaces.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/steve/spring/springcore/advanced/injecting/interfaces/annotations/config.xml");
		OrderBo bo = (OrderBo) ctx.getBean("bo");
		bo.order();

	}

}
