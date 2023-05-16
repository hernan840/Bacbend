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
@Table(name = "educacion")
@Setter @Getter
public class Educacion implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String school;
    private String title;
    @Lob
    private String description;
    private String img;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endDate;

    public Educacion() {
    }

    public Educacion(Integer id, String school, String title, String description, String img, Date startDate, Date endDate) {
        this.id = id;
        this.school = school;
        this.title = title;
        this.description = description;
        this.img = img;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    
    

    
}
