package com.example.demo.service;

import com.example.demo.model.Vol;

import java.util.List;

public interface VolService {
    List<Vol> getVols();

    Vol getVols(Long numeroVol);

    Vol creerVol(Vol vols);

    Vol mettreAJourVol(Vol vol);
    void supprimerVol(Long numeroVol);
}
