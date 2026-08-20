package com.example.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;
}
