package com.steve.spring.springcore.constructorinjection.ambiguity;

public class Addition {
	
	public Addition(int a , Double b) {
		System.out.println("Inside constructor mixed");
		System.out.println(a);
		System.out.println(b);
	}
	
	public Addition(int a , int b) {
		System.out.println("Inside constructor int");
	}
	
	public Addition(Double a , Double b) {
		System.out.println("Inside constructor Double");
	}
	
	/* 
	 * If String constructor is provided , Spring will pick only String constructor by default
	 * The arguments provided in config is considered by default as String and only if there is no 
	 * string constructor , then only those args are changed to other datatypes and invokes other type constructors
	 * in the order which it is defined . Here first int type , so int constructor.
	 * To avoid this "type" attribute given in constructor-arg  to match the constructor args
	 * 
	 * */
	public Addition(String a , String b) {
		System.out.println("Inside constructor String");
	}

}
