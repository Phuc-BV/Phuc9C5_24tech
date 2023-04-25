package com.tech.app.service.mapper;

import com.tech.app.domain.Order;
import com.tech.app.service.dto.OrderDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class OrderMapper implements EntityMapper<OrderDTO, Order>{

//    private OrderDetailMapper orderDetailMapper;
    @Override
    public Order toEntity(OrderDTO dto) {
        Order order = new Order();
        order.builder()
             .idOrder(dto.getIdOrder())
             .name(dto.getName())
             .email(dto.getEmail())
             .phone(dto.getPhone())
             .status(dto.getStatus())
             .date(dto.getDate())
//             .orderDetails(orderDetailMapper.toEntity(dto.getOrderDetails()))
             .build();

        return order;
    }

    @Override
    public OrderDTO toDTO(Order entity) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.builder()
                .idOrder(entity.getIdOrder())
                .name(entity.getName())
                .email(entity.getEmail())
                .phone(entity.getPhone())
                .status(entity.getStatus())
                .date(entity.getDate())
//                .orderDetails(orderDetailMapper.toDTO(entity.getOrderDetails()))
                .build();
        return orderDTO;
    }

    @Override
    public List<Order> toEntity(List<OrderDTO> dto) {
        List<Order> orderList = new ArrayList<>();
        dto.forEach(d -> {
            Order order = new Order();
            order.builder()
                    .idOrder(d.getIdOrder())
                    .name(d.getName())
                    .email(d.getEmail())
                    .phone(d.getPhone())
                    .status(d.getStatus())
                    .date(d.getDate())
//                    .orderDetails(orderDetailMapper.toEntity(d.getOrderDetails()))
                    .build();
            orderList.add(order);
        });
        return orderList;
    }

    @Override
    public List<OrderDTO> toDTO(List<Order> entity) {
        List<OrderDTO> orderDTOList = new ArrayList<>();
        entity.forEach(e -> {
            OrderDTO orderDTO = new OrderDTO();
            orderDTO.builder()
                    .idOrder(e.getIdOrder())
                    .name(e.getName())
                    .email(e.getEmail())
                    .phone(e.getPhone())
                    .status(e.getStatus())
                    .date(e.getDate())
//                    .orderDetails(orderDetailMapper.toDTO(e.getOrderDetails()))
                    .build();
            orderDTOList.add(orderDTO);
        });
        return orderDTOList;
    }
}
