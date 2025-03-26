package com.example.demo.controller;

import com.example.demo.model.Troncon;
import com.example.demo.service.TronconService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/troncon", produces = APPLICATION_JSON_VALUE)
public class TronconController {
    private TronconService tronconService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{id}")
    public Troncon getById(@PathVariable Long id) {
        return tronconService.getTronconById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<Troncon> gelAll() {
        return tronconService.getAllTroncons();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody Troncon troncon) {
        tronconService.saveTroncon(troncon);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Troncon troncon) {
        tronconService.updateTroncon(id, troncon);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        tronconService.deleteTroncon(id);
    }
}
