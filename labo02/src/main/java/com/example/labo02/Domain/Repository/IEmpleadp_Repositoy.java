package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Empleado;
import jakarta.transaction.Transactional;
import java.util.UUID;

@Transactional
public interface IEmpleadp_Repositoy extends Igeneral_repository<Empleado, UUID>{
    // La consulta jpa
    public Empleado findBynombre(String nombre);

}
