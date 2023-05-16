package com.example.porfolioSB.service;

import com.example.porfolioSB.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> obtenerTodas();
    public Educacion buscar (Integer id);   
    public void borrar (Integer id);
    public Educacion crear (Educacion educacion);
    public Educacion actualizar (Educacion educacion);
    
}
