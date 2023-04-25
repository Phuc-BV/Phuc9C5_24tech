package com.tech.app.service;

import com.tech.app.repository.RolesRepository;
import com.tech.app.repository.UserRepository;
import com.tech.app.security.jwt.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private AuthenticationManager authenticationManager;

    private UserRepository userRepository;

    private RolesRepository roleRepository;

    private PasswordEncoder encoder;

    private JwtUtils jwtUtils;


}
