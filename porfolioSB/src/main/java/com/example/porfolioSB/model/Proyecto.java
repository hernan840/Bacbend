package com.example.porfolioSB.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;

@Entity

@Table(name = "proyectos")
@Getter @Setter
public class Proyecto implements Serializable {    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String nameProyect;
    private String description;
    private String img;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endDate;
    private String urlProyect;

    public Proyecto() {
    }

    public Proyecto(Integer id, String nameProyect, String description, String img, Date endDate, String urlProyect) {
        this.id = id;
        this.nameProyect = nameProyect;
        this.description = description;
        this.img = img;
        this.endDate = endDate;
        this.urlProyect = urlProyect;
    }

  

   
   
    
}
