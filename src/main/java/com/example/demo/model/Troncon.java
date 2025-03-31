package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "troncons")
public class Troncon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ville_depart;
    private Time heure_depart;
    private String ville_arrive;
    private Time heure_arrive;
    @JsonIgnore
    @OneToMany(mappedBy = "troncon", fetch = FetchType.LAZY)
    Set<PassagerTroncon> escales_passagers = new HashSet<>();
    private int distance;
}