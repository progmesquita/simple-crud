package com.example.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dscatalog.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}