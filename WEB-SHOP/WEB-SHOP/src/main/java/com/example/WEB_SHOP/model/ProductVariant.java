package com.example.WEB_SHOP.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product_variants") 
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductVariant { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "variant_id")
    private Integer id; 
    @Column(name = "product_id")
    private Integer productId; 
    @Column(name = "size_id")
    private Integer sizeId; 
    @Column(name = "color_id")
    private Integer colorId; 
    @Column(name = "stock_quantity")
    private Integer stockQuantity;  
    @Column(name = "created_at")
    private LocalDateTime createdAt; 
    @Column(name = "updated_at")
    private LocalDateTime updatedAt; 
    
}
