package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Puesto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

@Transactional
public interface IPuesto_Repositoy extends Igeneral_repository<Puesto, UUID>{
    // La consulta jpa
    public Puesto findBynombre(String nombre);

    //directa
    @Query( nativeQuery = true, value = "SELECT * FROM Puesto WHERE nombre = :nombre")
    public Puesto findBynombreNative(@Param("nombre") String nombre);

}
