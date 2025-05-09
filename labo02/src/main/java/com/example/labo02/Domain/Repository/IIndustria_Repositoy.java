package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Industria;
import jakarta.transaction.Transactional;
import java.util.UUID;

@Transactional
public interface IIndustria_Repositoy extends Igeneral_repository<Industria, UUID>{
    // La consulta jpa
    public Industria findBynombre(String nombre);

}
