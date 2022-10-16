package com.example.demo.uitlity;

import com.example.demo.entity.Agency;
import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AgencyRepository extends CrudRepository<Agency,Long> {
   Integer countAgencyByAdresse(String adresse);
   Agency findAllById(Agency agency);




}
