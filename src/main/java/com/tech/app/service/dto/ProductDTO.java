package com.tech.app.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private int idProduct;
    private String name;
    private String image;
    private Long price;
    private Long discount;
    private int quantity;
    private String description;

}
