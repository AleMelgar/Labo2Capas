package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Departamento;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

@Transactional
public interface IDepartamento_Repositoy extends Igeneral_repository<Departamento, UUID>{
    // La consulta jpa
    public Departamento findBynombre(String nombre);

    //directa
    @Query( nativeQuery = true, value = "SELECT * FROM Departamento WHERE nombre = :nombre")
    public Departamento findBynombreNative(@Param("nombre") String nombre);

}
