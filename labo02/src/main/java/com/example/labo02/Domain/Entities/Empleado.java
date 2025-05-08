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

    @ManyToOne
    @JoinColumn(name = "id_puesto", nullable = false, foreignKey = @ForeignKey(name = "fk_puesto_empleado"))
    private Puesto puesto;

    @ManyToOne
    @JoinColumn(name = "id_departamento", nullable = false, foreignKey = @ForeignKey(name = "fk_departamento_empleado"))
    private Departamento departamento;

}
