package com.example.labo02.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Capacitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idCapacitacion;

    @Column
    private String tema;

    @Column
    private LocalDate fecha;

    @Column
    private Double duracion;
}
