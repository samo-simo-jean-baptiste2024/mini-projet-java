package com.example.demo.service;

import com.example.demo.model.Troncon;
import com.example.demo.repository.TronconRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TronconServiceImpl implements TronconService {
    @Autowired
    private TronconRepository tronconRepository;

    @Override
    public Troncon getTronconById(Long id) {
        return tronconRepository.findById(id).orElse(null);
    }

    @Override
    public List<Troncon> getAllTroncons() {
        return tronconRepository.findAll();
    }

    @Override
    public void updateTroncon(Long id, Troncon troncon) {
        Optional<Troncon> optionalUser = tronconRepository.findById(id);
        if (optionalUser.isPresent()) {
            Troncon existingTroncon = optionalUser.get();
            existingTroncon.setDistance(troncon.getDistance());
            existingTroncon.setHeure_arrive(troncon.getHeure_arrive());
            existingTroncon.setHeure_depart(troncon.getHeure_depart());
            existingTroncon.setVille_depart(troncon.getVille_depart());
            existingTroncon.setVille_arrive(troncon.getVille_arrive());
            tronconRepository.save(existingTroncon);
        } else {
            throw new RuntimeException("Départ non trouvé !");
        }
    }

    @Override
    public void saveTroncon(Troncon user) {
        tronconRepository.save(user);
    }

    @Override
    public void deleteTroncon(Long id) {
        tronconRepository.deleteById(id);
    }
}
