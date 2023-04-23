package com.tech.app.service;

import com.tech.app.repository.RolesRepository;
import com.tech.app.service.dto.RolesDTO;
import com.tech.app.service.mapper.RolesMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RolesService {
    private final RolesMapper rolesMapper;
    private final RolesRepository rolesRepository;

    public List<RolesDTO> findAll(){
        List<RolesDTO> rolesDTOList = new ArrayList<>();
        rolesDTOList = rolesMapper.toDTO(rolesRepository.findAll());
        return rolesDTOList;
    }

}
