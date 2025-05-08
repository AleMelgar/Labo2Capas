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
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idCategoria;

    @Column
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_area", nullable = false, foreignKey = @ForeignKey(name = "fk_area_categoria"))
    private Area area;

}
