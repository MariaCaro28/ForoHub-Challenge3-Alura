package com.alura.ForoHub.infra.repository;

import com.alura.ForoHub.domain.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
