package com.example.samplestsproduct.controller;

import com.example.samplestsproduct.dto.ProductCatogoryDTO;
import com.example.samplestsproduct.model.Product;
import com.example.samplestsproduct.response.ResponseHandler;
import com.example.samplestsproduct.service.ProdService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;


@RestController
@RequestMapping("/product")
public class Prodcontroller {
    ProdService prodService;


    public Prodcontroller(ProdService prodService) {
        this.prodService = prodService;
    }


    @GetMapping("/{productId}")
    public Product getProduct(@PathVariable("productId") Long productId) {

        return prodService.getProduct(productId);
    }

//    @GetMapping("/{productId}")
//    @ApiOperation(value = "Product id", response=ResponseEntity.class)
//    public ResponseEntity<Object> getProduct(@PathVariable("productId") Long productId) {
//
//        return ResponseHandler.
//    }

    @GetMapping()
    public List<Product> getAllProduct() {

        return prodService.getAllProduct();
    }

    @PostMapping()
    public String createProduct(@RequestBody Product product) {
        prodService.createProduct(product);

        return "product created successfully";
    }

    @PutMapping("/")
    public String updateProduct(@RequestBody Product product) {
        prodService.updateProduct(product);

        return "product db updated successfully";
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId) {
        prodService.deleteProduct(productId);

        return "product db deleted successfully";
    }


}
