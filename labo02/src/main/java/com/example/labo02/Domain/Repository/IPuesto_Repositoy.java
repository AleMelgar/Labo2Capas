package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Puesto;
import jakarta.transaction.Transactional;
import java.util.UUID;

@Transactional
public interface IPuesto_Repositoy extends Igeneral_repository<Puesto, UUID>{
    // La consulta jpa
    public Puesto findBynombre(String nombre);

}
