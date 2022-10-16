package com.example.demo.entity;


import lombok.*;
import org.hibernate.annotations.ListIndexBase;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Agency  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String adresse;
    private String admin;

    @EqualsAndHashCode.Exclude @ToString.Exclude
    @OneToMany(mappedBy = "agency")
    private Set<Employee> employees;

    @ListIndexBase
    @EqualsAndHashCode.Exclude @ToString.Exclude
    @OneToMany(mappedBy = "agency",cascade = CascadeType.REFRESH)
    private List<Vehicule> vehicules;

    @EqualsAndHashCode.Exclude @ToString.Exclude
    @OneToMany(mappedBy = "agency")
    private List<Employee> employees1;
}



