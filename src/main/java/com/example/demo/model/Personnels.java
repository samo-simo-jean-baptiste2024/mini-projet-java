package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Personnels {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Long id;
    private  String nom;
    private String adresse;
    private Long tel;
}
