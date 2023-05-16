package com.example.porfolioSB.service;

import com.example.porfolioSB.model.Habilidad;
import com.example.porfolioSB.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService {
    
    @Autowired
    public HabilidadRepository habilidadRepository;
    

    @Override
    public List<Habilidad> obtenerTodas() {
        return habilidadRepository.findAll();
    }

    @Override
    public Habilidad buscar(Integer id) {
        return habilidadRepository.findById(id).orElse(null);
    }

    @Override
    public void borrar(Integer id) {
        habilidadRepository.deleteById(id);
    }

    @Override
    public Habilidad crear(Habilidad habilidad) {
        return habilidadRepository.save(habilidad);
    }

    @Override
    public Habilidad actualizar(Habilidad habilidad) {
        return habilidadRepository.save(habilidad);
    }

}