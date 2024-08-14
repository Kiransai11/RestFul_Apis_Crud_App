package com.kiran.service;

import java.util.List;

import com.kiran.entity.Product;

public interface ProductService {
	
	public String upsert(Product product);
	
	public List<Product> getAllProducts();
	
	public String DeleteProduct(Integer productId);

}
