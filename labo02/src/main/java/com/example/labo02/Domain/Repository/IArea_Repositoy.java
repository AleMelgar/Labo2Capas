package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Area;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

@Transactional
public interface IArea_Repositoy extends Igeneral_repository<Area, UUID>{

    // La consulta jpa
    public Area findBynombre(String nombre);

    //directa
    @Query( nativeQuery = true, value = "SELECT * FROM area WHERE nombre = :nombre")
    public Area findBynombreNative(@Param("nombre") String nombre);

    //hibrido
    @Query("SELECT a FROM Area a WHERE a.nombre = :nombre")
    Area findByNombreh(@Param("nombre") String nombre);


}

