package com.steve.spring.springmvcorm.user.services.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.steve.spring.springmvcorm.user.dao.UserDao;
import com.steve.spring.springmvcorm.user.entity.User;
import com.steve.spring.springmvcorm.user.services.UserService;

@Service
public class UserServicesImpl implements UserService {
	
	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int save(User user) {
		return dao.create(user);
	}

	@Override
	public List<User> getUsers() {		
		List<User> users = dao.loadUsers(); 
		Collections.sort(users);
		return users ;
	}

	@Override
	public User getUser(int id) {		
		return dao.findUser(id);
	}

}
