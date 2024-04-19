package com.onlinestore.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ORDERS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private Date orderDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "delivery_address_id", referencedColumnName = "id")
    private DeliveryAddress deliveryAddress;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private OrderStatus status;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItemList;
}
