package com.steve.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


/*
 * 
 * @RequestMapping This will map the request from browser .
 * @RequestParam This will map the query parameters from the queryString
 * By default spring expects all the values as designated as @RequestParam , So if not provided spring will throw 404 exception
 * We should explicitly designate any values as "required = false" or defaultValue for spring to consider it
 * IF we designate primitive data types as "required = false" , then we should assign default value to thats because 
 * primitive data types cannot be assigned as null
 * 
 * */

@Controller
public class RequestParamController {

	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam(value= "sal" , required = false,defaultValue = "60") double salary) {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userReg");
		return modelAndView;
	}
}
