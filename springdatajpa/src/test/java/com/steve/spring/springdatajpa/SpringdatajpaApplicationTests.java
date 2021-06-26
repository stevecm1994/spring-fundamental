package com.steve.spring.springdatajpa;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.steve.spring.springdatajpa.entity.Product;
import com.steve.spring.springdatajpa.repositories.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	ApplicationContext ctx;
	
	@Test
	public void saveProduct() {
		
		ProductRepository repository = ctx.getBean(ProductRepository.class);
		Product product = new Product();
		product.setId(1L);
		product.setName("Mac Book");
		product.setDescription("Cool product");
		product.setPrice(1200);
		
		/* To Save the product  object to DB*/
		//repository.save(product);   
		
		/*  To retrieve product from DB using ID*/
		//Optional<Product> optional = repository.findById(1L);
		//Product productFromDb = optional.get();
		//System.out.println(productFromDb);
		
		/* Updating a particular field in DB . Here changing price value of product*/
		//productFromDb.setPrice(1500);		
		//repository.save(productFromDb);		
		//repository.findAll().forEach(p->{ System.out.println(p.getPrice());  });
		
		/*FindBy method from JPA which executes the SQL queries*/
		System.out.println("Find By Name " + repository.findByName("Mac Book"));
		System.out.println("Find By Price " + repository.findByPrice(1500D));		
		System.out.println("Find By Name and Price " + repository.findByNameAndPrice("Mac Book", 1500D));
	}

}
