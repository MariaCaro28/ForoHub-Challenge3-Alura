package com.alura.ForoHub.controller;

import com.alura.ForoHub.domain.Respuesta;
import com.alura.ForoHub.infra.service.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {


    @Autowired
    private RespuestaService respuestaService;

    @GetMapping
    public List<Respuesta> findAll() {
        return respuestaService.findAll();
    }

    @GetMapping("/{id}")
    public Respuesta findById(@PathVariable Long id) {
        return respuestaService.findById(id);
    }

    @PostMapping
    public Respuesta save(@RequestBody Respuesta respuesta) {
        return respuestaService.save(respuesta);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        respuestaService.deleteById(id);
    }
}
