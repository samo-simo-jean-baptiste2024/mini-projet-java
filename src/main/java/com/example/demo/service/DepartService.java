package com.example.demo.service;

import com.example.demo.model.Depart;

import java.util.List;

public interface DepartService {
    Depart getDepartById(Long id);
    List<Depart> getAllDeparts();

    List<Depart> getDepartByVolId(Long id);
    void updateDepart(Long id, Depart depart);

    void enrollPassager(Long departId, Long passagerId);

    void enrollPersonnel(Long departId, Long personnelId);

    void joinPassagerInTroncon(Long departId, Long tronconId, Long passagerId);
    void saveDepart(Depart depart);
    void deleteDepart(Long id);
}
