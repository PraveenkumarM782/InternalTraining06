package com.example2.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example2.model.Product;
import com.example2.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	//find all product record
	@GetMapping("/product")
	public List <Product> findAllProduct(){
		
		return productservice.findAllProduct();
	}
	//finding specific product by id
	@GetMapping("/product/{productId}")
	public Product  findProdById(@PathVariable int productId) {
		return productservice.findById(productId);
	}
	
	//adding
	@PostMapping("/product")
	public String addProduct(@RequestBody Product p) {
		return productservice.addProduct(p)+" Product data added !!";
	}
	
	//updating
	@PutMapping("/product/{productId}")
	public String updateProduct(@RequestBody Product p,@PathVariable int productId) {
		
		return productservice.updateProduct(p,productId)+" Product data Updated !!";
	}
	
	//deleting
	@DeleteMapping("/producti/{productId}")
	public String deleteProduct(@PathVariable int productId){
		return productservice.deleteProduct(productId)+" Product deleted !!";
		//hellooo wooorld
	}

}
