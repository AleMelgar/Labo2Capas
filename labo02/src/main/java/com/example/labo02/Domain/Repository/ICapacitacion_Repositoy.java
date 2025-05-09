package com.example.labo02.Domain.Repository;


import com.example.labo02.Domain.Entities.Capacitacion;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;
@Transactional
public interface ICapacitacion_Repositoy extends Igeneral_repository<Capacitacion, UUID>{
    // La consulta jpa
    public Capacitacion findBytema(String tema);

    //directa
    @Query( nativeQuery = true, value = "SELECT * FROM Capacitacion WHERE tema = :tema")
    public Capacitacion findBytemaNative(@Param("tema") String tema);

}
