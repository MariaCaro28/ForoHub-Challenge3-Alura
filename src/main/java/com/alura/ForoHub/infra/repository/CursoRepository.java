package com.alura.ForoHub.infra.repository;


import com.alura.ForoHub.domain.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}