package com.tech.app.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private long idUser;

    private String username;
    private String fullName;
    private String address;
    private String email;
    private String phone;
    @JsonIgnore
    private String password;

    private RolesDTO roles;

}
