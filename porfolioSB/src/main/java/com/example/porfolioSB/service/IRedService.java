package com.example.porfolioSB.service;

import com.example.porfolioSB.model.Red;
import java.util.List;

public interface IRedService {
    
    public List<Red> obtenerTodas();
    public Red buscar (Integer id);   
    public void borrar (Integer id);
    public Red crear (Red red);
    public Red actualizar (Red red);
    
}
