package com.tech.app.repository;

import com.tech.app.domain.ERole;
import com.tech.app.domain.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {
    Optional<Roles> findByName(ERole name);

}
