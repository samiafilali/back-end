package com.relations.services.Capteur;

import com.relations.mappers.CapteurMapper;
import com.relations.model.Capteur;
import com.relations.model.dto.CapteurDTO;
import com.relations.repo.CapteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CapteurServiceImpl implements CapteurService {

    private final CapteurRepository capteurRepository;

    @Autowired
    public CapteurServiceImpl(CapteurRepository capteurRepository) {
        this.capteurRepository = capteurRepository;
    }

    @Override
    public List<CapteurDTO> getAllCapteurs() {
        List<Capteur> capts= capteurRepository.findAll();
        List<CapteurDTO> capteurs=new  ArrayList<CapteurDTO>();
        capts.forEach(cpt->
        {
        	capteurs.add(CapteurMapper.convertToDTO(cpt));
        });
        return capteurs;
    }

    @Override
    public CapteurDTO getCapteurById(int id) {
        return CapteurMapper.convertToDTO(capteurRepository.findById(id).orElse(null));
    }

    @Override
    public CapteurDTO saveCapteur(Capteur capteur) {
        return CapteurMapper.convertToDTO(capteurRepository.save(capteur));
    }

    @Override
    public void deleteCapteur(int id) {
        capteurRepository.deleteById(id);
    }

}