package com.example.demo.service;

import com.example.demo.model.Avion;
import com.example.demo.repository.AvionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public void saveAvion(Avion avion) {
        avionRepository.save(avion);
    }

    @Override
    public void deleteAvion(Long id) {
        avionRepository.deleteById(id);
    }
}
