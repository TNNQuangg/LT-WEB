package com.example.WEB_SHOP.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.example.WEB_SHOP.model.ProductImage;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetailDto {
    private Integer id;
    private String name;
    private String description;
    private String thumbnailUrl;
    private Long basePrice;
    private Long salePrice;
    private String gender;
    private LocalDateTime saleStart;
    private LocalDateTime saleEnd;
    private Integer discountPercentage;
    private Boolean isWished;
    private Integer soldQuantity;
    private Double averageRating;

    private List<ProductImage> images;
    private List<ProductReviewDto> reviews;
}
