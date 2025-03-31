package com.example.demo.controller;

import com.example.demo.model.Passager;
import com.example.demo.service.PassagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/passager", produces = APPLICATION_JSON_VALUE)
public class PassagerController {
    @Autowired
    private PassagerService passagerService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<Passager> getAllPassagers() {
        return passagerService.getPassagers();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Passager getPassagerById(@PathVariable Long id) {
        return passagerService.getPassagers(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody Passager passager) {
        passagerService.creerPassagers(passager);
    }
}
