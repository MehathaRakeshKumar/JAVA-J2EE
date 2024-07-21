package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {
	@Autowired
	ProductService productservice;
	
	
	@GetMapping(value="getproduct",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getallproducts(){
		return productservice.getallproducts();
		
	}
	
	
	@PostMapping(value="storeproduct", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeproduct(@RequestBody Product product) {
		return productservice.storeproducts(product);
	}

}
