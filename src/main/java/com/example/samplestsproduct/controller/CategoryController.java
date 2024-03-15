package com.example.samplestsproduct.controller;

import com.example.samplestsproduct.dto.CategoryDTO;
import com.example.samplestsproduct.dto.ProductDTO;
import com.example.samplestsproduct.model.Category;
import com.example.samplestsproduct.model.Product;
import com.example.samplestsproduct.repository.CategoryRepository;
import com.example.samplestsproduct.repository.ProductRepository;
import com.example.samplestsproduct.service.CategoryService;
import com.example.samplestsproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
    CategoryService categoryService;

    @Autowired
    CategoryRepository categoryRepository;


    @GetMapping("/{Id}")
    public Category getCategory(@PathVariable Long Id) {
        List<Category> categoryList =  categoryService.getcategory(Id);
        return categoryRepository.findById(Id).get() ;
    }


    @GetMapping
    public List<Category> getAllCategory() {
       categoryService.getAllCategory();
        return  categoryRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO category) {
        CategoryDTO categoryDTO = categoryService.createCategory(category);
        return ResponseEntity.status(HttpStatus.CREATED.value()).body(category);
    }



    @PutMapping("/{Id}")
    public ResponseEntity<String> updateCategory(@RequestBody CategoryDTO category, @PathVariable Long Id) {
        CategoryDTO updatedCategory = categoryService.updateCategory(category);
        if (updatedCategory != null) {
            return ResponseEntity.ok("Product updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to update product");
        }
       }
//
//    @DeleteMapping("/{productId}")
//    public String deleteProduct(@PathVariable("productId") Long productId) {
//    	productService.deleteProduct(productId);
//
//        return "product db deleted successfully";
//    }


}
