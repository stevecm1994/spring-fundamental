package com.steve.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		/*
		 * ModelAndView Object (which contains both model and view object) is returned from the controller back to browser
		 * 
		 * */
		ModelAndView modelAndView = new ModelAndView();		
		modelAndView.addObject("id", 001);
		modelAndView.addObject("name", "Steve");
		modelAndView.setViewName("hello");
		return modelAndView;
	}
}
