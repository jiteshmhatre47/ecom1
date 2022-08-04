package com.pctechworld.desktop_system_portal.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pctechworld.desktop_system_portal.Entities.Pcworld;

@Repository
public interface PcworldRepository extends JpaRepository<Pcworld,String> {
   
   public  Optional<List<Pcworld>> findByProductName(String productName);








   



   


    
    
}