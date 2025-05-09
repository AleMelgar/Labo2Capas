package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.ProyectoXTecnologia;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface IProyxTec_Repositoy extends Igeneral_repository<ProyectoXTecnologia, UUID>{

    // la consulta jpa
    List<ProyectoXTecnologia> findByProyectoId(UUID idProyecto);

    // directa
    @Query(value = "SELECT * FROM proyecto_x_tecnologia WHERE id_proyecto = :idProyecto", nativeQuery = true)
    List<ProyectoXTecnologia> findByProyectonative(@Param("idProyecto") UUID idProyecto);

    // hibrida
    @Query("SELECT pt FROM ProyectoXTecnologia pt WHERE pt.proyecto.idProyecto = :idProyecto")
    List<ProyectoXTecnologia> findByProyectoh(@Param("idProyecto") UUID idProyecto);


}
