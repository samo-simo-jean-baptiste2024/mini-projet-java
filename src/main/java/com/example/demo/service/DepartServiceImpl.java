package com.example.demo.service;

import com.example.demo.model.Depart;
import com.example.demo.repository.DepartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartServiceImpl implements DepartService {
    @Autowired
    private DepartRepository departRepository;

    @Override
    public Depart getDepartById(Long id) {
        return departRepository.findById(id).orElse(null);
    }

    @Override
    public List<Depart> getAllDeparts() {
        return departRepository.findAll();
    }

    @Override
    public void saveDepart(Depart depart) {
        departRepository.save(depart);
    }

    @Override
    public void deleteDepart(Long id) {
        departRepository.deleteById(id);
    }
}
