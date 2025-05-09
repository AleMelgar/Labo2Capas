package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Categoria;
import jakarta.transaction.Transactional;
import java.util.UUID;

@Transactional
public interface ICategoria_Repositoy extends Igeneral_repository<Categoria, UUID>{
    // La consulta jpa
    public Categoria findBynombre(String nombre);
}
