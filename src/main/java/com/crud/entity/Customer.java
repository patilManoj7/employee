package com.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(nullable = false, unique = true)
    String name;
    @Column(unique = true, nullable = false)
    String email;
    @Column(length = 10)
    String phone;
}
