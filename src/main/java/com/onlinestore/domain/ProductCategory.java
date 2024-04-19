package com.onlinestore.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "PRODUCT_CATEGORY")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "category")
    private List<Product> productList;
}
