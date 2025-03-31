package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "passagers_troncons")
public class PassagerTroncon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "depart_id")
    private Depart depart;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "troncon_id")
    private Troncon troncon;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passager_id")
    private Passager passager;

    public void assignPassager(Passager passager) {
        this.passager = passager;
    }

    public void assignTroncon(Troncon troncon) {
        this.troncon = troncon;
    }

    public void assignDepart(Depart depart) {
        this.depart = depart;
    }
}
