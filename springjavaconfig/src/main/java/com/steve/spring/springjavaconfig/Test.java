package com.steve.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		// ctx.register(SpringConfig.class);
		Service service = ctx.getBean(Service.class);
		service.save();
		ctx.close();

	}

}
