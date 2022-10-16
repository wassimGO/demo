package com.example.demo.service;

import com.example.demo.entity.Agency;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Vehicule;

public interface AgencyService {
    Agency save(Agency agency);
    Integer findByAdresse(String adresse);
    Agency findById(Agency agency);

    Integer update(Employee employee);

    Integer updateAgencyCarList (Vehicule vehicule);

    Integer CarDisponibility (Agency agency);

}
