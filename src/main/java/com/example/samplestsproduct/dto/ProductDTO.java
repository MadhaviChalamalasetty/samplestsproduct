package com.example.samplestsproduct.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
	
	
	@NotEmpty
    private String productName;
	
	private Long productId;

    private String productDesc;

    @NotEmpty
    private double price;

    private int qty;

    private String supplierId;

    private long msrp;

    private String availableSize;

    private String availableColors;

    private String size;

    private String color;

    private String discount;

    private String unitWeight;

    private String unitInStock;

    private String unitsOnOrder;

    private String reOrderLevel;

    private String productAvailable;

    private String discountAvailable;

    private String currentOrder;

    private String picture;

    private String ranking;

    private String note;

}
