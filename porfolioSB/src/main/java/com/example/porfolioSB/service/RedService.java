package com.example.porfolioSB.service;

import com.example.porfolioSB.model.Red;
import com.example.porfolioSB.repository.RedRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedService implements IRedService{
    
    @Autowired
    public RedRepository redRepository;
    

    @Override
    public List<Red> obtenerTodas() {
        return redRepository.findAll();
    }

    @Override
    public Red buscar(Integer id) {
        return redRepository.findById(id).orElse(null);
    }

    @Override
    public void borrar(Integer id) {
        redRepository.deleteById(id);
    }

    @Override
    public Red crear(Red red) {
        return redRepository.save(red);
    }

    @Override
    public Red actualizar(Red red) {
        return redRepository.save(red);
    }
    
}
