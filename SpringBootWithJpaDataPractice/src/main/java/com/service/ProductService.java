package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productrepo;
	
	public List<Product> getallproducts(){
		return productrepo.findAll();
		
	}
	
	public String storeproducts(Product product) {
		boolean res=productrepo.existsById(product.getPid());
		if(res) {
			return "product not stored";
			
		}
		else {
			productrepo.save(product);
			return "product stored successfully";
		}
	}

}
