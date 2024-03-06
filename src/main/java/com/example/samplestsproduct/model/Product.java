package com.example.samplestsproduct.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId")
    private Long productId;

    @Column(name = "productName")
    private String productName;

    @Column(name = "productDesc")
    private String productDesc;

    @Column(name = "price")
    private double price;

    @Column(name = "qty")
    private int qty;

    @Column(name = "supplierId")
    private String supplierId;

    @Column(name = "msrp")
    private long msrp;

    @Column(name = "availableSize")
    private String availableSize;

    @Column(name = "availableColors")
    private String availableColors;

    @Column(name = "size")
    private String size;

    @Column(name = "color")
    private String color;

    @Column(name = "discount")
    private String discount;

    @Column(name = "unitWeight")
    private String unitWeight;

    @Column(name = "unitInStock")
    private String unitInStock;

    @Column(name = "unitsOnOrder")
    private String unitsOnOrder;

    @Column(name = "reOrderLevel")
    private String reOrderLevel;

    @Column(name = "productAvailable")
    private String productAvailable;

    @Column(name = "discountAvailable")
    private String discountAvailable;

    @Column(name = "currentOrder")
    private String currentOrder;

    @Column(name = "picture")
    private String picture;

    @Column(name = "ranking")
    private String ranking;

    @Column(name = "note")
    private String note;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Set<Category> categories = new HashSet<>();
}
