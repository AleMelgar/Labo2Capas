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
public class ProyectoXTecnologia {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idProyectoXTecnologia;


    @ManyToOne
    @JoinColumn(name = "id_proyecto", nullable = false, foreignKey = @ForeignKey(name = "fk_proyecto_proyectoXTecnologia"))
    private Proyecto proyecto;

    @ManyToOne
    @JoinColumn(name = "id_tecnologia", nullable = false, foreignKey = @ForeignKey(name = "fk_tecnologia_proyectoXTecnologia"))
    private Tecnologia tecnologia;
}
