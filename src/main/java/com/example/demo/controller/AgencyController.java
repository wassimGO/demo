package com.example.demo.controller;

import com.example.demo.entity.Agency;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Vehicule;
import com.example.demo.service.AgencyService;
import com.example.demo.service.VehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/Age")
@AllArgsConstructor
public class AgencyController {

    private final AgencyService service2;



    @PostMapping
    @ResponseBody
    public String addAgency (@RequestBody Agency a1) {

        if ( service2.save(a1)!=null){

            return "Saved";
        }
        return "not Saved";
    }


}
