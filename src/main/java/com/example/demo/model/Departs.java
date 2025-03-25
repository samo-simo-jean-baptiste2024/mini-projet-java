package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Departs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private Long num_depart;
    private Date date;
    private Time heure_depart;

    private  Float quantite_kerosene;

    @ManyToMany
    @JoinTable(
            name = "departs_personnels",
            joinColumns = @JoinColumn(name = "departs_id"),
            inverseJoinColumns = @JoinColumn(name = "personnels_id")
    )
    private List<Personnels> personnels;
    @ManyToMany
    @JoinTable(
            name = "departs_passagers",
            joinColumns = @JoinColumn(name = "departs_id"),
            inverseJoinColumns = @JoinColumn(name = "passagers_id")
    )
    private List<Passagers> passagers;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vol_id")
    private  Vols vols;
}
