package com.example.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dscatalog.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}