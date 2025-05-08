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
public class Tecnologia {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idTecnologia;

    @Column
    private String nombre;

    @Column
    private String version;
}
