package com.steve.spring.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.steve.spring.springmvcorm.user.entity.User;
import com.steve.spring.springmvcorm.user.services.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;

	@RequestMapping("registrationPage")
	public String showUser() {
		return "userReg";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		System.out.println(user);
		int result = service.save(user);
		model.addAttribute("result", "User Created with ID : " + result);
		return "userReg";
	}

	@RequestMapping("getUsers")
	public String getUsers(ModelMap model) {
		List<User> users = service.getUsers();
		model.addAttribute("users", users);
		return "displayUsers";
	}

	/*
	 * @ResponseBody annotation make sure that the returned string is not a view
	 * name otherwise here msg will be considered as view name. Since @ResponseBody
	 * is added to return type , string returned is considered as response body
	 * 
	 */
	@RequestMapping("validateUser")
	public @ResponseBody String validateUser(@RequestParam("id") int id) {
		User user = service.getUser(id);
		String msg = "";
		if (user != null) {
			msg = id + " already exists";
		}
		return msg;
	}

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

}
