package com.example.porfolioSB.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "experiencia")
@Setter @Getter
public class Experiencia implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String company;
    private String position;
    @Lob
    private String description;
    private String img;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endDate;

    public Experiencia() {
    }

    public Experiencia(Integer id, String company, String position, String description, String img, Date startDate, Date endDate) {
        this.id = id;
        this.company = company;
        this.position = position;
        this.description = description;
        this.img = img;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    
}
