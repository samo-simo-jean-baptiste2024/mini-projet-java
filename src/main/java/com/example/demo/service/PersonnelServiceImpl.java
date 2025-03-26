package com.example.demo.service;

import com.example.demo.model.Passagers;
import com.example.demo.model.Personnels;
import com.example.demo.repository.PassagerRepository;
import com.example.demo.repository.PersonnelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelServiceImpl implements PersonnelService{
    @Autowired
    PersonnelRepository personnelRepository;
    @Override
    public List<Personnels> getPersonnels(){
        return personnelRepository.findAll();
    }

    @Override
    public Personnels getPersonnels(Long id) {
        return personnelRepository.findById(id).orElse(null);
    }

    @Override
    public Personnels creerPersonnels(Personnels personnels) {
        return personnelRepository.save(personnels);
    }

    @Override
    public Personnels mettreAjourPersonnels(Personnels personnels) {
        return personnelRepository.save(personnels);
    }

    @Override
    public void supprimerPersonnels(Long id) {
        personnelRepository.deleteById(id);
    }
}
