package com.tech.app.service.mapper;

import com.tech.app.domain.Product;
import com.tech.app.service.dto.ProductDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class ProductMapper implements EntityMapper<ProductDTO, Product> {

    private CategoryMapper categoryMapper;

    @Override
    public Product toEntity(ProductDTO dto) {
        Product product = new Product();
        product.builder()
                .idProduct(dto.getIdProduct())
                .name(dto.getName())
                .image(dto.getImage())
                .price(dto.getPrice())
                .discount(dto.getDiscount())
                .quantity(dto.getQuantity())
                .description(dto.getDescription())
                .category(categoryMapper.toEntity(dto.getCategoryDTO()))
                .build();
        return product;
    }

    @Override
    public ProductDTO toDTO(Product entity) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.builder()
                .idProduct(entity.getIdProduct())
                .name(entity.getName())
                .image(entity.getImage())
                .price(entity.getPrice())
                .discount(entity.getDiscount())
                .quantity(entity.getQuantity())
                .description(entity.getDescription())
                .categoryDTO(categoryMapper.toDTO(entity.getCategory()))
                .build();
        return productDTO;
    }

    @Override
    public List<Product> toEntity(List<ProductDTO> dto) {
        List<Product> productList = new ArrayList<>();

        dto.forEach(d -> {
            Product product = new Product();
            product.builder()
                    .idProduct(d.getIdProduct())
                    .name(d.getName())
                    .image(d.getImage())
                    .price(d.getPrice())
                    .discount(d.getDiscount())
                    .quantity(d.getQuantity())
                    .description(d.getDescription())
                    .category(categoryMapper.toEntity(d.getCategoryDTO()))
                    .build();

            productList.add(product);
        });
        return productList;
    }

    @Override
    public List<ProductDTO> toDTO(List<Product> entity) {
        List<ProductDTO> productDTOList = new ArrayList<>();
        entity.forEach(e -> {
            ProductDTO productDTO = new ProductDTO();
            productDTO.builder()
                    .idProduct(e.getIdProduct())
                    .name(e.getName())
                    .image(e.getImage())
                    .price(e.getPrice())
                    .discount(e.getDiscount())
                    .quantity(e.getQuantity())
                    .description(e.getDescription())
                    .categoryDTO(categoryMapper.toDTO(e.getCategory()))
                    .build();

            productDTOList.add(productDTO);
        });
        return productDTOList;
    }

}
