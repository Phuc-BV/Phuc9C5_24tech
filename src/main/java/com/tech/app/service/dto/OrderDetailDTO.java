package com.tech.app.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDetailDTO {
    private int idOrderDetail;
    private long price;
    private int num;
    private long totalPrice;

    private OrderDTO orderDTO;
    private ProductDTO productDTO;
}
