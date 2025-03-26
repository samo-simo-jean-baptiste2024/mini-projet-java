package com.example.demo.service;

import com.example.demo.model.Passager;

import java.util.List;

public interface PassagerService {
    List<Passager> getPassagers();

    Passager getPassagers(Long id);

    Passager creerPassagers(Passager passagers);

    Passager mettreAJourPassagers(Passager passagers);
    void supprimerPassagers(Long id);
}

