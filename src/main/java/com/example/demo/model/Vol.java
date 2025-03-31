package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Setter
@NoArgsConstructor
@Getter
@Entity
@Table(name = "vols")
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String num_vol;
    private String ville_depart;
    private String ville_arrive;
    @JsonIgnore
    @OneToMany(mappedBy = "vol", fetch = FetchType.LAZY)
    List<Depart> departs;
    private int frequence;
    @ManyToMany
    @JoinTable(
            name = "vols_troncons",
            joinColumns = @JoinColumn(name = "vol_id"),
            inverseJoinColumns = @JoinColumn(name = "troncon_id")
    )
    private Set<Troncon> escales = new HashSet<>();

    public void addTroncon(Troncon troncon) {
        escales.add(troncon);
    }
}
