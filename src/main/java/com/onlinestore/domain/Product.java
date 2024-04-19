package com.onlinestore.domain;

import com.onlinestore.records.ProductRecord;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Double price;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductCategory category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductReview> reviewList;

    public ProductRecord toProductRecord() {
        return ProductRecord.builder()
                .name(this.name)
                .description(this.description)
                .price(this.price)
                .quantity(this.quantity)
                .build();
    }
}
