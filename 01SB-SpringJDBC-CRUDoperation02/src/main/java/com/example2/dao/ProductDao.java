package com.example2.dao;

import java.util.List;


import com.example2.model.Product;

public interface ProductDao {

	List<Product> findAllprod();
    //hello this is productDao
	Product findById(int productId);

	int addProd(Product p);

	int updateProd(Product p, int productId);

	int delete(int productId);

	
	
}
