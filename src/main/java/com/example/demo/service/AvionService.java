package com.example.demo.service;

import com.example.demo.model.Avion;

import java.util.List;

public interface AvionService {
    Avion getAvionById(Long id);
    List<Avion> getAllAvions();

    void saveAvion(Avion avion);
    void deleteAvion(Long id);
}
