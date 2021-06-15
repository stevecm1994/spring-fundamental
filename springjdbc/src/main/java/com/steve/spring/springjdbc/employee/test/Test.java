package com.steve.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.steve.spring.springjdbc.employee.dao.EmployeeDao;
import com.steve.spring.springjdbc.employee.entity.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/steve/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDao");
		//Employee employee = new Employee();
		//employee.setId(1);
		//employee.setFirstName("Steve");
		//employee.setLastName("Mathews");
		//int result = dao.create(employee);
		//int result = dao.update(employee);
		//int result = dao.delete(employee);
		//System.out.println("Number of records inserted are : " + result);
		//Employee emp = dao.read(2);
		//System.out.println("Employee : " + emp);
		List<Employee> read = dao.read();
		System.out.println("Employee List : " + read);
		

	}

}
