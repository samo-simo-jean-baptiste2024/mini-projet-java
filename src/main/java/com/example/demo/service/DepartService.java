package com.example.demo.service;

import com.example.demo.model.Depart;

import java.util.List;

public interface DepartService {
    Depart getDepartById(Long id);

    List<Depart> getAllDeparts();

    void saveDepart(Depart user);

    void deleteDepart(Long id);
}
