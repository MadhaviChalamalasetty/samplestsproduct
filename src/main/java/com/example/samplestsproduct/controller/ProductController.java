package com.example.samplestsproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.samplestsproduct.dto.ProductDTO;
import com.example.samplestsproduct.model.Product;
import com.example.samplestsproduct.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;


    @GetMapping("/{productId}")
    public Product getProduct(@PathVariable("productId") Long productId) {

        return productService.getProduct(productId);
    }

    @GetMapping
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO product) {
    	ProductDTO prodcut = productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED.value()).body(prodcut);
    }

    @PutMapping("/{productId}")
    public String updateProduct(@RequestBody Product product) {
    	productService.updateProduct(product);

        return "product db updated successfully";
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId) {
    	productService.deleteProduct(productId);

        return "product db deleted successfully";
    }


}
