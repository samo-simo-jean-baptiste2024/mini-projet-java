package com.example.demo.service;

import com.example.demo.model.Troncon;
import com.example.demo.repository.TronconRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TronconServiceImpl implements TronconService {
    private TronconRepository tronconRepository;

    public Troncon getTronconById(Long id) {
        return tronconRepository.findById(id).orElse(null);
    }

    public List<Troncon> getAllTroncons() {
        return tronconRepository.findAll();
    }

    public void saveTroncon(Troncon user) {
        tronconRepository.save(user);
    }

    public void deleteTroncon(Long id) {
        tronconRepository.deleteById(id);
    }
}
