package com.example.WEB_SHOP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WEB_SHOP.dto.ApiResponse;
import com.example.WEB_SHOP.model.Category;
import com.example.WEB_SHOP.service.CategoryService;

@RestController 
@RequestMapping("category") 
public class CategoryController {
    @Autowired
    private CategoryService service ; 
    @GetMapping
    public ResponseEntity<ApiResponse> listCategory() {
        return service.listCategory();
    } 
    @PostMapping("add")
    public ResponseEntity<ApiResponse> addCategory(@RequestBody Category category) {
        return service.addCategory(category);
    }    

}
