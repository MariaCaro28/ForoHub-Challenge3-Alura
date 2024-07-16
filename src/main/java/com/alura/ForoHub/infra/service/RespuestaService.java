package com.alura.ForoHub.infra.service;

import com.alura.ForoHub.domain.Respuesta;
import com.alura.ForoHub.infra.repository.RespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespuestaService {

    @Autowired
    private RespuestaRepository respuestaRepository;

    public List<Respuesta> findAll() {
        return respuestaRepository.findAll();
    }

    public Respuesta findById(Long id) {
        return respuestaRepository.findById(id).orElse(null);
    }

    public Respuesta save(Respuesta respuesta) {
        return respuestaRepository.save(respuesta);
    }

    public void deleteById(Long id) {
        respuestaRepository.deleteById(id);
    }
}
