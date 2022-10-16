package com.example.demo.controller;


import com.example.demo.entity.Vehicule;
import com.example.demo.service.AgencyService;
import com.example.demo.uitlity.AgencyRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Agency;

@RestController
@RequestMapping("api/car")
@AllArgsConstructor
public class ListController {

   private final AgencyService service3;

    @PutMapping
    @ResponseBody
    public String updateTable (@RequestBody Vehicule v1) {

        if (service3.updateAgencyCarList(v1) != 0 ){
            return "Saved";

        }

        return "Not saved";

    }








    }


