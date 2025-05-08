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
public class EmpleadoXProyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idEmpleadoXProyecto;

    @ManyToOne
    @JoinColumn(name = "id_empleado", nullable = false, foreignKey = @ForeignKey(name = "fk_empleado_empleadoXProyecto"))
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_proyecto", nullable = false, foreignKey = @ForeignKey(name = "fk_proyecto_empleadoXProyecto"))
    private Proyecto proyecto;
}
