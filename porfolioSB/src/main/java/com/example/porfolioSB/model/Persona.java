package com.example.porfolioSB.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "persona")
@Setter @Getter
public class Persona implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String name;
    private String position;
    private String imgPerfilMenu;
    private String imgPerfilPortada;
    private String backPortada;
    private String imgPerfilSibreMi;
    @Lob
    private String about;

    public Persona() {
    }

    public Persona(Integer id, String name, String position, String imgPerfilMenu, String imgPerfilPortada, String backPortada, String imgPerfilSibreMi, String about) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.imgPerfilMenu = imgPerfilMenu;
        this.imgPerfilPortada = imgPerfilPortada;
        this.backPortada = backPortada;
        this.imgPerfilSibreMi = imgPerfilSibreMi;
        this.about = about;
    }
    
    
    
    
    
    
    
}
