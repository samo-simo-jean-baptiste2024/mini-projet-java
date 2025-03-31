package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "passagers")
public class Passager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String adresse;
    @JsonIgnore
    @OneToMany(mappedBy = "passager", fetch = FetchType.LAZY)
    Set<PassagerTroncon> escales_passagers = new HashSet<>();
    private int tel;
    @JsonIgnore
    @ManyToMany(mappedBy = "direct_passagers", fetch = FetchType.LAZY)
    private Set<Depart> departs = new HashSet<>();
}
