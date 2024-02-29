package com.example.samplestsproduct.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="productId")
    private Long productId;

    @Column(name="productName")
    private String productName;

    @Column(name="productDesc")
    private String productDesc;

    @Column(name="price")
    private double price;

    @Column(name="qty")
    private int qty;

    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name = "category_id")
    private Categories categories;
}
