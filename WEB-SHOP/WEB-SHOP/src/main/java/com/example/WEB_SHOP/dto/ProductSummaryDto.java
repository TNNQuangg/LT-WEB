package com.example.WEB_SHOP.dto;

import java.time.LocalDateTime;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductSummaryDto {
    private Integer id;
    private String name;
    private String thumbnailUrl;
    private Long basePrice;
    private Long salePrice;
    private String gender;   
    private LocalDateTime saleStart;
     private LocalDateTime saleEnd;
    private Integer discountPercentage; 
    private Boolean isWished;
    private Integer  sold_quantity ; 
    private Integer average_rating ; 
}
