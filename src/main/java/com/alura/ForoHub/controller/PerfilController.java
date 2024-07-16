package com.alura.ForoHub.controller;

import com.alura.ForoHub.domain.Perfil;
import com.alura.ForoHub.infra.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfiles")
public class PerfilController {

    @Autowired
    private PerfilService perfilService;

    @GetMapping
    public List<Perfil> findAll() {
        return perfilService.findAll();
    }

    @GetMapping("/{id}")
    public Perfil findById(@PathVariable Long id) {
        return perfilService.findById(id);
    }

    @PostMapping
    public Perfil save(@RequestBody Perfil perfil) {
        return perfilService.save(perfil);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        perfilService.deleteById(id);
    }
}
