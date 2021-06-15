package com.steve.spring.springorm.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //This is the mandatory annotation
@Table(name = "product")  //Required If the table name and Class name different. Its also okay to define this for better visibility
public class Product {

	@Id //This is the mandatory annotation
	private int id;
	@Column(name = "name") //Required If the column name and variable name different. Its also okay to define this for better visibility
	private String name;
	@Column(name = "description") //Required If the column name and variable name different. Its also okay to define this for better visibility
	private String desc;
	@Column(name = "price") //Required If the column name and variable name different. Its also okay to define this for better visibility
	private double price; 

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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", desc=" + desc + ", price=" + price + "]";
	}

}
