package com.example.porfolioSB.controller;

import com.example.porfolioSB.model.Persona;
import com.example.porfolioSB.service.PersonaService;
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
@RequestMapping(path = "/api/datospersonales")
//@CrossOrigin(origins = "https://portfolio-frontend-roque.web.app")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
    @Autowired
    public PersonaService personaService;
    
    
    @GetMapping
    public ResponseEntity<List<Persona>> obtenerTodas(){
        return new ResponseEntity(personaService.obtenerTodas(), HttpStatus.OK);
    }
     
    @PostMapping
    public ResponseEntity<Persona> crear(@RequestBody Persona persona){
        return ResponseEntity.ok(personaService.crear(persona));
    }
    
    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Integer id) {
        personaService.borrar(id);
        return "Se borro correctamente.";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(personaService.buscar(id));
    }
    
    @PutMapping
    public ResponseEntity<Persona> actualizar(@RequestBody Persona persona){
        ResponseEntity<Persona> response;
        //Verificar si el ID es distinto de NULL y si la habilidad existe
        if (persona.getId() != null && personaService.buscar(persona.getId()) != null){
            response= ResponseEntity.ok(personaService.actualizar(persona));
        }else{
            response= ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }  
    
}
