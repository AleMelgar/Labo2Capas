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
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idProyecto;

    @Column
    private String codigo;

    @Column
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false, foreignKey = @ForeignKey(name = "fk_categoria_proyecto"))
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false, foreignKey = @ForeignKey(name = "fk_cliente_proyecto"))
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_lider", nullable = false, foreignKey = @ForeignKey(name = "fk_lider_proyecto"))
    private Empleado lider;

}
