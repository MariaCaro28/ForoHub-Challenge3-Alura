package com.alura.ForoHub.infra.repository;

import com.alura.ForoHub.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}