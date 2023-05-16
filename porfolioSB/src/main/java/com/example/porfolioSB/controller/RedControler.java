package com.example.porfolioSB.controller;

import com.example.porfolioSB.model.Red;
import com.example.porfolioSB.service.RedService;
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
@RequestMapping(path = "/api/redes")
//@CrossOrigin(origins = "https://portfolio-frontend-roque.web.app")
@CrossOrigin(origins = "http://localhost:4200")
public class RedControler {
    
    @Autowired
    public RedService redService;
    
    
    @GetMapping
    public ResponseEntity<List<Red>> obtenerTodas(){
        return new ResponseEntity(redService.obtenerTodas(), HttpStatus.OK);
    }
     
    @PostMapping
    public ResponseEntity<Red> crear(@RequestBody Red red){
        return ResponseEntity.ok(redService.crear(red));
    }
    
    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Integer id) {
        redService.borrar(id);
        return "Se borro correctamente.";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Red> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(redService.buscar(id));
    }
    
    @PutMapping
    public ResponseEntity<Red> actualizar(@RequestBody Red red){
        ResponseEntity<Red> response;
        //Verificar si el ID es distinto de NULL y si la habilidad existe
        if (red.getId() != null && redService.buscar(red.getId()) != null){
            response= ResponseEntity.ok(redService.actualizar(red));
        }else{
            response= ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }   
    
    
}
