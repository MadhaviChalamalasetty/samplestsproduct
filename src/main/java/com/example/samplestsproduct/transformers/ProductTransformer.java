package com.example.samplestsproduct.transformers;

import com.example.samplestsproduct.dto.CategoryDTO;
import com.example.samplestsproduct.dto.ProductDTO;
import com.example.samplestsproduct.model.Category;
import com.example.samplestsproduct.model.Product;

public class ProductTransformer {

	public static Product mapToProduct(ProductDTO product) {
		Product dbProduct = new Product();
		dbProduct.setProductName(product.getProductName());
		dbProduct.setPrice(product.getPrice());
		dbProduct.setProductDesc(product.getProductDesc());
		dbProduct.setProductAvailable(product.getProductAvailable());
		dbProduct.setProductName(product.getProductName());
		dbProduct.setQty(product.getQty());
		dbProduct.setProductId(product.getProductId());
		dbProduct.setColor(product.getColor());
		dbProduct.setMsrp(product.getMsrp());
		dbProduct.setDiscount(product.getDiscount());
		dbProduct.setAvailableSize(product.getAvailableSize());
		return dbProduct;
	}

	public static ProductDTO mapToProductDTO(Product updatedProduct) {
		ProductDTO productDto = new ProductDTO();
		productDto.setProductName(updatedProduct.getProductName());
		productDto.setPrice(updatedProduct.getPrice());
		productDto.setProductId(updatedProduct.getProductId());
		productDto.setProductAvailable(updatedProduct.getProductAvailable());
		productDto.setProductDesc(updatedProduct.getProductDesc());
		productDto.setColor(updatedProduct.getColor());
		productDto.setAvailableColors(updatedProduct.getAvailableColors());
		productDto.setDiscount(updatedProduct.getDiscount());
		productDto.setAvailableSize(updatedProduct.getAvailableSize());
		productDto.setDiscountAvailable(updatedProduct.getDiscountAvailable());
		productDto.setCurrentOrder(updatedProduct.getCurrentOrder());
		productDto.setMsrp(updatedProduct.getMsrp());
		return productDto;
	}


	public static Product mapToUpdateProduct(ProductDTO product) {
		Product dbProduct = new Product();
		dbProduct.setAvailableSize(product.getAvailableSize());
		dbProduct.setQty(product.getQty());
		dbProduct.setColor(product.getColor());
		dbProduct.setProductDesc(product.getProductDesc());
		dbProduct.setProductId(product.getProductId());
        return dbProduct;
    }

	public static ProductDTO mapToUpdateProductDTO(Product updatedProduct) {
		ProductDTO productDto = new ProductDTO();
		productDto.setAvailableSize(productDto.getAvailableSize());
		productDto.setQty(productDto.getQty());
		productDto.setColor(productDto.getColor());
		productDto.setProductDesc(productDto.getProductDesc());
		productDto.setProductId(productDto.getProductId());
        return productDto;
    }


}
