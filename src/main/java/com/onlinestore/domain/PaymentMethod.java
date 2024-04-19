package com.onlinestore.domain;

import com.onlinestore.enuns.PaymentTypeEnum;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PAYMENT_METHOD")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private PaymentTypeEnum type;

    private String description;
}
