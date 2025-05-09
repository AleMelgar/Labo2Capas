package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Tecnologia;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

@Transactional
public interface ITecnologia_Repositoy extends Igeneral_repository<Tecnologia, UUID>{
    // La consulta jpa
    public Tecnologia findBynombre(String nombre);

    //directa
    @Query( nativeQuery = true, value = "SELECT * FROM Tecnologia WHERE nombre = :nombre")
    public Tecnologia findBynombreNative(@Param("nombre") String nombre);

}
