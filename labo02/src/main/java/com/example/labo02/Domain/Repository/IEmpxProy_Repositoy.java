package com.example.labo02.Domain.Repository;
import com.example.labo02.Domain.Entities.EmpleadoXProyecto;
import jakarta.transaction.Transactional;
import java.util.UUID;

@Transactional
public interface IEmpxProy_Repositoy extends Igeneral_repository<EmpleadoXProyecto, UUID>{
}
