package com.relations.controller;

import com.relations.model.Alerte;
import com.relations.model.dto.AlerteDTO;
import com.relations.services.Alerte.AlerteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class AlerteController {

    @Autowired
    private AlerteService alerteService;

    @GetMapping("/alertes")
    public List<AlerteDTO> getAllAlertes() {
        List<AlerteDTO> alertes = alerteService.getAllAlertes();
        System.out.println("Alertes récupérées: " + alertes);
        return alertes;
    }

    @GetMapping("/alerte/{id}")
    public AlerteDTO getAlerteById(@PathVariable int id) {
        AlerteDTO alerte = alerteService.getAlerteById(id);
        System.out.println("Alerte récupérée: " + alerte);
        return alerte;
    }

    @PostMapping("/alerte")
    public AlerteDTO saveAlerte(@RequestBody Alerte alerte) {
        AlerteDTO savedAlerte = alerteService.saveAlerte(alerte);
        System.out.println("Alerte enregistrée: " + savedAlerte);
        return savedAlerte;
    }

    @DeleteMapping("/alerte/{id}")
    public void deleteAlerte(@PathVariable int id) {
        alerteService.deleteAlerte(id);
        System.out.println("Alerte supprimée avec ID: " + id);
    }

    @PostMapping("/alert")
    public String receiveAlert(@RequestBody Map<String, Object> alertData) {
        System.out.println("Alerte reçue: " + alertData);

        Alerte alerte = new Alerte();
        alerte.setType((String) alertData.get("variable"));
        alerte.setStatus((String) alertData.get("status"));
        alerte.setCapteurId((Integer) alertData.get("device_id"));
        alerteService.saveAlerte(alerte);

        return "Alerte reçue";
    }
}
