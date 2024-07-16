package com.alura.ForoHub.controller;

import com.alura.ForoHub.domain.Topico;
import com.alura.ForoHub.infra.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @GetMapping
    public List<Topico> findAll() {
        return topicoService.findAll();
    }

    @GetMapping("/{id}")
    public Topico findById(@PathVariable Long id) {
        return topicoService.findById(id);
    }

    @PostMapping
    public Topico save(@RequestBody Topico topico) {
        return topicoService.save(topico);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        topicoService.deleteById(id);
    }
}
