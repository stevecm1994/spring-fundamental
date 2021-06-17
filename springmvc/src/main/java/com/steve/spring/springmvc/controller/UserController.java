package com.steve.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.steve.spring.springmvc.dto.User;


/*
 * @Controller should be designated on a class if the dispatcher servlet want to 
 * search for mapping on any method  in this class
 * 
 * @RequestMapping This will map the request from browser .
 * By default it maps GET requests , so thats why we explicitly mentioned as method = RequestMethod.POST 
 * below so that the POST request is matched correctly
 * 
 * @ModelAttribute Get the data from the UI and maps to the Java object
 * The mapping is taken care by the Spring Container as long as the names in the HTML forms match exactly as the names 
 * in the Java Object Class
 * 
 * ModelMap Introduced for the decoupling between Model and view .
 * So String is which is returned by the method is the view name 
 * Data to be sent back is set into the ModelMap variable passed into the method
 * */

@Controller
public class UserController {

	@RequestMapping("registrationPage")
	public String showUser() {
		return "userReg";
	}
	
	
	@RequestMapping(value="registerUser",method = RequestMethod.POST)
	public String registerUser( @ModelAttribute("user") User user , ModelMap model) {
		System.out.println(user);
		model.addAttribute("user", user);
		return "regResult";
	}
}
