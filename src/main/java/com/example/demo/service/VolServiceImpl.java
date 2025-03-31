package com.example.demo.service;

import com.example.demo.model.Troncon;
import com.example.demo.model.Vol;
import com.example.demo.repository.VolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolServiceImpl implements VolService {
    @Autowired
    private VolRepository volRepository;
    @Autowired
    private TronconService tronconService;

    @Override
    public List<Vol> getVols() {
        return volRepository.findAll();
    }

    @Override
    public Vol getVols(Long id) {
        return volRepository.findById(id).orElse(null);
    }

    @Override
    public Vol creerVol(Vol vol) {
        return volRepository.save(vol);
    }

    @Override
    public Vol mettreAJourVol(Vol vol) {
        return volRepository.save(vol);
    }

    @Override
    public void addTroncon(Long volId, Long tronconId) {
        Vol vol = this.getVols(volId);
        Troncon troncon = tronconService.getTronconById(tronconId);
        vol.addTroncon(troncon);
        volRepository.save(vol);
    }

    @Override
    public void supprimerVol(Long numeroVol) {
        volRepository.deleteById(numeroVol);
    }
}
