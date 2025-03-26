package com.example.demo.service;

import com.example.demo.model.Troncon;
import com.example.demo.repository.TronconRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TronconServiceImpl implements TronconService {
    @Autowired
    private TronconRepository tronconRepository;

    @Override
    public Troncon getTronconById(Long id) {
        return tronconRepository.findById(id).orElse(null);
    }

    @Override
    public List<Troncon> getAllTroncons() {
        return tronconRepository.findAll();
    }

    @Override
    public void saveTroncon(Troncon user) {
        tronconRepository.save(user);
    }

    @Override
    public void deleteTroncon(Long id) {
        tronconRepository.deleteById(id);
    }
}
