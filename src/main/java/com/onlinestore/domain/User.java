package com.onlinestore.domain;

import com.onlinestore.enuns.UserRoleEnum;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "USER")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserRoleEnum role;
}
