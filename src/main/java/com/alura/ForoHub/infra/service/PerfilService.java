package com.alura.ForoHub.infra.service;

import com.alura.ForoHub.domain.Perfil;
import com.alura.ForoHub.infra.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository perfilRepository;

    public List<Perfil> findAll() {
        return perfilRepository.findAll();
    }

    public Perfil findById(Long id) {
        return perfilRepository.findById(id).orElse(null);
    }

    public Perfil save(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

    public void deleteById(Long id) {
        perfilRepository.deleteById(id);
    }
}
