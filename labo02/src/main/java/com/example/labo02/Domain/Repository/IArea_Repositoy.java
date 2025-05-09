package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Area;
import jakarta.transaction.Transactional;

import java.util.UUID;

@Transactional
public interface IArea_Repositoy extends Igeneral_repository<Area, UUID>{

    // La consulta jpa
    public Area findBynombre(String nombre);

}

