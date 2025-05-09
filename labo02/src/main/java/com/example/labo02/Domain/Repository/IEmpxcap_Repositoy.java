package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.EmpleadoXCapacitacion;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface IEmpxcap_Repositoy extends Igeneral_repository<EmpleadoXCapacitacion, UUID>{

    // la consulta jpa
    List<EmpleadoXCapacitacion> findByEmpleadoId(UUID idEmpleado);

    // directa
    @Query(value = "SELECT * FROM empleado_x_capacitacion WHERE id_empleado = :idEmpleado", nativeQuery = true)
    List<EmpleadoXCapacitacion> findByEmpleadonative(@Param("idEmpleado") UUID idEmpleado);

    // hibrida
    @Query("SELECT ec FROM EmpleadoXCapacitacion ec WHERE ec.empleado.idEmpleado = :idEmpleado")
    List<EmpleadoXCapacitacion> findByEmpleadoh(@Param("idEmpleado") UUID idEmpleado);

}
