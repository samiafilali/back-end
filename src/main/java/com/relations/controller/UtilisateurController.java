package com.relations.controller;

import com.relations.model.Utilisateur;
import com.relations.model.dto.UtilisateurDTO;
import com.relations.services.Utilisateur.UtilisateurService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping("/")
    public ResponseEntity<List<UtilisateurDTO>> getAllUtilisateurs() {
        return ResponseEntity.ok(utilisateurService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UtilisateurDTO> getUtilisateur(@PathVariable int id) {
    	UtilisateurDTO utilisateur = utilisateurService.getUtilisateur(id);
        if (utilisateur != null) {
            return ResponseEntity.ok(utilisateur);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping("")
    public ResponseEntity<UtilisateurDTO> addUtilisateur(@RequestBody Utilisateur utilisateur) {
        return ResponseEntity.ok(utilisateurService.addUtilisateur(utilisateur));
    }

    @GetMapping("email/{email}")
    public ResponseEntity<UtilisateurDTO> getOneUtilisateur(@PathVariable String email) {
    	UtilisateurDTO utilisateur = utilisateurService.getOneUtilisateur(email);
        if (utilisateur != null) {
            return ResponseEntity.ok(utilisateur);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable int id)
    {
    	utilisateurService.deleteOne(id);
    }
}