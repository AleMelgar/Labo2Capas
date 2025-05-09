package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.EmpleadoXCapacitacion;
import jakarta.transaction.Transactional;
import java.util.UUID;

@Transactional
public interface IEmpxcap_Repositoy extends Igeneral_repository<EmpleadoXCapacitacion, UUID>{
}
