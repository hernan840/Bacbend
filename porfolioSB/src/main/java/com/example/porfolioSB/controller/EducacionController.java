
package com.example.porfolioSB.controller;

import com.example.porfolioSB.model.Educacion;
import com.example.porfolioSB.service.EducacionService;
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
@RequestMapping(path = "/api/educaciones")
//@CrossOrigin(origins = "https://portfolio-frontend-roque.web.app")
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    
    @Autowired
    public EducacionService educacionService;
    
    
    @GetMapping
    public ResponseEntity<List<Educacion>> obtenerTodas(){
        return new ResponseEntity(educacionService.obtenerTodas(), HttpStatus.OK);
    }
     
    @PostMapping
    public ResponseEntity<Educacion> crear(@RequestBody Educacion educacion){
        return ResponseEntity.ok(educacionService.crear(educacion));
    }
    
    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Integer id) {
        educacionService.borrar(id);
        return "Se borro correctamente.";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Educacion> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(educacionService.buscar(id));
    }
    
    @PutMapping
    public ResponseEntity<Educacion> actualizar(@RequestBody Educacion educacion){
        ResponseEntity<Educacion> response;
        //Verificar si el ID es distinto de NULL y si la habilidad existe
        if (educacion.getId() != null && educacionService.buscar(educacion.getId()) != null){
            response= ResponseEntity.ok(educacionService.actualizar(educacion));
        }else{
            response= ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }   
    
}
