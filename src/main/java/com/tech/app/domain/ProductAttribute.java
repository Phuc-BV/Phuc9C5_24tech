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
public class ProductAttribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProductAtr;
    @Column(columnDefinition = "VARCHAR(60) NOT NULL")
    private String name;
    @Column(columnDefinition = "VARCHAR(200) NOT NULL")
    private String value;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;

}
