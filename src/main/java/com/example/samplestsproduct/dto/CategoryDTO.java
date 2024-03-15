package com.example.samplestsproduct.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CategoryDTO {


    private Long id;
    private String categoryName;
    private String categoryDesc;
    private double categoryValue;

}
