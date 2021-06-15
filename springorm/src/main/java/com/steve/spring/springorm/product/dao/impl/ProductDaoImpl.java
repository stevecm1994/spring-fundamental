package com.steve.spring.springorm.product.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.steve.spring.springorm.product.dao.ProductDao;
import com.steve.spring.springorm.product.entity.Product;

@Component("productdao")
public class ProductDaoImpl implements ProductDao {

	/* HibernateTemplate is automatically injected because we defined  HibernateTemplate bean in our config.xml 
	 * with all dependency required for the HibernateTemplate injected there itself */
	@Autowired
	HibernateTemplate hibernateTemplate;

	/*
	 * This add new row to the database using the help of HibernateTemplate
	 * @Transactional will wrap the entire method as a single unity and perform the action as a whole , if any exception happens
	 * in between the method , all the transactions done till that time will be reverted. Majorly used when we want to complete tasks as a whole or not.
	 * */
	@Override
	@Transactional
	public int create(Product product) {
		return (Integer) hibernateTemplate.save(product);
	}

	/*
	 * This will update the product in the table
	 * */
	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	/*
	 * This will delete the product in the table
	 * */
	@Override
	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}

	/*
	 * This will fetch a single product from table taking ID value as the key value
	 * */
	@Override
	public Product find(int id) {
		return hibernateTemplate.get(Product.class, id);
	}

	/*
	 * This will fetch all the rows from the table
	 * */
	@Override
	public List<Product> find() {
		List<Product> allProducts = hibernateTemplate.loadAll(Product.class);
		return allProducts;
	}

}
