package com.steve.spring.springcore.advanced.injecting.interfaces;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void order() {
		System.out.println("Inside Order DAO");
	}

}
