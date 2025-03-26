package com.example.demo.service;

import com.example.demo.model.Avion;
import com.example.demo.repository.AvionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvionServiceImpl implements AvionService {
    private AvionRepository avionRepository;

    public Avion getAvionById(Long id) {
        return avionRepository.findById(id).orElse(null);
    }

    public List<Avion> getAllAvions() {
        return avionRepository.findAll();
    }

    public void saveAvion(Avion avion) {
        avionRepository.save(avion);
    }

    public void deleteAvion(Long id) {
        avionRepository.deleteById(id);
    }
}
