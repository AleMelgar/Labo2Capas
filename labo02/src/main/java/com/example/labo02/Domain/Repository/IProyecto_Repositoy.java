package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Proyecto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface IProyecto_Repositoy extends Igeneral_repository<Proyecto, UUID>{
    // La consulta jpa
    public Proyecto findBynombre(String nombre);

    //directa
    @Query( nativeQuery = true, value = "SELECT * FROM Proyecto WHERE nombre = :nombre")
    public Proyecto findBynombreNative(@Param("nombre") String nombre);

    //hibrido
    @Query("SELECT p FROM Proyecto p WHERE p.cliente.nombre = :nombreCliente")
    List<Proyecto> findByClienteh(@Param("nombreCliente") String nombreCliente);

}
