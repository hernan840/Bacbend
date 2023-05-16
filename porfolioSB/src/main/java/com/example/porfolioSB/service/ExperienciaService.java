package com.example.porfolioSB.service;

import com.example.porfolioSB.model.Experiencia;
import com.example.porfolioSB.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExperienciaService implements IExperienciaService {
    @Autowired
    public ExperienciaRepository experienciaRepository;
    
    @Override
    public List<Experiencia> obtenerTodas() {
        return experienciaRepository.findAll();
    }

    @Override
    public Experiencia buscar(Integer id) {
        return experienciaRepository.findById(id).orElse(null);
    }

    @Override
    public void borrar(Integer id) {
        experienciaRepository.deleteById(id);
    }

    @Override
    public Experiencia crear(Experiencia experiencia) {
        return experienciaRepository.save(experiencia);
    }

    @Override
    public Experiencia actualizar(Experiencia experiencia) {
        return experienciaRepository.save(experiencia);
    }
    
}
