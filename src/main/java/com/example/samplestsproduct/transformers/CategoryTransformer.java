package com.example.samplestsproduct.transformers;

import com.example.samplestsproduct.dto.CategoryDTO;
import com.example.samplestsproduct.dto.ProductDTO;
import com.example.samplestsproduct.model.Category;
import com.example.samplestsproduct.model.Product;

public class CategoryTransformer {



	public static CategoryDTO mapToCategoryDTO(Category updatedCategory) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(updatedCategory.getId());
        categoryDTO.setCategoryDesc(updatedCategory.getCategoryDesc());
        categoryDTO.setCategoryName(updatedCategory.getCategoryName());
        categoryDTO.setCategoryValue(updatedCategory.getCategoryValue());

        return categoryDTO;
    }

    public static Category mapToCategory(CategoryDTO category) {
        Category dbCategory = new Category();
        dbCategory.setId(category.getId());
        dbCategory.setCategoryName(category.getCategoryName());
        dbCategory.setCategoryDesc(category.getCategoryDesc());
        dbCategory.setCategoryValue(category.getCategoryValue());

        return dbCategory;
    }

    public static Category mapToUpdateCategory(CategoryDTO category) {
        Category dbCategory1= new Category();
        dbCategory1.setId(category.getId());
        dbCategory1.setCategoryName(category.getCategoryName());
        dbCategory1.setCategoryValue(category.getCategoryValue());
        dbCategory1.setCategoryDesc(category.getCategoryDesc());
        return dbCategory1;

    }

    public static CategoryDTO mapToUpdateCategoryDTO(Category updatedCategory) {
        CategoryDTO categoryDTO1 = new CategoryDTO();
        categoryDTO1.setId(updatedCategory.getId());
        categoryDTO1.setCategoryName(updatedCategory.getCategoryName());
        categoryDTO1.setCategoryValue(updatedCategory.getCategoryValue());
        categoryDTO1.setCategoryDesc(updatedCategory.getCategoryDesc());
        return categoryDTO1;
    }
}
