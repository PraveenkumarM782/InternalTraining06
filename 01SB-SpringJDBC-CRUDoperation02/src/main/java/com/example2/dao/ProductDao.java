package com.example2.dao;

import java.util.List;


import com.example2.model.Product;

public interface ProductDao {

	List<Product> findAllprod();

	Product findById(int productId);

	int addProd(Product p);

	int updateProd(Product p, int productId);

	int delete(int productId);

	
	
}
