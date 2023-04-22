package com.tech.app.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private int idUser;
    private String fullName;
    private String address;
    private String email;
    private String phone;
    private String password;

    private RolesDTO roles;

}
