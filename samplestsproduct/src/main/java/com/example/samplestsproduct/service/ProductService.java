//package com.example.samplestsproduct.service;
//
//
//import com.example.samplestsproduct.dto.ProductCatogoryDTO;
//import com.example.samplestsproduct.model.Product;
//import com.example.samplestsproduct.repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
//
//@Service
//public class ProductService {
//
//    @Autowired
//    private ProductRepository prodRepository;
//
//    public List<ProductCatogoryDTO> getAllProductCategories(){
//
//        return prodRepository.findAll()
//                .stream()
//                .map(this::convertProducttoDTO)
//                .collect(Collectors.toList());
//    }
//
//    private ProductCatogoryDTO convertProducttoDTO(Product product){
//        ProductCatogoryDTO productCatogoryDTO = new ProductCatogoryDTO();
//        productCatogoryDTO.setProductId((product.getProductId()));
//        productCatogoryDTO.setProductDesc(product.getProductDesc());
//        productCatogoryDTO.setProductName(product.getProductName());
//        productCatogoryDTO.setCategoryName(product.getCategories().getCategoryName());
//        productCatogoryDTO.setCategoryDesc(product.getCategories().getCategoryDesc());
//
//        return productCatogoryDTO;
//    }
//
//
//
////    private ProductCatogoryDTO updateProdCategory(Product product) {
////
////
////        return prodCategory;
////    }
//
////    public List<ProductCatogoryDTO> updateProductCategory() {
////        return productRepository.findById(id)
////                .map(updateProductCategory -> {
////                    updateProductCategory.setProductId(prodCategory.getProductId());
////                    updateProductCategory.setProductName(prodCategory.getProductName());
////                    updateProductCategory.setProductDesc(prodCategory.getProductDesc());
////                    //  updateProductCategory.setCategories(prodCategory.getCategoryDesc());
////                    return new ResponseEntity<>(updateProductCategory.save(), HttpStatus.OK);;
////                })
////                .orElseGet(() -> {
////                    prodCategory. setProductId(id);
////                    return  new ResponseEntity<>(HttpStatus.NOT_FOUND);;
////                });
////    }
//
//
//}
//
//
//
