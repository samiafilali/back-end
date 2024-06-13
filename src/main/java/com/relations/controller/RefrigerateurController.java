package com.relations.controller;

import com.relations.model.Refrigerateur;
import com.relations.services.Refrigerateur.RefrigerateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class RefrigerateurController {

    @Autowired
    private RefrigerateurService refrigerateurService;

    @GetMapping("/refrigerateurs")
    public List<Refrigerateur> getAllRefrigerateurs() {
        return refrigerateurService.getAllRefrigerateurs();
    }

    @GetMapping("/refrigerateur/{id}")
    public Optional<Refrigerateur> getRefrigerateurById(@PathVariable int id) {
        return refrigerateurService.getRefrigerateurById(id);
    }

    @PostMapping("/refrigerateur")
    public Refrigerateur saveRefrigerateur(@RequestBody Refrigerateur refrigerateur) {
        return refrigerateurService.saveRefrigerateur(refrigerateur);
    }
}