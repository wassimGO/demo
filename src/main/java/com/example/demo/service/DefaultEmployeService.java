package com.example.demo.service;

import com.example.demo.entity.Agency;
import com.example.demo.entity.Employee;
import com.example.demo.uitlity.AgencyRepository;
import com.example.demo.uitlity.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class DefaultEmployeService implements UserService {

    private final UserRepository userRepository;
    private final AgencyRepository agencyRepository;

    @Override
    public Employee save(Employee employee) {
        if (this.findByIp(employee.getIp()).isEmpty()){
            Optional<Agency> opt = agencyRepository.findById(employee.getAgency().getId());
            if (opt.isPresent()){
                Agency entity=opt.get();
                employee.setAgency(entity);
            return userRepository.save(employee);
            }
            }

        return  null;
    }


    @Override
    public Employee update(Long id, Employee employee) {
        return null;
    }

    @Override
    public Optional<Employee> findByIp(String ip) {
        return userRepository.findAllByIp(ip);
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return userRepository.findAllById(id);
    }

    @Override
    public Integer verifyAgency(Agency agency) {
        return userRepository.countAllByAgency(agency);
    }


}
