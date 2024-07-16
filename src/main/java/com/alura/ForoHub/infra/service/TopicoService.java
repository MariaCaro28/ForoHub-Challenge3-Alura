package com.alura.ForoHub.infra.service;

import com.alura.ForoHub.domain.Topico;
import com.alura.ForoHub.infra.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public List<Topico> findAll() {
        return topicoRepository.findAll();
    }

    public Topico findById(Long id) {
        return topicoRepository.findById(id).orElse(null);
    }

    public Topico save(Topico topico) {
        topico.setFechaCreacion(LocalDateTime.now());
        return topicoRepository.save(topico);
    }

    public void deleteById(Long id) {
        topicoRepository.deleteById(id);
    }
}