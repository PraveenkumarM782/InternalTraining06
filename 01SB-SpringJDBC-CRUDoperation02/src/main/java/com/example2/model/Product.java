package com.example2.model;

import java.sql.Date;

public class Product {

	private int productId;
	private String productName;
	private String productCategory;
	private float productPrice;
	private int quantity;
	private Date  expiryDate;
	
		
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, String productCategory, float productPrice, int quantity,
			Date expiryDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.expiryDate = expiryDate;
	}



	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getProductCategory() {
		return productCategory;
	}



	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}



	public float getProductPrice() {
		return productPrice;
	}



	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public Date getExpiryDate() {
		return expiryDate;
	}



	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", productPrice=" + productPrice + ", quantity=" + quantity + ", expiryDate="
				+ expiryDate + "]";
	}
	
	
		
}
