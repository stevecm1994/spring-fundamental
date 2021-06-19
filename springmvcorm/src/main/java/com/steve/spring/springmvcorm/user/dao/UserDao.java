package com.steve.spring.springmvcorm.user.dao;

import java.util.List;

import com.steve.spring.springmvcorm.user.entity.User;

public interface UserDao {

	public int create(User user);
	public List<User> loadUsers();
	public User findUser(int id);
}
