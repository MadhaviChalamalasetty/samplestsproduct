package com.example.samplestsproduct.service;


import com.example.samplestsproduct.dto.CategoryDTO;
import com.example.samplestsproduct.dto.ProductDTO;
import com.example.samplestsproduct.exception.ProductNotfoundException;
import com.example.samplestsproduct.model.Category;
import com.example.samplestsproduct.model.Product;
import com.example.samplestsproduct.repository.CategoryRepository;
import com.example.samplestsproduct.repository.ProductRepository;
import com.example.samplestsproduct.transformers.CategoryTransformer;
import com.example.samplestsproduct.transformers.ProductTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

	public CategoryDTO createCategory(CategoryDTO category) {
		Category dbCategory = CategoryTransformer.mapToCategory(category);
		Category updatedCategory =  categoryRepository.save(dbCategory);
		CategoryDTO categoryDto = CategoryTransformer.mapToCategoryDTO(updatedCategory);
		return categoryDto;
	}

	public List<Category> getAllCategory() {
		return  categoryRepository.findAll();
	}

	public List<Category> getcategory(Long productId) {
		return categoryRepository.findAll();
	}

	public CategoryDTO updateCategory(CategoryDTO category) {
		Category dbCategory = CategoryTransformer.mapToUpdateCategory(category);
		Category updatedCategory = categoryRepository.save(dbCategory);
		return CategoryTransformer.mapToUpdateCategoryDTO(updatedCategory);

	}


//	public void deleteProduct(Long productId) {
//		Optional<Product> optionalProduct = prodRepository.findById(productId);
//		if(optionalProduct.isPresent()){
//			Product product =optionalProduct.get();
//			prodRepository.deleteById(productId);
//		} else{
//			throw new ProductNotfoundException("product not found::"+productId);
//		}
//
//	}

}



