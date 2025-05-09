package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Departamento;
import jakarta.transaction.Transactional;
import java.util.UUID;

@Transactional
public interface IDepartamento_Repositoy extends Igeneral_repository<Departamento, UUID>{
    // La consulta jpa
    public Departamento findBynombre(String nombre);

}
