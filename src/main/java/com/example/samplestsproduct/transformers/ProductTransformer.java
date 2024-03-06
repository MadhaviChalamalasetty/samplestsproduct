package com.example.samplestsproduct.transformers;

import com.example.samplestsproduct.dto.ProductDTO;
import com.example.samplestsproduct.model.Product;

public class ProductTransformer {

	public static Product mapToProduct(ProductDTO product) {
		Product dbProduct = new Product();
		dbProduct.setProductName(product.getProductName());
		dbProduct.setPrice(product.getPrice());
		return dbProduct;
	}

	public static ProductDTO mapToProductDTO(Product updatedProduct) {
		ProductDTO productDto = new ProductDTO();
		productDto.setProductName(updatedProduct.getProductName());
		productDto.setPrice(updatedProduct.getPrice());
		productDto.setProductId(updatedProduct.getProductId());
		return productDto;
	}
	
	
	

}
