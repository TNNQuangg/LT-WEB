package com.example.WEB_SHOP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WEB_SHOP.dto.ApiResponse;
import com.example.WEB_SHOP.model.ProductVariant;
import com.example.WEB_SHOP.service.ProductVariantService;

@RestController
@RequestMapping("variant")
public class ProductVariantController {

    @Autowired
    private ProductVariantService variantService;

    @GetMapping("/{id}")
    public List<ProductVariant> listVariant(@PathVariable Integer id ) {
        return variantService.getAllProductVariants(id);
    }

    @PostMapping("add")
    public ResponseEntity<ApiResponse<ProductVariant>> addVariant(@RequestBody ProductVariant variant) {
        return variantService.addProductVariant(variant);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<ApiResponse<ProductVariant>> updateVariant(@PathVariable Integer id, @RequestBody ProductVariant variant) {
        return variantService.updateVariant(id, variant);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<ApiResponse<ProductVariant>> deleteVariant(@PathVariable Integer id) {
        return variantService.deleteVariant(id);
    }
}
