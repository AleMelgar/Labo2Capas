package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Cliente;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

@Transactional
public interface ICliente_Repositoy extends Igeneral_repository<Cliente, UUID>{
    // La consulta jpa
    public Cliente findBynombre(String nombre);

    //directa
    @Query( nativeQuery = true, value = "SELECT * FROM Cliente WHERE nombre = :nombre")
    public Cliente findBynombreNative(@Param("nombre") String nombre);

    //hibrida
    @Query("SELECT c FROM Cliente c WHERE c.nombre = :nombre")
    Cliente findByNombreh(@Param("nombre") String nombre);

}
