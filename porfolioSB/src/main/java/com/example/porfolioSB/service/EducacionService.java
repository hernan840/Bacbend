package com.example.porfolioSB.service;

import com.example.porfolioSB.model.Educacion;
import com.example.porfolioSB.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
   
   @Autowired
    public EducacionRepository educacionRepository;
    

    @Override
    public List<Educacion> obtenerTodas() {
        return educacionRepository.findAll();
    }

    @Override
    public Educacion buscar(Integer id) {
        return educacionRepository.findById(id).orElse(null);
    }

    @Override
    public void borrar(Integer id) {
        educacionRepository.deleteById(id);
    }

    @Override
    public Educacion crear(Educacion educacion) {
        return educacionRepository.save(educacion);
    }

    @Override
    public Educacion actualizar(Educacion educacion) {
        return educacionRepository.save(educacion);
    }

    
}
