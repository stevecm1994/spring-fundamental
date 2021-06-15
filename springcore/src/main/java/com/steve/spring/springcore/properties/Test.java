package com.steve.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/steve/spring/springcore/properties/propertiesconfig.xml");
		CountriesAndLanguages countryAndLang = (CountriesAndLanguages) ctx.getBean("countryAndLang");
		System.out.println(countryAndLang);
		

	}

}
