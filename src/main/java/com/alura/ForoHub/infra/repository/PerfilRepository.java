package com.alura.ForoHub.infra.repository;


import com.alura.ForoHub.domain.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {
}
