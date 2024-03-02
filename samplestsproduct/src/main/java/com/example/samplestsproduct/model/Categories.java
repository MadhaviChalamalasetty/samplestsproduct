package com.example.samplestsproduct.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoryName;
    private String categoryDesc;
    private double categoryValue;

    @OneToMany
    @MapsId
    @JoinColumn(name= "productId")
    private List<Product>  product  = new ArrayList<>();
}
