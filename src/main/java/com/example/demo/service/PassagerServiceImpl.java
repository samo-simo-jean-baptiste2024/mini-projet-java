package com.example.demo.service;

import com.example.demo.model.Passager;
import com.example.demo.repository.PassagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassagerServiceImpl implements PassagerService{
   @Autowired
    PassagerRepository passagerRepository;
   @Override
   public List<Passager> getPassagers() {
       return passagerRepository.findAll();
    }

    @Override
    public Passager getPassagers(Long id) {
        return passagerRepository.findById(id).orElse(null);
    }

    @Override
    public Passager creerPassagers(Passager passagers) {
        return passagerRepository.save(passagers);
    }

    @Override
    public Passager mettreAJourPassagers(Passager passagers) {
        return passagerRepository.save(passagers);
    }

    @Override
    public void supprimerPassagers(Long id) {
        passagerRepository.deleteById(id);
    }
}
