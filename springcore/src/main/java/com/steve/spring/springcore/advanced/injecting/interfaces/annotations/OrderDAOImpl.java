package com.steve.spring.springcore.advanced.injecting.interfaces.annotations;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void order() {
		System.out.println("Inside OrderDAOImpl  order");
	}

}
