package com.example.WEB_SHOP.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WEB_SHOP.model.ProductReview;

public interface ProductReviewRepository extends JpaRepository<ProductReview, Integer> {

    List<ProductReview> findAllByProductId(Integer productId);
    
}
