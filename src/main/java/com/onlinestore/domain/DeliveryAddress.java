package com.onlinestore.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "DELIVERY_ADDRESS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeliveryAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    private String city;

    private String zipcode;

    private String country;
}
