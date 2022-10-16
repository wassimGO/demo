package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data @Entity
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String ref;
    private String marque;
    private String serie;
    private String cylindre;
    private String moteur;
    private Integer modele;
    private Boolean isBooked;
    private Boolean isForceInduct;
    private Boolean isTwinTurbo;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Agency agency;
}
