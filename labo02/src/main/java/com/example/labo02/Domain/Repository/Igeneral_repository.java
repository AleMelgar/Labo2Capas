package com.example.labo02.Domain.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface Igeneral_repository<T,ID> extends JpaRepository<T , ID> {
}
