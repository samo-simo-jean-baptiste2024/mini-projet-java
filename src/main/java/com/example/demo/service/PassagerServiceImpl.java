package com.example.demo.service;

import com.example.demo.model.Passagers;
import com.example.demo.model.Vols;
import com.example.demo.repository.PassagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassagerServiceImpl implements PassagerService{
   @Autowired
    PassagerRepository passagerRepository;
   @Override
   public List<Passagers> getPassagers(){
       return passagerRepository.findAll();
    }

    @Override
    public Passagers getPassagers(Long id) {
        return passagerRepository.findById(id).orElse(null);
    }

    @Override
    public Passagers creerPassagers(Passagers passagers) {
        return passagerRepository.save(passagers);
    }

    @Override
    public Passagers mettreAJourPassagers(Passagers passagers) {
        return passagerRepository.save(passagers);
    }

    @Override
    public void supprimerPassagers(Long id) {
        passagerRepository.deleteById(id);
    }
}
