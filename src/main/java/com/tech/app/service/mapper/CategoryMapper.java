package com.tech.app.service.mapper;

import com.tech.app.domain.Category;
import com.tech.app.service.dto.CategoryDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryMapper implements EntityMapper<CategoryDTO, Category> {

    @Override
    public Category toEntity(CategoryDTO dto) {
        Category category = new Category();
        category.builder()
                .idCategory(dto.getIdCategory())
                .name(dto.getName())
                .build();
        return category;
    }

    @Override
    public CategoryDTO toDTO(Category entity) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setIdCategory(entity.getIdCategory());
        categoryDTO.setName(entity.getName());
        return categoryDTO;
    }

    @Override
    public List<Category> toEntity(List<CategoryDTO> dto) {
        List<Category> categoryList = new ArrayList<>();
        dto.forEach(d -> {
            Category category = new Category();
            category.builder()
                    .idCategory(d.getIdCategory())
                    .name(d.getName())
                    .build();
            categoryList.add(category);
        });
        return categoryList;
    }

    @Override
    public List<CategoryDTO> toDTO(List<Category> entity) {
        List<CategoryDTO> categoryDTOList = new ArrayList<>();
        entity.forEach(e -> {
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setIdCategory(e.getIdCategory());
            categoryDTO.setName(e.getName());
            categoryDTOList.add(categoryDTO);
        });
        return categoryDTOList;
    }
}
