package com.example2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example2.dao.ProductDao;
import com.example2.model.Product;
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productdao;
	
	
	@Override
	public List<Product> findAllProduct() {
		
		return productdao.findAllprod();
	}

	@Override
	public Product findById(int productId) {
		
		return productdao.findById(productId);
	}

	@Override
	public int addProduct(Product p) {
		
		return productdao.addProd(p);
	}

	@Override
	public int updateProduct(Product p, int productId) {
		
		return productdao.updateProd(p,productId);
	}

	@Override
	public int deleteProduct(int productId) {
		
		return productdao.delete(productId);
	}

}
