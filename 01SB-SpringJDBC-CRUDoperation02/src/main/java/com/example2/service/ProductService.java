package com.example2.service;

import java.util.List;

import com.example2.model.Product;

public interface ProductService {

	List<Product> findAllProduct();

	Product findById(int productId);

	int addProduct(Product p);

	int updateProduct(Product p, int productId);

	int deleteProduct(int productId);

	
	
}
