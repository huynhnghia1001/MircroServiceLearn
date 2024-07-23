package com.huynhnghia.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.huynhnghia.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product,String>{

}
