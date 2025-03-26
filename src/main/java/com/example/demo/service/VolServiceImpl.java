package com.example.demo.service;

import com.example.demo.model.Vols;
import com.example.demo.repository.VolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolServiceImpl implements VolService {
    @Autowired
    private VolRepository volRepository;

    @Override
    public List<Vols> getVols() {
        return volRepository.findAll();
    }

    @Override
    public Vols getVols(Long numeroVol) {
        return volRepository.findById(numeroVol).orElse(null);
    }

    @Override
    public Vols creerVol(Vols vol) {
        return volRepository.save(vol);
    }

    @Override
    public Vols mettreAJourVol(Vols vol) {
        return volRepository.save(vol);
    }

    @Override
    public void supprimerVol(Long numeroVol) {
        volRepository.deleteById(numeroVol);
    }
}
