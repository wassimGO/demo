package com.example.demo.service;

import com.example.demo.entity.Agency;
import com.example.demo.entity.Employee;


import java.util.Optional;

public interface UserService {

    Object save(Employee employee);
    Employee update(Long id,Employee employee);
    Optional<Employee> findByIp(String ip);
    Optional<Employee> findById(Long id);
    Integer verifyAgency(Agency agency);


}
