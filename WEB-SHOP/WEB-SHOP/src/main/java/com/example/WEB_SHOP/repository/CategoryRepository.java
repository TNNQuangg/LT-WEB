package com.example.WEB_SHOP.repository;

import java.util.List;
import java.util.Optional;
import java.util.Locale.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends  JpaRepository<Category , Integer > {

    public List<Category> findAll() ;
    public Optional<Category> findById(Integer id);   
    public Category findByName(String name);  
} 
