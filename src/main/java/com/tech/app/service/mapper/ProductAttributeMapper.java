package com.tech.app.service.mapper;

import com.tech.app.domain.ProductAttribute;
import com.tech.app.service.dto.ProductAttributeDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class ProductAttributeMapper implements EntityMapper<ProductAttributeDTO, ProductAttribute> {

    private ProductMapper productMapper;
    @Override
    public ProductAttribute toEntity(ProductAttributeDTO dto) {
        ProductAttribute productAttribute = new ProductAttribute();
        productAttribute.builder()
                .idProductAtr(dto.getIdProductAtr())
                .name(dto.getName())
                .value(dto.getValue())
                .product(productMapper.toEntity(dto.getProductDTO()))
                .build();
        return productAttribute;
    }

    @Override
    public ProductAttributeDTO toDTO(ProductAttribute entity) {
        ProductAttributeDTO productAttributeDTO = new ProductAttributeDTO();
        productAttributeDTO.builder()
                .idProductAtr(entity.getIdProductAtr())
                .name(entity.getName())
                .value(entity.getValue())
                .productDTO(productMapper.toDTO(entity.getProduct()))
                .build();
        return productAttributeDTO;
    }

    @Override
    public List<ProductAttribute> toEntity(List<ProductAttributeDTO> dto) {
        List<ProductAttribute> productAttributeList = new ArrayList<>();
        dto.forEach(d -> {
            ProductAttribute productAttribute = new ProductAttribute();
            productAttribute.builder()
                    .idProductAtr(d.getIdProductAtr())
                    .name(d.getName())
                    .value(d.getValue())
                    .product(productMapper.toEntity(d.getProductDTO()))
                    .build();
            productAttributeList.add(productAttribute);
        });
        return productAttributeList;
    }

    @Override
    public List<ProductAttributeDTO> toDTO(List<ProductAttribute> entity) {
        List<ProductAttributeDTO> productAttributeDTOList = new ArrayList<>();
        entity.forEach(e -> {
            ProductAttributeDTO productAttributeDTO = new ProductAttributeDTO();
            productAttributeDTO.builder()
                    .idProductAtr(e.getIdProductAtr())
                    .name(e.getName())
                    .value(e.getValue())
                    .productDTO(productMapper.toDTO(e.getProduct()))
                    .build();
            productAttributeDTOList.add(productAttributeDTO);
        });
        return productAttributeDTOList;
    }
}
