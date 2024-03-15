package com.example.samplestsproduct.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoryName;
    private String categoryDesc;
    private double categoryValue;

    @OneToMany(mappedBy="category")
    private Set<ProductCategory> productCategories = new HashSet<>();
}
