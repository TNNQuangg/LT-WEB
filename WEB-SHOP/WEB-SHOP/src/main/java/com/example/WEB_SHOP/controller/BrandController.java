package com.example.WEB_SHOP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.WEB_SHOP.dto.ApiResponse;
import com.example.WEB_SHOP.model.Brand;
import com.example.WEB_SHOP.service.BrandService;

@Controller
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping("add")
    @ResponseBody
    public ResponseEntity<ApiResponse> addBrand(@RequestBody Brand brand) {
        return brandService.addBrand(brand);
    }

    @GetMapping("list")
    @ResponseBody
    public ResponseEntity<ApiResponse> listBrand() {
        return brandService.listBrand();
    }
}