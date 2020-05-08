package com.product.demo.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.demo.model.Product;
import com.product.demo.service.ProductService;
import com.product.demo.model.Response;



@RestController
@RequestMapping(path = "/product/api")
public class ProductController 
{

	@Autowired
	ProductService productService;
    
    @GetMapping(value = "{domain}/getproductdetails")
    public Response getProductDetails(@PathVariable("domain") String domain)  {
    	List<Product> productData = productService.getProductDetails();
		if (productData.isEmpty()) {
			return new Response(HttpStatus.NO_CONTENT, null);
		}
		return new Response(HttpStatus.OK, productData);
        
    }
    
    @GetMapping(path="{domain}/getproductconfig")
    public  Response getProductConfig(@PathVariable("domain") String domain) {
    	ArrayList<String> list = new ArrayList<>();
		list.add("DummyData");
		Response result = new Response(HttpStatus.OK, list);
		return result;
    }
    
}
