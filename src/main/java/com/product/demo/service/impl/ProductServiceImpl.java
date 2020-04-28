package com.product.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;


import com.product.demo.model.Product;
import com.product.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	
	private static final AtomicLong counter = new AtomicLong();
	 
	 private static List<Product> products ;
	 
	 static {
		 products = populateDummyProduct();
	 }

	

	private static List<Product> populateDummyProduct() {

		List<Product> prods = new ArrayList<Product>();
		// adding dummy employees here
		prods.add(new Product(counter.incrementAndGet(), "Test", "banking"));
		prods.add(new Product(counter.incrementAndGet(), "Deepak", "retail"));
		prods.add(new Product(counter.incrementAndGet(), "Test1", "banking"));
		prods.add(new Product(counter.incrementAndGet(), "Test2", "banking"));
		return prods;
	}



	@Override
	public List<Product> getProductDetails() {
		// TODO Auto-generated method stub
		return products;
	}

	
	 

}
