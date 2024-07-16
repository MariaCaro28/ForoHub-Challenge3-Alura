package com.alura.ForoHub.infra.repository;

import com.alura.ForoHub.domain.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
}

