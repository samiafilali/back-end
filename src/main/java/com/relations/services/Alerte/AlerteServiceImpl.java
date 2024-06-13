package com.relations.services.Alerte;

import com.relations.mappers.AlerteMapper;
import com.relations.model.Alerte;
import com.relations.model.dto.AlerteDTO;
import com.relations.repo.AlerteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlerteServiceImpl implements AlerteService {

    private final AlerteRepository alerteRepository;

    @Autowired
    public AlerteServiceImpl(AlerteRepository alerteRepository) {
        this.alerteRepository = alerteRepository;
    }

    @Override
    public List<AlerteDTO> getAllAlertes() {
        List<Alerte> alerts=alerteRepository.findAll();
        List<AlerteDTO> alarms = new ArrayList<AlerteDTO>();
        alerts.forEach(alerte->{
        	alarms.add(AlerteMapper.convertToDTO(alerte));
        });
        return alarms;
    }

    @Override
    public AlerteDTO getAlerteById(int id) {
        return AlerteMapper.convertToDTO(alerteRepository.findById(id).orElse(null));
    }

    @Override
    public AlerteDTO saveAlerte(Alerte alerte) {
        return AlerteMapper.convertToDTO(alerteRepository.save(alerte));
    }

    @Override
    public void deleteAlerte(int id) {
        alerteRepository.deleteById(id);
    }

    
}