package com.example.demo.service;

import com.example.demo.model.Personnel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonnelService {
    List<Personnel> getPersonnels();

    Personnel getPersonnels(Long id);

    Personnel creerPersonnels(Personnel personnels);

    Personnel mettreAjourPersonnels(Personnel personnels);

    void supprimerPersonnels(Long id);
}
