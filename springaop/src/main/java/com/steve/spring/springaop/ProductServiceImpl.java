package com.steve.spring.springaop;

public class ProductServiceImpl implements ProductService {

	@Override
	public int multiply(int num1, int num2) {
		System.out.println("Inside multiply method");
		return num1 * num2;
	}

}
