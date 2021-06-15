package com.steve.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/steve/spring/springcore/set/setconfig.xml");
		CarDealer dealer = (CarDealer) ctx.getBean("cardealer");
		System.out.println(dealer.getName());
		System.out.println(dealer.getModels());
		System.out.println(dealer.getModels().getClass());
		

	}

}
