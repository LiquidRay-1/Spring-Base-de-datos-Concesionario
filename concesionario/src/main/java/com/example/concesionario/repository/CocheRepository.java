package com.example.concesionario.repository;

import com.example.concesionario.model.Coches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheRepository extends JpaRepository<Coches, Long> {
    

}

