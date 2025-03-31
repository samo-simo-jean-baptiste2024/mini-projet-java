package com.example.demo.controller;

import com.example.demo.model.Personnel;
import com.example.demo.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "personnel", produces = APPLICATION_JSON_VALUE)
public class PersonnelController {
    @Autowired
    private PersonnelService personnelService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<Personnel> getAllPersonnesls() {
        return personnelService.getPersonnels();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Personnel getPersonnelById(@PathVariable Long id) {
        return personnelService.getPersonnels(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody Personnel personnel) {
        personnelService.creerPersonnels(personnel);
    }
}
