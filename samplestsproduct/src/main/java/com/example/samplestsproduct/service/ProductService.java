package com.example.samplestsproduct.service;


import com.example.samplestsproduct.dto.ProductCatogoryDTO;
import com.example.samplestsproduct.model.Product;
import com.example.samplestsproduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {


    @Autowired
    private ProductRepository prodRepository;

    public List<ProductCatogoryDTO> getAllProductCategories(){

        return prodRepository.findAll()
                .stream()
                .map(this::convertProducttoDTO)
                .collect(Collectors.toList());
    }

    private ProductCatogoryDTO convertProducttoDTO(Product product){
        ProductCatogoryDTO productCatogoryDTO = new ProductCatogoryDTO();
        productCatogoryDTO.setProductId((product.getProductId()));
        productCatogoryDTO.setProductDesc(product.getProductDesc());
        productCatogoryDTO.setProductName(product.getProductName());
        productCatogoryDTO.setCategoryName(product.getCategories().getCategoryName());
        productCatogoryDTO.setCategoryDesc(product.getCategories().getCategoryDesc());

        return productCatogoryDTO;
    }
}
