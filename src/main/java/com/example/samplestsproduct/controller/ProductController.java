//package com.example.samplestsproduct.controller;
//
//import com.example.samplestsproduct.dto.ProductCatogoryDTO;
//import com.example.samplestsproduct.model.Product;
//import com.example.samplestsproduct.repository.ProductRepository;
//import com.example.samplestsproduct.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.NoSuchElementException;
//
//@RestController
//
//public class ProductController {
//
//
//    @Autowired
//    private ProductService productService;
//
//    @Autowired
//    private ProductRepository productRepository;
//
//@GetMapping("/product-categories")
//    public List<ProductCatogoryDTO>getAllProductCatogoryDTOS(){
//
//    return productService.getAllProductCategories();
//    }
//
////    @PutMapping("/product-categories/{id}")
////    public List<ProductCatogoryDTO>updateProductCategory(){
////
////        return productService.updateProductCategory();
////    }
//
////    @PutMapping("/products/{id}")
////    public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Integer id) {
////        try {
////            Product existProduct = productService.updateProductCategory();
////            service.save(product);
////            return new ResponseEntity<>(HttpStatus.OK);
////        } catch (NoSuchElementException e) {
////            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
////        }
////    }
//
////    @PutMapping
////    public ResponseEntity<ProductCatogoryDTO> updateProductCategory(@RequestBody ProductCatogoryDTO prodCategory) {
////        ProductCatogoryDTO updatedProdCategory = productService.updateProdCategory(prodCategory);
////        return ResponseEntity.ok(updatedProdCategory);
////    }
////    @DeleteMapping
////
////    public ResponseEntity<Void> deleteCustomerWithAddresses(@RequestBody CustomerRequest customerRequest) {
////        customerService.deleteCustomerWithAddresses(customerRequest);
////        return ResponseEntity.noContent().build();
////    }
//}
