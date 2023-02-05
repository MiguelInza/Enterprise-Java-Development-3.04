package com.ironhack.lab304.repository;

import com.ironhack.lab304.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//<Aircraft, String>  es el Modelo y el tipo de clave primaria
public interface AircraftRepository extends JpaRepository<Aircraft, String> {
}
