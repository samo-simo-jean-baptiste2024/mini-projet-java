package com.example.demo.service;

import com.example.demo.model.Personnel;
import com.example.demo.repository.PersonnelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelServiceImpl implements PersonnelService{
    @Autowired
    PersonnelRepository personnelRepository;
    @Override
    public List<Personnel> getPersonnels() {
        return personnelRepository.findAll();
    }

    @Override
    public Personnel getPersonnels(Long id) {
        return personnelRepository.findById(id).orElse(null);
    }

    @Override
    public Personnel creerPersonnels(Personnel personnels) {
        return personnelRepository.save(personnels);
    }

    @Override
    public Personnel mettreAjourPersonnels(Personnel personnels) {
        return personnelRepository.save(personnels);
    }

    @Override
    public void supprimerPersonnels(Long id) {
        personnelRepository.deleteById(id);
    }
}
