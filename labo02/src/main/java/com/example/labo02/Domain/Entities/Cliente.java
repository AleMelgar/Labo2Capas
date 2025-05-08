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
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idCliente;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_industria", nullable = false, foreignKey = @ForeignKey(name = "fk_industria_cliente"))
    private Industria industria;

}
