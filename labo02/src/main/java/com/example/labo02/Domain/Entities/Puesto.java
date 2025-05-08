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
public class Puesto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idPuesto;

    @Column
    private String nombre;
}
