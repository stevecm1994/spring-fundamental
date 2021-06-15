package com.steve.spring.springcore.advanced.injecting.interfaces.annotations;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void order() {
		System.out.println("Inside OrderDAOImpl2  order");
	}

}
