package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Area;
import com.example.labo02.Domain.Entities.Evaluacion;
import jakarta.transaction.Transactional;
import java.util.UUID;

@Transactional
public interface Ievaluacion_Repositoy extends Igeneral_repository<Evaluacion, UUID>{
    // La consulta jpa
    public Evaluacion findBypuntaje(String puntaje);

}
