package com.ironhack.lab304.repository;

import com.ironhack.lab304.model.Aircraft;
import com.ironhack.lab304.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//<Flight, String>  es el Modelo y el tipo de clave primaria
public interface FlightRepository extends JpaRepository<Flight, String> {
}
