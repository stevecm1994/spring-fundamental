package com.steve.spring.springmvcorm.user.services;

import java.util.List;

import com.steve.spring.springmvcorm.user.entity.User;

public interface UserService {

	public int save(User user);
	public List<User> getUsers();
	public User getUser(int id);
}
