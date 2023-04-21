package com.tech.app.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @Column(nullable = false, length = 150)
    private String fullName;

    @Column(nullable = false, length = 200)
    private String address;

    @Column(nullable = false, length = 191)
    private String email;
    @Column(nullable = false, length = 80)
    private String phone;
    @Column(nullable = false, length = 60)
    private String password;

    @ManyToOne
    @JoinColumn(name= "id_role")
    @JsonIgnore
    private User user;

}
