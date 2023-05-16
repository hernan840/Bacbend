package com.example.porfolioSB.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "habilidades")
@Setter @Getter
public class Habilidad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer progress;

    public Habilidad() {
    }

    public Habilidad(Integer id, String name, Integer progress) {
        this.id = id;
        this.name = name;
        this.progress = progress;
    }

   
    
    

    


    
    
}