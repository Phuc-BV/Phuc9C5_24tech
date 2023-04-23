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
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduct;
    @Column(nullable = false, length = 350)
    private String name;

    @Column(nullable = false)
    private String image;

    private Long price;
    private Long discount;

    @Column(columnDefinition = "INTEGER DEFAULT 0")
    private Integer quantity;

    @Column(columnDefinition = "TEXT DEFAULT NULL")
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;
}
