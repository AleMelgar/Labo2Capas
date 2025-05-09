package com.example.labo02.Domain.Repository;
import com.example.labo02.Domain.Entities.EmpleadoXProyecto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface IEmpxProy_Repositoy extends Igeneral_repository<EmpleadoXProyecto, UUID>{

    // la consulta jpa
    List<EmpleadoXProyecto> findByEmpleado_IdEmpleado(UUID idEmpleado);


    // la directa
    @Query(value = "SELECT * FROM empleado_x_proyecto WHERE id_empleado = :idEmpleado", nativeQuery = true)
    List<EmpleadoXProyecto> findByEmpleadonative(@Param("idEmpleado") UUID idEmpleado);

    // hibrida
    @Query("SELECT ep FROM EmpleadoXProyecto ep WHERE ep.empleado.idEmpleado = :idEmpleado")
    List<EmpleadoXProyecto> findByEmpleadoh(@Param("idEmpleado") UUID idEmpleado);

}
