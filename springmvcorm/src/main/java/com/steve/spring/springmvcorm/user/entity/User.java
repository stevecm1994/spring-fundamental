package com.steve.spring.springmvcorm.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Comparable<User> {

	@Id
	private Integer id;
	private String name;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	/*
	 * Since Comparable<User> interface is implemented and because of compareTo(User o) method
	 * When we do sorting on collections of this entity , it will sort based on the logic return on compareTo(User o) method
	 * Here it compares to IDs
	 *  
	 * */
	@Override
	public int compareTo(User o) {		
		return this.id.compareTo(o.getId());
	}

}
