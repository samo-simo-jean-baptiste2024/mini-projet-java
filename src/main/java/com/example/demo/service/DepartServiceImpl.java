package com.example.demo.service;

import com.example.demo.model.*;
import com.example.demo.repository.DepartRepository;
import com.example.demo.repository.PassagerTronconRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartServiceImpl implements DepartService {
    @Autowired
    private DepartRepository departRepository;
    @Autowired
    private PassagerService passagerService;
    @Autowired
    private PersonnelService personnelService;
    @Autowired
    private PassagerTronconRepository passagerTronconRepository;
    @Autowired
    private TronconService tronconService;

    @Override
    public Depart getDepartById(Long id) {
        return departRepository.findById(id).orElse(null);
    }

    @Override
    public List<Depart> getAllDeparts() {
        return departRepository.findAll();
    }

    @Override
    public List<Depart> getDepartByVolId(Long id) {
        return departRepository.getDepartByVolId(id);
    }

    @Override
    public void updateDepart(Long id, Depart depart) {
        Optional<Depart> optionalDepart = departRepository.findById(id);
        if (optionalDepart.isPresent()) {
            Depart existingDepart = optionalDepart.get();
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
    public void enrollPassager(Long departId, Long passagerId) {
        Depart depart = this.getDepartById(departId);
        Passager passager = passagerService.getPassagers(passagerId);
        depart.enrollPassager(passager);
        departRepository.save(depart);
    }

    @Override
    public void enrollPersonnel(Long departId, Long personnelId) {
        Depart depart = this.getDepartById(departId);
        Personnel personnel = personnelService.getPersonnels(personnelId);
        depart.enrollPersonnel(personnel);
        departRepository.save(depart);
    }

    @Override
    public void joinPassagerInTroncon(Long departId, Long tronconId, Long passagerId) {
        PassagerTroncon passagerTroncon = new PassagerTroncon();
        Passager passager = passagerService.getPassagers(passagerId);
        Troncon troncon = tronconService.getTronconById(tronconId);
        Depart depart = this.getDepartById(departId);

        passagerTroncon.assignDepart(depart);
        passagerTroncon.assignPassager(passager);
        passagerTroncon.assignTroncon(troncon);
        passagerTronconRepository.save(passagerTroncon);
    }

    @Override
    public void saveDepart(Depart depart) {
        Vol vol = new Vol();
        Avion avion = new Avion();
        Depart depart1 = new Depart();
        vol.setId(depart.getVol().getId());
        avion.setId(depart.getAvion().getId());

        depart1.setVol(vol);
        depart1.setAvion(avion);
        depart1.setQuantite_kerosene(depart.getQuantite_kerosene());
        depart1.setNum_depart(depart.getNum_depart());
        depart1.setHeure_depart(depart.getHeure_depart());
        depart1.setDate(depart.getDate());
        departRepository.save(depart1);
    }

    @Override
    public void deleteDepart(Long id) {
        departRepository.deleteById(id);
    }
}
