package com.example.porfolioSB.service;

import com.example.porfolioSB.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> obtenerTodas();
    public Persona buscar (Integer id);   
    public void borrar (Integer id);
    public Persona crear (Persona persona);
    public Persona actualizar (Persona persona);
    
}
