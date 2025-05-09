package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Comentarios;
import jakarta.transaction.Transactional;
import java.util.UUID;


@Transactional
public interface IComentarios_Repositoy extends Igeneral_repository<Comentarios, UUID>{
    // La consulta jpa
    public Comentarios findByautor(String autor);
}
