package com.example.samplestsproduct.repository;

import com.example.samplestsproduct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
