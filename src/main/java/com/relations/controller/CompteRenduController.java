package com.relations.controller;

import com.relations.model.CompteRendu;
import com.relations.services.CompteRendu.CompteRenduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CompteRenduController {

    @Autowired
    private CompteRenduService compteRenduService;

    @GetMapping("/compte-rendus")
    public List<CompteRendu> getAllCompteRendus() {
        return compteRenduService.getAllCompteRendus();
    }

    @GetMapping("/compte-rendu/{id}")
    public Optional<CompteRendu> getCompteRenduById(@PathVariable int id) {
        return compteRenduService.getCompteRenduById(id);
    }

    @PostMapping("/compte-rendu")
    public CompteRendu saveCompteRendu(@RequestBody CompteRendu compteRendu) {
        return compteRenduService.saveCompteRendu(compteRendu);
    }

    @DeleteMapping("/compte-rendu/{id}")
    public void deleteCompteRendu(@PathVariable int id) {
        compteRenduService.deleteCompteRendu(id);
    }
}