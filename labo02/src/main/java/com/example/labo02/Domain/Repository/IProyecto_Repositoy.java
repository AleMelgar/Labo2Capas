package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Proyecto;
import jakarta.transaction.Transactional;
import java.util.UUID;

@Transactional
public interface IProyecto_Repositoy extends Igeneral_repository<Proyecto, UUID>{
    // La consulta jpa
    public Proyecto findBynombre(String nombre);
}
