package com.example.WEB_SHOP.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "wishlists") 
@Data
@AllArgsConstructor 
@NoArgsConstructor
public class WishList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wishlist_id")
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "product_id")    
    private Integer productId; 
    @Column(name = "added_at")
    private LocalDateTime addedAt;
     public WishList(Integer userId, Integer productId, LocalDateTime createdAt) {
        this.userId = userId;
        this.productId = productId;
        this.addedAt = createdAt;
    }
}
