package com.example.porfolioSB.repository;

import com.example.porfolioSB.model.Red;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RedRepository extends JpaRepository<Red, Integer>{
    
}
