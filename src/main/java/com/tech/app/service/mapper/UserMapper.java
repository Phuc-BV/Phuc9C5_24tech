//package com.tech.app.service.mapper;
//
//import com.tech.app.domain.User;
//import com.tech.app.service.dto.UserDTO;
//import lombok.AllArgsConstructor;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//@Component
//@RequiredArgsConstructor
//public class UserMapper implements EntityMapper<UserDTO, User>{
//    private RolesMapper rolesMapper;
//    @Override
//    public User toEntity(UserDTO dto) {
//        User user = new User();
//        user.builder()
//                .idUser(dto.getIdUser())
//                .username(dto.getUsername())
//                .fullName(dto.getFullName())
//                .email(dto.getEmail())
//                .address(dto.getAddress())
//                .phone(dto.getPhone())
//                .password(dto.getPassword())
//                .roles(rolesMapper.toEntity(dto.getRoles()))
//                .build();
//        return user;
//    }
//
//    @Override
//    public UserDTO toDTO(User entity) {
//        UserDTO userDTO = new UserDTO();
//        userDTO.builder()
//                .idUser(entity.getIdUser())
//                .username(entity.getUsername())
//                .fullName(entity.getFullName())
//                .email(entity.getEmail())
//                .address(entity.getAddress())
//                .phone(entity.getPhone())
//                .password(entity.getPassword())
//                .roles(rolesMapper.toDTO(entity.getRoles()))
//                .build();
//        return userDTO;
//    }
//
//    @Override
//    public List<User> toEntity(List<UserDTO> dto) {
//        List<User> userList = new ArrayList<>();
//        dto.forEach((u -> {
//            User user = new User();
//            user.builder()
//                    .idUser(u.getIdUser())
//                    .username(u.getUsername())
//                    .fullName(u.getFullName())
//                    .email(u.getEmail())
//                    .address(u.getAddress())
//                    .phone(u.getPhone())
//                    .password(u.getPassword())
//                    .roles(rolesMapper.toEntity(u.getRoles()))
//                    .build();
//            userList.add(user);
//        }));
//        return userList;
//    }
//
//    @Override
//    public List<UserDTO> toDTO(List<User> entity) {
//        List<UserDTO> userDTOList = new ArrayList<>();
//        entity.forEach(e-> {
//            UserDTO userDTO = new UserDTO();
//            userDTO.builder()
//                    .idUser(e.getIdUser())
//                    .username(e.getUsername())
//                    .fullName(e.getFullName())
//                    .email(e.getEmail())
//                    .address(e.getAddress())
//                    .phone(e.getPhone())
//                    .password(e.getPassword())
//                    .roles(rolesMapper.toDTO(e.getRoles()))
//                    .build();
//            userDTOList.add(userDTO);
//        });
//        return userDTOList;
//    }
//}
