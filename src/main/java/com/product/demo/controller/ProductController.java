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



@RestController
@RequestMapping(path = "/product/api")
public class ProductController 
{

	@Autowired
	ProductService productService;
    
    @GetMapping(value = "{domain}/getproductdetails")
    public ResponseEntity<List<Product>> getProductDetails(@PathVariable("domain") String domain) 
    {
    	List<Product> productData =  productService.getProductDetails();
    	/*Product product = new Product(23, "Test","banking");
    	Product product1 = new Product(23, "Test2","Retail");
    	productData.add(product);	
    	productData.add(product1);	*/
    	if (productData.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Product>>(productData, HttpStatus.OK);
        
    }
    
    @GetMapping(path="{domain}/getproductconfig")
    public ResponseEntity<List<String>> getProductConfig(@PathVariable("domain") String domain) 
    {
    	ArrayList<String> list = new ArrayList<>();
    	list.add("DummyData");
    	return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }
    
}
