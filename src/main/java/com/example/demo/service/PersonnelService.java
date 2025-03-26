package com.example.demo.service;

import com.example.demo.model.Personnels;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonnelService {
    List<Personnels> getPersonnels();

    Personnels getPersonnels(Long id);

    Personnels creerPersonnels(Personnels personnels);

    Personnels mettreAjourPersonnels (Personnels personnels);

    void supprimerPersonnels(Long id);
}
