package com.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Industria {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idIndustria;

    @Column
    private String nombre;
}
