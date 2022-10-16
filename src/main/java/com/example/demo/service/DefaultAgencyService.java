package com.example.demo.service;

import com.example.demo.entity.Agency;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Vehicule;
import com.example.demo.uitlity.AgencyRepository;
import com.example.demo.uitlity.UserRepository;
import com.example.demo.uitlity.VehiculeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.*;

@Service
@AllArgsConstructor
public class DefaultAgencyService implements AgencyService {


    public final AgencyRepository agencyRepository;
    public final UserRepository userRepository;

    public final VehiculeRepository vehiculeRepository;


    @Override
    public Agency save(Agency agency) {
        if (findByAdresse(agency.getAdresse()) < 1) {

            return agencyRepository.save(agency);
        }
        return null;
    }

    @Override
    public Integer findByAdresse(String adresse) {
        return agencyRepository.countAgencyByAdresse(adresse);
    }

    @Override
    public Agency findById(Agency agency) {
        return  agencyRepository.findAllById(agency);
    }

    @Override
    public Integer update(Employee employee) {
        if (userRepository.findAllById(employee.getId()).isPresent()){
        if(userRepository.findAllById(employee.getId()).get().getIsAdmin()){
            Optional<Agency> opt = agencyRepository.findById(employee.getAgency().getId());
            if (opt.isPresent() && userRepository.findAllById(employee.getId()).get().getIsAdmin()==true)
            {
                Agency entity=opt.get();
                entity.setAdmin("true");
                agencyRepository.save(entity);
                return 1;
            }
            else {
                Agency entity=opt.get();
                entity.setAdmin("false");
                agencyRepository.save(entity);
                return 1;
            }
            }
        }
        return  null;
}

    @Override
    public Integer updateAgencyCarList(Vehicule vehicule) {
     Optional<Vehicule> optional=  vehiculeRepository.findAllByRef(vehicule.getRef());
        if(optional.isPresent())
        {
           Optional<Agency> opt = agencyRepository.findById(vehicule.getAgency().getId());
           if (opt.isPresent()){
               Agency entity = opt.get();
               entity.setVehicules(new ArrayList<>(Arrays.asList(optional.get())));
               agencyRepository.save(entity);
               Integer lc = entity.getVehicules().size();
               return 1;
        }
        }
        return 0;
}

    @Override
    public Integer CarDisponibility(Agency agency) {

        Optional<Agency> opt = agencyRepository.findById(agency.getId());

//        if ()


        return null;
    }
}


