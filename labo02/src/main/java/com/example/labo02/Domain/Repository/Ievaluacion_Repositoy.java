package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Evaluacion;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

@Transactional
public interface Ievaluacion_Repositoy extends Igeneral_repository<Evaluacion, UUID>{
    // La consulta jpa
    public Evaluacion findBypuntaje(String puntaje);

    //directa
    @Query( nativeQuery = true, value = "SELECT * FROM Evaluacion WHERE puntaje = :puntaje")
    public Evaluacion findBypuntajeNative(@Param("puntaje") String puntaje);

}
