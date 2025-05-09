package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Capacitacion;
import com.example.labo02.Domain.Entities.Categoria;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

@Transactional
public interface ICategoria_Repositoy extends Igeneral_repository<Categoria, UUID>{
    // La consulta jpa
    public Categoria findBynombre(String nombre);

    //directa
    @Query( nativeQuery = true, value = "SELECT * FROM Categoria WHERE nombre = :nombre")
    public Categoria findBynombreNative(@Param("nombre") String nombre);

}
