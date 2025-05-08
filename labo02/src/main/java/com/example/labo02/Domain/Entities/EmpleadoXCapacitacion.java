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
public class EmpleadoXCapacitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idEmpleadoXCapacitacion;

    @ManyToOne
    @JoinColumn(name = "id_empleado", nullable = false, foreignKey = @ForeignKey(name = "fk_empleado_empleadoXCapacitacion"))
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_capacitacion", nullable = false, foreignKey = @ForeignKey(name = "fk_capacitacion_empleadoXCapacitacion"))
    private Capacitacion capacitacion;


}
