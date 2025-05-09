package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Industria;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

@Transactional
public interface IIndustria_Repositoy extends Igeneral_repository<Industria, UUID>{
    // La consulta jpa
    public Industria findBynombre(String nombre);

    //directa
    @Query( nativeQuery = true, value = "SELECT * FROM Industria WHERE nombre = :nombre")
    public Industria findBynombreNative(@Param("nombre") String nombre);

}
