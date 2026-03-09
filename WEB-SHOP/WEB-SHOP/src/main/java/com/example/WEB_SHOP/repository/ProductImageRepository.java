package com.example.WEB_SHOP.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WEB_SHOP.model.ProductImage;

public interface ProductImageRepository extends JpaRepository<ProductImage, Integer> {

    Optional<ProductImage> findFirstByProductIdAndColorId(Integer productId, Integer colorId);

    List<ProductImage> findAllByProductId(Integer productId);
}
