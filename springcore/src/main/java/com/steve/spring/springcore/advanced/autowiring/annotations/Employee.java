package com.steve.spring.springcore.advanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	/* 
	 * Can also be used on 
	 * 1. Setter method 
	 * 2. Constructor 
	 * All results in same outcome . Automatically Injects the beans from the container
	 * 
	 * */
	@Autowired(required = false)
	@Qualifier("address123")
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
