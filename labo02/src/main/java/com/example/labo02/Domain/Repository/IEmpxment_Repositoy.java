package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.EmpleadoXMentor;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface IEmpxment_Repositoy extends Igeneral_repository<EmpleadoXMentor, UUID>{

    // la consulta jpa
    List<EmpleadoXMentor> findByMentoreado_IdEmpleado(UUID idMentoreado);


    //la directa
    @Query( nativeQuery = true, value = "SELECT * FROM empleado_x_mentor WHERE id_mentor = :idMentor")
    List<EmpleadoXMentor> findByMentornative(@Param("idMentor") UUID idMentor);

    //hibrida
    @Query("SELECT em FROM EmpleadoXMentor em WHERE em.mentor.idEmpleado = :idEmpleado OR em.mentoreado.idEmpleado = :idEmpleado")
    List<EmpleadoXMentor> findByEmpleadoh(@Param("idEmpleado") UUID idEmpleado);

}
