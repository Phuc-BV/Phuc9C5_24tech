package com.tech.app.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Roles {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idRole;

    @Column(nullable = false, length = 80)
    private String role;

}
