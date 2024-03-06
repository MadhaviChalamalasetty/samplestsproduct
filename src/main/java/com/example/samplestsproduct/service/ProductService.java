package com.example.samplestsproduct.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.samplestsproduct.dto.ProductDTO;
import com.example.samplestsproduct.model.Product;
import com.example.samplestsproduct.repository.ProductRepository;
import com.example.samplestsproduct.transformers.ProductTransformer;


@Service
public class ProductService {

    @Autowired
    private ProductRepository prodRepository;

	public Product getProduct(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	public ProductDTO createProduct(ProductDTO product) {
		Product dbProduct = ProductTransformer.mapToProduct(product);
		
		Product updatedProduct =  prodRepository.save(dbProduct);
		
		ProductDTO productDto = ProductTransformer.mapToProductDTO(updatedProduct);
		
		return productDto;
	}

	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	public void deleteProduct(Long productId) {
		// TODO Auto-generated method stub
		
	}

}



