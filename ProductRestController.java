package com.kiran.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kiran.entity.Product;
import com.kiran.service.ProductService;

@RestController
public class ProductRestController {
	@Autowired
	public ProductService service;

	@PostMapping("/product")
	public ResponseEntity<String> addProduct(@RequestBody Product product) {
		String upsertproduct = service.upsert(product);
		return new ResponseEntity<>(upsertproduct, HttpStatus.CREATED);
	}

	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllproducts() {
		List<Product> allProducts = service.getAllProducts();
		return new ResponseEntity<>(allProducts, HttpStatus.OK);
	}

	@DeleteMapping("/product")
	public ResponseEntity<String> deleteProduct(@RequestParam Integer productId) {
		
		String deleteProduct = service.DeleteProduct(productId);
		return new ResponseEntity<>(deleteProduct, HttpStatus.OK);
	}

}
