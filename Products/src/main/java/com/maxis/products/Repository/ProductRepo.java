package com.maxis.products.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxis.products.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
