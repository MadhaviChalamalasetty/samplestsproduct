package com.example.samplestsproduct.service;

import com.example.samplestsproduct.exception.ProductNotfoundException;
import com.example.samplestsproduct.model.Categories;
import com.example.samplestsproduct.model.Product;
import com.example.samplestsproduct.repository.CategoryRepository;
import com.example.samplestsproduct.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdImpl implements ProdService {

    ProductRepository productRepository;
    CategoryRepository categoryRepository;

    public ProdImpl(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }

    @Override
    public String createProduct(Product product) {
        productRepository.save(product);
        categoryRepository.save(new Categories());
        return "Successfully created";
    }

    @Override
    public String updateProduct(Product product) {
        productRepository.save(product);
        return "Successfully updated";
    }

    @Override
    public String deleteProduct(Long productId) {
        productRepository.deleteById(productId);
        return "deleted successfully";
    }

    @Override
    public Product getProduct(Long productId) {
    if(productRepository.findById(productId).isEmpty())
        throw new ProductNotfoundException("Requsted Product doesnot exist");
        return productRepository.findById(productId).get();
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
