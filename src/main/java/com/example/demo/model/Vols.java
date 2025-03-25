package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@Entity
public class Vols {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    ,
    private String num_vol;
    private String ville_depart;
    private String ville_arrive;
    private Float frequence;
}
