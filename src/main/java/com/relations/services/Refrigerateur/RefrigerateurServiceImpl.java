package com.relations.services.Refrigerateur;

import com.relations.model.Refrigerateur;
import com.relations.repo.RefrigerateurRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RefrigerateurServiceImpl implements RefrigerateurService {

    @Autowired
    private RefrigerateurRepository refrigerateurRepository;

    @Override
    public List<Refrigerateur> getAllRefrigerateurs() {
        return refrigerateurRepository.findAll();
    }

    @Override
    public Optional<Refrigerateur> getRefrigerateurById(int id) {
        return refrigerateurRepository.findById(id);
    }

    @Override
    public Optional<Refrigerateur> getRefrigerateurByDeviceId(String deviceId) {
        return refrigerateurRepository.findByDeviceId(deviceId);
    }

    @Override
    public Refrigerateur saveRefrigerateur(Refrigerateur refrigerateur) {
        return refrigerateurRepository.save(refrigerateur);
    }

    @Override
    public void deleteRefrigerateur(int id) {
        refrigerateurRepository.deleteById(id);
    }
}
