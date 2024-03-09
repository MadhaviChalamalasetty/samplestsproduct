package com.example.samplestsproduct.model;

import java.util.Set;

import org.hibernate.annotations.ManyToAny;

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
@Table(name = "attribute")
public class Attribute {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "attrId")
    private Long attrId;

    @Column(name = "attrName")
    private String attrName;

    @Column(name = "attrDesc")
    private String attrDesc;
    
    @ManyToOne
    @JoinColumn(name="productId")
    private Product product;
}

