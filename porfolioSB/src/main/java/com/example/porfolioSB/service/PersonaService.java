package com.example.porfolioSB.service;

import com.example.porfolioSB.model.Persona;
import com.example.porfolioSB.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository personaRepository;
    

    @Override
    public List<Persona> obtenerTodas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona buscar(Integer id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void borrar(Integer id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona crear(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizar(Persona persona) {
        return personaRepository.save(persona);
    }
    
}
