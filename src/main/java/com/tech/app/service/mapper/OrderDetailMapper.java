package com.tech.app.service.mapper;

import com.tech.app.domain.OrderDetail;
import com.tech.app.service.dto.OrderDetailDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class OrderDetailMapper implements EntityMapper<OrderDetailDTO, OrderDetail> {

    private OrderMapper orderMapper;
    private ProductMapper productMapper;

    @Override
    public OrderDetail toEntity(OrderDetailDTO dto) {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.builder()
                .idOrderDetail(dto.getIdOrderDetail())
                .price(dto.getPrice())
                .num(dto.getNum())
                .totalPrice(dto.getTotalPrice())
                .order(orderMapper.toEntity(dto.getOrderDTO()))
                .product(productMapper.toEntity(dto.getProductDTO()))
                .build();
        return orderDetail;
    }

    @Override
    public OrderDetailDTO toDTO(OrderDetail entity) {
        OrderDetailDTO orderDetailDTO = new OrderDetailDTO();
        orderDetailDTO.builder()
                .idOrderDetail(entity.getIdOrderDetail())
                .price(entity.getPrice())
                .num(entity.getNum())
                .totalPrice(entity.getTotalPrice())
                .orderDTO(orderMapper.toDTO(entity.getOrder()))
                .productDTO(productMapper.toDTO(entity.getProduct()))
                .build();
        return orderDetailDTO;
    }

    @Override
    public List<OrderDetail> toEntity(List<OrderDetailDTO> dto) {
        List<OrderDetail> orderDetailList = new ArrayList<>();
        dto.forEach(d -> {
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.builder()
                    .idOrderDetail(d.getIdOrderDetail())
                    .price(d.getPrice())
                    .num(d.getNum())
                    .totalPrice(d.getTotalPrice())
                    .order(orderMapper.toEntity(d.getOrderDTO()))
                    .product(productMapper.toEntity(d.getProductDTO()))
                    .build();
            orderDetailList.add(orderDetail);
        });
        return orderDetailList;
    }

    @Override
    public List<OrderDetailDTO> toDTO(List<OrderDetail> entity) {
        List<OrderDetailDTO> orderDetailDTOList = new ArrayList<>();
        entity.stream().forEach(e -> {
            OrderDetailDTO orderDetailDTO = new OrderDetailDTO();
            orderDetailDTO.builder()
                    .idOrderDetail(e.getIdOrderDetail())
                    .price(e.getPrice())
                    .num(e.getNum())
                    .totalPrice(e.getTotalPrice())
                    .orderDTO(orderMapper.toDTO(e.getOrder()))
                    .productDTO(productMapper.toDTO(e.getProduct()))
                    .build();
            orderDetailDTOList.add(orderDetailDTO);
        });
        return orderDetailDTOList;
    }
}
