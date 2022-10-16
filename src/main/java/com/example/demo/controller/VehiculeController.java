package com.example.demo.controller;


import com.example.demo.entity.Vehicule;
import com.example.demo.service.VehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/vehi")
@AllArgsConstructor
public class VehiculeController {

    private final VehiculeService service1;



    @PostMapping
    @ResponseBody
    public String addVehicule (@RequestBody Vehicule v1) {

        if ( service1.save(v1)!=null){
            return "Saved";
        }
        return "not Saved";
    }

}

