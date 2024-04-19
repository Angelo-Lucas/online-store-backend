package com.onlinestore.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PRODUCT_REVIEW")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private Integer rating;

    private String comment;
}
