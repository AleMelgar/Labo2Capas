package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Empleado;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

@Transactional
public interface IEmpleadp_Repositoy extends Igeneral_repository<Empleado, UUID>{
    // La consulta jpa
    public Empleado findBynombre(String nombre);

    //directa
    @Query( nativeQuery = true, value = "SELECT * FROM Empleado WHERE nombre = :nombre")
    public Empleado findBynombreNative(@Param("nombre") String nombre);

    //hibrida
    @Query("SELECT e FROM Empleado e WHERE e.email = :email")
    Empleado findByEmailh(@Param("email") String email);

}
