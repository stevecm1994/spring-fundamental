package com.steve.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {

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

	/* afterPropertiesSet() ,destroy() invoked automatically by spring container
	 * because of implementing InitializingBean, DisposableBean interfaces.
	 * No Need to mention in xmlconfig for invocation  */
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet method of Patient");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method of Patient");
	}

}
