package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "departs")
public class Depart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "depart", fetch = FetchType.LAZY)
    Set<PassagerTroncon> escales_passagers = new HashSet<>();
    private Date date;
    private Time heure_depart;
    private Float quantite_kerosene;
    private String num_depart;
    @ManyToMany
    @JoinTable(
            name = "departs_personnels",
            joinColumns = @JoinColumn(name = "depart_id"),
            inverseJoinColumns = @JoinColumn(name = "personnel_id")
    )
    private Set<Personnel> personnels = new HashSet<>();
    @ManyToMany
    @JoinTable(
            name = "departs_passagers",
            joinColumns = @JoinColumn(name = "depart_id"),
            inverseJoinColumns = @JoinColumn(name = "passager_id")
    )
    private Set<Passager> direct_passagers = new HashSet<>();
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "avion_id")
    private Avion avion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vol_id")
    private Vol vol;

    public void enrollPassager(Passager passager) {
        direct_passagers.add(passager);
    }

    public void enrollPersonnel(Personnel personnel) {
        personnels.add(personnel);
    }
}
