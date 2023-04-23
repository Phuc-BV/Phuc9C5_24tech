package com.tech.app.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductAttributeDTO {
    private long idProductAtr;
    private String name;
    private String value;

    private ProductDTO productDTO;
}
