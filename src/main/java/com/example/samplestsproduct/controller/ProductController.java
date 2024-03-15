package com.example.samplestsproduct.controller;

import com.example.samplestsproduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import java.util.List;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;

    @Autowired
    ProductRepository productRepository;


    @GetMapping("/{productId}")
    public Product getProduct(@PathVariable Long productId) {
        List<Product> prod =  productService.getProduct(productId);
        return productRepository.findById(productId).get() ;
    }


    @GetMapping
    public List<Product> getAllProduct() {
        productService.getAllProduct();
        return  productRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO product) {
    	ProductDTO prodcut = productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED.value()).body(prodcut);
    }

    @PutMapping("/{productId}")
    public ResponseEntity<String> updateProduct(@RequestBody ProductDTO product, @PathVariable Long productId) {
        ProductDTO updatedProduct = productService.updateProduct(product);
        if (updatedProduct != null) {
            return ResponseEntity.ok("Product updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to update product");
        }
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId) {
    	productService.deleteProduct(productId);

        return "product db deleted successfully";
    }


}
