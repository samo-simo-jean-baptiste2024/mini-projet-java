package com.example.demo.service;

import com.example.demo.model.Avion;
import com.example.demo.repository.AvionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvionServiceImpl implements AvionService {
    @Autowired
    private AvionRepository avionRepository;

    @Override
    public Avion getAvionById(Long id) {
        return avionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Avion> getAllAvions() {
        return avionRepository.findAll();
    }

    @Override
    public void updateAvion(Long id, Avion avion) {
        Optional<Avion> optionalUser = avionRepository.findById(id);
        if (optionalUser.isPresent()) {
            Avion existingAvion = optionalUser.get();
            existingAvion.setNom(avion.getNom());
            existingAvion.setCapacite(avion.getCapacite());
            existingAvion.setImmatriculation(avion.getImmatriculation());
            existingAvion.setType(avion.getType());
            avionRepository.save(existingAvion);
        } else {
            throw new RuntimeException("Avion non trouvé !");
        }
    }

    @Override
    public void saveAvion(Avion avion) {
        avionRepository.save(avion);
    }

    @Override
    public void deleteAvion(Long id) {
        avionRepository.deleteById(id);
    }
}
