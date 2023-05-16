
package com.example.porfolioSB.repository;

import com.example.porfolioSB.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer>{
    
}
