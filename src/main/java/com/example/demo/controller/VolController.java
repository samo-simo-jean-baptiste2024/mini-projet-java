package com.example.demo.controller;

import com.example.demo.model.Vol;
import com.example.demo.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/vol", produces = APPLICATION_JSON_VALUE)
public class VolController {
    @Autowired
    private VolService volService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<Vol> getAllVols() {
        return volService.getVols();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Vol getVolById(@PathVariable Long id) {
        return volService.getVols(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody Vol vol) {
        volService.creerVol(vol);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{volId}/troncon/{tronconId}")
    public void addTronconInVol(@PathVariable Long volId, @PathVariable Long tronconId) {
        volService.addTroncon(volId, tronconId);
    }
}
