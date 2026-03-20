package com.example.WEB_SHOP.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WEB_SHOP.model.WishList;
import com.example.WEB_SHOP.repository.WishListRepository;

@Service
public class WishListService {
    
    @Autowired
    private WishListRepository wishListRepository; 

    public void addWishList(Integer userId, Integer productId) {
        WishList wishList = new  WishList(userId, productId, LocalDateTime.now());
        wishListRepository.save(wishList); 
    }

    @org.springframework.transaction.annotation.Transactional
    public void removeWishList(Integer userId, Integer productId) {
        wishListRepository.deleteByUserIdAndProductId(userId, productId);
    }

    public java.util.List<Integer> getWishListProductIds(Integer userId) {
        return wishListRepository.findProductIdsByUserId(userId);
    }

    public List<WishList> listWishList(Integer userId) {
        return wishListRepository.findByUserId(userId);
    }
    public void clearWishList(Integer userId) {
        wishListRepository.deleteByUserId(userId);
    }
}
