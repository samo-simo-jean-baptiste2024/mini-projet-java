package com.example.demo.service;

import com.example.demo.model.Depart;
import com.example.demo.repository.DepartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartServiceImpl implements DepartService {
    private DepartRepository departRepository;

    public Depart getDepartById(Long id) {
        return departRepository.findById(id).orElse(null);
    }

    public List<Depart> getAllDeparts() {
        return departRepository.findAll();
    }

    public void saveDepart(Depart depart) {
        departRepository.save(depart);
    }

    public void deleteDepart(Long id) {
        departRepository.deleteById(id);
    }
}
