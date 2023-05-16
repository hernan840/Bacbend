package com.example.porfolioSB.service;

import com.example.porfolioSB.model.Proyecto;
import com.example.porfolioSB.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    public ProyectoRepository proyectoRepository;

    @Override
    public List<Proyecto> mostrarProyectos() {
        return proyectoRepository.findAll();
    }

    @Override
    public Proyecto buscarProyecto(Integer id) {
        return proyectoRepository.findById(id).orElse(null);
    }

    @Override
    public void borrarProyecto(Integer id) {
        proyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto crearProyecto(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
   
        
    }

    @Override
    public Proyecto actualizarProyecto(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

  
    
}
