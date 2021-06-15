package com.steve.spring.springcore.lc.xmlconfig;

public class Patient {

	private int id;

	public void init() {
		System.out.println("Inside init method of Patient");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter method of Patient ID");
		this.id = id;
	}

	public void destroy() {
		System.out.println("Inside destroy method of Patient");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
