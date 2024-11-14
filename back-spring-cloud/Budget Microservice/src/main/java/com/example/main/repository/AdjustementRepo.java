package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.entities.HistoriqueAjustement;

@Repository
public interface AdjustementRepo extends JpaRepository <HistoriqueAjustement,Integer>{
    
}
