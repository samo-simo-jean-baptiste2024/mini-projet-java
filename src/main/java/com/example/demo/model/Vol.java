package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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
    private Float frequence;

    @ManyToMany
    @JoinTable(
            name = "vols_troncons",
            joinColumns = @JoinColumn(name = "vols_id"),
            inverseJoinColumns = @JoinColumn(name = "troncons_id")
    )
    private List<Troncon> troncons;
}
