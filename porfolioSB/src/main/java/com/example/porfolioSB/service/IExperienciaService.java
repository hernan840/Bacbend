package com.example.porfolioSB.service;

import com.example.porfolioSB.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> obtenerTodas();
    public Experiencia buscar (Integer id);   
    public void borrar (Integer id);
    public Experiencia crear (Experiencia experiencia);
    public Experiencia actualizar (Experiencia experiencia);
    
}
