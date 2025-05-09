package com.example.labo02.Domain.Repository;


import com.example.labo02.Domain.Entities.Capacitacion;
import jakarta.transaction.Transactional;

import java.util.UUID;
@Transactional
public interface ICapacitacion_Repositoy extends Igeneral_repository<Capacitacion, UUID>{
    // La consulta jpa
    public Capacitacion findBytema(String tema);

}
