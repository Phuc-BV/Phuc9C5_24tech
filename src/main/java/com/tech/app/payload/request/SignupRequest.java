package com.tech.app.payload.request;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;

    private String fullName;

    @NotBlank
    @Size(max = 80)
    @Email
    private String email;

    private String phone;
    private String address;
    private Set<String> role;
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

}
