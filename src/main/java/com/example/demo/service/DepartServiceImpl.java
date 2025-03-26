package com.example.demo.service;

import com.example.demo.model.Depart;
import com.example.demo.repository.DepartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public void updateDepart(Long id, Depart depart) {
        Optional<Depart> optionalUser = departRepository.findById(id);
        if (optionalUser.isPresent()) {
            Depart existingDepart = optionalUser.get();
            existingDepart.setNum_depart(depart.getNum_depart());
            existingDepart.setDate(depart.getDate());
            existingDepart.setHeure_depart(depart.getHeure_depart());
            existingDepart.setQuantite_kerosene(depart.getQuantite_kerosene());
            departRepository.save(existingDepart);
        } else {
            throw new RuntimeException("Départ non trouvé !");
        }
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
