package com.example.demo.service;


import com.example.demo.entity.Vehicule;
import com.example.demo.uitlity.UserRepository;
import com.example.demo.uitlity.VehiculeRepository;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import java.util.Optional;

import static org.apache.logging.log4j.ThreadContext.isEmpty;

@Service
@AllArgsConstructor
public class DefaultVehiculeService implements VehiculeService {

    private final VehiculeRepository vehiculeRepository;

    @SneakyThrows
    @Override
    public Vehicule save(Vehicule vehicule) {
        if (this.FindByRef(vehicule.getRef()).isEmpty()){
            return vehiculeRepository.save(vehicule);}

        return null;}


    @Override
    public  Optional<Vehicule> FindByRef(String ref) {
        return vehiculeRepository.findAllByRef(ref);
    }
}
