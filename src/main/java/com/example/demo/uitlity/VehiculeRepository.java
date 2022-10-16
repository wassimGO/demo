package com.example.demo.uitlity;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Vehicule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehiculeRepository  extends CrudRepository<Vehicule,Integer> {
    Optional<Vehicule> findAllByRef(String ref);
}
