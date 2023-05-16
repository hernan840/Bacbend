package com.example.porfolioSB.controller;

import com.example.porfolioSB.model.Experiencia;
import com.example.porfolioSB.service.ExperienciaService;
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
@RequestMapping(path = "/api/experiencias")
//@CrossOrigin(origins = "https://portfolio-frontend-roque.web.app")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    
    @Autowired
    public ExperienciaService experienciaService;
    
    
    @GetMapping
    public ResponseEntity<List<Experiencia>> obtenerTodas(){
        return new ResponseEntity(experienciaService.obtenerTodas(), HttpStatus.OK);
    }
     
    @PostMapping
    public ResponseEntity<Experiencia> crear(@RequestBody Experiencia experiencia){
        return ResponseEntity.ok(experienciaService.crear(experiencia));
    }
    
    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Integer id) {
        experienciaService.borrar(id);
        return "Se borro correctamente.";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Experiencia> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(experienciaService.buscar(id));
    }
    
    @PutMapping
    public ResponseEntity<Experiencia> actualizar(@RequestBody Experiencia experiencia){
        ResponseEntity<Experiencia> response;
        //Verificar si el ID es distinto de NULL y si la habilidad existe
        if (experiencia.getId() != null && experienciaService.buscar(experiencia.getId()) != null){
            response= ResponseEntity.ok(experienciaService.actualizar(experiencia));
        }else{
            response= ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }   
    
}
