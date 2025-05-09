package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.ProyectoXTecnologia;
import jakarta.transaction.Transactional;
import java.util.UUID;

@Transactional
public interface IProyxTec_Repositoy extends Igeneral_repository<ProyectoXTecnologia, UUID>{
}
