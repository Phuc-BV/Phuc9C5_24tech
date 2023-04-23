package com.tech.app.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private long idProduct;
    private String name;
    private String image;
    private Long price;
    private Long discount;
    private int quantity;
    private String description;

    private CategoryDTO categoryDTO;

}
