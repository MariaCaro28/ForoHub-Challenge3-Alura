package com.alura.ForoHub.controller;

import com.alura.ForoHub.domain.Curso;
import com.alura.ForoHub.infra.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> findAll() {
        return cursoService.findAll();
    }

    @GetMapping("/{id}")
    public Curso findById(@PathVariable Long id) {
        return cursoService.findById(id);
    }

    @PostMapping
    public Curso save(@RequestBody Curso curso) {
        return cursoService.save(curso);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        cursoService.deleteById(id);
    }
}