package com.example.demo.service;

import com.example.demo.entity.Vehicule;

import java.util.Optional;

public interface VehiculeService {

   Vehicule save(Vehicule vehicule);
  Optional<Vehicule> FindByRef(String ref);

}
