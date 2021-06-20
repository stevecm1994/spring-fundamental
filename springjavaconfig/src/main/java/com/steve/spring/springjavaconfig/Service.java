package com.steve.spring.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {

	@Autowired
	Dao dao;

	public void save() {
		dao.create();
	}

	public void init() {
		System.out.println("Inside init method of service");
	}

	public void destroy() {
		System.out.println("Inside destroy method of service");
	}
}
