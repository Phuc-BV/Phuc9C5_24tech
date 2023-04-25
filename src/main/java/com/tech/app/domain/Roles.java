package com.tech.app.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Roles {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idRole;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;


}
