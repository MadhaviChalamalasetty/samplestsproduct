package com.example.samplestsproduct;

import com.example.samplestsproduct.model.Categories;
import com.example.samplestsproduct.model.Product;
import com.example.samplestsproduct.repository.CategoryRepository;
import com.example.samplestsproduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//public class SamplestsproductApplication implements CommandLineRunner {
public class SamplestsproductApplication {
    public static void main(String[] args) {

        SpringApplication.run(SamplestsproductApplication.class, args);
    }

//
//	@Autowired
//	private ProductRepository prodRepository;
//
//	@Autowired
//	private CategoryRepository categoryRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		//for category
//		Categories categories = new Categories();
//		categories.setCategoryDesc("CatDesc1");
//		categories.setCategoryValue(2.8);
//		categories.setCategoryName("CatName");
//		categoryRepository.save(categories);
//
//		//for product
//		Product product1 = new Product();
//		product1.setProductDesc("cosmetics");
//		product1.setProductName("Perfumes");
//		product1.setPrice(30);
//		product1.setQty(50);
//		product1.setCategories(categories);
//		product1.setProductId(1L);
//		prodRepository.save(product1);
//	}
}
