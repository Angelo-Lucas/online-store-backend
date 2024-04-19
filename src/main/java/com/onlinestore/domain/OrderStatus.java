package com.onlinestore.domain;

import com.onlinestore.enuns.OrderStatusEnum;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ORDER_STATUS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private OrderStatusEnum status;
}
