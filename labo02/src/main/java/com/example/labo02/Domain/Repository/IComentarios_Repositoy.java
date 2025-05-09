package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Comentarios;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;


@Transactional
public interface IComentarios_Repositoy extends Igeneral_repository<Comentarios, UUID>{
    // La consulta jpa
    public Comentarios findByautor(String autor);

    //directa
    @Query( nativeQuery = true, value = "SELECT * FROM Comentarios WHERE autor = :autor")
    public Comentarios findByautorNative(@Param("autor") String autor);

    //hibrida
    @Query("SELECT c FROM Comentarios c WHERE c.autor = :autor")
    List<Comentarios> findByAutorh(@Param("autor") String autor);

}
