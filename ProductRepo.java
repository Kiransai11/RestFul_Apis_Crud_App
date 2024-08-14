package com.kiran.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiran.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
