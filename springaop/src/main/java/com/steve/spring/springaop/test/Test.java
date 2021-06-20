package com.steve.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.steve.spring.springaop.ProductService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/steve/spring/springaop/test/config.xml");
		ProductService productService = (ProductService) ctx.getBean("productService");
		int result = productService.multiply(1, 2);
		System.out.println(result);
	}

}
