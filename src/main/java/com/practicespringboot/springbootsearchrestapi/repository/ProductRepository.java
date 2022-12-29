package com.practicespringboot.springbootsearchrestapi.repository;

import com.practicespringboot.springbootsearchrestapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p from Product p where p.name like concat('%', :query, '%') OR p.description like concat('%', :query, '%')")
    List<Product> searchProduct(String query);

    @Query(value = "SELECT * from products where name like concat('%',:query,'%') OR description like concat('%',:query,'%')", nativeQuery = true)
    List<Product> searchProductSQL(String query);
}
