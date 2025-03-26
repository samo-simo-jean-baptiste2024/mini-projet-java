package com.example.demo.service;

import com.example.demo.model.Troncon;

import java.util.List;

public interface TronconService {
    Troncon getTronconById(Long id);

    List<Troncon> getAllTroncons();

    void saveTroncon(Troncon user);

    void deleteTroncon(Long id);
}
