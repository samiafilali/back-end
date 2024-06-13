package com.relations.controller;

import com.relations.model.Capteur;
import com.relations.model.dto.CapteurDTO;
import com.relations.services.Capteur.CapteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CapteurController {

    @Autowired
    private CapteurService capteurService;

    @GetMapping("/capteurs")
    public List<CapteurDTO> getAllCapteurs() {
        return capteurService.getAllCapteurs();
    }

    @GetMapping("/capteur/{id}")
    public CapteurDTO getCapteurById(@PathVariable int id) {
        return capteurService.getCapteurById(id);
    }

    @PostMapping("/capteur")
    public CapteurDTO saveCapteur(@RequestBody Capteur capteur) {
        return capteurService.saveCapteur(capteur);
    }

    @DeleteMapping("/capteur/{id}")
    public void deleteCapteur(@PathVariable int id) {
        capteurService.deleteCapteur(id);
    }
}