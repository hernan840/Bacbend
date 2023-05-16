package com.example.porfolioSB.service;

import com.example.porfolioSB.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    
    public List<Proyecto> mostrarProyectos();
    
    public Proyecto buscarProyecto (Integer id);
    
    public void borrarProyecto (Integer id);
    
    public Proyecto crearProyecto (Proyecto proyecto);
    
    public Proyecto actualizarProyecto(Proyecto proyecto);
    
    
    
}
