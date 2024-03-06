package com.example.samplestsproduct.service;

import com.example.samplestsproduct.dto.ProductCatogoryDTO;
import com.example.samplestsproduct.model.Product;

import java.util.List;

public interface ProdService {

    public String createProduct(Product product);

    public String updateProduct(Product product);

    public String deleteProduct(Long productId);

    public Product getProduct(Long productId);

    public List<Product> getAllProduct();

}
