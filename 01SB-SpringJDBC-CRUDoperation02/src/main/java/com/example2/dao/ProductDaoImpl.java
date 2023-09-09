package com.example2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example2.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	JdbcTemplate jdbctemplate;
	
	@Override
	public List<Product> findAllprod() {
		
		return jdbctemplate.query("select productId,productName,productCategory,productPrice,quantity,expiryDate from Product", new BeanPropertyRowMapper<Product>(Product.class));
	}

	@Override
	public Product findById(int productId) {
	
		return jdbctemplate.queryForObject("SELECT productId,productName,productCategory,productPrice,quantity,expiryDate FROM Product WHERE productId=?", new BeanPropertyRowMapper<Product>(Product.class), productId);

	}

	@Override
	public int addProd(Product p) {
		String query ="INSERT INTO Product (productId,productName,productCategory,productPrice,quantity,expiryDate) VALUES (?,?,?,?,?,?)";
	//	return jdbctemplate.query(query, new BeanPropertyRowMapper<Product>(Product.class));
		
		return jdbctemplate.update(query, new Object[] {p.getProductId(),p.getProductName(), p.getProductCategory(), p.getQuantity(),p.getProductPrice(),p.getExpiryDate()});
	}

	@Override
	public int updateProd(Product p, int productId) {
		
		return jdbctemplate.update("UPDATE Product SET productName = ?, productCategory = ?,productPrice=?,quantity=?,expiryDate=? WHERE productId= ?", new Object[] {p.getProductName(), p.getProductCategory(), p.getQuantity(),p.getProductPrice(),p.getExpiryDate(), productId});

	}

	@Override
	public int delete(int productId) {
		
		return jdbctemplate.update("DELETE FROM Product WHERE productId=?", productId);
	}
	
	//third update

}
