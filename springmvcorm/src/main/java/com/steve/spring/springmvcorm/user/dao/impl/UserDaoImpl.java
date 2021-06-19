package com.steve.spring.springmvcorm.user.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.steve.spring.springmvcorm.user.dao.UserDao;
import com.steve.spring.springmvcorm.user.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int create(User user) {
		return (Integer) hibernateTemplate.save(user);
	}

	@Override
	public List<User> loadUsers() {
		List<User> users = hibernateTemplate.loadAll(User.class);
		return users;
	}

	@Override
	public User findUser(int id) {	
		return hibernateTemplate.get(User.class, id);
	}
}
