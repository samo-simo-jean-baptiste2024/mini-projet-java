package com.example.demo.controller;

import com.example.demo.model.Avion;
import com.example.demo.service.AvionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "avion", produces = APPLICATION_JSON_VALUE)
public class AvionController {
    @Autowired
    private AvionService avionService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Avion getById(@PathVariable Long id) {
        return avionService.getAvionById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<Avion> getAll() {
        return avionService.getAllAvions();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody Avion avion) {
        avionService.saveAvion(avion);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Avion avion) {
        avionService.updateAvion(id, avion);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        avionService.deleteAvion(id);
    }
}
