package com.example.WEB_SHOP.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WEB_SHOP.model.Cart;

public interface CartRepository  extends JpaRepository<Cart, Integer>  {

    List<Cart> findByUserId(Integer userId);
    Optional<Cart> findByUserIdAndProductIdAndVariantId(Integer userId, Integer productId, Integer variantId);
    
}
