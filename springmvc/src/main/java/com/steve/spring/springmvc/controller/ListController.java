package com.steve.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.steve.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView snedList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("readList");
		Employee employee = new Employee();
		employee.setId(001);
		employee.setName("Steve");
		employee.setSalary(8000);
		
		Employee employee2 = new Employee();
		employee2.setId(002);
		employee2.setName("Dion");
		employee2.setSalary(12000);
		
		Employee employee3 = new Employee();
		employee3.setId(003);
		employee3.setName("Della");
		employee3.setSalary(15000);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
				
		modelAndView.addObject("employees", employees);
		return modelAndView;
	}
}
