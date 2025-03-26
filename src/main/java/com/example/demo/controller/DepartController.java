package com.example.demo.controller;

import com.example.demo.model.Depart;
import com.example.demo.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "depart", produces = APPLICATION_JSON_VALUE)
public class DepartController {
    @Autowired
    private DepartService departService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Depart getById(@PathVariable Long id) {
        return departService.getDepartById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<Depart> getAll() {
        return departService.getAllDeparts();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody Depart depart) {
        departService.saveDepart(depart);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping
    public void updete(@RequestBody Depart depart) {
        departService.saveDepart(depart);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        departService.deleteDepart(id);
    }
}
