package com.relations.services.Alerte;

import com.relations.model.Alerte;
import com.relations.model.dto.AlerteDTO;

import java.util.List;
import java.util.Optional;

public interface AlerteService {
    List<AlerteDTO> getAllAlertes();
    AlerteDTO getAlerteById(int id);
AlerteDTO saveAlerte(Alerte alerte);
    void deleteAlerte(int id);
  
}
