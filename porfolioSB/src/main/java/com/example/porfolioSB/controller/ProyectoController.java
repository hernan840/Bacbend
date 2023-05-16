package com.example.porfolioSB.controller;

import com.example.porfolioSB.model.Proyecto;
import com.example.porfolioSB.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/proyectos")
@CrossOrigin(origins = "http://localhost:4200")

public class ProyectoController {
    
    @Autowired
    public IProyectoService preoyectoService;
    
    @GetMapping
    public ResponseEntity<List<Proyecto>> mostrarProyectos(){
        return new ResponseEntity(preoyectoService.mostrarProyectos(), HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<Proyecto> crearProyecto(@RequestBody Proyecto proyecto){
        return ResponseEntity.ok(preoyectoService.crearProyecto(proyecto));
    }
    
    @DeleteMapping("/{id}")
    public String eliminarProyecto(@PathVariable Integer id){
        preoyectoService.borrarProyecto(id);
        return "se borro correctamente el proyecto";
    } 
    
    @GetMapping("/{id}")
    public ResponseEntity<Proyecto> buscarPorId(@PathVariable Integer id){
      return ResponseEntity.ok(preoyectoService.buscarProyecto(id));  
    }
    
    @PutMapping
    public ResponseEntity<Proyecto> actualizarProyecto(@RequestBody Proyecto proyecto){
        ResponseEntity<Proyecto> response;
        // se verifica si el id es distinto de null y si el proyecto existe
        if (proyecto.getId() != null && preoyectoService.buscarProyecto(proyecto.getId()) != null){
            response= ResponseEntity.ok(preoyectoService.actualizarProyecto(proyecto));
        }else{
            response= ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }
}
