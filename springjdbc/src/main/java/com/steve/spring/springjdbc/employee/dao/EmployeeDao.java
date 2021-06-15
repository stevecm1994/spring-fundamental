package com.steve.spring.springjdbc.employee.dao;

import java.util.List;

import com.steve.spring.springjdbc.employee.entity.Employee;

public interface EmployeeDao {

	int create(Employee employee);
	
	int update(Employee employee);
	
	int delete(Employee employee);
	
	Employee read(int id);
	
	List<Employee> read();
}
