package com.tech.app.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDTO {
    private long idOrder;
    private String name;
    private String email;
    private String phone;
    private int status;
    private Date date;

}
