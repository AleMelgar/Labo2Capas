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
public class EmpleadoXMentor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idEmpleadoXMentor;

    @ManyToOne
    @JoinColumn(name = "id_mentor", nullable = false, foreignKey = @ForeignKey(name = "fk_mentor_empleadoXMentor"))
    private Empleado mentor;

    @ManyToOne
    @JoinColumn(name = "id_mentoreado", nullable = false, foreignKey = @ForeignKey(name = "fk_mentoreado_empleadoXMentor"))
    private Empleado mentoreado;

}
