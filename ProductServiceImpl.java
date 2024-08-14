package com.kiran.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kiran.Repository.ProductRepo;
import com.kiran.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	public ProductRepo repo;

	public ProductServiceImpl(ProductRepo repo) {
		this.repo = repo;
	}

	@Override
	public String upsert(Product product) {
		Integer productId = product.getPid();
		if (productId == null) {
			repo.save(product);
			return "Product Inserted Successfully";
		} else {
			repo.save(product);
			return "Product Updated Successfully";
		}

	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> all = repo.findAll();
		return all;
	}

	@Override
	public String DeleteProduct(Integer productId) {
		repo.deleteById(productId);
		return "Record Deleted Successfully";
	}

}
