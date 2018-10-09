package com.capgemini.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.product.entity.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {

}
