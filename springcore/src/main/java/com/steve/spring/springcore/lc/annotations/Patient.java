package com.steve.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter method of Patient ID");
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	/* This is another way to call bean life cycle methods. Using Annotations .
	 * @PostConstruct  @PreDestroy invokes the respective methods automatically during initialization and destruction
	 * Annotations should be enabled in conifg xml file for these annotation to work
	 *  */
	
	@PostConstruct
	public void init() {
		System.out.println("Inside init method of Patient");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method of Patient");
	}

}
