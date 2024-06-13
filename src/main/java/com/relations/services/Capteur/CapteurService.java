package com.relations.services.Capteur;

import com.relations.model.Capteur;
import com.relations.model.dto.CapteurDTO;

import java.util.List;
import java.util.Optional;

public interface CapteurService {
    List<CapteurDTO> getAllCapteurs();
    CapteurDTO getCapteurById(int id);
    CapteurDTO saveCapteur(Capteur capteur);
    void deleteCapteur(int id);
}