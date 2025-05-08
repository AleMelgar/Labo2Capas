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
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idEmpleado;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String email;

    @Column
    private LocalDate fechaIngreso;
}
