package com.example.demo.service;

import com.example.demo.model.Passagers;
import com.example.demo.model.Vols;

import java.util.List;

public interface PassagerService {
    List<Passagers> getPassagers();
    Passagers getPassagers(Long id);

    Passagers creerPassagers (Passagers passagers);

    Passagers mettreAJourPassagers(Passagers passagers);
    void supprimerPassagers(Long id);
}

