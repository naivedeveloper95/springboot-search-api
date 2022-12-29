package com.practicespringboot.springbootsearchrestapi.service;

import com.practicespringboot.springbootsearchrestapi.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
