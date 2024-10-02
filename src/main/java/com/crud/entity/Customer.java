package com.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="customer")
public class Customer {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;
    String email;
    String phone;
}
