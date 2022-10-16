package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;


@Data @Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String Fname;
        private String Lname;
        private String num;
        private String adresse;
        private Integer age;
        private Boolean isAdmin;
        private String ip;

        @ManyToOne(cascade = CascadeType.REFRESH)
        private Agency agency;


}







