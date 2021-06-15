package com.steve.spring.springcore.advanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {

	@Value("10")
	private int id;

	@Value("Steve")
	private String name;

	@Value("#{T(java.lang.Math).abs(-8)}")
	private int Star;

	@Value("#{topics}")
	private List<String> topics;

	@Value("#{'male'.toLowerCase()}")
	private String gender;

	@Autowired
	private Profile profile;

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

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public int getStar() {
		return Star;
	}

	public void setStar(int star) {
		Star = star;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", Star=" + Star + ", topics=" + topics + ", gender="
				+ gender + ", profile=" + profile + "]";
	}

}
