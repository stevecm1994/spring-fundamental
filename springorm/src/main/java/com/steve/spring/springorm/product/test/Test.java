package com.steve.spring.springorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.steve.spring.springorm.product.dao.ProductDao;
import com.steve.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/steve/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) ctx.getBean("productdao");
		/* 
		 * Product product = new Product();
		 * product.setId(3); 
		 * product.setName("MI 11");
		 * product.setDesc("6.5 Inch Screen , LED , Not so good");
		 * product.setPrice(350); 
		 * productDao.create(product);
		 * productDao.update(product); 
		 * productDao.delete(product);
		 * Product product = productDao.find(1);
		 */
		System.out.println(productDao.find());
		
	}

}
