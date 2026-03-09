package com.example.WEB_SHOP.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.WEB_SHOP.model.WishList;

@Repository
public interface WishListRepository  extends JpaRepository<WishList, Integer>  {
    void deleteByUserIdAndProductId(Integer userId, Integer productId);

    @Query("SELECT w.productId FROM WishList w WHERE w.userId = :userId")
    List<Integer> findProductIdsByUserId(@Param("userId") Integer userId);
    List<WishList> findByUserId(Integer userId);
    void deleteByUserId(Integer userId);
}
