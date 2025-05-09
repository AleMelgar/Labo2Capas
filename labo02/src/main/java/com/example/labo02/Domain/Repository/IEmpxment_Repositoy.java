package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.EmpleadoXMentor;
import jakarta.transaction.Transactional;
import java.util.UUID;

@Transactional
public interface IEmpxment_Repositoy extends Igeneral_repository<EmpleadoXMentor, UUID>{
}
