package com.example.samplestsproduct.controller;

import com.example.samplestsproduct.dto.ProductCatogoryDTO;
import com.example.samplestsproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    @Autowired
    private ProductService productService;

@GetMapping("/product-categories")
    public List<ProductCatogoryDTO>getAllProductCatogoryDTOS(){
        return productService.getAllProductCategories();
    }
}
