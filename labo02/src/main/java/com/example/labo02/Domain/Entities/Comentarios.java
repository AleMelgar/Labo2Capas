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
public class Comentarios {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idComentario;

    @Column
    private String contenido;

    @Column
    private LocalDate fecha;

    @Column
    private String autor;

    @ManyToOne
    @JoinColumn(name = "id_evaluacion", nullable = false, foreignKey = @ForeignKey(name = "fk_evaluacion_comentario"))
    private Evaluacion evaluacion;


}
