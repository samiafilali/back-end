package com.relations.services.Alerte;

import com.relations.mappers.AlerteMapper;
import com.relations.model.Alerte;
import com.relations.model.dto.AlerteDTO;
import com.relations.repo.AlerteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlerteServiceImpl implements AlerteService {

    private final AlerteRepository alerteRepository;

    @Autowired
    public AlerteServiceImpl(AlerteRepository alerteRepository) {
        this.alerteRepository = alerteRepository;
    }

    @Override
    public List<AlerteDTO> getAllAlertes() {
        List<Alerte> alerts = alerteRepository.findAll();
        List<AlerteDTO> alarms = new ArrayList<>();
        alerts.forEach(alerte -> {
            alarms.add(AlerteMapper.convertToDTO(alerte));
        });
        System.out.println("Alertes récupérées : " + alarms);
        return alarms;
    }

    @Override
    public AlerteDTO getAlerteById(int id) {
        AlerteDTO alerteDTO = AlerteMapper.convertToDTO(alerteRepository.findById(id).orElse(null));
        System.out.println("Alerte récupérée : " + alerteDTO);
        return alerteDTO;
    }

    @Override
    public AlerteDTO saveAlerte(Alerte alerte) {
        Alerte savedAlerte = alerteRepository.save(alerte);
        AlerteDTO alerteDTO = AlerteMapper.convertToDTO(savedAlerte);
        System.out.println("Alerte enregistrée : " + alerteDTO);
        return alerteDTO;
    }

    @Override
    public void deleteAlerte(int id) {
        alerteRepository.deleteById(id);
        System.out.println("Alerte supprimée avec ID : " + id);
    }
}

