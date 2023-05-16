package com.example.porfolioSB.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "red_social")
@Setter @Getter
public class Red implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Basic
    private String icono;
    private String urlRedSocial;

    public Red() {
    }

    public Red(Integer id, String icono, String urlRedSocial) {
        this.id = id;
        this.icono = icono;
        this.urlRedSocial = urlRedSocial;
    }
       
    
    
    
}
