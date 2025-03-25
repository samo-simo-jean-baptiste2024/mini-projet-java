package com.example.demo.service;

import com.example.demo.model.Vols;

import java.util.List;

public interface VolService {
    List<Vols> getVols();
    Vols getVol(Long numeroVol);
    Vols creerVol(Vols vols);
    Vols mettreAJourVol(Vols vols);
    void supprimerVol(Long numeroVol);
}
