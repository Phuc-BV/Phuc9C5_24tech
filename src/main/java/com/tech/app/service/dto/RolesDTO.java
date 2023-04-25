package com.tech.app.service.dto;

import com.tech.app.domain.ERole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RolesDTO  {
    private long idRole;
    private ERole name;


}
