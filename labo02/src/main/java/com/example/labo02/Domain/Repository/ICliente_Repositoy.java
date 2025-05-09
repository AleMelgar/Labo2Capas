package com.example.labo02.Domain.Repository;

import com.example.labo02.Domain.Entities.Cliente;
import jakarta.transaction.Transactional;
import java.util.UUID;

@Transactional
public interface ICliente_Repositoy extends Igeneral_repository<Cliente, UUID>{
    // La consulta jpa
    public Cliente findBynombre(String nombre);
}
